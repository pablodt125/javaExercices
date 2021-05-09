/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package b;
import javax.swing.JFrame;
/**
 *
 * @author juan
 */
public class B {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PanelDibujo panel = new PanelDibujo();
        JFrame aplicacion = new JFrame();
        aplicacion.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        aplicacion.add(panel);
        aplicacion.setSize(300, 300);
        aplicacion.setVisible(true);
    }
    
}
