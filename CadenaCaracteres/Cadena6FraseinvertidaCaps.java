/*
 * Pedir una frase y presentarla inverida con las letras en mayusculas.                    5
            Ejemplo, frase: ballena
                    salida: aNeLLaB
 */
package CadenaCaracteres;

import java.util.Scanner;

public class Cadena6FraseinvertidaCaps {
    public void InversoYmayuscula(){
        char[] vocales = {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa una frase: ");
        String fraseIngresada = scanner.nextLine();
        StringBuilder fraseCaps = new StringBuilder();

        for (int i = 0; i < fraseIngresada.length(); i++) {
            char letractual = fraseIngresada.charAt(i);
            for (char vocal : vocales) {
                if (letractual == vocal) {
                    letractual = Character.toUpperCase(letractual);
                }
            }
            fraseCaps.append(letractual);
        }
        fraseCaps.reverse();
        String fraseinversaCaps = fraseCaps.toString();
        
        System.out.println("La nueva frase es: "+fraseinversaCaps.toString());
    }
    
}
