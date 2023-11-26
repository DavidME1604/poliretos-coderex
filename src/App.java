import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        try (Scanner reader = new Scanner(System.in)) {
            System.out.println();
            System.out.println("                ***********");
            System.out.println("              ******** # **");
            System.out.println("              **************");
            System.out.println("                      ######");
            System.out.println("                ############");
            System.out.println("                      *******");
            System.out.println("                      ********                   *");
            System.out.println("                 **************                  **");
            System.out.println("                ***¯¯¯***********              ****");
            System.out.println("                      ****************************");
            System.out.println("                      ***************************");
            System.out.println("                       ****** /###   ###  ******");
            System.out.println("                        ***** #      #  # ****");
            System.out.println("                          *** #      #  # ***");
            System.out.println("                           **  ###   ###/ **");
            System.out.println("                            ***************");
            System.out.println("                             ****      ****");
            System.out.println("                             ****      ****");
            System.out.println("                           *****     *****");
            System.out.println("");
            System.out.println("                          ###   ####  #    #");
            System.out.println("                          #  #  #      #  #");
            System.out.println("                          ###/  ###     ##");
            System.out.println("                          #  #  #      #  #");
            System.out.println("                          #  #  ####  #    #");
            System.out.println();
            System.out.println(
                    "        * Lopez.Elizabeth   * Morales.David  * Pallares.Jose\n               * Paredes.Leon   * Pasquel.Johann\n");
            System.out.print("Ingrese el numero de elementos: ");
            int numeroElementos = reader.nextInt();

            Serie1Fibonacci oSerie1 = new Serie1Fibonacci();
            System.out.print("\nImprimiendo serie Fibonacci con bucle for: ");
            oSerie1.imprimirFibonacciFor(numeroElementos);
            System.out.print("\nImprimiendo serie Fibonacci con bucle do-while: ");
            oSerie1.imprimirFibonacciDoWhile(numeroElementos);
            System.out.print("\nImprimiendo serie Fibonacci con bucle while: ");
            oSerie1.imprimirFibonacciWhile(numeroElementos);
            System.out.println();

            Serie2ImparCero oSerie2 = new Serie2ImparCero();
            System.out.print("\nSerie 1 - 0... for: ");
            oSerie2.ImparesCeroFor(numeroElementos);
            System.out.print("\nSerie 1 - 0... do: ");
            oSerie2.ImparesCeroDo(numeroElementos);
            System.out.print("\nSerie 1 - 0... while: ");
            oSerie2.ImparesCeroWhile(numeroElementos);
            System.out.println();

            Serie3FibonacciImpar oSerie3 = new Serie3FibonacciImpar();
            System.out.print("\nSerie de fracciones con for: ");
            oSerie3.fraccion_For(numeroElementos);
            System.out.print("\nSerie de fracciones con doWhile: ");
            oSerie3.fraccion_DoWhile(numeroElementos);
            System.out.print("\nSerie de fracciones con while: ");
            oSerie3.fraccion_While(numeroElementos);
            System.out.println();

            Serie4FibonacciPar oSerie4 = new Serie4FibonacciPar();
            System.out.print("\nSerie de fibonacci dividido entre pares con for: ");
            oSerie4.SerieFraccionariaFor(numeroElementos);
            System.out.print("\nSerie de fibonacci dividido entre pares con do-while: ");
            oSerie4.SerieFraccionariaDo(numeroElementos);
            System.out.print("\nSerie de fibonacci dividido entre pares con while: ");
            oSerie4.SerieFraccionariaWhile(numeroElementos);
            System.out.println();

            Serie5NumerosImpares oSerie5 = new Serie5NumerosImpares();
            System.out.print("\nSerie primos con for: ");
            oSerie5.NumerosPrimosFor(numeroElementos);
            System.out.print("\nSerie primos con do: ");
            oSerie5.NumerosPrimosDo(numeroElementos);
            System.out.print("\nSerie primos con do: ");
            oSerie5.NumerosPrimosWhile(numeroElementos);
            System.out.println();

            Serie6CuadradosSucesivos oSerie6 = new Serie6CuadradosSucesivos();
            System.out.print("\nSerie de cuadrados con for: ");
            oSerie6.numcuadrado_For(numeroElementos);
            System.out.print("\nSerie de cuadrados con do-while: ");
            oSerie6.numcuadrado_DoWhile(numeroElementos);
            System.out.print("\nSerie de cuadrados con while: ");
            oSerie6.numcuadrado_While(numeroElementos);
            System.out.println();

            Serie7IncrementoTres oSerie7 = new Serie7IncrementoTres();
            System.out.print("\nSerie 1 - 4... for: ");
            oSerie7.IncrementoTresFor(numeroElementos);
            System.out.print("\nSerie 1 - 4... do: ");
            oSerie7.IncrementoTresDo(numeroElementos);
            System.out.print("\nSerie 1 - 4... while: ");
            oSerie7.IncrementoTresWhile(numeroElementos);
            System.out.println();

            Serie8SumaCinco oSerie8 = new Serie8SumaCinco();
            System.out.print("\nSerie primos con for: ");
            oSerie8.SumaCincoFor(numeroElementos);
            System.out.print("\nSerie primos con do: ");
            oSerie8.SumaCincoDo(numeroElementos);
            System.out.print("\nSerie primos con while: ");
            oSerie8.SumaCincoWhile(numeroElementos);
            System.out.println();

            Serie9DobleAnterior oSerie9 = new Serie9DobleAnterior();
            System.out.print("\nUsando bucle for: ");
            oSerie9.imprimirMultiplicacionPorDosFor(numeroElementos);
            System.out.print("\nUsando bucle do-while: ");
            oSerie9.imprimirMultiplicacionPorDosDoWhile(numeroElementos);
            System.out.print("\nUsando bucle while: ");
            oSerie9.imprimirMultiplicacionPorDosWhile(numeroElementos);
            System.out.println();

            Serie10MultiplicacionPorTres oSerie10 = new Serie10MultiplicacionPorTres();
            System.out.print("\nSerie 3 elevado a n potencias con for: ");
            oSerie10.MultiplicacionPor3For(numeroElementos);
            System.out.print("\nSerie 3 elevado a n potencias con do-while: ");
            oSerie10.MultiplicacionPor3Do(numeroElementos);
            System.out.print("\nSerie 3 elevado a n potencias con while: ");
            oSerie10.MultiplicacionPor3While(numeroElementos);
            System.out.println();

            Serie12MultiplosDos oSerie12 = new Serie12MultiplosDos();
            System.out.print("\nSerie 2 - 6... for: ");
            oSerie12.MultiplosDosFor(numeroElementos);
            System.out.print("\nSerie 2 - 6... do: ");
            oSerie12.MultiplosDosDo(numeroElementos);
            System.out.print("\nSerie 2 - 6... while: ");
            oSerie12.MultiplosDosWhile(numeroElementos);
            System.out.println();
        }
    }
}
