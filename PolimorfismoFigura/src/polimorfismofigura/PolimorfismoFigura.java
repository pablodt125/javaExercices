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
public class PolimorfismoFigura {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Figura[] arreglo= new Figura[4];
        arreglo[0]=new Triangulo(5,5);
        arreglo[1]=new Rectangulo(5,5);
        arreglo[2]=new Cuadrado(2);
        arreglo[3]=new Poligono();
        
        arreglo[3].mueveFigura(arreglo[3], 9);
    }
    
}
