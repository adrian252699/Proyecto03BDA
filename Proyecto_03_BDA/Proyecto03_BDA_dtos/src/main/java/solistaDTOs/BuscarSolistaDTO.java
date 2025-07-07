/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package solistaDTOs;

import java.util.List;

/**
 *
 * @author jalt2
 */
public class BuscarSolistaDTO {
    private String idSolista;
    private String nombreArtista;
    private String rutaImagen;
    private List<String> listaGeneros;

    public BuscarSolistaDTO() {
    }

    public BuscarSolistaDTO(String idSolista, String nombreArtista, String rutaImagen, List<String> listaGeneros) {
        this.idSolista = idSolista;
        this.nombreArtista = nombreArtista;
        this.rutaImagen = rutaImagen;
        this.listaGeneros = listaGeneros;
    }

    public BuscarSolistaDTO(String nombreArtista, String rutaImagen, List<String> listaGeneros) {
        this.nombreArtista = nombreArtista;
        this.rutaImagen = rutaImagen;
        this.listaGeneros = listaGeneros;
    }

    public String getIdSolista() {
        return idSolista;
    }

    public void setIdSolista(String idSolista) {
        this.idSolista = idSolista;
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
