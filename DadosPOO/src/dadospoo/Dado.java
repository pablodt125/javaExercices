/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dadospoo;

/**
 *
 * @author juan
 */
public class Dado {
    private int valor;

    public int getValor() {
        return valor;
    }

    public void setValor() {
        this.valor = ( int) (Math.random()*7);
    }
    
}
