/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfacegrafica5;
import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;
/**
 *
 * @author juan
 */
public class InterfaceGrafica5 extends JFrame implements ChangeListener,ActionListener{
    private JLabel texto;
    private JCheckBox check1;
    private JButton boton1;
    
    public InterfaceGrafica5(){
        setLayout(null);
        
        texto=new JLabel("Acepto terminos y condiciones");
        texto.setBounds(5,10,300,30);
        add(texto);
        
        check1=new JCheckBox("Aceptar");
        check1.setBounds(5,50,100,30);
        check1.addChangeListener(this);
        add(check1);
        
        boton1=new JButton("Continuar");
        boton1.setBounds(5,90,120,30);
        add(boton1);
        boton1.addActionListener(this);
        boton1.setEnabled(false);
        
    }
    
    @Override
    public void stateChanged(ChangeEvent e) {
        if(check1.isSelected()){
            boton1.setEnabled(true);
        }else{
            boton1.setEnabled(false);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==boton1){
            System.exit(0);
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        InterfaceGrafica5 inter=new InterfaceGrafica5();
        inter.setBounds(0,0,250,200);
        inter.setVisible(true);
        inter.setLocationRelativeTo(null);
    }

    
    
}
