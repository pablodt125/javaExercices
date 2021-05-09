/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfismofigura;

import jdk.jfr.Unsigned;

/**
 *
 * @author juan
 */
public class Figura {
    private double area;
    private double perimetro;
    
    public Figura() {
        this.area=0.0;
        this.perimetro=0.0;
    }
    public void setArea(double area){
        if (area>0) this.area=area;
        else this.area=0;
        
    }
    public double getArea(){
        return this.area;
    }
    public void mueveFigura(Figura f,double pos){
        f.borra();
        f.dibujar(pos);   
    }
    
}
