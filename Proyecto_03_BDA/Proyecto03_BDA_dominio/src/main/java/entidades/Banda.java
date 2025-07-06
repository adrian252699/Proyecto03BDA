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
public class Banda {
    private String nombreBanda;
    private Icon imagen;
    private List<String> listaGeneros;
    private List<Integrante> listaIntegrantes;

    public Banda() {
    }

    public Banda(String nombreBanda, Icon imagen, List<String> listaGeneros, List<Integrante> listaIntegrantes) {
        this.nombreBanda = nombreBanda;
        this.imagen = imagen;
        this.listaGeneros = listaGeneros;
        this.listaIntegrantes = listaIntegrantes;
    }

    public String getNombreBanda() {
        return nombreBanda;
    }

    public void setNombreBanda(String nombreBanda) {
        this.nombreBanda = nombreBanda;
    }

    public Icon getImagen() {
        return imagen;
    }

    public void setImagen(Icon imagen) {
        this.imagen = imagen;
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
