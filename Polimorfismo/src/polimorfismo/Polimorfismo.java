/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfismo;

/**
 *
 * @author juan
 */
public class Polimorfismo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Mobile telefonos[]=new Mobile[3];
       telefonos[0]=new Iphone();
       telefonos[1]=new Xiaomi();
       telefonos[2]=new Mobile();
       
       telefonos[0].sms();
       telefonos[1].sms();
       telefonos[2].sms();
    }
    
}
