/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primerdibujo;
import java.awt.Graphics;
import javax.swing.JPanel;
/**
 *
 * @author juan
 */
public class PanelDibujo extends JPanel{
    // dibuja una x desde las esquinas del panel
    
    public void paintComponent(Graphics g)
    {
        double pasos;
        // llama a paintComponent para asegurar que el panel se muestre correctamente
        super.paintComponent(g);
        int anchura = 0; // anchura total
        int altura = getHeight(); // altura total
        
        pasos=getWidth()/15.0;
        // dibuja una línea de la esquina superior izquierda a la esquina inferior
        //derecha
        double anch2=0;
        for (int i = 0; i < 15; i++) {
            anch2+=(double)pasos;
            g.drawLine(anchura, 0,anchura+(int)anch2, altura);
        }
        
        
        // dibuja una línea de la esquina inferior izquierda a la esquina superior
        //derecha
        
    }
}
