package modelo;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<Libro> librosDisponibles;
    private List<Libro> librosPrestados;

    // Constructor
    public Biblioteca() {
        this.librosDisponibles = new ArrayList<>();
        this.librosPrestados = new ArrayList<>();
    }

    // Métodos
    public void agregarLibro(Libro libro) {
        librosDisponibles.add(libro);
        System.out.println("Libro agregado a la biblioteca: " + libro.obtenerInformacion());
    }

    public void prestarLibro(Libro libro) {
        if (librosDisponibles.contains(libro)) {
            librosDisponibles.remove(libro);
            librosPrestados.add(libro);
            System.out.println("Libro prestado a la persona.");
        } else {
            System.out.println("El libro no está disponible en la biblioteca.");
        }
    }

    public void devolverLibro(Libro libro) {
        if (librosPrestados.contains(libro)) {
            librosPrestados.remove(libro);
            librosDisponibles.add(libro);
            System.out.println("Libro devuelto a la biblioteca.");
        } else {
            System.out.println("El libro no está en la lista de libros prestados.");
        }
    }

    public void mostrarLibrosDisponibles() {
        System.out.println("Libros disponibles en la biblioteca:");
        for (Libro libro : librosDisponibles) {
            System.out.println(libro.obtenerInformacion());
        }
    }

    public void mostrarLibrosPrestados() {
        System.out.println("Libros prestados:");
        for (Libro libro : librosPrestados) {
            System.out.println(libro.obtenerInformacion());
        }
    }
}
