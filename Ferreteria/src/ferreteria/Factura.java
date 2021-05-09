package ferreteria;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author juan
 */
public class Factura {
    private String NoPieza;
    private String descripcionPieza;
    private double precioPieza;
    private int cantidadPieza;
    
    public Factura(String noPieza, String desPieza,double valuePieza,int cantPieza){
        this.NoPieza=noPieza;
        this.descripcionPieza=desPieza;
        this.precioPieza=valuePieza;
        if (cantPieza>0) {
            this.cantidadPieza=cantPieza;
        }
        
    }
    
    public String getNoPieza() {
        return NoPieza;
    }

    public void setNoPieza(String NoPieza) {
        this.NoPieza = NoPieza;
    }

    public String getDescripcionPieza() {
        return descripcionPieza;
    }

    public void setDescripcionPieza(String descripcionPieza) {
        this.descripcionPieza = descripcionPieza;
    }

    public double getPrecioPieza() {
        return precioPieza;
    }

    public void setPrecioPieza(double precioPieza) {
        this.precioPieza = precioPieza;
    }

    public int getCantidadPieza() {
        return cantidadPieza;
    }

    public void setCantidadPieza(int cantidadPieza) {
        this.cantidadPieza = cantidadPieza;
    }
    
    public double obtenerMontoFactura(){
        double valor=this.cantidadPieza*this.precioPieza;
        if (valor>0) {
            return this.cantidadPieza*this.precioPieza;
        }
        return 0;
    }
    
    
}
