/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;


import buscador.Buscador;
import detalles.DetalleAlbum;
import detalles.DetalleArtistaBanda;
import detalles.DetalleArtistaSolista;
import detalles.DetalleFavoritos;
import inicio.ExplorarAlbumes;
import inicio.ExplorarArtistas;
import inicio.ExplorarCanciones;
import inicio.ExplorarGeneros;
import inicio.Inicio;
import java.awt.Component;
import java.awt.Container;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Stack;
import javax.swing.JFrame;
import javax.swing.JTextField;
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
    private Stack<JFrame> historialAtras = new Stack<>();
    private Stack<JFrame> historialAdelante = new Stack<>();
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
    private DetalleFavoritos frmDetalleFavoritos;
    
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
    
    //Iniciar flujo del login
    
    public void iniciarFlujoLogin(){
        this.frmLogin = new Login(this);
        this.frmLogin.setVisible(true);
    }
    
    public void iniciarRegistrarUsuario(){
        this.frmRegistrarUsuario = new RegistrarUsuario(this);
        this.frmLogin.dispose();
        this.frmRegistrarUsuario.setVisible(true);
    }
    
    //Primero el flujo iniciara sin el inicio de sesion
    public void iniciarFlujoUsuario(){
        this.frmIncioFlujo = new Inicio(this);
        this.abrirFrame(frmIncioFlujo);
        
    }
    
    /*Flujo Ver y editar perfil*/
    public void iniciarVerPerfil(){
        this.frmMiPerfil = new MiPerfil(this);
        this.abrirFrame(frmMiPerfil);
    }
    
    /*Flujo ver Favoritos*/
    public void iniciarVerFavoritos(){
        this.frmDetalleFavoritos = new DetalleFavoritos(this);
        this.abrirFrame(frmDetalleFavoritos);
        
    }
    
    
    //Metodos para guardar frame anterior
    
    private void abrirFrame(JFrame nuevoFrame) {
        if (frmActual != null) {
            historialAtras.push(frmActual);
            frmActual.setVisible(false);
        }
        historialAdelante.clear(); // se pierde el futuro si abres algo nuevo
        frmActual = nuevoFrame;
        frmActual.setVisible(true);
    }
    
    public void regresar() {
        if (!historialAtras.isEmpty()) {
            historialAdelante.push(frmActual);
            frmActual.setVisible(false);
            frmActual = historialAtras.pop();
            frmActual.setVisible(true);
        } else {
            System.out.println("No hay frame anterior");
        }
    }
    
    public void adelantar() {
        if (!historialAdelante.isEmpty()) {
            historialAtras.push(frmActual);
            frmActual.setVisible(false);
            frmActual = historialAdelante.pop();
            frmActual.setVisible(true);
        } else {
            System.out.println("No hay frame siguiente");
        }
    }
    
    public void agregarClickListeners(Component comp, JTextField txtBuscar) {
        if (!(comp instanceof JTextField)) {
            comp.addMouseListener(new MouseAdapter() {
                @Override
                public void mousePressed(MouseEvent e) {
                    if (txtBuscar.hasFocus() && txtBuscar.getText().isEmpty()) {
                        txtBuscar.setText("");
                        
                    }
                    comp.requestFocusInWindow();
                }
            });
        }
        if (comp instanceof Container) {
            for (Component child : ((Container) comp).getComponents()) {
                agregarClickListeners(child, txtBuscar);
            }
        }
    }

    public JFrame getFrmActual() {
        return frmActual;
    }
    
    
}
