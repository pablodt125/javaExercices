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
public class Ataque {
    //Ataques Personaje Principal 
    //--------------------------------------------------------
    //Daño
    
    
    public float getBolaFuego(){
        return (float) 1.3;
    }
    public float getGranBolaFuego(){
        return (float) 1.7;
    }
    public float getGolpeMartillo(){
        return 2;
    }
    public float getGarraDios(){
        return (float) 1.8;
    }
    public float getEspadazoTrueno(){
        return 2;
    }
    public float getFlechaArdiente(){
        return (float)1.5;
    }
    public float getFlechaDeLuz(){
        return (float) 1.7;
    }
    //Aumentar Estadisticas
    public float getCaraDura(){
        return (float) (0.2);
    }
    public float getGraciaDivina(){
        return (float) (15);
    }
    
    //Disminuir caracteristica
    public float getIntimidacion(){
        return (float) (7);
    }
    public float getNeblinaVenenosa(){
        return (float) ( 0.1);
    }
    
    //Ataques Enemigos
    //----------------------------------------------
    //Daño
    public float getBolaNegra(){
        return (float) 1.1;
    }
    public float getGranBolaNegra(){
        return (float) 1.3;
    }
    public float getAvalanchaHueso(){
        return (float) 1.5;
    }
    public float getMordeduraCanibal(){
        return (float) 1.7;
    }
    public float getSalpicadura(){
        return (float) 1.1;
    }
    public float getTiroGracia(){
        return (float) 1.9;
    }
    public float getPatadaVoladora(){
        return (float) 1.05;
    }
    
    //Aumentar Caracteristicas
    public float getCarneFerrea(){
        return (float) ( 9);
    }
    public float getPosesion(){
        return (float) ( 0.15);
    }
    
    //Disminuir caracteristica
    public float getDebilitar(){
        return (float) ( 6);
    }
    public float getControlGusano(){
        return (float) (0.22);
    }
    
    
}
