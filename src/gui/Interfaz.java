/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import aritmetico.Aritmetico;
import factories.AbstractFactory;
import factories.FactoryProducer;
import static factories.FactoryProducer.getFactory;
import java.awt.Component;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author María Lourdes
 */
public final class Interfaz extends JFrame {

    private JTextField caja1;
    private JTextField caja2;
    private JTextField caja3;
    private JButton boton1;
    private JButton boton2;
    private JButton boton3;
    private JButton boton4;
    private JButton boton5;
    private JLabel aviso;

    public Interfaz() {
        initialComponents();
    }

    public void initialComponents() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        caja1 = new JTextField();//Se puede mandar como parametro algun valor predederminado o defecto que se muestre en la caja de texto
        caja1.setBounds(10, 50, 50, 30);

        caja2 = new JTextField();
        caja2.setBounds(65, 50, 50, 30);

        caja3 = new JTextField();
        caja3.setBounds(100, 150, 50, 30);

        boton1 = new JButton("x");
        boton1.setBounds(20, 200, 50, 30);

        boton2 = new JButton("+");
        boton2.setBounds(80, 200, 50, 30);

        boton3 = new JButton("-");
        boton3.setBounds(140, 200, 50, 30);

        boton4 = new JButton("/");
        boton4.setBounds(200, 200, 50, 30);

        boton5 = new JButton("Binario");
        boton5.setBounds(60, 100, 150, 30);

        //caja2= new JTextField();
        //caja2.setBounds(10,125,125,30);
        //caja2.setEditable(false);//Evita que el usuario edite la caja de texto
        Container contenedor = getContentPane();
        contenedor.add(caja1);
        contenedor.add(caja2);
        contenedor.add(caja3);
        contenedor.add(boton1);
        contenedor.add(boton2);
        contenedor.add(boton3);
        contenedor.add(boton4);
        contenedor.add(boton5);

        //Capturar los eventos de la caja de texto
        //Boton para la operacion de multiplicacion
        boton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                double num = Integer.parseInt(caja1.getText());
                double num2 = Integer.parseInt(caja2.getText());
                AbstractFactory factory = factories.FactoryProducer.getFactory("aritmetico");
                String resultado = Double.toString(factory.getAritmetico("multiplicacion").operacion(num, num2));
                caja3.setText(resultado);
            }
        });
        //Boton para la operacion de suma
        boton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                double num = Integer.parseInt(caja1.getText());
                double num2 = Integer.parseInt(caja2.getText());
                AbstractFactory factory = factories.FactoryProducer.getFactory("aritmetico");
                String resultado = Double.toString(factory.getAritmetico("suma").operacion(num, num2));
                caja3.setText(resultado);
            }
        });

        //Boton para la operacion resta
        boton3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                //Captura el String de la caja de texto  
                //Guarda y convierte el string capturado
                double num = Integer.parseInt(caja1.getText());
                double num2 = Integer.parseInt(caja2.getText());
                AbstractFactory factory = factories.FactoryProducer.getFactory("aritmetico");
                String resultado = Double.toString(factory.getAritmetico("resta").operacion(num, num2));
                caja3.setText(resultado);
            }
        });

        //Boton para la operacion Division
        boton4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {

                double num = Double.parseDouble(caja1.getText());
                double num2 = Double.parseDouble(caja2.getText());
                if (num2 != 0) {
                    AbstractFactory factory = factories.FactoryProducer.getFactory("aritmetico");
                    String resultado = Double.toString(factory.getAritmetico("division").operacion(num, num2));
                    caja3.setText(resultado);
                } else {
                    JOptionPane.showMessageDialog(null, "No es posible realizar la operación");

                }
            }
        });
        boton5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {

                int num = Integer.parseInt(caja1.getText());
                AbstractFactory factory = factories.FactoryProducer.getFactory("conversor");
                String resultado = Double.toString(factory.getConversor("binario").operacion( num));
                caja3.setText(resultado);
            }
        });
        

        setSize(
                300, 300);
    }

    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Interfaz().setVisible(true);
            }
        });
    }
}
