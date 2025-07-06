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
    private Icon imagen;
    private List<String> listaGeneros;

    public Solista(String nombreArtista, Icon imagen, List<String> listaGeneros) {
        this.nombreArtista = nombreArtista;
        this.imagen = imagen;
        this.listaGeneros = listaGeneros;
    }

    public String getNombreArtista() {
        return nombreArtista;
    }

    public void setNombreArtista(String nombreArtista) {
        this.nombreArtista = nombreArtista;
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
    
    
}
