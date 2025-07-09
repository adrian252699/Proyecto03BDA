/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package interfacesDAO;

import bandaDTOs.NuevaBandaDTO;
import entidades.Banda;

/**
 *
 * @author jalt2
 */
public interface IBandaDAO {
    public boolean registrarBanda(NuevaBandaDTO nuevaBanda)throws Exception;
    
}
