/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import javax.swing.Icon;
import org.bson.Document;

/**
 *
 * @author jalt2
 */
public class Cancion {
    private String nombre;
    private Double duracion;


    public Cancion() {
    }
    
    public Document toDocument(){
        return new Document("nombreCancion",this.nombre).append("duracion", this.duracion);
    }
    public Cancion(String nombre, Double duracion) {
        this.nombre = nombre;
        this.duracion = duracion;
    }
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getDuracion() {
        return duracion;
    }

    public void setDuracion(Double duracion) {
        this.duracion = duracion;
    }
    
}
