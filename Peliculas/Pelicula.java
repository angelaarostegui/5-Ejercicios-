package Peliculas;

public class Pelicula {
    String titulo;
    String genero;
    int duracion; // en minutos

    void mostrarInfo() {
        System.out.println("Título: " + titulo + " | Género: " + genero + " | Duración: " + duracion + " min");
    }
}
