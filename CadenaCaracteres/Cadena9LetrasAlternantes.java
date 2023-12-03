package CadenaCaracteres;

import java.util.Scanner;

public class Cadena9LetrasAlternantes {
    /*
     * @author José David Pallares Santamaría
     * @Github JosDavP
     * @version 2.0
     * 
     * since 2023-12-3
     * 
     * @license
     * 
     * Ingresa una frase y convertir una leta a mayusculas y otra a minisculas              3
     * Ejemplo, frase : di mi nombre
     * salida : Di Mi NoMbRe
     */
    /*
     * @param nombre
     * @param apellido
     */
    public void LetrasAlternantes(){
        Scanner reader = new Scanner(System.in);
        System.out.println("Ingresa una frase: ");
        String frase = reader.nextLine();

        String cambio = LetrasAlternantes(frase);
        System.out.println("Frase resultante: "+ cambio);

    }
private static String LetrasAlternantes(String frase) {
        StringBuilder resultado = new StringBuilder();

        boolean mayuscula = true;

        for (char letra : frase.toCharArray()) {
            if (Character.isLetter(letra)) {
                if (mayuscula) {
                    resultado.append(Character.toUpperCase(letra));
                } else {
                    resultado.append(Character.toLowerCase(letra));
                }

                mayuscula = !mayuscula;
            } else {
                resultado.append(letra);
            }
        }
        return resultado.toString();
    }
}