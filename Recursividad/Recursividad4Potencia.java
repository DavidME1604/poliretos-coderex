package Recursividad;
/**
     * @author David Esteban Morales Estrella
     * @Github DavidME1604
     * @version 2.0
     * 
     * @since 2023-11-21
     * 
     * @license
     * 
     * Potencia 
     */

public class Recursividad4Potencia {
    /**
     * Muestra el resultado
     * @param numBase
     * @param exp
     */
    public void mostrar(int numBase, int exp) {
        System.out.print("La base " + numBase + " elevado a " + exp + " es igual a: " + potencia(numBase, exp));

    }

    /**
     * Metodo recursivo
     * @param base
     * @param exp
     * @return
     */
    public int potencia(int base, int exp) {
        if (exp == 0) {
            return 1;
        } else {
            return base * potencia(base, exp - 1);
        }

    }
}
