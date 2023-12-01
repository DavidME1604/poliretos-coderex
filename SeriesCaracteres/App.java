package SeriesCaracteres;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner reader = new Scanner(System.in);

        System.out.print("Ingrese el numero de elementos: ");
        int numeroElementos = reader.nextInt();

        Serie2MasFibonacci serieCaracter2 = new Serie2MasFibonacci();
        System.out.print("Serie 2 fibonacci con For (+): ");
        serieCaracter2.SerieMasFibonacciFor(numeroElementos);
        System.out.print("\nSerie 2 fibonacci con Do (+): ");
        serieCaracter2.SerieMasFibonacciDo(numeroElementos);
        System.out.print("\nSerie 2 fibonacci con While (+): ");
        serieCaracter2.SerieMasFibonacciWhile(numeroElementos);
        System.out.println();


        Serie6LetrasImpares serieCaracter6 = new Serie6LetrasImpares();
        System.out.print("\nSerie 6 letras impares con For: ");
        serieCaracter6.letrasImparesFor(numeroElementos);
        System.out.print("\nSerie 6 letras impares con Do: ");
        serieCaracter6.letrasImparesDo(numeroElementos);
        System.out.print("\nSerie 6 letras impares con While: ");
        serieCaracter6.letrasImparesWhile(numeroElementos);
        System.out.println();

        reader.close();
    }
}
