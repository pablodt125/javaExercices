/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebacarro;

/**
 *
 * @author juan
 */
public class Carro {
    private String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    
    public void prender(){
        System.out.println("Prendiendo");
    }
    
    public void acelerar(){
        System.out.println("Acelerando...");
    }
    public void  apagar(){
        System.out.println("Apagando");

    }
    public void frenar(){
        System.out.println("Frenando");
    } 
    
    
}
