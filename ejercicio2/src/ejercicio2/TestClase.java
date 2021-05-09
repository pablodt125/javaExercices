/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;

/**
 *
 * @author juan
 */



public class TestClase {
    
    
    public static void main(String[] args) {
        Ejercicio2 persona;
        persona=new Ejercicio2();
        boolean band=true;
        int[] vec;
        vec=new int[2];
        vec[0]=1;vec[1]=2;
        while(band){
            for(int x=0;x<2;x++){
                if(persona.verDados()) System.out.println("Ganaste Jugador "+vec[x]);
                else System.out.println("Perdiste Jugador "+vec[x]);
                    
            }
        }
        
    }
}
