/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAOs;

import com.mongodb.MongoException;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Sorts;
import conexionMongo.Conexion;
import interfacesDAO.ISolistaDAO;
import java.util.ArrayList;
import java.util.List;
import org.bson.Document;
import solistaDTOs.BuscarSolistaDTO;
import solistaDTOs.NuevoSolistaDTO;

/**
 *
 * @author jalt2
 */
public class SolistaDAO implements ISolistaDAO{

    @Override
    public boolean agregarSolista(NuevoSolistaDTO nuevoSolista) throws Exception{
        MongoClient clienteMongo = null;
        Conexion conexion = Conexion.getInstance();
        
        try {
            clienteMongo = conexion.crearConexion();
            MongoDatabase baseDatos = conexion.obtenerBaseDatos(clienteMongo);
            MongoCollection<Document> coleccion = baseDatos.getCollection("Solistas");
            
            Document solista = new Document("idSolista",this.generarId())
                    .append("nombreArtista", nuevoSolista.getNombreArtista())
                    .append("icon", nuevoSolista.getImagen())
                    .append("Generos", nuevoSolista.getListaGeneros());
            coleccion.insertOne(solista);
            return true;
        } catch (Exception e) {
            throw new Exception("Error al crear el solista: " + e.getMessage());
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
            MongoCollection<Document> coleccion = baseDatos.getCollection("Solistas");
            
            Document ultimoUsuario = coleccion.find()
                    .sort(Sorts.descending("idSolista"))
                    .limit(1)
                    .first();
            
            //Se encontro un usuario
            if (ultimoUsuario!=null) {
                String ultimoID = ultimoUsuario.getString("idSolista");
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
    public BuscarSolistaDTO buscarSolista(BuscarSolistaDTO solistaBuscar) throws Exception {
        MongoClient clienteMongo = null;
        Conexion conexion = Conexion.getInstance();
        try {
            clienteMongo = conexion.crearConexion();
            MongoDatabase baseDatos = conexion.obtenerBaseDatos(clienteMongo);
            MongoCollection<Document> coleccion = baseDatos.getCollection("Solistas");
        
            Document filtro = new Document("idSolista",solistaBuscar.getIdSolista());
            Document resultado = coleccion.find(filtro).first();
            
            //Quedan pendientes albumes
            if (resultado != null) {
                solistaBuscar.setNombreArtista(resultado.getString("nombreArtista"));
                solistaBuscar.setListaGeneros((List<String>) resultado.get("Generos"));
                solistaBuscar.setRutaImagen(resultado.getString("icon"));
                return solistaBuscar;
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

    @Override
    public List<BuscarSolistaDTO> recuperarSolistas() throws Exception {
        MongoClient clienteMongo = null;
        Conexion conexion = Conexion.getInstance();
        List<BuscarSolistaDTO> solistas = new ArrayList<>();
        
        try {
            clienteMongo = conexion.crearConexion();
            MongoDatabase baseDatos = conexion.obtenerBaseDatos(clienteMongo);
            MongoCollection<Document> coleccion = baseDatos.getCollection("Solistas");

            FindIterable<Document> resultados = coleccion.find();

            for(Document doc : resultados){
                //Crear una instancia por cada documento de la coleccion
                BuscarSolistaDTO solista = new BuscarSolistaDTO();
                solista.setNombreArtista(doc.getString("nombreArtista"));
                solista.setRutaImagen(doc.getString("icon"));
                solista.setListaGeneros((List<String>) doc.get("Generos"));
                solistas.add(solista);

            }
        } catch (MongoException e) {
            throw new Exception("Error al recuperar solistas: " + e.getMessage());
        } finally {
            if (clienteMongo!=null) {
                conexion.cerrarConexion(clienteMongo);
            }
        }
        
        return solistas;
    }
    
}
