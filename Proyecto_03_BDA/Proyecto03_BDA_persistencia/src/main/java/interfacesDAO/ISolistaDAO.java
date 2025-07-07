/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package interfacesDAO;

import java.util.List;
import solistaDTOs.BuscarSolistaDTO;
import solistaDTOs.NuevoSolistaDTO;

/**
 *
 * @author jalt2
 */
public interface ISolistaDAO {
    public boolean agregarSolista(NuevoSolistaDTO nuevoSolista)throws Exception;
    public BuscarSolistaDTO buscarSolista(BuscarSolistaDTO solistaBuscar)throws Exception;
    public List<BuscarSolistaDTO> recuperarSolistas()throws Exception;
}
