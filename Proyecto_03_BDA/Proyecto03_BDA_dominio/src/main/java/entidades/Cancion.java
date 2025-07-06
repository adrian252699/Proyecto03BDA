/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import javax.swing.Icon;

/**
 *
 * @author jalt2
 */
public class Cancion {
    private String nombre;
    private Icon imagen;
    private Solista artistaSolista;
    private Banda artistaBanda;

    public Cancion() {
    }
    
    //Cuando la cancion sea de un solista
    public Cancion(String nombre, Icon imagen, Solista artistaSolista) {
        this.nombre = nombre;
        this.imagen = imagen;
        this.artistaSolista = artistaSolista;
    }
    
    //Cuando la cancion sea de una banda
    public Cancion(String nombre, Icon imagen, Banda artistaBanda) {
        this.nombre = nombre;
        this.imagen = imagen;
        this.artistaBanda = artistaBanda;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Icon getImagen() {
        return imagen;
    }

    public void setImagen(Icon imagen) {
        this.imagen = imagen;
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
