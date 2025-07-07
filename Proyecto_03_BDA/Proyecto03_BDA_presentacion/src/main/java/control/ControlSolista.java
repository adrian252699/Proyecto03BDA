/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import BOs.SolistaBO;
import fabrica.FabricaBO;
import java.util.List;
import solistaDTOs.BuscarSolistaDTO;

/**
 *
 * @author jalt2
 */
public class ControlSolista {
    private static ControlSolista instancia;
    private final SolistaBO solistaBO = FabricaBO.crearSolistaBO();
    
    
    private ControlSolista(){
    
    }
    
    public static ControlSolista getInstance(){
        if (instancia == null) {
            instancia = new ControlSolista();
        }
        return instancia;
    }
    
    public BuscarSolistaDTO recuperarArtista(BuscarSolistaDTO solistaBuscar) throws Exception{
        return solistaBO.buscarSolista(solistaBuscar);
    }
    
    public List<BuscarSolistaDTO> recuperarArtistas() throws Exception{
        return solistaBO.recuperarSolistas();
    }
}
