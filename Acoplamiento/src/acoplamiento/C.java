/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package acoplamiento;

/**
 *
 * @author juan
 */
public class C {
    private int X;
    private A a;
    private B b;
    
    public C(int n){
        X=n;
        a=new A();
        b=new B();
    }
    public int sampleMethod(){
        return a.sampleMethod(X)+b.sampleMethod(X);
    }
}
