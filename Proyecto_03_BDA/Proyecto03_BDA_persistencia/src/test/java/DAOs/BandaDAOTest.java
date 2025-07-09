/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package DAOs;

import bandaDTOs.NuevaBandaDTO;
import entidades.Album;
import entidades.Cancion;
import entidades.Integrante;
import interfacesDAO.IBandaDAO;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author jalt2
 */
public class BandaDAOTest {
    
    public BandaDAOTest() {
    }

    /**
     * Test of registrarBanda method, of class BandaDAO.
     */
    @Test
    public void testRegistrarBanda() throws Exception {
        IBandaDAO dao = new BandaDAO();
        
        List<String> listaGeneros = new ArrayList<>();
        List<Integrante> integrantes = new ArrayList<>();
        List<Album> listaAlbumes = new ArrayList<>();
        List<Cancion> canciones = new ArrayList<>();
        
        listaGeneros.add("Rock");
        listaGeneros.add("Nu Metal");
        
        Calendar fecha = Calendar.getInstance();
        fecha.set(Calendar.YEAR, 1980);
        fecha.set(Calendar.MONTH,Calendar.APRIL);
        fecha.set(Calendar.DAY_OF_MONTH, 25);
        integrantes.add(new Integrante("Chino Moreno", "Cantante", fecha, null, true));
        integrantes.add(new Integrante("Stephen", "Guitarrista", fecha, null, true));
        
        canciones.add(new Cancion("My own Summer", 3.34));
        
        Calendar fechaAlbum = Calendar.getInstance();
        fechaAlbum.set(Calendar.YEAR, 1997);
        listaAlbumes.add(new Album("Around the fur", fechaAlbum, listaGeneros, "/imgsArtistas/Canciones/TuyoByMora.jpg", canciones));
        
        NuevaBandaDTO nuevaBanda = new NuevaBandaDTO("Deftones", listaGeneros, integrantes, listaAlbumes);
        
        dao.registrarBanda(nuevaBanda);
    }
    
}
