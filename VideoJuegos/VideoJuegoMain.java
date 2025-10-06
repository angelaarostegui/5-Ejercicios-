package VideoJuegos;

public class VideoJuegoMain {
    public static void main(String[] args) {
        VideoJuego juego1 = new VideoJuego();
        juego1.nombre = "FIFA 24";
        juego1.consola = "PS5";
        juego1.precio = 59.99;

        VideoJuego juego2 = new VideoJuego();
        juego2.nombre = "Minecraft";
        juego2.consola = "PC";
        juego2.precio = 26.95;

        VideoJuego juego3 = new VideoJuego();
        juego3.nombre = "Free fire";
        juego3.consola = "PC";
        juego3.precio = 25.55;

        System.out.println("Juego: " + juego1.nombre + " | Consola: " + juego1.consola + " | Precio: $" + juego1.precio);
        System.out.println("Juego: " + juego2.nombre + " | Consola: " + juego2.consola + " | Precio: $" + juego2.precio);
        System.out.println("Juego: " + juego3.nombre + " | Consola: " + juego3.consola + " | Precio: $" + juego3.precio);

    }
}
