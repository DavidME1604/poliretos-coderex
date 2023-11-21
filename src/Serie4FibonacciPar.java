public class Serie4FibonacciPar {
// Método para generar una serie de fracciones usando un bucle for
    public void SerieFraccionariaFor(int nPosiciones) {
// Inicializar variables para los dos primeros numeradores, el denominador y el tamaño del salto
        int numerador1 = 0;
        int numerador2 = 1;
        int denominador1 = 2;
        int salto = 2;
        // Iterar 'nPosiciones' veces para generar la serie de fracciones
        for (int i = 0; i < nPosiciones; i++) {
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
    // Método para generar una serie de fracciones usando un bucle do-while
    public void SerieFraccionariaDo(int nPosiciones) {
        int numerador1 = 0;
        int numerador2 = 1;
        int denominador1 = 2;
        int salto = 2;
        int i = 0;
        // Utilizar un bucle do-while para generar la serie de fracciones
        do {
            System.out.print(numerador1 + "/");
            System.out.print(denominador1 + " ");
            int signumerador = numerador1 + numerador2;
            numerador1 = numerador2;
            numerador2 = signumerador;
            denominador1 += salto;
            // Incrementar el contador del bucle
            i++;
        } while (i < nPosiciones); // Continuar hasta alcanzar 'nPosiciones' iteraciones
    }
    // Método para generar una serie de fracciones usando un bucle while
    public void SerieFraccionariaWhile(int nPosiciones) {
        int numerador1 = 0;
        int numerador2 = 1;
        int denominador1 = 2;
        int salto = 2;
        int i = 0;
        // Utilizar un bucle while para generar la serie de fracciones
        while (i < nPosiciones) {
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
