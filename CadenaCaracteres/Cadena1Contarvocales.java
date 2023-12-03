/*
 * Pedir una frase y contador las vocales. 
            Ejemplo, frase: ballena
                    salida: tiene 3 vocales
 */
package CadenaCaracteres;

import java.util.Scanner;

public class Cadena1Contarvocales {
    public void contarvocal(){
        int contador = 0;
        char[] vocales = {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};
        
        Scanner frase1 = new Scanner(System.in);
        System.out.println("Ingresa una frase: ");
        String fraseingresada = frase1.nextLine();

        for (int i = 0; i < fraseingresada.length(); i++) {
            char letractual = fraseingresada.charAt(i);
            for (char vocal : vocales) {
                if (letractual == vocal) {
                    contador++;
                    break;
                }
            }
        }
        System.out.println("La frase: " + fraseingresada + " contiene " + contador + " vocales");
    }
    
}
    

