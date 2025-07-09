/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bandaDTOs;

import entidades.Album;
import entidades.Integrante;
import java.util.List;

/**
 *
 * @author jalt2
 */
public class NuevaBandaDTO {
    private String nombreBanda;
    private List<String> listaGeneros;
    private List<Integrante> listaIntegrantes;
    private List<Album> albumes;

    public NuevaBandaDTO() {
    }

    public NuevaBandaDTO(String nombreBanda, List<String> listaGeneros, List<Integrante> listaIntegrantes, List<Album> albumes) {
        this.nombreBanda = nombreBanda;
        this.listaGeneros = listaGeneros;
        this.listaIntegrantes = listaIntegrantes;
        this.albumes = albumes;
    }

    public String getNombreBanda() {
        return nombreBanda;
    }

    public void setNombreBanda(String nombreBanda) {
        this.nombreBanda = nombreBanda;
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

    public List<Album> getAlbumes() {
        return albumes;
    }

    public void setAlbumes(List<Album> albumes) {
        this.albumes = albumes;
    }
    
    
}
