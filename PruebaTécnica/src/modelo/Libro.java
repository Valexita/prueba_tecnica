package modelo;
public class Libro {
    private String titulo;
    private String autor;
    private int anoPublicacion;
    private String genero;
    private int numPaginas;
    private boolean prestado;

    // Constructor
    public Libro(String titulo, String autor, int anoPublicacion, String genero, int numPaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacion = anoPublicacion;
        this.genero = genero;
        this.numPaginas = numPaginas;
        this.prestado = false;
    }

    // Métodos
    public String obtenerInformacion() {
        return "Título: " + titulo + ", Autor: " + autor + ", Año de publicación: " + anoPublicacion +
                ", Género: " + genero + ", Número de páginas: " + numPaginas;
    }

    public void prestarLibro() {
        if (!prestado) {
            prestado = true;
            System.out.println("Libro prestado.");
        } else {
            System.out.println("El libro ya está prestado.");
        }
    }

    public void devolverLibro() {
        if (prestado) {
            prestado = false;
            System.out.println("Libro devuelto.");
        } else {
            System.out.println("El libro no estaba prestado.");
        }
    }
}
