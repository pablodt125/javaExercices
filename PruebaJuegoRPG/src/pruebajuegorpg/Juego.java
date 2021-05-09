/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebajuegorpg;

/**
 *
 * @author juan
 */
public class Juego {
    
    public void cuadroPj(Personaje jugador){
        System.out.println("-------------------------------------------------------------");
        System.out.println(" Nombre: "+jugador.getNombre()+"                                      ");
        System.out.println(" Hp: "+jugador.getHpReal()+"                                      ");
        System.out.println(" hp: "+jugador.getDefensa()+"                                      ");
        System.out.println(" hp: "+jugador.getEvacion()+"                                      ");
        System.out.println("-------------------------------------------------------------");
        
    }
    
    public void estadisticasJugador(Personaje jugador){
        System.out.println("Las caracteristicas actuales  de "+jugador.getNombre()+" son: ");
        System.out.println("\n\nClase: " + jugador.getClase());
        System.out.println("\nAtaque: " + jugador.getAtaque());
        System.out.println("\nVida total: " + jugador.getHpMax());
        System.out.println("\nVida actual: " + jugador.getHpReal());
        System.out.println("\nDefensa: " + jugador.getDefensa());
        System.out.println("\nVelocidad: " + jugador.getVelocidad());
        System.out.println("\nEvacion: " + jugador.getEvacion());
        System.out.println("\nAtaques: "+jugador.getAtaque1()+"\t"+jugador.getAtaque2()+"\t"+jugador.getAtaque3()+"\t"+jugador.getAtaque4());  
    }
    
    public void menu(String nombre){
        System.out.println("Elija una de las siguientes opciones:");
        System.out.println("1.Ver las estadisticas de " + nombre);
        System.out.println("2.Recuperar salud de "+ nombre);
        System.out.println("3.Peleear.");
        System.out.print(">>");
    }
    
    public void menu2(Personaje jugador){
        System.out.println("Elija que ataque quieres realizar "+jugador.nombre+":");
        System.out.println("1. "+jugador.ataque1);
        System.out.println("2. "+jugador.ataque2);
        System.out.println("3. "+jugador.ataque3);
        System.out.println("4. "+jugador.ataque4);
        System.out.print(">>");
    }
    
    public void recuperarSalud(Personaje jugador){
        jugador.hpReal=jugador.hpMax;
    }
    public  void restablecerEstadisticas(Personaje jugador){
        jugador.ataque=jugador.ataqueMax;
        jugador.defensa= jugador.defensaMax;
        jugador.evacion=jugador.evacionMax;
        
    }
}
