package modelo;

import java.util.ArrayList;
import java.util.List;
public class Persona {
    private String nombre;
    private int edad;
    private List<Libro> librosPrestados;

    // Constructor
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
        this.librosPrestados = new ArrayList<>();
    }

    // Métodos
    public void tomarPrestadoLibro(Libro libro) {
        if (librosPrestados.size() < 3) {
            librosPrestados.add(libro);
            System.out.println("Libro prestado a " + nombre + ". Edad: " + edad);
        } else {
            System.out.println("Ya has alcanzado el límite de libros prestados. Edad: " + edad);
        }
    }

    public void devolverLibro(Libro libro) {
        if (librosPrestados.contains(libro)) {
            librosPrestados.remove(libro);
            System.out.println("Libro devuelto por " + nombre + ". Edad: " + edad);
        } else {
            System.out.println("No tienes este libro prestado. Edad: " + edad);
        }
    }

    // Método para obtener la lista de libros prestados
    public List<Libro> getLibrosPrestados() {
        return librosPrestados;
    }

    // Nuevo método que devuelve la edad
    public int getEdad() {
        return edad;
    }
}
