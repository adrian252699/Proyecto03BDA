/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import java.util.Calendar;
import org.bson.Document;

/**
 *
 * @author jalt2
 */
public class Integrante {
    private String nombreCompleto;
    private String rol;
    private Calendar fechaIngreso;
    private Calendar fechaSalida;
    private Boolean estado;

    public Integrante() {
    }
    
    
    
    public Integrante(String nombre, String rol, Calendar fechaIngreso, Calendar fechaSalida, Boolean estado) {
        this.nombreCompleto = nombre;
        this.rol = rol;
        this.fechaIngreso = fechaIngreso;
        this.fechaSalida = fechaSalida;
        this.estado = estado;
    }

    public Integrante(String nombre, String rol, Calendar fechaIngreso, Boolean estado) {
        this.nombreCompleto = nombre;
        this.rol = rol;
        this.fechaIngreso = fechaIngreso;
        this.estado = estado;
    }
    
    public Document toDocument() {
        return new Document("nombreCompleto", nombreCompleto)
            .append("rol", rol)
            .append("fechaIngreso", fechaIngreso != null ? fechaIngreso.getTime() : null)
            .append("fechaSalida", fechaSalida != null ? fechaSalida.getTime() : null)
            .append("estado", estado);
    }
    
    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public Calendar getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(Calendar fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public Calendar getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(Calendar fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }
    
    
    
}
