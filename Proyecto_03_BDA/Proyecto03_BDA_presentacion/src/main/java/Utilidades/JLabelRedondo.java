/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Utilidades;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

/**
 *
 * @author jalt2
 */
public class JLabelRedondo extends JLabel{
    private Color colorFondo;

    public JLabelRedondo(String texto, Color colorFondo) {
        super(texto, SwingConstants.CENTER);
        this.colorFondo = colorFondo;
        setOpaque(false); // Para que no pinte el fondo rectangular por defecto
        setForeground(Color.WHITE);
    }

    @Override
    protected void paintComponent(Graphics g) {
        // Pintar un círculo como fondo
        Graphics2D g2 = (Graphics2D) g.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        int diameter = Math.min(getWidth(), getHeight());
        g2.setColor(colorFondo);
        g2.fillOval(0, 0, diameter, diameter);

        g2.dispose();
        super.paintComponent(g); // Para dibujar el texto encima
    }

    @Override
    public Dimension getPreferredSize() {
        // Asegurarse de que sea cuadrado
        Dimension size = super.getPreferredSize();
        int diameter = Math.max(size.width, size.height);
        return new Dimension(diameter, diameter);
    }
    
}
