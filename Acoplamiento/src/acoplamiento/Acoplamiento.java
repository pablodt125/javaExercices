/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package acoplamiento;
import java.util.Scanner;
/**
 *
 * @author juan
 */
public class Acoplamiento {

    /**
     * @param args the command line arguments
     */
    
    //Este codigo esta muy mal imlementado a nivel laboral porque 
    //requiere que las clases tengan una alta cohecion y una baja modularidad.
    //Esto se debe a que todos los metodos dependen de otras clases, y lo peor es que 
    //no se tienen ninguna relacion entre si.
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        C a=new C(sc.nextInt());
        System.out.println(a.sampleMethod());
    }
    
}
