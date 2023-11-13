package biblioteca;
import modelo.Libro;
import modelo.Biblioteca;
import modelo.Persona;

public class Main {
    public static void main(String[] args) {
        // Crear libros
        Libro libro1 = new Libro("El Señor de los Anillos", "J.R.R. Tolkien", 1954, "Fantasía", 1200);
        Libro libro2 = new Libro("1984", "George Orwell", 1949, "Ciencia Ficción", 300);

        // Crear biblioteca
        Biblioteca biblioteca = new Biblioteca();

        // Agregar libros a la biblioteca
        biblioteca.agregarLibro(libro1);
        biblioteca.agregarLibro(libro2);

        // Mostrar libros disponibles en la biblioteca
        biblioteca.mostrarLibrosDisponibles();

        // Crear personas
        Persona persona1 = new Persona("Juan", 25);
        Persona persona2 = new Persona("Maria", 30);

        // Persona toma prestado un libro
        persona1.tomarPrestadoLibro(libro1);

        // Intentar prestar un libro que no está en la biblioteca
        biblioteca.prestarLibro(libro2);

        // Prestar un libro de la biblioteca a una persona
        biblioteca.prestarLibro(libro1);

        // Mostrar libros prestados por la persona
        System.out.println("Libros prestados por " + persona1.toString() + ":");
        for (Libro libro : persona1.getLibrosPrestados()) {
            System.out.println(libro.obtenerInformacion());
        }

        // Devolver un libro a la biblioteca
        persona1.devolverLibro(libro1);

        // Mostrar libros disponibles después de la devolución
        biblioteca.mostrarLibrosDisponibles();
    }
}
