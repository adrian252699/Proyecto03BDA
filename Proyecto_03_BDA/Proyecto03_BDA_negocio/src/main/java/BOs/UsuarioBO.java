/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BOs;

import DAOs.UsuarioDAO;
import interfacesBO.IUsuarioBO;
import usuarioDTOs.LoginUsuarioDTO;
import usuarioDTOs.ModificarUsuarioDTO;
import usuarioDTOs.RegistrarUsuarioDTO;

/**
 *
 * @author jalt2
 */
public class UsuarioBO implements IUsuarioBO{
    
    private UsuarioDAO dao;

    public UsuarioBO(UsuarioDAO dao) {
        this.dao = new UsuarioDAO();
    }
    
    //Cambiar despues exceptio por exceptioBO
    @Override
    public boolean registrarUsuario(RegistrarUsuarioDTO nuevoUsuario) throws Exception{
        this.validarUsuarioVacio(nuevoUsuario);
        
        return dao.registrarUsuario(nuevoUsuario);
    }

    @Override
    public LoginUsuarioDTO iniciarSesion(LoginUsuarioDTO usuarioLogin) throws Exception {
        //Validaciones
        if (usuarioLogin.getNombreUsuario() == null) {
            throw new IllegalArgumentException("El Usuario esta vacio");
        }
        
        if (usuarioLogin.getContrasena()== null) {
            throw new IllegalArgumentException("La Contraseña esta vacio");
        }
        
        return dao.iniciarSesion(usuarioLogin);
    }

    @Override
    public boolean modificarUsuario(ModificarUsuarioDTO usuarioModificar) throws Exception {
        if (usuarioModificar.getNombre()==null) {
            throw new IllegalArgumentException("El nombre no puede ser null");
        }
        
        return dao.modificarUsuario(usuarioModificar);
    }
    
    
    private void validarUsuarioVacio(RegistrarUsuarioDTO nuevoUsuario){
        if (nuevoUsuario.getNombre().isEmpty()||nuevoUsuario.getApellidoPaterno().isEmpty()||nuevoUsuario.getCorreo().isEmpty()||nuevoUsuario.getNombreUsuario().isEmpty()||nuevoUsuario.getContrasena().isEmpty()) {
            throw new IllegalArgumentException("Los Campos obligatorios deben ser rellenados");
        }
        
        if (nuevoUsuario.getNombre() == null || nuevoUsuario.getApellidoPaterno()==null) {
            //lanzar excepcion
            throw new IllegalArgumentException("El nombre o el apellido paterno no pueden ser null");
        }
    }
    
}
