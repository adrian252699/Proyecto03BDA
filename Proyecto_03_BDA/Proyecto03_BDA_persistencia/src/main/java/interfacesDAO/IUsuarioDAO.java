/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package interfacesDAO;

import entidades.Usuario;
import usuarioDTOs.LoginUsuarioDTO;
import usuarioDTOs.ModificarUsuarioDTO;
import usuarioDTOs.RegistrarUsuarioDTO;

/**
 *
 * @author jalt2
 */
public interface IUsuarioDAO {
    public boolean registrarUsuario(RegistrarUsuarioDTO nuevoUsuario)throws Exception;
    public LoginUsuarioDTO iniciarSesion(LoginUsuarioDTO usuarioLogin)throws Exception;
    public boolean modificarUsuario(ModificarUsuarioDTO usuarioModificar)throws Exception;
}
