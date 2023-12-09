package SeriesCaracteres;

import java.util.Scanner;

public class AppSerieCaracteres {
    public static void main(String[] args) throws Exception {
        Scanner reader = new Scanner(System.in);

        System.out.print("Ingrese el numero de elementos: ");
        int numeroElementos = reader.nextInt();
        System.out.println();

        Serie1MasMenos oSerie1 = new Serie1MasMenos();
        System.out.print("[ Serie 1 ]- Mas y menos: ");
        oSerie1.imprimirSerieS1(numeroElementos);
        System.out.println("\n");

        Serie2MasFibonacci oSerie2 = new Serie2MasFibonacci();
        System.out.print("[ Serie 2 ]- fibonacci (+): ");
        oSerie2.SerieMasFibonacciFor(numeroElementos);
        System.out.println("\n");

        Serie3MasAumento oSerie3 = new Serie3MasAumento();
        System.out.print("[ Serie 3 ]- con mas aumentado: ");
        oSerie3.Serie3(numeroElementos);
        System.out.println("\n");

        Serie4Caracteres oSerie4 = new Serie4Caracteres();
        System.out.print("[ Serie 4 ]-distintos caracteres: ");
        oSerie4.generarSerieFor(numeroElementos);
        System.out.println();

        Serie5palitos oSerie5 = new Serie5palitos();
        System.out.print("\n[ Serie 5 ]- con lineas inclinadas: ");
        oSerie5.palitosinclinados(numeroElementos);
        System.out.println();

        Serie6Abecedario oSerie6 = new Serie6Abecedario();
        System.out.print("[ Serie 6 ]- Abecedario: ");
        oSerie6.imprimirAbecedario();
        System.out.println();

        Serie7LetrasImpares obSerie7 = new Serie7LetrasImpares();
        System.out.print("\n[ Serie 7 ]- letras impares: ");
        obSerie7.letrasImparesFor(numeroElementos);
        System.out.println("\n");

        Serie8AbcAumento oSerie8 = new Serie8AbcAumento();
        System.out.print("[ Serie 8 ]- abecedaria con repeticion: ");
        oSerie8.generarSerieConFor(numeroElementos);
        System.out.println();

        Serie9letras oSerie9 = new Serie9letras();
        System.out.print("[ Serie 9 ]- abecedario fibonacci: ");
        oSerie9.generarSerieFor(numeroElementos);
        System.out.println();

        Serie10letrassum2 oSerie10 = new Serie10letrassum2();
        System.out.print("[ Serie 10 ]- de suma iterada con letras: ");
        oSerie10.sumaelementosantes(numeroElementos);
        System.out.println();
    }
}
