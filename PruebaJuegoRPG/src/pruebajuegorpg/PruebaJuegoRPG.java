/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebajuegorpg;
import java.util.Scanner;
/**
 *
 * @author juan
 */
public class PruebaJuegoRPG {

    
    public static void limpiar(int lineas)
    {
        for (int i=0; i < lineas; i++){
             System.out.println("");
            }
    }
    static public void pressAnyKeyToContinue()
    {
        String seguir;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Press Enter key to continue...");
        try
        {
            seguir = teclado.nextLine();
        }
        catch(Exception e)
        {}
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        limpiar(50);
        
        //Se elige el personaje que se va utilizar aleatoriamente
        int choisePer=(int) Math.floor(Math.random()*4);
        
        //Se crea la bandera con la que vamos a terminar el juego
        boolean banderaTerminar=true;
        
        //Se intancia juego que tiene ciertos metodos de funcionamiento
        Juego game=new Juego();
        
        Ataque atacar=new Ataque();
        
        
        Scanner sc=new Scanner(System.in);
        
        //Instanciar el enemigo
        Personaje miEnemigo[]=new Personaje[4];
        miEnemigo[0]=new Alive();
        miEnemigo[1]=new MonsterDark();
        miEnemigo[2]=new SinesterCar();
        miEnemigo[3]=new KillerJay();
        
        //Intanciar un vector con los tipos de personajes que hay
        Personaje miPersonaje[]=new Personaje[4];
        miPersonaje[0]=new Paladin();
        miPersonaje[1]=new Guerrero();
        miPersonaje[2]=new Hechicero();
        miPersonaje[3]=new Arquero();
        
        
        //Se ingresa el nombre del personaje, se utilizara en todo el juego
        System.out.print("Porfavor ingrese un nombre para el personaje: ");
        miPersonaje[choisePer].nombre=sc.nextLine();
        limpiar(50);
        
        
        System.out.println("Bienvenidos al juego RPG: ");
        //Se utiliza el ciclo para iterar mientras no maten al personaje
        while (banderaTerminar){
            
            //Se llama el menu1 que se encuentra en la clase Juego y se ingresa la opcion
            game.menu(miPersonaje[choisePer].getNombre());
            int choise=sc.nextInt();
            limpiar(50);
            
            //Se utiliza un switch para seleccionar una de las opciones que se dieron anteriormente en el menu
            switch(choise){
                case 1:
                    //Se muestra por pantalla la informacion del jugador
                    game.estadisticasJugador(miPersonaje[choisePer]);
                    pressAnyKeyToContinue();
                    limpiar(50);
                    break;
                case 2:
                    //Se recupera la vida perdida en el combate
                    System.out.println("La vida de "+miPersonaje[choisePer].nombre+ " se ha recuperado al 100%");
                    game.recuperarSalud(miPersonaje[choisePer]);
                    pressAnyKeyToContinue();
                    limpiar(50);
                    break;
                    
                case 3:
                    //Cuando se elige pelear se crea la variable choiseEne, permite elegir uno de los enemigos aleatoriamente
                    int choiseEne=(int) Math.floor(Math.random()*4);
                    
                    //Se crea la bandera para salir de la pelea
                    boolean banderaEnemigo=true;
                    
                    //Indica que jugador deberia empezar a atacar si el enemigo o el personaje principal, comparando
                    //la velocidad de cada uno.
                    boolean turnoJugador=(miPersonaje[choisePer].velocidad>=miEnemigo[choiseEne].velocidad)? true:false;
                    
                    //Empieza a iterar el ciclo de pelea
                    while(banderaEnemigo){
                        
                        //Si turnoJugador es verdadero empiezan las opciones del jugador
                        if (turnoJugador) {
                            game.cuadroPj(miPersonaje[choisePer]);
                            //Se crea esta variable para mostrar el menu de los ataques que tiene el personaje
                            game.menu2(miPersonaje[choisePer]);
                            int elegirAtaque=sc.nextInt();
                            
                            //Se elige el ataque y se hace la operacion correspondiente
                            switch(elegirAtaque){
                                case 1:
                                    float dañoTotal=miPersonaje[choisePer].primerAtaque();
                                    dañoTotal=miPersonaje[choisePer].dañoRealizado(dañoTotal, miEnemigo[choiseEne]);
                                    System.out.println("El daño total fue de "+dañoTotal+"\nLa nueva vida de "+miEnemigo[choiseEne].getNombre()+" es: "+miEnemigo[choiseEne].getHpReal());
                                    break;
                                    
                                case 2:
                                    dañoTotal=miPersonaje[choisePer].segundoAtaque();
                                    dañoTotal=miPersonaje[choisePer].dañoRealizado(dañoTotal, miEnemigo[choiseEne]);
                                    System.out.println("El daño total fue de "+dañoTotal+"\nLa nueva vida de "+miEnemigo[choiseEne].getNombre()+" es: "+miEnemigo[choiseEne].getHpReal());
                                    break;
  
                                case 3:
                                    miPersonaje[choisePer].tercerAtaque(miPersonaje[choisePer]);
                                    break;
                                    
                                case 4:
                                    miPersonaje[choisePer].cuartoAtaque(miEnemigo[choiseEne]);
                                    break;
                                    
                            }
                            
                        }else{//Si turnoJugador es falso empiezan las opciones del enemigo
                            //Ataques del enemigo
                            game.cuadroPj(miEnemigo[choiseEne]);
                            
                            int elegirAtaque=(int) Math.floor(Math.random()*4);
                            switch(elegirAtaque){
                                case 1:
                                    System.out.println(miEnemigo[choiseEne].getAtaque1()+" realizado");
                                    float dañoTotal=miEnemigo[choiseEne].primerAtaque();
                                    dañoTotal=miEnemigo[choiseEne].dañoRealizado(dañoTotal, miPersonaje[choisePer]);
                                    System.out.println("El daño total fue de "+dañoTotal+"\nLa nueva vida de "+miPersonaje[choisePer].getNombre()+" es: "+miPersonaje[choisePer].getHpReal());
                                    break;
                                    
                                case 2:
                                    System.out.println(miEnemigo[choiseEne].getAtaque2()+" realizado");
                                    dañoTotal=miEnemigo[choiseEne].segundoAtaque();
                                    dañoTotal=miEnemigo[choiseEne].dañoRealizado(dañoTotal, miPersonaje[choisePer]);
                                    System.out.println("El daño total fue de "+dañoTotal+"\nLa nueva vida de "+miPersonaje[choisePer].getNombre()+" es: "+miPersonaje[choisePer].getHpReal());
                                    break;
  
                                case 3:
                                    System.out.println(miEnemigo[choiseEne].getAtaque3()+" realizado");
                                    miEnemigo[choiseEne].tercerAtaque(miEnemigo[choiseEne]);
                                    break;
                                    
                                case 4:
                                    System.out.println(miEnemigo[choiseEne].getAtaque4()+" realizado");
                                    miPersonaje[choisePer].tercerAtaque(miPersonaje[choisePer]);
                                    break;
                                    
                            }
                            
                            
                        }
                        
                        
                        turnoJugador = !turnoJugador;
                        
                        
                        if (miPersonaje[choisePer].hpReal<=0) {
                            System.out.println("HAZ MUERTOOOO!");
                            banderaEnemigo=false;
                            banderaTerminar=false;
                        }
                        
                        
                        
                        if (miEnemigo[choiseEne].hpReal<=0) banderaEnemigo=false;
                        
                        pressAnyKeyToContinue();
                        limpiar(50);
                    }
                    //Se restablecen las caracteristicas del enemigo
                    miEnemigo[choiseEne].hpReal=miEnemigo[choiseEne].hpMax;
                    game.restablecerEstadisticas(miEnemigo[choiseEne]);
                    
            }
            
            
            //Se restablecen las caracteristicas del personaje principal
            game.restablecerEstadisticas(miPersonaje[choisePer]);
            
        }        
        
    }
}
