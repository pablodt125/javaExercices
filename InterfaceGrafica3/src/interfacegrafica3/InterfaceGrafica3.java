/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfacegrafica3;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/**
 *
 * @author juan
 */
public class InterfaceGrafica3 extends JFrame implements ActionListener{
    private JMenuBar barraMenu;
    private JMenu menu;
    private JMenuItem item1,item2,item3;
    
    public InterfaceGrafica3(){
        setLayout(null);
        barraMenu=new JMenuBar();
        setJMenuBar(barraMenu);
        
        menu=new JMenu("Option");
        barraMenu.add(menu);
        
        item1=new JMenuItem("Rojo");
        item1.addActionListener(this);
        menu.add(item1);
        
        
        item2=new JMenuItem("Verde");
        item2.addActionListener(this);
        menu.add(item2);
        
        
        item3=new JMenuItem("Azul");
        item3.addActionListener(this);
        menu.add(item3);
        
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
         Container fondo=this.getContentPane();
         if(e.getSource()== item1){
             fondo.setBackground(new Color(255,0,0));
         }
         if(e.getSource()== item2){
             fondo.setBackground(new Color(0,255,0));
         }
         if(e.getSource()== item3){
             fondo.setBackground(new Color(0,0,255));
         }
    }
    
    public static void main(String[] args) {
        InterfaceGrafica3 inter= new InterfaceGrafica3();
        inter.setBounds(0,0,500,450);
        inter.setVisible(true);
        inter.setLocationRelativeTo(null);
    }

    
    
}
