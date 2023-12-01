package Figuras;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Ingrese el numero de elementos: ");
        int tamanioFigura = reader.nextInt();

        Figura2AteriscoMas serie2Cuadrado = new Figura2AteriscoMas();
        System.out.println("Figura del cuadrado con For (*+): ");
        serie2Cuadrado.AteriscoMasCuadradoFor(tamanioFigura);

        Figura7EscalerasIzq serie7EscalerasIzq = new Figura7EscalerasIzq();
        serie7EscalerasIzq.EscalerasIzqFor(tamanioFigura);
        System.out.println();

        Figura12TrianguloInvertido serie12TrianguloInver = new Figura12TrianguloInvertido();
        serie12TrianguloInver.TrianguloInvertido(tamanioFigura);
        System.out.println();

        Figura17NumerosX serie17NumerosX = new Figura17NumerosX();
        serie17NumerosX.NumerosX(tamanioFigura);
        reader.close();
    }
}
