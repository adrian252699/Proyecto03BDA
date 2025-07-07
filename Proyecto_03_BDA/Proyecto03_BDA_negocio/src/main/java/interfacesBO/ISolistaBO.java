/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package interfacesBO;

import java.util.List;
import solistaDTOs.BuscarSolistaDTO;

/**
 *
 * @author jalt2
 */
public interface ISolistaBO {
    public BuscarSolistaDTO buscarSolista(BuscarSolistaDTO solistaBuscar)throws Exception;
    public List<BuscarSolistaDTO> recuperarSolistas()throws Exception;
}
