/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package probarcuenta;

/**
 *
 * @author juan
 */
import java.util.Scanner;
public class ProbarCuenta {

    /**
     * @param args the command line arguments
     */
    public static void mostrarCuenta(Cuenta cuentaAMostrar){
        System.out.printf("Saldo de %s: $%.2f%n",cuentaAMostrar.obterneNombre(),cuentaAMostrar.obtenerSaldo());
    }
    
    public static void main(String[] args) {
        
        Cuenta cuenta1=new Cuenta("Jane Green", 50.00);
        Cuenta cuenta2=new Cuenta("Jhon Blue", 0.00);

        mostrarCuenta(cuenta1);
        mostrarCuenta(cuenta2);
        
        Scanner scc=new Scanner(System.in);
        
        System.out.println("Escriba el monto a depositar para la cuenta1: ");
        double montoDeposito= scc.nextDouble();
        System.out.printf("%nSumando %.2f al saldo de cuenta1%n%n",montoDeposito);
        cuenta1.depositar(montoDeposito);
        
        mostrarCuenta(cuenta1);
        mostrarCuenta(cuenta2);
        
        System.out.println("Escriba el monto a depositar para la cuenta1: ");
        montoDeposito=scc.nextDouble();
        System.out.printf("%nSumando %.2f al saldo de cuenta1%n%n",montoDeposito);
        cuenta2.depositar(montoDeposito);
        
        mostrarCuenta(cuenta1);
        mostrarCuenta(cuenta2);
    }
    
}
