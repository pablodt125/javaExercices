/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ferreteria;
import javax.swing.JOptionPane;
/**
 *
 * @author juan
 */
public class Ferreteria {

    /**
     * @param args the command line arguments
     */
    
    
    public static void main(String[] args) {
        Factura nFac=new Factura("N0001","Llave de precicion",25.65,9);
        
        double i=nFac.obtenerMontoFactura();
        
        nFac.setPrecioPieza(-6.2);
        i=nFac.obtenerMontoFactura();
        
        JOptionPane.showMessageDialog(null, "El valor de total es: "+i);
        
    }
    
}
