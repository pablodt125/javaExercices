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
public class Juego {
    private Jugador j1,j2;
    private Dado dado1,dado2;
    private final int turno=0;
    
    public Juego(){
        j1=new Jugador("Juan", "Florez");
        j2=new Jugador("Juan", "Perez");
    }
    public boolean resulDados(){
        int a,b;
        a=dado1.lanzar();
        b=dado2.lanzar();
        return a==b && a==6;
    }
}
