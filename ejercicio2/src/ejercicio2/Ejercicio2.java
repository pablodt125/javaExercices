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
public class Ejercicio2 {
    int dado1, dado2;
    public int tirarDados(){
        return (int)Math.random()*7;
    }
    public boolean verDados(){
        if(this.tirarDados()==6){
            if(this.tirarDados()==6){
                return true;
            }
        }
        return false;
    }
}
