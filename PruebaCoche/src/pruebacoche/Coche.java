/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebacoche;

/**
 *
 * @author juan
 */
public class Coche {
    private boolean prendido;
    public void prender(){
        System.out.println("El carro esta prendido...");
        this.prendido=true;
    }
    public void apagar(){
        System.out.println("El carro esta prendido...");
        this.prendido=false;
    }
    public void acelerar(){
        System.out.println("El carro esta acelerando...");
    }
    public void frenar(){
        System.out.println("El carro frena...");
    }
    public void tanquear(){
        System.out.println("Tanquear");
    }
}
