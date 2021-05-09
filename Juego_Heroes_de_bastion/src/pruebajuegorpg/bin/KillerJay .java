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
public class KillerJay extends Personaje{

    KillerJay() {
        this.nombre="KillerJay";
        int hp=150;
        int ataque=10;
        float defensa= (float) 0.2;
        float evacion=(float) 0.15;
        this.hpMax=(float) Math.floor(Math.random()*(hp-(hp-20))+(hp-20));
        this.hpReal=this.hpMax;
        this.ataque=(int) Math.floor(Math.random()*(ataque-(ataque-6))+(ataque-5));
        this.defensa= (float) (Math.random()*(defensa-(defensa-0.08))+(defensa-0.08));
        this.evacion=(float) (Math.random()*(defensa-(defensa-0.08))+(defensa-0.08));
        this.velocidad= 1300;
        this.ataque1="AvalanchaHueso";this.ataque2="MordeduraCanibal";this.ataque3="CarneFerrea";this.ataque4="Debilitar";
        this.ataqueMax=this.ataque;
        this.defensaMax= this.defensa;
        this.evacionMax=this.evacion;
    }
    public float primerAtaque(){
        return jAtaque.getAvalanchaHueso()*this.ataque;
    }
    public float segundoAtaque(){
        return jAtaque.getMordeduraCanibal()*this.ataque;
    }
    public float tercerAtaque(Personaje jugador){
        return jugador.ataque+=jAtaque.getCarneFerrea();
    }
    public float cuartoAtaque(Personaje jugador){
       System.out.println("Se ha reducido el ataque del enemigo un "+jAtaque.getDebilitar()+"%");
        return jugador.defensa-=jAtaque.getDebilitar();
    }
    
    
    
    
}
