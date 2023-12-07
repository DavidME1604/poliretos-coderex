package Arrays;
import java.util.Scanner;
/**
 * Clase que permite ingresar un nombre completo, solicitar porcentajes de carga
 * para cada palabra 
 * @author Jonathan Paredes
 * @version 2.43
 * @since 2023-12-03
 */
public class Arrays1CargaPorcentajePalabra {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.println("Ingrese su nombre: ");
        String nombre = scanner.nextLine();

       
        String[] palabras = nombre.split(" ");

        
        System.out.println("Ingrese el porcentaje de carga : ");
        String[] porcentajesStr = scanner.nextLine().split(" ");
        int[] porcentajes = new int[palabras.length];

        
        for (int i = 0; i < porcentajesStr.length; i++) {
            porcentajes[i] = Integer.parseInt(porcentajesStr[i]);
        }

        for (int i = 0; i < palabras.length; i++) {
            mostrarBarra(palabras[i], porcentajes[i]);
        }

        scanner.close();
    }

    private static void mostrarBarra(String palabra, int porcentaje) {
        int largoBarra = porcentaje / 5;
        int espacios = 20 - largoBarra;

        System.out.println("[" + "=".repeat(largoBarra) + ">" + " ".repeat(espacios) + "]" + porcentaje + "% " + palabra);
    }
}
