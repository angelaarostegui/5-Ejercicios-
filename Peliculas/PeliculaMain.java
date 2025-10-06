package Peliculas;

public class PeliculaMain {
    public static void main(String[] args) {
        Pelicula p1 = new Pelicula();
        p1.titulo = "Avatar";
        p1.genero = "Ciencia Ficción";
        p1.duracion = 162;

        Pelicula p2 = new Pelicula();
        p2.titulo = "El Rey León";
        p2.genero = "Animación";
        p2.duracion = 88;

        Pelicula p3 = new Pelicula();
        p3.titulo = "Sirenitas";
        p3.genero = "Ficcion";
        p3.duracion = 60;


        System.out.println("Título: " + p1.titulo + " | Género: " + p1.genero + " | Duración: " + p1.duracion + " min");
        System.out.println("Título: " + p2.titulo + " | Género: " + p2.genero + " | Duración: " + p2.duracion + " min");
        System.out.println("Título: " + p3.titulo + " | Género: " + p3.genero + " | Duración: " + p3.duracion + " min");

    }
}
