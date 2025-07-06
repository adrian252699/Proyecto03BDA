/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;


import buscador.Buscador;
import detalles.DetalleAlbum;
import detalles.DetalleArtistaBanda;
import detalles.DetalleArtistaSolista;
import inicio.ExplorarAlbumes;
import inicio.ExplorarArtistas;
import inicio.ExplorarCanciones;
import inicio.ExplorarGeneros;
import inicio.Inicio;
import java.util.Stack;
import javax.swing.JFrame;
import login.Login;
import login.RegistrarUsuario;
import miPerfil.MiPerfil;
import miPerfil.MiPerfilEditar;


/**
 *
 * @author jalt2
 */
public class ControlNavegacion {
    /*Utilidades*/
    private Stack<JFrame> historial = new Stack<>();
    private JFrame frmActual;
    private static ControlNavegacion instancia;
    
    
    /*Forms de Inicio de sesion*/
    private Login frmLogin;
    private RegistrarUsuario frmRegistrarUsuario;
    
    /*Forms de flujo principal*/
    private Inicio frmIncioFlujo;
    
    /*Forms de exploracion de catalogo*/
    private ExplorarAlbumes frmExplorarAlbumes;
    private ExplorarArtistas frmExplorarArtistas;
    private ExplorarCanciones frmExplorarCanciones;
    private ExplorarGeneros frmExplorarGeneros;
    
    /*Forms de detalles*/
    private DetalleAlbum frmDetalleAlbum;
    private DetalleArtistaBanda frmDetalleBanda;
    private DetalleArtistaSolista frmDetalleSolista;
    
    /*Forms mi perfil*/
    private MiPerfil frmMiPerfil;
    private MiPerfilEditar frmMiPerfilEditar;
    
    /*PanelBuscador*/
    private Buscador pnlBuscador;

    private ControlNavegacion() {
        
    }
    
    public static ControlNavegacion getInstance(){
        if (instancia == null) {
            instancia = new ControlNavegacion();
        }
        return instancia;
    }
    
    //Primero el flujo iniciara sin el inicio de sesion
    public void iniciarFlujo(){
        this.frmIncioFlujo = new Inicio(this);
        this.abrirFrame(frmIncioFlujo);
        
    }
    
    public void iniciarVerPerfil(){
        this.frmMiPerfil = new MiPerfil(this);
        this.abrirFrame(frmMiPerfil);
    }
    
    /*Flujo Ver y editar perfil*/
    
    
    //Metodos para guardar frame anterior
    
    public void abrirFrame(JFrame nuevoFrame){
        if (frmActual!=null) {
            historial.push(frmActual);
            frmActual.setVisible(false);
        }
        
        frmActual = nuevoFrame;
        frmActual.setVisible(true);
    }
    
    public void regresar(){
        if (!historial.isEmpty()) {
            frmActual.dispose();
            frmActual = historial.pop();
            frmActual.setVisible(true);
        } else{
            System.out.println("Ya no hay frame anterior");
        }
    }
    
}
