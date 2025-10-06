package Tienda;

public class Producto {
    String nombre;
    double precio;
    int stock;

    void muestraProducto() {
        System.out.println(nombre + " - $" + precio + " | Stock: " + stock);
    }
}
