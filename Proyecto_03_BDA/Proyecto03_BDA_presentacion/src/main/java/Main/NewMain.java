/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Main;

import control.ControlNavegacion;
import inicio.Inicio;

/**
 *
 * @author jalt2
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ControlNavegacion control = ControlNavegacion.getInstance();
        control.iniciarFlujoLogin();
    }
    
}
