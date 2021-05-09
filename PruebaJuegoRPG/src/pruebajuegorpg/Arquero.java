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
public class Arquero extends Personaje{

    public Arquero() {
        this.clase="Arquero";
        int hp=80;
        int ataque=30;
        float defensa= (float) 0.1;
        float evacion=(float) 0.4;
        this.hpMax=(float) Math.floor(Math.random()*(hp-(hp-20))+(hp-20));
        this.hpReal=this.hpMax;
        this.ataque=(int) Math.floor(Math.random()*(ataque-(ataque-6))+(ataque-5));
        this.defensa= (float) (Math.random()*(defensa-(defensa-0.08))+(defensa-0.08));
        this.evacion=(float) (Math.random()*(defensa-(defensa-0.08))+(defensa-0.08));
        this.velocidad= 32;
        this.ataque1="Flecha Ardiente";this.ataque2="Flecha Luz";this.ataque3="Cara Dura";this.ataque4="Neblina Venenosa";
        this.ataqueMax=this.ataque;
        this.defensaMax= this.defensa;
        this.evacionMax=this.evacion;
    }
    
    @Override
    public float primerAtaque(){
        return jAtaque.getFlechaArdiente()*this.ataque;
    }
    public float segundoAtaque(){
        return jAtaque.getFlechaDeLuz()*this.ataque;
    }
    public float tercerAtaque(Personaje jugador){
        return jugador.defensa+=jAtaque.getCaraDura();
    }
    public float cuartoAtaque(Personaje jugador){
        System.out.println("Se ha reducido la defensa del enemigo un "+jAtaque.getNeblinaVenenosa()*100+"%");
        return jugador.defensa-=jAtaque.getNeblinaVenenosa();
    }
}
