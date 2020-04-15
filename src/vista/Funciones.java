/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JOptionPane;
import modelo.Pelicula;

/**
 *
 * @author Andres Ortega
 */
public class Funciones {

    ArrayList<Pelicula> peli = new ArrayList();

    public void llenar() {

        Pelicula pel1 = new Pelicula("Origen", "Christopher Nola", 2010, "");
        Pelicula pel2 = new Pelicula("Avatar", "James Cameron", 2009, "");
        Pelicula pel3 = new Pelicula("En caballero oscuro", "Christopher Nolan ", 2008, "");
        Pelicula pel4 = new Pelicula("Malditos bastardos", "Quentin Tarantino", 2009, "");
        Pelicula pel5 = new Pelicula("Joker", "Todd Phillops", 2019, "");
        Pelicula pel6 = new Pelicula("Interstellar", "Christopher Nolan", 2014, " ");
        Pelicula pel7 = new Pelicula("Cisne negro", "Darren Aronofsky ", 2010, "");
        Pelicula pel8 = new Pelicula("Gran torino", "Clint Eastwood", 2008, "");
        Pelicula pel9 = new Pelicula("Slumdog Millionaire", "Danny Boyle, Loveleen Tandan", 2008, "");
        Pelicula pel10 = new Pelicula("Django desencadenado", "Quentin Tarantino", 2012, "");

        peli.add(pel1);
        peli.add(pel2);
        peli.add(pel3);
        peli.add(pel4);
        peli.add(pel5);
        peli.add(pel6);
        peli.add(pel7);
        peli.add(pel8);
        peli.add(pel9);
        peli.add(pel10);

    }

    public void buscar(String nombrePeli) {

        Iterator it = peli.iterator();

        while (it.hasNext()) {
            Pelicula pelicula = (Pelicula) it.next();
            if (nombrePeli.equalsIgnoreCase(pelicula.getNombre())) {
                JOptionPane.showMessageDialog(null, pelicula.getNombre() + " " + pelicula.getDirector() + " " + pelicula.getAño() + " " + pelicula.getReseña());

            }

        }

    }

    public void vender(int cantidad, String nombre) {
        Iterator it = peli.iterator();
        while (it.hasNext()) {
            Pelicula pelicula = (Pelicula) it.next();
            if (nombre.equalsIgnoreCase(pelicula.getNombre())) {
                JOptionPane.showMessageDialog(null, pelicula.getNombre() + pelicula.getDirector() + pelicula.getAño() + pelicula.getReseña());
                pelicula.setEntrada(cantidad + pelicula.getEntrada());
            }

        }

    }

    public void totalD(String nombre) {
        Iterator it = peli.iterator();
        while (it.hasNext()) {
            Pelicula pelicula = (Pelicula) it.next();
            if (nombre.equalsIgnoreCase(pelicula.getNombre())) {
                JOptionPane.showMessageDialog(null, pelicula.getNombre());
            }
        }

    }
}
