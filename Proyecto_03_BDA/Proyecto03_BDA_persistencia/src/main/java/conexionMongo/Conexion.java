/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conexionMongo;

import com.mongodb.MongoException;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jalt2
 */
public class Conexion {
    private static final Conexion instancia = new Conexion();
    private final String BASE_DATOS = "bibliotecaMusical4";
    private final String CADENA_CONEXION = "mongodb://localhost:27017";
    
    private Conexion(){
    
    }
    
    public static Conexion getInstance(){
        return instancia;
    }
    
    public MongoClient crearConexion() throws MongoException {
        MongoClient conexionMongo = null;
        
        try {
            conexionMongo = MongoClients.create(CADENA_CONEXION);
        } catch (Exception e) {
            throw new MongoException("Hubo un error al conectarse a MongoDB: " + e.getMessage());
        }
        
        return conexionMongo;
    }
    
    public MongoDatabase obtenerBaseDatos(MongoClient conexion) throws MongoException{
        MongoDatabase baseDatos = null;
        try {
            List<String> nombresBaseDatos = new ArrayList<>();
            conexion.listDatabaseNames().into(nombresBaseDatos);
            
            if (nombresBaseDatos.contains(BASE_DATOS)) {
                baseDatos = conexion.getDatabase(BASE_DATOS);
            }else{
                baseDatos = conexion.getDatabase(BASE_DATOS);
            }
            
        } catch (Exception e) {
            throw new MongoException("Error al obtener la base de datos: " + e.getMessage());
        }
        return baseDatos;
    }
    
    public void cerrarConexion(MongoClient conexion){
        if (conexion!=null) {
            conexion.close();
        }
    }
}
