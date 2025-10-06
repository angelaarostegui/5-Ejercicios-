package VideoJuegos;

public class VideoJuego {
    String nombre;
    String consola;
    double precio;

    void mostrarDatos() {
        System.out.println("Juego: " + nombre + " | Consola: " + consola + " | Precio: $" + precio);
    }
}

