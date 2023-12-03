package Figuras;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Ingrese el numero de elementos: ");
        int tamanioFigura = reader.nextInt();

        Figura2AteriscoMas oFigura2 = new Figura2AteriscoMas();
        System.out.println("\nFigura del cuadrado con For (*+): ");
        oFigura2.AteriscoMasCuadradoFor(tamanioFigura);

        Figura7EscalerasIzq oFigura7 = new Figura7EscalerasIzq();
        System.out.println("\nEscaleras hacia la izquierda: ");
        oFigura7.EscalerasIzqFor(tamanioFigura);
        System.out.println();

        Figura12TrianguloInvertido oFigura12 = new Figura12TrianguloInvertido();
        System.out.println("\nTriangulo con numeros invertido: ");
        oFigura12.TrianguloInvertido(tamanioFigura);
        System.out.println();

        Figura17NumerosX oFigura17 = new Figura17NumerosX();
        System.out.println("\nNumeros en X: ");
        oFigura17.NumerosX(tamanioFigura);

        
        reader.close();
    }
}
