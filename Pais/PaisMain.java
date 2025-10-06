package Pais;

public class PaisMain {
    public static void main(String[] args) {
        Pais p1 = new Pais();
        p1.nombre = "Argentina";
        p1.capital = "Buenos Aires";
        p1.poblacion = 45;

        Pais p2 = new Pais();
        p2.nombre = "México";
        p2.capital = "Ciudad de México";
        p2.poblacion = 126;

        Pais p3 = new Pais();
        p3.nombre = "Peru";
        p3.capital = "Lima";
        p3.poblacion = 100;

        System.out.println("País: " + p1.nombre + ", Capital: " + p1.capital + ", Población: " + p1.poblacion + " millones");
        System.out.println("País: " + p2.nombre + ", Capital: " + p2.capital + ", Población: " + p2.poblacion + " millones");
        System.out.println("País: " + p3.nombre + ", Capital: " + p3.capital + ", Población: " + p3.poblacion + " millones");

    }
}

