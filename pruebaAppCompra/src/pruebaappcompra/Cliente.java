/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebaappcompra;

/**
 *
 * @author juan
 */
public class Cliente extends appProductos{
    private double debito;
    private double efectivo;
    private double billeteraMovil;
    private double credito;

    public Cliente(double debito,double efectivo,double billeteraMovil,double credito) {
        if (debito<0) this.debito=0;
        else this.debito=debito;
        
        if (credito<0) this.credito=0;
        else this.credito=credito;
        
        if (efectivo<0) this.efectivo=0;
        else this.efectivo=efectivo;
        
        if (billeteraMovil<0) this.billeteraMovil=0;
        else this.billeteraMovil=billeteraMovil;
    }

    public double getDebito() {
        return debito;
    }

    public void setDebito(double debito) {
        this.debito = debito;
    }

    public double getEfectivo() {
        return efectivo;
    }

    public void setEfectivo(double efectivo) {
        this.efectivo = efectivo;
    }

    public double getBilleteraMovil() {
        return billeteraMovil;
    }

    public void setBilleteraMovil(double billeteraMovil) {
        this.billeteraMovil = billeteraMovil;
    }

    public double getCredito() {
        return credito;
    }

    public void setCredito(double credito) {
        this.credito = credito;
    }
    
    public void menu(){
        System.out.println("----------------------------------");
        System.out.println("Debito ="+this.debito);
        System.out.println("Credito ="+this.credito);
        System.out.println("Billetera Movil ="+this.billeteraMovil);
        System.out.println("Efectivo ="+this.efectivo);
        System.out.println("-----------------------------------");
    }
    
    
    public void descontarValor(String tipoPago,double valorProducto){
        if (tipoPago.equalsIgnoreCase("debito"))  this.debito-=valorProducto;
        else if(tipoPago.equalsIgnoreCase("credito")) this.credito-=valorProducto;
        else if(tipoPago.equalsIgnoreCase("billetera movil")) this.billeteraMovil-=valorProducto;
        else if(tipoPago.equalsIgnoreCase("efectivo")) this.efectivo-=valorProducto;
    }
    
    
}
