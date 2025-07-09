/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;
import org.bson.Document;

/**
 *
 * @author jalt2
 */
public class Album {
    private String nombre;
    private Calendar fechaLanzamiento;
    private List<String> listaGeneros;
    private String rutaImagen;
    private List<Cancion> listaCanciones;

    

    public Album() {
    }
    
    //Cuando el album sea de un solista
    public Album(String nombre, Calendar fechaLanzamiento, List<String> listaGeneros, String imagen, List<Cancion> listaCanciones) {
        this.nombre = nombre;
        this.fechaLanzamiento = fechaLanzamiento;
        this.listaGeneros = listaGeneros;
        this.rutaImagen = imagen;
        this.listaCanciones = listaCanciones;

    }
    public Document toDocument() {
        
        // Convertir fechaLanzamiento a java.util.Date
        Date fecha = fechaLanzamiento != null ? fechaLanzamiento.getTime() : null;

        // Convertir las canciones a List<Document>
        List<Document> cancionesDoc = listaCanciones != null
            ? listaCanciones.stream().map(Cancion::toDocument).collect(Collectors.toList())
            : null;

        return new Document("nombre", nombre)
            .append("fechaLanzamiento", fecha)
            .append("listaGeneros", listaGeneros)
            .append("rutaImagen", rutaImagen)
            .append("listaCanciones", cancionesDoc);
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Calendar getFechaLanzamiento() {
        return fechaLanzamiento;
    }

    public void setFechaLanzamiento(Calendar fechaLanzamiento) {
        this.fechaLanzamiento = fechaLanzamiento;
    }

    public List<String> getListaGeneros() {
        return listaGeneros;
    }

    public void setListaGeneros(List<String> listaGeneros) {
        this.listaGeneros = listaGeneros;
    }

    public String getRutaImagen() {
        return rutaImagen;
    }

    public void setRutaImagen(String rutaImagen) {
        this.rutaImagen = rutaImagen;
    }

    public List<Cancion> getListaCanciones() {
        return listaCanciones;
    }

    public void setListaCanciones(List<Cancion> listaCanciones) {
        this.listaCanciones = listaCanciones;
    }
    
    
    
}
