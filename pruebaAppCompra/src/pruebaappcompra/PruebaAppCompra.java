/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebaappcompra;
import java.util.Scanner;
/**
 *
 * @author juan
 */
public class PruebaAppCompra {

    /**
     * @param args the command line arguments
     */
    public static void limpiar(int lineas)
    {
        for (int i=0; i < lineas; i++){
             System.out.println("");
            }
    }
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int producto;
        double valor=0;
        boolean band,bandera=true;
        String medioPago,esperar;
        
        appProductos app=new appProductos();
        Cliente nCliente=new Cliente(1500, 8500, 0, 10000);
        limpiar(50);
        while (bandera){
           int opcion;
           limpiar(50);
           app.menu();
           opcion=sc.nextInt();
           
           switch(opcion){
               case 1:
                   limpiar(50);
                    System.out.println("Que producto deseas comprar: ");
                    app.verProductos();
                    producto=sc.nextInt();
                    limpiar(50);
                    System.out.println("Con que medio de pago deseas comprar\nIngrese el medio de pago que quiere utilizar tal cual se le pide: ");
                    nCliente.menu();
                    medioPago=sc.next();

                    limpiar(50);
                    System.out.println("\nVerificacion de productos... ingrese una tecla para continuar");
                    esperar =sc.next();

                    if (medioPago.equalsIgnoreCase("debito"))  valor=nCliente.getDebito();
                    else if(medioPago.equalsIgnoreCase("credito")) valor=nCliente.getCredito();
                    else if(medioPago.equalsIgnoreCase("billetera movil")) valor=nCliente.getBilleteraMovil();
                    else if(medioPago.equalsIgnoreCase("efectivo")) valor=nCliente.getEfectivo();
                    limpiar(50);
                    band = app.comprarProducto(valor, producto);
                    if (band) {
                        nCliente.descontarValor(medioPago, app.productos[producto].getValor());
                    }
                    System.out.println("\nVerificacion de productos... ingrese una tecla para continuar");
                    esperar=sc.next();
                   break;
               case 2:
                   bandera=false;
                   break;
           } 
        }
        
        
        
        
        
        
        
    }
    
}
