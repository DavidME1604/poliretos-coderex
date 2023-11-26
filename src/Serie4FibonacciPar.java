public class Serie4FibonacciPar {
/*
 *@author José David Pallares Santamaría
 *
 *@version 2.0
 *
 *@since 2023-11-21
 *
 *@license
 *
 *Serie  S4: 0/2  1/4  1/6  2/8  3/10  5/12  8/14  13/16 ....
*/

    /**
     *Incremento Serie Fibonachi calcula la serie usando el ciclo for:  0/2  1/4  1/6  2/8  3/10  5/12  8/14  13/16 ....
     *
     *@param numeroElementos
    */
    public void SerieFraccionariaFor(int numeroElementos) {

        int numerador1 = 0;
        int numerador2 = 1;
        int denominador1 = 2;
        int salto = 2;
        // Iterar 'numeroElementos' veces para generar la serie de fracciones
        for (int i = 0; i < numeroElementos; i++) {
            // Imprimir la fracción actual
            System.out.print(numerador1 + "/");
            System.out.print(denominador1 + " ");
             // Actualizar numeradores y denominador para la siguiente iteración
            int signumerador = numerador1 + numerador2;
            numerador1 = numerador2;
            numerador2 = signumerador;
            denominador1 += salto;

        }
    }
    /**
     *Incremento Serie Fibonachi calcula la serie usando el ciclo Dor:  0/2  1/4  1/6  2/8  3/10  5/12  8/14  13/16 ....
     *
     *@param numeroElementos
    */
    public void SerieFraccionariaDo(int numeroElementos) {
        int numerador1 = 0;
        int numerador2 = 1;
        int denominador1 = 2;
        int salto = 2;
        int i = 0;
        do {
            System.out.print(numerador1 + "/");
            System.out.print(denominador1 + " ");
            int signumerador = numerador1 + numerador2;
            numerador1 = numerador2;
            numerador2 = signumerador;
            denominador1 += salto;
            // Incrementar el contador del bucle
            i++;
        } while (i < numeroElementos); // Continuar hasta alcanzar 'numeroElementos' iteraciones
    }
    /**
     *Incremento Serie Fibonachi calcula la serie usando el ciclo While:  0/2  1/4  1/6  2/8  3/10  5/12  8/14  13/16 ....
     *
     *@param numeroElementos
    */
    public void SerieFraccionariaWhile(int numeroElementos) {
        int numerador1 = 0;
        int numerador2 = 1;
        int denominador1 = 2;
        int salto = 2;
        int i = 0;
        while (i < numeroElementos) {
            System.out.print(numerador1 + "/");
            System.out.print(denominador1 + " ");
            int signumerador = numerador1 + numerador2;
            numerador1 = numerador2;
            numerador2 = signumerador;
            denominador1 += salto;
            // Incrementar el contador del bucle
            i++;

        }

    }

}
