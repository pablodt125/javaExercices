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
public class SinesterCar extends Personaje{
    Ataque ataques;
    SinesterCar() {
        this.nombre="SinesterCar";
        int hp=500;
        int ataque=7;
        float defensa= (float) 0.3;
        float evacion=(float) 0.3;
        this.hpMax=(float) Math.floor(Math.random()*(hp-(hp-20))+(hp-20));
        this.hpReal=this.hpMax;
        this.ataque=(int) Math.floor(Math.random()*(ataque-(ataque-6))+(ataque-5));
        this.defensa= (float) (Math.random()*(defensa-(defensa-0.08))+(defensa-0.08));
        this.evacion=(float) (Math.random()*(defensa-(defensa-0.08))+(defensa-0.08));
        this.velocidad= 500;
        this.ataque1="PatadaVoladora";this.ataque2="BolaNegra";this.ataque3="CarneFerrea";this.ataque4="Debilitar";
        this.ataqueMax=this.ataque;
        this.defensaMax= this.defensa;
        this.evacionMax=this.evacion;
    }
    public float primerAtaque(){
        return jAtaque.getPatadaVoladora()*this.ataque;
    }
    public float segundoAtaque(){
        return jAtaque. getBolaNegra()*this.ataque;
    }
    public float tercerAtaque(Personaje jugador){
        return jugador.ataque+=jAtaque.getCarneFerrea();
    }
    public float cuartoAtaque(Personaje jugador){
       System.out.println("Se ha reducido el ataque del enemigo un "+jAtaque.getDebilitar()+"%");
        return jugador.defensa-=jAtaque.getDebilitar();
    }
}
