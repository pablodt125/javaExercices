/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfacegrafica2;
import javax.swing.*;
import java.awt.event.*;
/**
 *
 * @author juan
 */
public class InterfaceGrafica2 extends JFrame implements ItemListener{
    
    private JComboBox combo1;
    
    public InterfaceGrafica2(){
        setLayout(null);
        combo1=new JComboBox();
        combo1.setBounds(10,10,80,20);
        add(combo1);
        
        combo1.addItem("Azul");
        combo1.addItem("Rojo");
        combo1.addItem("Verde");
        combo1.addItem("Magenta");
        combo1.addItem("Rosado");
        combo1.addItemListener(this);
    }
    @Override
    public void itemStateChanged(ItemEvent e) {
        if (e.getSource()==combo1) {
            String seleccion=combo1.getSelectedItem().toString();
            setTitle(seleccion);
        }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        InterfaceGrafica2 inter=new InterfaceGrafica2();
        inter.setBounds(0,0,200,150);
        inter.setVisible(true);
        inter.setResizable(false);
        inter.setLocationRelativeTo(null);
    }

    
    
}
