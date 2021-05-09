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
public class Alive extends Personaje{
    
    public Alive() {
        this.nombre="Alive";
        int hp=100;
        int ataque=8;
        float defensa= (float) 0.1;
        float evacion=(float) 0.1;
        this.hpMax=(float) Math.floor(Math.random()*(hp-(hp-20))+(hp-20));
        this.hpReal=this.hpMax;
        this.ataque=(int) Math.floor(Math.random()*(ataque-(ataque-6))+(ataque-5));
        this.defensa= (float) (Math.random()*(defensa-(defensa-0.08))+(defensa-0.08));
        this.evacion=(float) (Math.random()*(defensa-(defensa-0.08))+(defensa-0.08));
        this.velocidad= 1000;
        this.ataque1="BolaNegra";this.ataque2="GranBolaNegra";this.ataque3="Posesion";this.ataque4="ControlGusano";
        this.ataqueMax=this.ataque;
        this.defensaMax= this.defensa;
        this.evacionMax=this.evacion;
    }
    public float primerAtaque(){
        return jAtaque.getBolaNegra()*this.ataque;
    }
    public float segundoAtaque(){
        return jAtaque.getGranBolaNegra()*this.ataque;
    }
    public float tercerAtaque(Personaje jugador){
        return jugador.ataque+=jAtaque.getPosesion();
    }
    public float cuartoAtaque(Personaje jugador){
        System.out.println("Se ha reducido el ataque del enemigo un "+jAtaque.getControlGusano()*100+"%");
        return jugador.defensa-=jAtaque.getControlGusano();
    }
}
