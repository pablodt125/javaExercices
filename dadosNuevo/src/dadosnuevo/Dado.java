/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dadosnuevo;

/**
 *
 * @author juan
 */
public class Dado {
    public int lanzar(){
        int a= (int) (Math.random()*7);
        return a;
    }
}
