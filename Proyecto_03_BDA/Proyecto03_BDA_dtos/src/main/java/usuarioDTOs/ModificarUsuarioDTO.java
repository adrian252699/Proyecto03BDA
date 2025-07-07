/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package usuarioDTOs;

/**
 *
 * @author jalt2
 */
public class ModificarUsuarioDTO {
    private String idUsuario;
    private String nombreUsuario;
    private String Correo;
    private String contrasena;
    private String nombre;
    private String apellidoPaterno;
    private String apellidoMaterno;

    public ModificarUsuarioDTO() {
    }

    public ModificarUsuarioDTO(String idUsuario, String nombreUsuario, String Correo, String contrasena, String nombre, String apellidoPaterno, String apellidoMaterno) {
        this.idUsuario = idUsuario;
        this.nombreUsuario = nombreUsuario;
        this.Correo = Correo;
        this.contrasena = contrasena;
        this.nombre = nombre;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
    }
    
    
    
    public ModificarUsuarioDTO(String nombreUsuario, String Correo, String contrasena, String nombre, String apellidoPaterno, String apellidoMaterno) {
        this.nombreUsuario = nombreUsuario;
        this.Correo = Correo;
        this.contrasena = contrasena;
        this.nombre = nombre;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    public String getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(String idUsuario) {
        this.idUsuario = idUsuario;
    }
    
    
}
