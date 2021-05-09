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
public class Rectangulo extends Figura{
    private double area,base,altura;
    
    
    
    public Rectangulo(double b,double a){
        this.base= b;
        this.altura= a;
    }
    
    public void setArea(){
        this.area= this.base*this.altura;
    }

    public double getArea() {
        return area;
    }
    
}
