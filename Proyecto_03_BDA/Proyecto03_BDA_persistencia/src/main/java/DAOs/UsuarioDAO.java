/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAOs;

import com.mongodb.MongoException;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Sorts;
import conexionMongo.Conexion;
import entidades.Usuario;
import hashPasswords.Seguridad;
import interfacesDAO.IUsuarioDAO;
import org.bson.Document;
import org.bson.types.ObjectId;
import usuarioDTOs.LoginUsuarioDTO;
import usuarioDTOs.ModificarUsuarioDTO;
import usuarioDTOs.RegistrarUsuarioDTO;

/**
 *
 * @author jalt2
 */
public class UsuarioDAO implements IUsuarioDAO{

    public UsuarioDAO() {
    }
    
    @Override
    public boolean registrarUsuario(RegistrarUsuarioDTO nuevoUsuario) throws Exception{
        MongoClient clienteMongo = null;
        Conexion conexion = Conexion.getInstance();
        
        try {
            clienteMongo = conexion.crearConexion();
            MongoDatabase baseDatos = conexion.obtenerBaseDatos(clienteMongo);
            MongoCollection<Document> coleccion = baseDatos.getCollection("Usuarios");
            
            Document usuario = new Document("idUsuario",this.generarId())
                    .append("nombre", nuevoUsuario.getNombre())
                    .append("apellidoPaterno", nuevoUsuario.getApellidoPaterno())
                    .append("apellidoMaterno", nuevoUsuario.getApellidoMaterno()).append("correo", nuevoUsuario.getCorreo())
                    .append("nombreUsuario", nuevoUsuario.getNombreUsuario()).append("contrasena", Seguridad.hashPassword(nuevoUsuario.getContrasena()));
            
            coleccion.insertOne(usuario);
            return true;
        } catch (MongoException e) {
            throw new Exception("Error al crear el administrador: " + e.getMessage());
        } finally {
            if (clienteMongo!=null) {
                conexion.cerrarConexion(clienteMongo);
            }
        }
        
    }  
    
    private String generarId() throws Exception{
        MongoClient clienteMongo = null;
        Conexion conexion = Conexion.getInstance();
        
        try {
            clienteMongo = conexion.crearConexion();
            MongoDatabase baseDatos = conexion.obtenerBaseDatos(clienteMongo);
            MongoCollection<Document> coleccion = baseDatos.getCollection("Usuarios");
            
            Document ultimoUsuario = coleccion.find()
                    .sort(Sorts.descending("idUsuario"))
                    .limit(1)
                    .first();
            
            //Se encontro un usuario
            if (ultimoUsuario!=null) {
                String ultimoID = ultimoUsuario.getString("idUsuario");
                int siguienteID = Integer.parseInt(ultimoID) + 1;
                return String.format("%06d", siguienteID);
            }else{
                return "000001";
            }
            
        } catch (MongoException e) {
            throw new Exception("Error al generar ID: " + e.getMessage());
        } finally {
            if (clienteMongo!=null) {
                conexion.cerrarConexion(clienteMongo);
            }
        }
    }
    
    @Override
    public LoginUsuarioDTO iniciarSesion(LoginUsuarioDTO usuarioLogin) throws Exception {
        MongoClient clienteMongo = null;
        Conexion conexion = Conexion.getInstance();
        
        try {
            clienteMongo = conexion.crearConexion();
            MongoDatabase baseDatos = conexion.obtenerBaseDatos(clienteMongo);
            MongoCollection<Document> coleccion = baseDatos.getCollection("Usuarios");
            
            Document filtro = new Document("nombreUsuario",usuarioLogin.getNombreUsuario());
            Document resultado = coleccion.find(filtro).first();
            
            if (resultado != null) {
                String passwordBD = resultado.getString("contrasena");
                if (Seguridad.verificarPassword(usuarioLogin.getContrasena(), passwordBD)) {
                    usuarioLogin.setIdUsuario(resultado.getString("idUsuario"));
                    usuarioLogin.setNombre(resultado.getString("nombre"));
                    usuarioLogin.setApellidoPaterno(resultado.getString("apellidoPaterno"));
                    usuarioLogin.setApellidoMaterno(resultado.getString("apellidoMaterno"));
                    usuarioLogin.setCorreo(resultado.getString("correo"));
                    return usuarioLogin;
                }else{
                    //Contraseña incorrecta
                    return null;
                }
                
            }else{
                //Usuario no encontrado
                return null;
            }
            
            
        } catch (MongoException e) {
            throw new Exception("Error al iniciar sesion: " + e.getMessage());
        } finally {
            if (clienteMongo!=null) {
                conexion.cerrarConexion(clienteMongo);
            }
        }
    }

    @Override
    public boolean modificarUsuario(ModificarUsuarioDTO usuarioModificar) throws Exception {
        MongoClient clienteMongo = null;
        Conexion conexion = Conexion.getInstance();
        try {
            clienteMongo = conexion.crearConexion();
            MongoDatabase baseDatos = conexion.obtenerBaseDatos(clienteMongo);
            MongoCollection<Document> coleccion = baseDatos.getCollection("Usuarios");
            
            Document filtro = new Document("idUsuario", usuarioModificar.getIdUsuario());
            Document usuarioBusqueda =  coleccion.find(filtro).first();
            
            //Coincidencia con el id, se encontro un usuario
            if (usuarioBusqueda!=null) {
                Document datosActualizar = new Document()
                        .append("nombre", usuarioModificar.getNombre())
                        .append("apellidoPaterno", usuarioModificar.getApellidoPaterno())
                        .append("apellidoMaterno", usuarioModificar.getApellidoMaterno())
                        .append("correo", usuarioModificar.getCorreo())
                        .append("nombreUsuario", usuarioModificar.getNombreUsuario())
                        .append("contrasena", usuarioModificar.getContrasena());
                
                Document actualizarUsuario = new Document("$set", datosActualizar);
                        
                
                coleccion.updateOne(filtro, actualizarUsuario);
                return true;
            }else{
                //Usuario no encontrado
                return false;
            }
            
        } catch (MongoException e) {
            throw new Exception("Error al actualizar el usuario: " + e.getMessage());
        } finally {
            if (clienteMongo!=null) {
                conexion.cerrarConexion(clienteMongo);
            }
        }
        
        
    }
    
    
    
}
