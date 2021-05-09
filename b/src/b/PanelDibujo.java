/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package b;

import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Graphics;
import java.security.SecureRandom;
/**
 *
 * @author juan
 */
public class PanelDibujo extends JPanel{
    private SecureRandom numerosAleatorios = new SecureRandom();
    private MiLinea[] lineas; 
    
    // constructor, crea un panel con figuras al azar
    public PanelDibujo()
    {
        setBackground( Color.WHITE);
        lineas = new MiLinea[5 + numerosAleatorios.nextInt(5)];
        // crea lineas
        for (int cuenta = 0; cuenta < lineas.length; cuenta++)
        {
            // genera coordenadas aleatorias
            int x1 = numerosAleatorios.nextInt(300);
            int y1 = numerosAleatorios.nextInt(300);
            int x2 = numerosAleatorios.nextInt( 300);
            int y2 = numerosAleatorios.nextInt(300);
            // genera un color aleatorio
            Color color = new Color(numerosAleatorios.nextInt(256),
            numerosAleatorios.nextInt(256), numerosAleatorios.nextInt(256));
            // agrega la línea a la lista de líneas a mostrar en pantalla
            lineas[cuenta] = new MiLinea(x1, y1, x2, y2, color);
        }
    }
    // para cada arreglo de figuras, dibuja las figuras individuales
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        // dibuja las líneas
        for (MiLinea linea : lineas)
        linea.dibujar(g);
    }
} // fin de la clase PanelDibujo
