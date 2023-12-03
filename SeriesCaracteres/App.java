package SeriesCaracteres;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner reader = new Scanner(System.in);

        System.out.print("Ingrese el numero de elementos: ");
        int numeroElementos = reader.nextInt();
        System.out.println();

        Serie2MasFibonacci oSerie2 = new Serie2MasFibonacci();
        System.out.print("Serie 2 fibonacci con For (+): ");
        oSerie2.SerieMasFibonacciFor(numeroElementos);
        System.out.println();

        Serie5palitos oSerie5 = new Serie5palitos();
        System.out.print("\nSerie 5 con lineas inclinadas: ");
        oSerie5.palitosinclinados(numeroElementos);
        System.out.println();

        
        Serie3MasAumento oSerie3 = new Serie3MasAumento();
        System.out.print("Serie 3 usando for: ");
        oSerie3.Serie3(numeroElementos);
        System.out.println();


        Serie6LetrasImpares oSerie6 = new Serie6LetrasImpares();
        System.out.print("\nSerie 6 letras impares con For: ");
        oSerie6.letrasImparesFor(numeroElementos);
        System.out.println();

        Serie10letrassum2 oSerie10 = new Serie10letrassum2();
        System.out.print("\nSerie 10 de suma iterada con letras: ");
        oSerie10.sumaelementosantes(numeroElementos);
        System.out.println();

        Serie7AbcAumento oSerie7 = new Serie7AbcAumento();
        System.out.print("Serie 7 usando For: ");
        oSerie7.generarSerieConFor(numeroElementos);
        System.out.println();

        reader.close();
    }
}
