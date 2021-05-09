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
public class appProductos {
    protected Inventario productos[]=new Inventario[5]; 
    
    
    
    public appProductos() {
        productos[0]=new Inventario("P001","Laptop Asus Rog","A",3000);
        productos[1]=new Inventario("P002","Acer Nitro 5","A",1000);
        productos[2]=new  Inventario("P003","Msi Prestige","C",3700);
        productos[3]=new  Inventario("P004","Msi Titan","B",5000);
        productos[4]=new  Inventario("P005","Apple MacBook Pro","C",4500);
    }
    
    
    public void menu(){
        System.out.println("----------------------------------");
        System.out.println("1.Comprar Producto\n 2.Cerrar programa");
        System.out.println("-----------------------------------");
    }
    public boolean comprarProducto(Double capacidad,int i){
        if (capacidad>=productos[i].getValor()) {
            System.out.println("Producto comprado.");
            return true;
        }else System.out.println("Producto no comprado");
        return false;
    }
    
    public void verProductos(){
        System.out.println("------------------------------------------------------------------------------");
        for (int i = 0; i < 5; i++) {
            System.out.println(i+". "+this.productos[i].getCodigoProducto()+"---"+this.productos[i].getDescripcion()+"---"+this.productos[i].getValor());
            
        }
        System.out.println("------------------------------------------------------------------------------");  
    }
    
    
}
