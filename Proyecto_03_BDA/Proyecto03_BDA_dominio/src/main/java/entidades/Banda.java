/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import java.util.List;
import javax.swing.Icon;
import org.bson.Document;

/**
 *
 * @author jalt2
 */
public class Banda {
    private String nombreBanda;
    private String rutaImagen;
    private List<String> listaGeneros;
    private List<Integrante> listaIntegrantes;
    private List<Album> albumes;

    public Banda() {
    }

    public Banda(String nombreBanda, String imagen, List<String> listaGeneros, List<Integrante> listaIntegrantes) {
        this.nombreBanda = nombreBanda;
        this.rutaImagen = imagen;
        this.listaGeneros = listaGeneros;
        this.listaIntegrantes = listaIntegrantes;
    }
    
    public Document toDocument(){
        return new Document();
    }
    
    public String getNombreBanda() {
        return nombreBanda;
    }

    public void setNombreBanda(String nombreBanda) {
        this.nombreBanda = nombreBanda;
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

    public List<Integrante> getListaIntegrantes() {
        return listaIntegrantes;
    }

    public void setListaIntegrantes(List<Integrante> listaIntegrantes) {
        this.listaIntegrantes = listaIntegrantes;
    }
    
    
}
