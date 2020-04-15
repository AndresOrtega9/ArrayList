/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Andres Ortega
 */
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.util.*;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import vista.Funciones;

public class Cine extends JFrame implements ActionListener {

    //ArrayList aut = new ArrayList();
    Funciones funciones = new Funciones();
    JLabel tiquete;
    JLabel peli;
    JLabel total;
    JTextArea peliculas1;
    JTextArea peliculas2;
    JTextField tiquets;
    JTextField pelis;
    JTextArea totals;
    JButton vender;
    JButton totalD;
    JButton limpiar;

    public Cine() {

        tiquete = new JLabel("Cantidad de tiquetes");
        peli = new JLabel("Pelicula ");
        tiquets = new JTextField(20);
        pelis = new JTextField(20);
        vender = new JButton("Info");
        totalD = new JButton("Total");
        limpiar = new JButton("Limpiar");
        totals = new JTextArea();
        total = new JLabel("Total  de tiquetes al dia");
        peliculas1 = new JTextArea("1)Origen\n" + "2)Avatar\n" + "3)En caballero oscuro\n" + "4)Malditos bastardos\n" + "5)Joker\n" + "6)Interstellar\n" + "7)Cisne negro\n" + "8)Gran torino\n" + "9)Slumdog Millionaire\n" + "10)Django desencadenado\n");
        peli = new JLabel("Pelicula ");
        peliculas1.setWrapStyleWord(true);
        peliculas1.setLineWrap(true);

        totals.setWrapStyleWord(true);
        totals.setLineWrap(true);

        setBounds(200, 200, 500, 500);
        setLayout(new FlowLayout());
        add(peliculas1);
        add(peli);
        add(pelis);
        add(tiquete);
        add(tiquets);
        add(vender);
        add(totalD);
        add(total);
        add(totals);
        add(limpiar);

        vender.addActionListener(this);
        totalD.addActionListener(this);
        limpiar.addActionListener(this);

        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String texBoton;

        texBoton = e.getActionCommand();
        if (e.getSource() == vender) {
            System.out.println("Informacion");
            funciones.llenar();
            funciones.buscar(pelis.getText());

        } else if (e.getSource() == totalD) {
            int i;
            i = Integer.parseInt(tiquets.getText());
            totals.setText("Total  a pagar : " + i * 7500 + "Tiquetes" + i);
            JOptionPane.showMessageDialog(null, "Total  a pagar : " + i + "Tiquetes");

        } else if (e.getSource() == limpiar) {
            totals.setText(null);
            tiquets.setText(null);
            pelis.setText(null);
        }

    }

}
