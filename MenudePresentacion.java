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
    public static void main(String[] args) throws InterruptedException, Exception{
        int opcion;
        do{
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
            System.out.println("                ***---***********              ****");
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
            
            System.out.println();
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
                    AppArrays oApp1 = new AppArrays();
                    oApp1.presentar1();
                    System.out.println();
                    break;

                case 2:
                    AppCadenaCaracteres oApp2 = new AppCadenaCaracteres();
                    oApp2.presentar2();
                    System.out.println();
                    break;

                case 3:
                    AppFiguras oApp3 = new AppFiguras();
                    oApp3.presentar3();
                    break;

                case 4:
                    AppLoading oApp4 = new AppLoading();
                    oApp4.presentar4();
                    System.out.println();
                    break;

                case 5:
                    AppRecursividad oApp5 = new AppRecursividad();
                    oApp5.presentar5();
                    System.out.println();
                    break;

                case 6:
                    AppSerieCaracteres oApp6 = new AppSerieCaracteres();
                    oApp6.presentar6();
                    System.out.println();
                    break;

                case 7:
                    AppSeriesNumericas oApp7 = new AppSeriesNumericas();
                    oApp7.presentar7();                    
                    System.out.println();
                    break;

                case 8:
                    System.out.println("- - Saliendo del programa - - ");
                    System.exit(0); 
                    break;

            
                default:
                    System.out.println("Opción no válida, por favor ingrese un número");
                    break;

            }

        }while(opcion>0 && opcion<=8);
        
        reader.close();
        
    }
}