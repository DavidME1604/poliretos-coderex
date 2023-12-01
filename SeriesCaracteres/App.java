package SeriesCaracteres;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner reader = new Scanner(System.in);

        System.out.print("Ingrese el numero de elementos: ");
        int numeroElementos = reader.nextInt();

        Serie2MasFibonacci oSerie2 = new Serie2MasFibonacci();
        System.out.print("Serie 2 fibonacci con For (+): ");
        oSerie2.SerieMasFibonacciFor(numeroElementos);
        System.out.print("\nSerie 2 fibonacci con Do (+): ");
        oSerie2.SerieMasFibonacciDo(numeroElementos);
        System.out.print("\nSerie 2 fibonacci con While (+): ");
        oSerie2.SerieMasFibonacciWhile(numeroElementos);
        System.out.println();


        Serie6LetrasImpares oSerie6 = new Serie6LetrasImpares();
        System.out.print("\nSerie 6 letras impares con For: ");
        oSerie6.letrasImparesFor(numeroElementos);
        System.out.print("\nSerie 6 letras impares con Do: ");
        oSerie6.letrasImparesDo(numeroElementos);
        System.out.print("\nSerie 6 letras impares con While: ");
        oSerie6.letrasImparesWhile(numeroElementos);
        System.out.println();

        reader.close();
    }
}
