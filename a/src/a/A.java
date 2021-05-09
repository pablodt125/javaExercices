/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;
/**
 *
 * @author juan
 */
public class A extends JPanel{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DibujarCaraSonriente panel=new DibujarCaraSonriente();
        JFrame aplicacion=new JFrame();
        
        aplicacion.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        aplicacion.add(panel);
        aplicacion.setSize(230,250);
        aplicacion.setVisible(true);
    }   
}
