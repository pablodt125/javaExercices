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
public class MonsterDark extends Personaje{

    MonsterDark() {
        this.nombre="MonsterDark";
        int hp=175;
        int ataque=15;
        float defensa= (float) 0.1;
        float evacion=(float) 0.1;
        this.hpMax=(float) Math.floor(Math.random()*(hp-(hp-20))+(hp-20));
        this.hpReal=this.hpMax;
        this.ataque=(int) Math.floor(Math.random()*(ataque-(ataque-6))+(ataque-5));
        this.ataqueMax=this.ataque;
        this.defensa= (float) (Math.random()*(defensa-(defensa-0.08))+(defensa-0.08));
        this.defensaMax= this.defensa;
        this.evacion=(float) (Math.random()*(defensa-(defensa-0.08))+(defensa-0.08));
        this.evacionMax=this.evacion;
        this.velocidad= 90000;
        this.ataque1="Salpicadura";this.ataque2="TiroGracia";this.ataque3="Posesion";this.ataque4="ControlGusano";
    }
    public float primerAtaque(){
        return jAtaque.getSalpicadura()*this.ataque;
    }
    public float segundoAtaque(){
        return jAtaque.getTiroGracia()*this.ataque;
    }
    public float tercerAtaque(Personaje jugador){
        return jugador.ataque+=jAtaque.getPosesion();
    }
    public float cuartoAtaque(Personaje jugador){
        System.out.println("Se ha reducido el ataque del enemigo un "+jAtaque.getControlGusano()+"%");
        return jugador.defensa-=jAtaque.getControlGusano();
    }
}
