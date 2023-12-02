package Figuras;

public class Figura12TrianguloInvertido {
    public void TrianguloInvertido(int tamanioFigura) {
        int maxNumero = tamanioFigura;
        for (int i = 0; i < tamanioFigura; i++) {
            for (int j = 1; j <= maxNumero; j++) {
                System.out.print(j);
            }
            maxNumero--;
            System.out.println();
        }

    }
}
