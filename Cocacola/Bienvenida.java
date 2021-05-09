/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
/**
 *
 * @author juan
 */
public class Bienvenida extends JFrame implements ActionListener{
    private JLabel imagen,texto1,texto2,texto3;
    private JTextField nombreTexto;
    private JButton ingresar;
    
    public Bienvenida(){
        setLayout(null);
        setTitle("Bienvenido");
        getContentPane().setBackground(new Color(255,0,0));
        setIconImage(new ImageIcon(getClass().getResource("ima/icon.png")).getImage());
        
        ImageIcon image=new ImageIcon("ima/logo-coca.png");
        imagen=new JLabel(image);
        imagen.setBounds(25,15,300,150);
        add(imagen);
        
        texto1=new JLabel("Sistema de control vacacional.");
        texto1.setBounds(35,135,300,30);
        texto1.setFont(new Font("Andale Mono",3,15));
        texto1.setForeground(new Color(255,255,255));
        add(texto1);
        
        texto2=new JLabel("Ingrese su nombre: ");
        texto2.setBounds(45,212,200,30);
        texto2.setFont(new Font("Andale Mono",1,12));
        texto2.setForeground(new Color(255,255,255));
        add(texto2);
        
        texto3=new JLabel("©2017 The Coca-Cola Company");
        texto3.setBounds(85,375,300,30);
        texto3.setFont(new Font("Andale Mono",1,12));
        texto3.setForeground(new Color(255,255,255));
        add(texto3);
        
        
        nombreTexto =new JTextField();
        nombreTexto.setBounds(45,240,255,25);
        nombreTexto.setBackground(new Color(222,222,222));
        nombreTexto.setFont(new Font("Andale Mono",1,12));
        nombreTexto.setForeground(new Color(255,0,0));
        add(nombreTexto);
        
        ingresar=new JButton("Ingresar");
        ingresar.setBounds(125,280,100,30);
        ingresar.setBackground(new Color(255,255,255));
        ingresar.setFont(new Font("Andale Mono",1,12));
        ingresar.setForeground(new Color(255,0,0));
        add(ingresar);
        ingresar.addActionListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==ingresar){
            
        }
    }
    
    public static void main(String[] args) {
        Bienvenida ingre=new Bienvenida();
        ingre.setBounds(0,0,350,450);
        ingre.setVisible(true);
        ingre.setResizable(false);
        ingre.setLocationRelativeTo(null);
    }
    
    
}
