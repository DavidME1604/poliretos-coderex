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

        Figura3TrianguloIzquierda oFigura3 = new Figura3TrianguloIzquierda();
        System.out.print("\nTriangulos: ");
        oFigura3.TrianguloIzquierda(tamanioFigura);

        Figura7EscalerasIzq oFigura7 = new Figura7EscalerasIzq();
        System.out.println("\nEscaleras hacia la izquierda: ");
        oFigura7.EscalerasIzqFor(tamanioFigura);
        System.out.println();

        Figura8EscalerasDer oFigura8 = new Figura8EscalerasDer();
        System.out.println("\nEscaleras hacia la derecha: ");
        oFigura8.EscalerasDer(tamanioFigura);
        System.out.println();

        Figura12TrianguloInvertido oFigura12 = new Figura12TrianguloInvertido();
        System.out.println("\nTriangulo con numeros invertido: ");
        oFigura12.TrianguloInvertido(tamanioFigura);
        System.out.println();

        Figura13TrianguloNum oFigura13 = new Figura13TrianguloNum();
        System.out.println("\nTriangulo con numeros: ");
        oFigura13.TrianguloNum(tamanioFigura);
        System.out.println();

        Figura17NumerosX oFigura17 = new Figura17NumerosX();
        System.out.println("\nNumeros en X: ");
        oFigura17.NumerosX(tamanioFigura);
        System.out.println();

        Figura18TrianguloNumPascal oFigura18 = new Figura18TrianguloNumPascal();
        System.out.println("\nTriangulo Numero Pascal: ");
        oFigura18.TrianguloNumPascal(tamanioFigura);
        System.out.println();


        
        reader.close();

    }
}
