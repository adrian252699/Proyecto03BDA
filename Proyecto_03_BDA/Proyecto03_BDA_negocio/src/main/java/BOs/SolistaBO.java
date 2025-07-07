/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BOs;

import DAOs.SolistaDAO;
import interfacesBO.ISolistaBO;
import java.util.List;

import solistaDTOs.BuscarSolistaDTO;

/**
 *
 * @author jalt2
 */
public class SolistaBO implements ISolistaBO{
    private SolistaDAO dao;

    public SolistaBO(SolistaDAO dao) {
        this.dao = new SolistaDAO();
    }
    
    
    
    @Override
    public BuscarSolistaDTO buscarSolista(BuscarSolistaDTO solistaBuscar) throws Exception {
        return dao.buscarSolista(solistaBuscar);
    }

    @Override
    public List<BuscarSolistaDTO> recuperarSolistas() throws Exception {
        return dao.recuperarSolistas();
    }
}
