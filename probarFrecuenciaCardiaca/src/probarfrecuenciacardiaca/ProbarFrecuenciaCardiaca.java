/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package probarfrecuenciacardiaca;
import javax.swing.JOptionPane;
/**
 *
 * @author juan
 */
public class ProbarFrecuenciaCardiaca {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        String name=JOptionPane.showInputDialog(null,"Ingrese el nombre: ");
        String apellido=JOptionPane.showInputDialog(null,"Ingrese apellido:");
        int dia=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese dia de nacimiento de la persona: "));
        int mes=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese mes de nacimiento de la persona: "));
        int anyo=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese anyo de nacimiento de la persona: "));
        FrecuenciaCardiaca calculo=new FrecuenciaCardiaca(name, apellido, dia, mes, anyo);
        
        
        int edad=calculo.Edad(2021);
        JOptionPane.showMessageDialog(null,("La edad de la " + calculo.getNombre()+" "+calculo.getApellido()+" es: "+edad));
         
        int frecuenciaMax=calculo.FrecuenciaMax(edad);
        JOptionPane.showMessageDialog(null,("La frecuencia Max de la persona deberia ser: "+frecuenciaMax));
        
        JOptionPane.showMessageDialog(null,("La frecuencia relativa esta entre:"+calculo.FrecuenciaRel(frecuenciaMax, 50)+" y "+calculo.FrecuenciaRel(frecuenciaMax, 85)));
      
    }
    
}
