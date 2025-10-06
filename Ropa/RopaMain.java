package Ropa;

public class RopaMain {
    public static void main(String[] args) {
        Ropa prenda1 = new Ropa();
        prenda1.tipo = "Camiseta";
        prenda1.talla = "M";
        prenda1.color = "Rojo";

        Ropa prenda2 = new Ropa();
        prenda2.tipo = "Pantalón";
        prenda2.talla = "L";
        prenda2.color = "Azul";

        Ropa prenda3 = new Ropa();
        prenda3.tipo = "short";
        prenda3.talla = "S";
        prenda3.color = "Negro";

        System.out.println("Tipo: " + prenda1.tipo + ", Talla: " + prenda1.talla + ", Color: " + prenda1.color);
        System.out.println("Tipo: " + prenda2.tipo + ", Talla: " + prenda2.talla + ", Color: " + prenda2.color);
        System.out.println("Tipo: " + prenda3.tipo + ", Talla: " + prenda3.talla + ", Color: " + prenda3.color);

    }
}
