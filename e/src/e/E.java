/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e;

import java.util.Scanner;

/**
 *
 * @author juan
 */
public class E {

    /**
     * @param args the command line arguments
     */
    
    public static int cociente(int numerador, int denominador)
        {
        return numerador / denominador; // posible división entre cero
        }
    
    /**
     *
     * @param args
     */
    public static void main(String[] args){
        Scanner explorador = new Scanner(System.in);
        
        System.out.print( "Introduzca un numerador entero: ");
        
        int numerador = explorador.nextInt();
        System.out.print("Introduzca un denominador entero: ");
        
        int denominador = explorador.nextInt();
        int resultado = cociente(numerador, denominador);
        System.out.printf("%nResultado: %d / %d = %d%n", numerador, denominador, resultado);
        }
}
    

