/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import java.util.List;
import javax.swing.Icon;

/**
 *
 * @author jalt2
 */
public class Solista {
    private String nombreArtista;
    private String rutaImagen;
    private List<String> listaGeneros;
    private List<Album> albumes;

    public Solista(String nombreArtista, String rutaImagen, List<String> listaGeneros, List<Album> albumes) {
        this.nombreArtista = nombreArtista;
        this.rutaImagen = rutaImagen;
        this.listaGeneros = listaGeneros;
        this.albumes = albumes;
    }

    
    public Solista(String nombreArtista, String imagen, List<String> listaGeneros) {
        this.nombreArtista = nombreArtista;
        this.rutaImagen = imagen;
        this.listaGeneros = listaGeneros;
    }

    public String getNombreArtista() {
        return nombreArtista;
    }

    public void setNombreArtista(String nombreArtista) {
        this.nombreArtista = nombreArtista;
    }

    public String getRutaImagen() {
        return rutaImagen;
    }

    public void setRutaImagen(String rutaImagen) {
        this.rutaImagen = rutaImagen;
    }

    public List<String> getListaGeneros() {
        return listaGeneros;
    }

    public void setListaGeneros(List<String> listaGeneros) {
        this.listaGeneros = listaGeneros;
    }
    
    
}
