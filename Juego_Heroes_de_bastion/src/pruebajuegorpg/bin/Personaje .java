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
public class Personaje {
    protected String clase;
    protected String nombre;
    protected float hpMax;
    protected  float hpReal;
    protected int ataqueMax;
    protected int ataque;
    protected float defensaMax;
    protected  float defensa;
    protected  int velocidad;
    protected float evacionMax;
    protected float evacion;
    protected float nivel;
    protected String ataque1;
    protected String ataque2;
    protected String ataque3;
    protected String ataque4;
    protected Ataque jAtaque=new Ataque();
    
    
    public float datoRealizado(float datoAtaque, Personaje personaje){
        float daño= datoAtaque*(1-personaje.defensa);
        personaje.hpReal-=daño;
        if (personaje.hpReal<=0) {
            personaje.hpReal= 0;
        }
        return daño;
    }
    
    public float ataqueAumento(float aumento, Personaje personaje){
        personaje.ataque+=aumento;
        return aumento;
    }
    
    public float ataqueReduccion(float reducir, Personaje personaje){
        
        personaje.ataque-=reducir;
        return reducir;
    }
    
    public void setNivel(float nivel) {
        this.nivel = nivel;
    }

    public float getNivel() {
        return nivel;
    }
    
    public float primerAtaque(){
        return jAtaque.getBolaFuego()*this.ataque;
    }
    
    public float segundoAtaque(){
        return jAtaque.getBolaFuego()*this.ataque;
    }
    
    
    public float tercerAtaque(Personaje jugador){
        return jugador.ataque+=jAtaque.getGraciaDivina();
    }
    
    
    public float cuartoAtaque(Personaje jugador){
        return jugador.defensa-=jAtaque.getIntimidacion();
    }

    public String getClase() {
        return clase;
    }

    public void setClase(String clase) {
        this.clase = clase;
    }

    public String getAtaque1() {
        return ataque1;
    }

    public void setAtaque1(String ataque1) {
        this.ataque1 = ataque1;
    }

    public String getAtaque2() {
        return ataque2;
    }

    public void setAtaque2(String ataque2) {
        this.ataque2 = ataque2;
    }

    public String getAtaque3() {
        return ataque3;
    }

    public void setAtaque3(String ataque3) {
        this.ataque3 = ataque3;
    }

    public String getAtaque4() {
        return ataque4;
    }

    public void setAtaque4(String ataque4) {
        this.ataque4 = ataque4;
    }
    public float getHpMax() {
        return hpMax;
    }

    public void setHpMax(float hpMax) {
        this.hpMax = hpMax;
    }

    public float getHpReal() {
        return hpReal;
    }

    public void setHpReal(float hpReal) {
        this.hpReal = hpReal;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public float getDefensa() {
        return defensa;
    }

    public void setDefensa(int defensa) {
        this.defensa = defensa;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public float getEvacion() {
        return evacion;
    }

    public void setEvacion(int evacion) {
        this.evacion = evacion;
    }
    

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
    
}
