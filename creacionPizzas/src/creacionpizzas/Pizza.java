/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package creacionpizzas;

/**
 *
 * @author juan
 */
public class Pizza {
    private Chef chef1;
    Ingredientes ingredientesPizza;
    
    public Pizza(){
        chef1=new Chef("Juan", "Florez");
        ingredientesPizza=new Ingredientes();
    }
    
    public void mezclarIngre(){
        System.out.println("Mezclando ingredientes...");
    }
    public void calentarPizza(){
        System.out.println("Calentando pizza...");
    }
}
