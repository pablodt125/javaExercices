/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfacegrafica4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/**
 *
 * @author juan
 */
public class InterfaceGrafica4 extends JFrame implements ActionListener{
    
    private JMenuBar barraMenu;
    private  JMenu menu1,menu2,menu3;
    private JMenuItem menu1Item1,menu1Item2,menu2Item1,menu2Item2,menu2Item3;
    
    public InterfaceGrafica4(){
        setLayout(null);
        barraMenu=new JMenuBar();
        setJMenuBar(barraMenu);
        
        
        menu1= new JMenu("Opcion");
        barraMenu.add(menu1);
        
        menu2= new JMenu("Tamaño Ventana");
        menu1.add(menu2);
        
        menu3= new JMenu("Color Fondo");
        menu1.add(menu3);
        
        menu1Item1=new JMenuItem("300*200");
        menu1Item1.addActionListener(this);
        menu2.add(menu1Item1);
        
        menu1Item2=new JMenuItem("640*480");
        menu1Item2.addActionListener(this);
        menu2.add(menu1Item2);
        
        menu2Item1=new JMenuItem("Rojo");
        menu2Item1.addActionListener(this);
        menu3.add(menu2Item1);
        
        menu2Item2=new JMenuItem("Verde");
        menu2Item2.addActionListener(this);
        menu3.add(menu2Item2);
        
        menu2Item3=new JMenuItem("Azul");
        menu2Item3.addActionListener(this);
        menu3.add(menu2Item3);
        
        
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        Container fondo= this.getContentPane();
        if (e.getSource()==menu1Item1){
            setSize(300,200);
        }
        if (e.getSource()==menu1Item2){
            setSize(640,480);
        }
        if (e.getSource()==menu2Item1){
            
            fondo.setBackground(new Color(255,0,0));
        }
        if (e.getSource()==menu2Item2){
            
            fondo.setBackground(new Color(0,255,0));
        }
        if (e.getSource()==menu2Item3){
            fondo.setBackground(new Color(0,0,255));
        }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        InterfaceGrafica4 inter=new InterfaceGrafica4();
        inter.setBounds(0,0,500,500);
        inter.setVisible(true);
        inter.setLocationRelativeTo(null);
    }

    
    
}
