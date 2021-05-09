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
public class Cuadrado extends Figura{
    private double lado,area;
    
    public Cuadrado(double l) {
        this.lado=l;
    }
    
    public void setArea(double lado){
        this.area= (double) (lado*lado);
    }
    
}
