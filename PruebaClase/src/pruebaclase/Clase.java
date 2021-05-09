/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebaclase;
import javax.swing.JOptionPane;
/**
 *
 * @author juan
 */
public class Clase {
    public final static int EST = 12;
    private double [] notasEst;
    private double promedio;
    private  int cantidadEst;
    
    public Clase(){
        this.cantidadEst=0;
        
        notasEst=new double[EST];
        boolean band;
        for (int x = 0; x <this.notasEst.length ; x++) {
            band=true;
            while(band){
                double nota=Double.parseDouble(JOptionPane.showInputDialog("Ingrese la nota "+(x+1)+":"));
                if (nota>=0.0 &&nota<=5.0) {
                    this.notasEst[x]=nota;
                    band=false;
                }
            }
        }
    }
    
    public void cambiarNota(int indice,double newNota){
        if (newNota>=0.0 &&  newNota<=5.0 && (indice<=EST && indice>=0)) {
                    this.notasEst[indice-1]=newNota;
         }else JOptionPane.showMessageDialog(null, ("La nota no extiste o la nota no esta en un rango permitido"));
    }
    
    public double obtenerNota(int nota){
        if (nota<0 ||nota>EST-1){
            System.out.println("Estudiante no existe.");
            return 0.0;
        } 
        return this.notasEst[nota];
    }
    
    public void verNotas(){
        String notas = "";
        for (int x = 0; x < this.notasEst.length; x++) {
            notas +=("Estudiante "+x+":         "+this.notasEst[x]+"\n");
        }
        JOptionPane.showMessageDialog(null, notas);
    }
    
    public double setPromedio(){
        double sum=0;
        for (int x = 0; x < this.notasEst.length; x++) {
            sum+=this.notasEst[x];
        }
        this.promedio=(double)sum/EST;
        return this.promedio;
    }
    
    public double getPromedio(){
        return this.promedio;
    }
    
    
    public int setCantEst(){
        this.cantidadEst=0;
        for (int x = 0; x < this.notasEst.length; x++) {
            if (this.notasEst[x]>this.promedio) {
                this.cantidadEst+=1;
            }
        }
        return this.cantidadEst;
    }
    
    public int getCantEst(){
        return this.cantidadEst;
    }
    
}
