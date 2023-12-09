import java.util.Scanner;

import Arrays.AppArrays;
import CadenaCaracteres.AppCadenaCaracteres;
import Figuras.AppFiguras;
import Loading.AppLoading;
import Recursividad.AppRecursividad;
import SeriesCaracteres.AppSerieCaracteres;
import SeriesNumericas.AppSeriesNumericas;

public class MenudePresentacion {
    public static Scanner reader = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        System.out.println();
        System.out.println("                          G R U P O  3                    ");
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

        System.out.println();

        int opcion=1;
        
        do {
            System.out.println(" - - - - M E N U - - - - ");
            System.out.println("1. Arrays");
            System.out.println("2. CadenaCaracteres");
            System.out.println("3. Figuras");
            System.out.println("4. Loading");
            System.out.println("5. Recursividad");
            System.out.println("6. SeriesCaracteres");
            System.out.println("7. SeriesNumericas");
            System.out.println("8. Salir del programa");
            System.out.print("\nIngrese una opción: ");
            opcion = reader.nextInt();
            switch (opcion) {
                case 1:
                    AppArrays.main(args);
                    System.out.println();
                    break;
                
                case 2:
                    AppCadenaCaracteres.main(args);
                    System.out.println();
                    break;
                case 3:
                    AppFiguras.main(args);
                    System.out.println();
                    break;

                case 4:
                    AppLoading.main(args);
                    System.out.println();
                    break;

                case 5:
                    AppRecursividad.main(args);
                    System.out.println();
                    break;

                case 6:
                    AppSerieCaracteres.main(args);
                    System.out.println();
                    break;

                case 7:
                    AppSeriesNumericas.main(args);
                    System.out.println();
                    break;

                case 8:
                    System.out.println("Saliendo del programa...");
                    System.exit(0); // This will terminate the program
                    break;
                default:
                    System.out.println("Opción no válida, por favor ingrese un número");
                    break;
            }
        } while (opcion != 8);
    }
}
