// Archivo: ProductoMain.java
package Tienda;

public class ProductoMain {
    public static void main(String[] args) {
        Producto prod1 = new Producto();
        prod1.nombre = "Chocolate";
        prod1.precio = 1.50;
        prod1.stock = 20;

        Producto prod2 = new Producto();
        prod2.nombre = "Café";
        prod2.precio = 2.30;
        prod2.stock = 10;

        Producto prod3 = new Producto();
        prod3.nombre = "Cocoa";
        prod3.precio = 1.50;
        prod3.stock = 15;

        System.out.println(prod1.nombre + " - $" + prod1.precio + " | Stock: " + prod1.stock);
        System.out.println(prod2.nombre + " - $" + prod2.precio + " | Stock: " + prod2.stock);
        System.out.println(prod3.nombre + " - $" + prod3.precio + " | Stock: " + prod3.stock);
    }
}



