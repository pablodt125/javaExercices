/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dadospoo;

import java.util.Scanner;
import java.util.ArrayList;
/**
 *
 * @author juan
 */


public class DadosPOO {
    static void Menu(){
        System.out.println("Bienvenido al juego de dados, ingrese los nombres del jugador 1 y jugador dos: ");
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Menu();
        boolean band=true;
        
        Dado dado1=new Dado();
        Dado dado2=new Dado();
     
        Jugador arrayObjetos[]=new Jugador[2];
        arrayObjetos[0]=new Jugador();
        arrayObjetos[0].setNombre(sc.nextLine());
        arrayObjetos[1]=new Jugador();
        arrayObjetos[1].setNombre(sc.nextLine());
        
        
        while(band){
            
            for (int x = 0; x < 2; x++) {
                
                dado1.setValor();
                dado2.setValor();
                
                System.out.println("Los resultados para "+arrayObjetos[x].getNombre()+":");
                System.out.println(dado1.getValor()+"   "+dado2.getValor());
                
                if (dado1.getValor()==dado2.getValor() && dado1.getValor()==6) {
                        System.out.println("FELICIDADES A "+ arrayObjetos[x].getNombre()+" HAZ GANADO");
                        return;
                }
                
            }
            
        }
    }
}
        
    
    

