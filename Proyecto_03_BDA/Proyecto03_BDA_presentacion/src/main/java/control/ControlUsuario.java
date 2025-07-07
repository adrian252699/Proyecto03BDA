/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import BOs.UsuarioBO;
import fabrica.FabricaBO;
import usuarioDTOs.LoginUsuarioDTO;
import usuarioDTOs.ModificarUsuarioDTO;
import usuarioDTOs.RegistrarUsuarioDTO;

/**
 *
 * @author jalt2
 */
public class ControlUsuario {
    private static ControlUsuario instancia;
    private final UsuarioBO usuarioBO = FabricaBO.crearUsuarioBO();
    private LoginUsuarioDTO usuarioActual;
    
    private ControlUsuario(){
    
    }
    
    public static ControlUsuario getInstance(){
        if (instancia==null) {
            instancia = new ControlUsuario();
        }
        return instancia;
    }
    
    public boolean registrarUsuario(RegistrarUsuarioDTO nuevoUsuario) throws Exception{
        return usuarioBO.registrarUsuario(nuevoUsuario);
    }
    
    public LoginUsuarioDTO iniciarSesion(LoginUsuarioDTO loginUsuario) throws Exception{
        return usuarioBO.iniciarSesion(loginUsuario);
    }
    
    public boolean modificarUsuario(ModificarUsuarioDTO usuarioModificar) throws Exception{
        return usuarioBO.modificarUsuario(usuarioModificar);
    }

    public void setUsuarioActual(LoginUsuarioDTO usuarioActual) {
        this.usuarioActual = usuarioActual;
    }

    public LoginUsuarioDTO getUsuarioActual() {
        return usuarioActual;
    }
    
    
}
