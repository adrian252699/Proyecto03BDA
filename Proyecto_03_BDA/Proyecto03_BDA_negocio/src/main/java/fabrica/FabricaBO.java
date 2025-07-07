/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fabrica;

import BOs.SolistaBO;
import BOs.UsuarioBO;
import DAOs.SolistaDAO;
import DAOs.UsuarioDAO;

/**
 *
 * @author jalt2
 */
public class FabricaBO {
    public static UsuarioBO crearUsuarioBO(){
        UsuarioDAO dao = new UsuarioDAO();
        return new UsuarioBO(dao);
    }
    
    public static SolistaBO crearSolistaBO(){
        SolistaDAO dao = new SolistaDAO();
        return new SolistaBO(dao);
    }
}
