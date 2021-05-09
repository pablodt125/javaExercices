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
public class Hechicero extends Personaje{
    
    public Hechicero() {
        this.clase="Hechicero";
        int hp=70;
        int ataque=35;
        float defensa= (float) 0.05;
        float evacion=(float) 0.05;
        this.hpMax=(float) Math.floor(Math.random()*(hp-(hp-20))+(hp-20));
        this.hpReal=this.hpMax;
        this.ataque=(int) Math.floor(Math.random()*(ataque-(ataque-6))+(ataque-5));
        this.defensa= (float) (Math.random()*(defensa-(defensa-0.08))+(defensa-0.08));
        this.evacion=(float) (Math.random()*(defensa-(defensa-0.08))+(defensa-0.08));
        this.velocidad= 10000;
        this.ataque1="Bola Fuego";this.ataque2="Gran Bola Fuego";this.ataque3="Cara Dura";this.ataque4="Neblina Venenosa";
        this.ataqueMax=this.ataque;
        this.defensaMax= this.defensa;
        this.evacionMax=this.evacion;
    }
    
    public float primerAtaque(){
        return jAtaque.getBolaFuego()*this.ataque;
    }
    public float segundoAtaque(){
        return jAtaque.getGranBolaFuego()*this.ataque;
    }
    public float tercerAtaque(Personaje jugador){
        return jugador.defensa+=jAtaque.getCaraDura();
    }
    public float cuartoAtaque(Personaje jugador){
        System.out.println("Se ha reducido la defensa del enemigo un "+jAtaque.getNeblinaVenenosa()*100+"%");
        return jugador.defensa-=jAtaque.getNeblinaVenenosa();
    }
    
    
}
