package Recursividad;

public class Recursividad5ConteoProgresivo {
    /*
     * @author José David Pallares Santamaría
     * @Github JosDavP
     * @version 2.0
     * 
     * since 2023-12-3
     * 
     * @license
     * Crear una serie que contee progrsivamente y sea recursiva
     * 
     *  
     *...
     */
    public static void conteoProgresivo(int n) {
        conteoRecursivo(1, n);
    }

    private static void conteoRecursivo(int actual, int n) {
        if (actual <= n) {
            System.out.println("Avance: " + actual);
            pausa(500); // Pausa de medio segundo para visualizar el avance

            conteoRecursivo(actual + 1, n);
        }
    }

    private static void pausa(int milisegundos) {
        try {
            Thread.sleep(milisegundos);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

