/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kilometrajegasolina;
import java.util.Scanner;
/**
 *
 * @author juan
 */
public class KilometrajeGasolina {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        
        int m=0,a=0;
        
        KmPerL cantidadCom=new KmPerL(m,a);
        while(a>=0 || m>=0){
            m=sc.nextInt();
            a=sc.nextInt();
            cantidadCom.setKm(m);
            cantidadCom.setL(a);
            System.out.println("los km/L recorridos son ---> "+cantidadCom.getKmL());
            cantidadCom.setTotal(cantidadCom.getKmL());
            
        }
        
        
        
        
        
        
        System.out.println("La cantidad  total de combustible gastado es de ----> "+ cantidadCom.getTotal());
    }
    
}
