/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfismofigura;

/**
 *
 * @author juan
 */
public class Circulo extends Figura{
    private double area;
    private String name;

    public Circulo() {
        this.name="Circulo";
    }
    
    public void borra (){
        System.out.println(this.name+" borrado");
    }
    public void dibujar(int pos){
        System.out.println(this.name+" dibujado");
    }
}
