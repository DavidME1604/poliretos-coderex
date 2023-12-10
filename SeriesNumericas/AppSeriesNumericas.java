package SeriesNumericas;

import java.util.Scanner;

public class AppSeriesNumericas {
    public static void main(String[] args) throws Exception {
        Scanner reader = new Scanner(System.in);
            System.out.print("Ingrese el numero de elementos: ");
            int numeroElementos = reader.nextInt();

            Serie1Fibonacci oSerie1 = new Serie1Fibonacci();
            System.out.print("\n[ SerieNum. 1 ] Imprimiendo serie Fibonacci con bucle for: ");
            oSerie1.imprimirFibonacciFor(numeroElementos);
            System.out.print("\n[ SerieNum. 1 ] Imprimiendo serie Fibonacci con bucle do-while: ");
            oSerie1.imprimirFibonacciDoWhile(numeroElementos);
            System.out.print("\n[ SerieNum. 1 ] Imprimiendo serie Fibonacci con bucle while: ");
            oSerie1.imprimirFibonacciWhile(numeroElementos);
            System.out.println();

            Serie2ImparCero oSerie2 = new Serie2ImparCero();
            System.out.print("\n[ SerieNum. 2 ] con for: ");
            oSerie2.ImparesCeroFor(numeroElementos);
            System.out.print("\n[ SerieNum. 2 ] con do: ");
            oSerie2.ImparesCeroDo(numeroElementos);
            System.out.print("\n[ SerieNum. 2 ] con while: ");
            oSerie2.ImparesCeroWhile(numeroElementos);
            System.out.println();

            Serie3FibonacciImpar oSerie3 = new Serie3FibonacciImpar();
            System.out.print("\n[ SerieNum. 3 ] Serie de fracciones con for: ");
            oSerie3.fraccion_For(numeroElementos);
            System.out.print("\n[ SerieNum. 3 ] Serie de fracciones con doWhile: ");
            oSerie3.fraccion_DoWhile(numeroElementos);
            System.out.print("\n[ SerieNum. 3 ] Serie de fracciones con while: ");
            oSerie3.fraccion_While(numeroElementos);
            System.out.println();

            Serie4FibonacciPar oSerie4 = new Serie4FibonacciPar();
            System.out.print("\n[ SerieNum. 4 ] Serie de fibonacci dividido entre pares con for: ");
            oSerie4.SerieFraccionariaFor(numeroElementos);
            System.out.print("\n[ SerieNum. 4 ] Serie de fibonacci dividido entre pares con do-while: ");
            oSerie4.SerieFraccionariaDo(numeroElementos);
            System.out.print("\n[ SerieNum. 4 ] Serie de fibonacci dividido entre pares con while: ");
            oSerie4.SerieFraccionariaWhile(numeroElementos);
            System.out.println();

            Serie5NumerosPrimos oSerie5 = new Serie5NumerosPrimos();
            System.out.print("\n[ SerieNum. 5 ] Numeros Primos con for:            ");
            oSerie5.imprimirPrimosFor(numeroElementos);
            System.out.print("\n[ SerieNum. 5 ] Numeros Primos con Do-While:      ");
            oSerie5.imprimirPrimosDoWhile(numeroElementos);
            System.out.print("\n[ SerieNum. 5 ] Numeros Primos con While:         ");
            oSerie5.imprimirPrimosWhile(numeroElementos);
            System.out.println();

            Serie6CuadradosSucesivos oSerie6 = new Serie6CuadradosSucesivos();
            System.out.print("\n[ SerieNum. 6 ] Serie de cuadrados con for: ");
            oSerie6.numcuadrado_For(numeroElementos);
            System.out.print("\n[ SerieNum. 6 ] Serie de cuadrados con do-while: ");
            oSerie6.numcuadrado_DoWhile(numeroElementos);
            System.out.print("\n[ SerieNum. 6 ] Serie de cuadrados con while: ");
            oSerie6.numcuadrado_While(numeroElementos);
            System.out.println();

            Serie7IncrementoTres oSerie7 = new Serie7IncrementoTres();
            System.out.print("\n[ SerieNum. 7 ] con for: ");
            oSerie7.IncrementoTresFor(numeroElementos);
            System.out.print("\n[ SerieNum. 7 ] con do: ");
            oSerie7.IncrementoTresDo(numeroElementos);
            System.out.print("\n[ SerieNum. 7 ] con while: ");
            oSerie7.IncrementoTresWhile(numeroElementos);
            System.out.println();

            Serie8SumaCinco oSerie8 = new Serie8SumaCinco();
            System.out.print("\n[ SerieNum. 8 ] Incremento en cinco con for:      ");
            oSerie8.imprimirIncrementoEnCincoFor(numeroElementos);
            System.out.print("\n[ SerieNum. 8 ] Incremento en cinco con Do-While: ");
            oSerie8.imprimirIncrementoEnCincoDoWhile(numeroElementos);
            System.out.print("\n[ SerieNum. 8 ] Incremento en cinco con While:    ");
            oSerie8.imprimirIncrementoEnCincoWhile(numeroElementos);
            System.out.println();

            Serie9DobleAnterior oSerie9 = new Serie9DobleAnterior();
            System.out.print("\n[ SerieNum. 9 ] Usando bucle for: ");
            oSerie9.imprimirMultiplicacionPorDosFor(numeroElementos);
            System.out.print("\n[ SerieNum. 9 ] Usando bucle do-while: ");
            oSerie9.imprimirMultiplicacionPorDosDoWhile(numeroElementos);
            System.out.print("\n[ SerieNum. 9 ] Usando bucle while: ");
            oSerie9.imprimirMultiplicacionPorDosWhile(numeroElementos);
            System.out.println();

            Serie10MultiplicacionPorTres oSerie10 = new Serie10MultiplicacionPorTres();
            System.out.print("\n[ SerieNum. 10 ] Elevado a n potencias con for: ");
            oSerie10.MultiplicacionPor3For(numeroElementos);
            System.out.print("\n[ SerieNum. 10 ] Elevado a n potencias con do-while: ");
            oSerie10.MultiplicacionPor3Do(numeroElementos);
            System.out.print("\n[ SerieNum. 10 ] Elevado a n potencias con while: ");
            oSerie10.MultiplicacionPor3While(numeroElementos);
            System.out.println();

            Serie12MultiplosDos oSerie12 = new Serie12MultiplosDos();
            System.out.print("\n[ SerieNum. 12 ] con for: ");
            oSerie12.MultiplosDosFor(numeroElementos);
            System.out.print("\n[ SerieNum. 12 ] con do: ");
            oSerie12.MultiplosDosDo(numeroElementos);
            System.out.print("\n[ SerieNum. 12 ] con while: ");
            oSerie12.MultiplosDosWhile(numeroElementos);
            System.out.println();

            reader.nextLine();
        }
}
