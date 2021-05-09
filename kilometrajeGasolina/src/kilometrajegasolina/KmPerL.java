/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kilometrajegasolina;

/**
 *
 * @author juan
 */
public class KmPerL {
    private int km;
    private int l;
    private double total;
    
    public KmPerL(int km,int l){
        this.km=km;
        this.l=l;
        total =0;
    }

    public void setKm(int km) {
        this.km = km;
    }

    public void setL(int l) {
        this.l = l;
    }
    
    public void setTotal(double total) {
        this.total += total;
    }
    
    public double getKmL() {
        return (double) km/l;
    }

    public double getTotal() {
        return total;
    }
    
    
}
