/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package solistaDTOs;

import java.util.List;
import javax.swing.Icon;

/**
 *
 * @author jalt2
 */
public class NuevoSolistaDTO {
    private String idSolista;
    private String nombreArtista;
    private String rutaImagen;
    private List<String> listaGeneros;

    public NuevoSolistaDTO() {
    }

    public NuevoSolistaDTO(String idSolista, String nombreArtista, String imagen, List<String> listaGeneros) {
        this.idSolista = idSolista;
        this.nombreArtista = nombreArtista;
        this.rutaImagen = imagen;
        this.listaGeneros = listaGeneros;
    }
    
    public NuevoSolistaDTO(String nombreArtista, String imagen, List<String> listaGeneros) {
        this.nombreArtista = nombreArtista;
        this.rutaImagen = imagen;
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

    public String getImagen() {
        return rutaImagen;
    }

    public void setImagen(String imagen) {
        this.rutaImagen = imagen;
    }

    public List<String> getListaGeneros() {
        return listaGeneros;
    }

    public void setListaGeneros(List<String> listaGeneros) {
        this.listaGeneros = listaGeneros;
    }
    
    
}
