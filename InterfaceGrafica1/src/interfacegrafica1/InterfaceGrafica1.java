/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfacegrafica1;
import javax.swing.*;
import java.awt.event.*;
/**
 *
 * @author juan
 */
public class InterfaceGrafica1 extends JFrame implements ActionListener{
    private JTextField textField1,textField2;
    private JLabel Label1,Label2,Label3;
    private JButton boton1;
    
    public InterfaceGrafica1(){
        setLayout(null);
        
        Label1= new JLabel("Valor 1:");
        Label1.setBounds(50,5,100,30);
        add(Label1);
        
        Label2 =new JLabel("Valor 2: ");
        Label2.setBounds(50,35,100,30);
        add(Label2);
        
        Label3 =new JLabel("Resultado: ");
        Label3.setBounds(120,80,120,30);
        add(Label3);
        
        textField1=new JTextField();
        textField1.setBounds(120,10,150,20);
        add(textField1);
        
        textField2=new JTextField();
        textField2.setBounds(120,40,150,20);
        add(textField2);
        
        boton1=new JButton("Sumar");
        boton1.setBounds(10,80,100,30);
        add(boton1);
        boton1.addActionListener(this);
        
    }
    
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==boton1){
            int valor1,valor2,resultado;
            
            valor1= Integer.parseInt(textField1.getText());
            valor2= Integer.parseInt(textField2.getText());
            resultado=valor1+valor2;
            Label3.setText("Resultado: "+resultado);
        }
    }
     
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        InterfaceGrafica1 Inter=new InterfaceGrafica1();
        Inter.setBounds(0,0, 300,150);
        Inter.setResizable(false);
        Inter.setVisible(true);
        Inter.setLocationRelativeTo(null);
    }
    
}
