package Recursividad;

public class Recursividad3Producto {

    public void mostrar(int a, int b) {
        System.out.println("El resultado de la multiplicación de " + a + " y " + b + " es igual a: " + producto(a, b));
    }

    public int producto(int a, int b) {
        if (b == 0) {
            return 0;
        } else {
            return a + producto(a, b - 1);
        }
    }
}
