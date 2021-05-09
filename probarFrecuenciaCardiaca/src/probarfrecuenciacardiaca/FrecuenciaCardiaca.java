/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package probarfrecuenciacardiaca;

/**
 *
 * @author juan
 */
public class FrecuenciaCardiaca {
    private String nombre,apellido;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        if (dia>=1 && dia<=31) {
            this.dia = dia;
        }else System.out.println("No se puede ingresar ese dia...");
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        if (mes>=1 && dia<=12) {
            this.mes = mes;
        }else System.out.println("No se puede ingresar ese mes...");
    }

    public int getAnyo() {
        return anyo;
    }

    public void setAnyo(int anyo) {
        if (anyo>=1) {
            this.anyo = anyo;
        }else System.out.println("No se puede ingresar ese anyo...");
        
    }
    private int dia,mes,anyo;
    public FrecuenciaCardiaca(String nombre,String apellido,int dia,int mes,int anyo){
        this.nombre=nombre;
        this.apellido=apellido;
        this.dia=dia;
        this.mes=mes;
        this.anyo=anyo;
    }
    
    public int Edad(int anyo){
        return anyo-this.anyo;
    }
    
    public int FrecuenciaMax(int edad){
        return 220 -edad;
    }
    
    public double FrecuenciaRel(int FrecuenciaMax,int porcentaje){
        return FrecuenciaMax*((double)porcentaje/100);
    }
                   
}
