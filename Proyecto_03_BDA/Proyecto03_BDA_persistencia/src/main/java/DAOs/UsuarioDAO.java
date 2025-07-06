/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAOs;

import com.mongodb.MongoException;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import conexionMongo.Conexion;
import entidades.Usuario;
import interfacesDAO.IUsuarioDAO;
import org.bson.Document;
import usuarioDTOs.LoginUsuarioDTO;
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
            
            Document usuario = new Document("nombre", nuevoUsuario.getNombre())
                    .append("apellidoPaterno", nuevoUsuario.getApellidoPaterno())
                    .append("apellidoMaterno", nuevoUsuario.getApellidoMaterno()).append("correo", nuevoUsuario.getCorreo())
                    .append("nombreUsuario", nuevoUsuario.getNombreUsuario()).append("contrasena", nuevoUsuario.getContrasena());
            
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

    @Override
    public LoginUsuarioDTO iniciarSesion(LoginUsuarioDTO usuarioLogin) throws Exception {
        MongoClient clienteMongo = null;
        Conexion conexion = Conexion.getInstance();
        
        try {
            clienteMongo = conexion.crearConexion();
            MongoDatabase baseDatos = conexion.obtenerBaseDatos(clienteMongo);
            MongoCollection<Document> coleccion = baseDatos.getCollection("Usuarios");
            
            Document filtro = new Document("nombreUsuario",usuarioLogin.getNombreUsuario())
                    .append("contrasena", usuarioLogin.getContrasena());
            
            Document resultado = coleccion.find(filtro).first();
            
            if (resultado != null) {
                usuarioLogin.setNombre(resultado.getString("nombre"));
                usuarioLogin.setApellidoPaterno(resultado.getString("apellidoPaterno"));
                usuarioLogin.setApellidoMaterno(resultado.getString("apellidoMaterno"));
                usuarioLogin.setCorreo(resultado.getString("correo"));
                
                
                return usuarioLogin;
            }else{
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
    
    
    
}
