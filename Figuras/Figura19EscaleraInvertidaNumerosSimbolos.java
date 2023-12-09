package Figuras;
/**
 * @author Jonathan Paredes
 * @version 2.43
 * @since 2023-12-03
 * Genera un triangulo que sigue la logica del Triangulo de pascal, pero en este caso esta formado por simbolos *, +.
 *  F19:                                                                    
            *
            +   *
            +   3   *
            +   4   5   *
            +   5   9   7  *
            +   6   14  16  9  *
*/
public class Figura19EscaleraInvertidaNumerosSimbolos {

    public void imprimirSecuencia(int numNiveles) {
        int matrizNumerosSimbolos[][] = new int[numNiveles + 1][numNiveles + 1];
        StringBuilder trianguloSumadoPascalYSimbolos = new StringBuilder();
        for (int filas = 0; filas < numNiveles; filas++) {
            for (int columnas = 0; columnas < numNiveles; columnas++) {
                if (columnas <= filas) {
                    if (columnas == filas) {
                        matrizNumerosSimbolos[filas][columnas] = 2;
                        trianguloSumadoPascalYSimbolos.append("* ");
                    } else if (filas > columnas && columnas == 0) {
                        matrizNumerosSimbolos[filas][0] = 1;
                        trianguloSumadoPascalYSimbolos.append("+ ");
                    } else {
                        matrizNumerosSimbolos[filas][columnas] =
                                matrizNumerosSimbolos[filas - 1][columnas] + matrizNumerosSimbolos[filas - 1][columnas - 1];
                        trianguloSumadoPascalYSimbolos.append(matrizNumerosSimbolos[filas][columnas] + "  ");
                    }
                } else {
                    trianguloSumadoPascalYSimbolos.append(" ");
                }
            }
            trianguloSumadoPascalYSimbolos.append("\n");
        }
        System.out.println(trianguloSumadoPascalYSimbolos.toString());
    }
}
