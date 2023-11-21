import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner reader = new Scanner(System.in);
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
        System.out.println("Ingrese el numero de elementos");
        int nPosiciones = reader.nextInt();

        Serie2ImparCero oCeroImpar = new Serie2ImparCero();
        System.out.print("\nSerie 1 - 0... for: ");
        oCeroImpar.ImparesCeroFor(nPosiciones);
        System.out.print("\nSerie 1 - 0... do: ");
        oCeroImpar.ImparesCeroDo(nPosiciones);
        System.out.print("\nSerie 1 - 0... while: ");
        oCeroImpar.ImparesCeroWhile(nPosiciones);
        System.out.println();

        Serie3FibonacciImpar serie3 = new Serie3FibonacciImpar();
        System.out.print("\nSerie de fracciones con for: ");
        serie3.fraccion_For(nPosiciones);
        System.out.print("\nSerie de fracciones con doWhile: ");
        serie3.fraccion_DoWhile(nPosiciones);
        System.out.print("\nSerie de fracciones con while: ");
        serie3.fraccion_While(nPosiciones);
        System.out.println();

        Serie4FibonacciPar serie4 = new Serie4FibonacciPar();
        System.out.print("\nSerie de fibonacci dividido entre pares con for: ");
        serie4.SerieFraccionariaFor(nPosiciones);
        System.out.print("\nSerie de fibonacci dividido entre pares con do-while: ");
        serie4.SerieFraccionariaDo(nPosiciones);
        System.out.print("\nSerie de fibonacci dividido entre pares con while: ");
        serie4.SerieFraccionariaWhile(nPosiciones);
        System.out.println();

        Serie6CuadradosSucesivos serie6 = new Serie6CuadradosSucesivos();
        System.out.print("\nSerie de cuadrados con for: ");
        serie6.numcuadrado_For(nPosiciones);
        System.out.print("\nSerie de cuadrados con do-while: ");
        serie6.numcuadrado_DoWhile(nPosiciones);
        System.out.print("\nSerie de cuadrados con while: ");
        serie6.numcuadrado_While(nPosiciones);
        System.out.println();

        Serie7IncrementoTres oIncrementoTres = new Serie7IncrementoTres();
        System.out.print("\nSerie 1 - 4... for: ");
        oIncrementoTres.IncrementoTresFor(nPosiciones);
        System.out.print("\nSerie 1 - 4... do: ");
        oIncrementoTres.IncrementoTresDo(nPosiciones);
        System.out.print("\nSerie 1 - 4... while: ");
        oIncrementoTres.IncrementoTresWhile(nPosiciones);
        System.out.println();
        
        Serie10MultiplicacionPorTres serie10 = new Serie10MultiplicacionPorTres();
        System.out.print("\nSerie 3 elevado a n potencias con for: ");
        serie10.MultiplicacionPor3For(nPosiciones);
        System.out.print("\nSerie 3 elevado a n potencias con do-while: ");
        serie10.MultiplicacionPor3Do(nPosiciones);
        System.out.print("\nSerie 3 elevado a n potencias con while: ");
        serie10.MultiplicacionPor3While(nPosiciones);
        System.out.println();

        Serie12MultiplosDos oMultiplosDos = new Serie12MultiplosDos();
        System.out.print("\nSerie 2 - 6... for: ");
        oMultiplosDos.MultiplosDosFor(nPosiciones);
        System.out.print("\nSerie 2 - 6... do: ");
        oMultiplosDos.MultiplosDosDo(nPosiciones);
        System.out.print("\nSerie 2 - 6... while: ");
        oMultiplosDos.MultiplosDosWhile(nPosiciones);
        System.out.println();
    }
}
