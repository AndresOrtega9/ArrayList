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
public class Pelicula {

    private String nombre;
    private String director;
    private int año;
    private String reseña;
    private int entrada;

    public Pelicula(String nombre, String director, int año, String reseña) {
        this.nombre = nombre;
        this.director = director;
        this.año = año;
        this.reseña = reseña;
    }

    public String sumaTotal() {
        return ("nombre; " + nombre);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public String getReseña() {
        return reseña;
    }

    public void setReseña(String reseña) {
        this.reseña = reseña;
    }

    public int getEntrada() {
        return entrada;
    }

    public void setEntrada(int entrada) {
        this.entrada = entrada;
    }
}
