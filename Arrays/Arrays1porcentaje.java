package Arrays;
import java.util.Scanner;

/**
 * Clase que permite ingresar un nombre completo, solicitar porcentajes de carga
 * para cada palabra y mostrar una representación del porcentaje de carga
 * para cada palabra.
 * 
 * @author Jonathan Paredes
 * @version 2.43
 * @since 2023-12-03
 */
public class Arrays1porcentaje {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Ingrese su nombre completo: ");
        String nombreCompleto = scanner.nextLine();

        
        String[] palabras = nombreCompleto.split("\\s+");

        
        int[] porcentajesCarga = new int[palabras.length];

        
        for (int i = 0; i < palabras.length; i++) {
            System.out.print("Ingrese el porcentaje de carga para \"" + palabras[i] + "\": ");
            porcentajesCarga[i] = scanner.nextInt();
        }

        
        System.out.println("\n" + nombreCompleto);

        for (int i = 0; i < palabras.length; i++) {
            mostrarPorcentajeCarga(palabras[i], porcentajesCarga[i]);
        }

        scanner.close();
    }

    private static void mostrarPorcentajeCarga(String palabra, int porcentaje) {
        int longitudBarra = porcentaje / 5;
        int espacios = 20 - longitudBarra;

        System.out.print("[");
        for (int i = 0; i < longitudBarra; i++) {
            System.out.print("=");
        }
        for (int i = 0; i < espacios; i++) {
            System.out.print(" ");
        }
        System.out.println("] " + porcentaje + "% " + palabra);
    }
}
