/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import java.util.Calendar;

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
    
}
