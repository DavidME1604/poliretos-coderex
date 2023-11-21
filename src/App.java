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
        System.out.println("        * Lopez.Elizabeth   * Morales.David  * Pallares.Jose\n               * Paredes.Leon   * Pasquel.Johann\n");
        System.out.println("Ingrese el numero de elementos");
        int nPosiciones = reader.nextInt();
        SerieCeroImpar oCeroImpar = new SerieCeroImpar();
        System.out.print("\nSerie 1 - 0... for: ");
        oCeroImpar.ImparesCeroFor(nPosiciones);
        System.out.print("\nSerie 1 - 0... do: ");
        oCeroImpar.ImparesCeroDo(nPosiciones);
        System.out.print("\nSerie 1 - 0... while: ");
        oCeroImpar.ImparesCeroWhile(nPosiciones);
        System.out.println();

        SerieIncrementoTres oIncrementoTres = new SerieIncrementoTres();
        System.out.print("\nSerie 1 - 4... for: ");
        oIncrementoTres.IncrementoTresFor(nPosiciones);
        System.out.print("\nSerie 1 - 4... do: ");
        oIncrementoTres.IncrementoTresDo(nPosiciones);
        System.out.print("\nSerie 1 - 4... while: ");
        oIncrementoTres.IncrementoTresWhile(nPosiciones);
        System.out.println();

        SerieMultiplosDos oMultiplosDos = new SerieMultiplosDos();
        System.out.print("\nSerie 2 - 6... for: ");
        oMultiplosDos.MultiplosDosFor(nPosiciones);
        System.out.print("\nSerie 2 - 6... do: ");
        oMultiplosDos.MultiplosDosDo(nPosiciones);
        System.out.print("\nSerie 2 - 6... while: ");
        oMultiplosDos.MultiplosDosWhile(nPosiciones);
        System.out.println();
    }
}
