/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAOs;

import bandaDTOs.NuevaBandaDTO;
import com.mongodb.MongoException;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Sorts;
import conexionMongo.Conexion;
import entidades.Album;
import entidades.Banda;
import entidades.Integrante;
import interfacesDAO.IBandaDAO;
import java.util.List;
import java.util.stream.Collectors;
import org.bson.Document;

/**
 *
 * @author jalt2
 */
public class BandaDAO implements IBandaDAO{

    @Override
    public boolean registrarBanda(NuevaBandaDTO nuevaBanda) throws Exception{
        MongoClient clienteMongo = null;
        Conexion conexion = Conexion.getInstance();
        
        try {
            clienteMongo = conexion.crearConexion();
            MongoDatabase baseDatos = conexion.obtenerBaseDatos(clienteMongo);
            MongoCollection<Document> coleccion = baseDatos.getCollection("Bandas");
            
            List<Document> integrantesDoc = nuevaBanda.getListaIntegrantes().stream()
            .map(Integrante::toDocument)
            .collect(Collectors.toList());
            
            List<Document> albumesDoc = nuevaBanda.getAlbumes().stream()
            .map(Album::toDocument)
            .collect(Collectors.toList());
            
            Document bandaGuardar = new Document("idBanda",this.generarId())
                    .append("nombre", nuevaBanda.getNombreBanda())
                    .append("integrantes", integrantesDoc)
                    .append("generos", nuevaBanda.getListaGeneros())
                    .append("albumes", albumesDoc);
            
            coleccion.insertOne(bandaGuardar);
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
            MongoCollection<Document> coleccion = baseDatos.getCollection("Bandas");
            
            Document ultimoUsuario = coleccion.find()
                    .sort(Sorts.descending("idBanda"))
                    .limit(1)
                    .first();
            
            //Se encontro un usuario
            if (ultimoUsuario!=null) {
                String ultimoID = ultimoUsuario.getString("idBanda");
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
}
