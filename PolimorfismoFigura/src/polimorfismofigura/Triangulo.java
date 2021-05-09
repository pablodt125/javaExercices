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
public class Triangulo extends Figura{
    private double area,base,altura;

    public Triangulo(double base,double altura ) {
        this.altura=altura;
        this.base=base;
    }
    public void setArea(double base,double altura){
        this.area= (double) (base*altura)/2;
    }
    public double getArea(){
        return this.area;
    }
}
