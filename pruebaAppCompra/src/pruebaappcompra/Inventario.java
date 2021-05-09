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
public class Inventario {
    private String codigoProducto;
    private String descripcion;
    private String categoria;
    private double valor;

    public Inventario(String codigoProducto,String descripcion,String categoria,int valor) {
        this.categoria=categoria;
        this.codigoProducto=codigoProducto;
        this.descripcion=descripcion;
        this.valor=valor;
    }

    public void setCodigoProducto(String codigoProducto) {
        this.codigoProducto = codigoProducto;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public void setValor(double valor) {
        
        this.valor = valor;
    }

    public String getCodigoProducto() {
        return codigoProducto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getCategoria() {
        return categoria;
    }

    public double getValor() {
        if (this.getCategoria().equalsIgnoreCase("A"))    return  valor*1;
        
        else if(this.getCategoria().equalsIgnoreCase("B")) return valor*1.05;
        
        else if(this.getCategoria().equalsIgnoreCase("C"))return valor*1.19;
        
        return 0;
    }
    
    
}
