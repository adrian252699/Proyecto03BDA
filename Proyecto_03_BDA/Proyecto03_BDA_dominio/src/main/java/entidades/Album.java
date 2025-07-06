/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import java.util.Calendar;
import java.util.List;
import javax.swing.Icon;

/**
 *
 * @author jalt2
 */
public class Album {
    private String nombre;
    private Calendar fechaLanzamiento;
    private List<String> listaGeneros;
    private Icon imagen;
    private List<Cancion> listaCanciones;
    private Solista artistaSolista;
    private Banda artistaBanda;

    public Album() {
    }
    
    //Cuando el album sea de un solista
    public Album(String nombre, Calendar fechaLanzamiento, List<String> listaGeneros, Icon imagen, List<Cancion> listaCanciones, Solista artistaSolista) {
        this.nombre = nombre;
        this.fechaLanzamiento = fechaLanzamiento;
        this.listaGeneros = listaGeneros;
        this.imagen = imagen;
        this.listaCanciones = listaCanciones;
        this.artistaSolista = artistaSolista;
    }
    
    //Cuando el album sea de una banda
    public Album(String nombre, Calendar fechaLanzamiento, List<String> listaGeneros, Icon imagen, List<Cancion> listaCanciones, Banda artistaBanda) {
        this.nombre = nombre;
        this.fechaLanzamiento = fechaLanzamiento;
        this.listaGeneros = listaGeneros;
        this.imagen = imagen;
        this.listaCanciones = listaCanciones;
        this.artistaBanda = artistaBanda;
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

    public Icon getImagen() {
        return imagen;
    }

    public void setImagen(Icon imagen) {
        this.imagen = imagen;
    }

    public List<Cancion> getListaCanciones() {
        return listaCanciones;
    }

    public void setListaCanciones(List<Cancion> listaCanciones) {
        this.listaCanciones = listaCanciones;
    }

    public Solista getArtistaSolista() {
        return artistaSolista;
    }

    public void setArtistaSolista(Solista artistaSolista) {
        this.artistaSolista = artistaSolista;
    }

    public Banda getArtistaBanda() {
        return artistaBanda;
    }

    public void setArtistaBanda(Banda artistaBanda) {
        this.artistaBanda = artistaBanda;
    }
    
    
    
}
