/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebaclase;
import  javax.swing.JOptionPane;
/**
 *
 * @author juan
 */

public class PruebaClase {
    public static void menu(){
        JOptionPane.showMessageDialog(null, """
                                            Seleccione una de las opciones:
                                            1. Ver las notas de todo el grupo.
                                            2. Cambiar nota de uno de los estudiantes.
                                            3. Mostrar el promedio del grupo.
                                            4. Mostrar la cantidad de estudiantes por encima del promedio.
                                            0. Salir del programa.""");
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Clase grupoEst=new Clase();
        int option=1;
        while(option!=0){
            menu();
           option=Integer.parseInt(JOptionPane.showInputDialog("Ingrese una de las opciones: "));
           switch(option){
            case 0:
                JOptionPane.showMessageDialog(null, "Saliendo del programa... Hasta luego");
                break;
            case 1:
                grupoEst.verNotas();
                break;
            case 2:
                int noEst=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de estudiante que quiere cambiar la nota: "));
                double newNota=Double.parseDouble(JOptionPane.showInputDialog("Ingrese la nueva nota del estudiante: "));
                grupoEst.cambiarNota(noEst, newNota);
                break;
            case 3:
                grupoEst.setPromedio();
                JOptionPane.showMessageDialog(null,("El promedio es: " + grupoEst.getPromedio()));
                break;
            case 4:
                grupoEst.setCantEst();
                JOptionPane.showMessageDialog(null,("La cantidad de estudiantes que tienen una nota superior al promedio es: " + grupoEst.getCantEst()));
                break;
            } 
           
            
          
        }
        
        
    }
    
}
