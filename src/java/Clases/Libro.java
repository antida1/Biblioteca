/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author Lina David
 */
public class Libro {
    
    private int id;
    private String nombre;
    private String autor;
    private String estante;
    private Categoria categoria;

    public Libro() {
    }

    public Libro(int id, String nombre, String autor, String estante, Categoria categoria) {
        this.id = id;
        this.nombre = nombre;
        this.autor = autor;
        this.estante = estante;
        this.categoria = categoria;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEstante() {
        return estante;
    }

    public void setEstante(String estante) {
        this.estante = estante;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return "Libro{" + "id=" + id + ", nombre=" + nombre + ", autor=" + autor + ", estante=" + estante + ", categoria=" + categoria + '}';
    }
    
    
    
    
}
