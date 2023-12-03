package CadenaCaracteres;

import java.util.Scanner;

public class Cadena4EliminarLetra {
    /*
     * @author José David Pallares Santamaría
     * @Github JosDavP
     * @version 2.0
     * 
     * since 2023-12-3
     * 
     * @license
     * 
     * Pedir una frase y una letra, eliminar la letra ingresada de la frase.
     *       Ejemplo, frase: ballena azul
     *               letra : l
     *               salida: ba  ena azu
     */
    /*
     * @param nombre
     * @param apellido
     */
    public static void EliminarLetra() {
        Scanner reader = new Scanner(System.in);
        System.out.println("Ingresa una frase:");
        String frase = reader.nextLine();
        System.out.println("Ingresa una letra a eliminar:");
        char letraEliminar = reader.next().charAt(0);
        String fraseSinLetra = frase.replace(String.valueOf(letraEliminar), "");
        System.out.println("Frase resultante: " + fraseSinLetra);
    }
}

