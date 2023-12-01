package Figuras;

public class Figura2AteriscoMas {
    public void AteriscoMasCuadradoFor(int tamanioFigura) {
        char caracter = '*';
        for (int i = 0; i < tamanioFigura; i++) {
            for (int j = 0; j < tamanioFigura; j++) {
                System.out.print((i==0||i==tamanioFigura-1) ? caracter + " ":(j==0||j==tamanioFigura-1)? caracter+" ": "  ");
                if (caracter == '*') {
                    caracter = '+';
                } else {
                    caracter = '*';
                }
            }
            System.out.println();
        }
    }
}
