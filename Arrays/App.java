package Arrays;
import java.util.Arrays;
import java.util.Scanner;


public class App {
        public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        Arrays1porcentaje oArray1 = new Arrays1porcentaje();
        System.out.print("Ingrese su nombre completo: ");
        String nombreCompleto = reader.nextLine();
        String[] palabras = nombreCompleto.split("\\s+");
        System.out.print("Ingrese porcentaje de carga: ");
        String porcentajeInput = reader.nextLine();
        String[] porcentajesCar = porcentajeInput.split(" ");
        int[] porcentajesCarga = Arrays.stream(porcentajesCar).mapToInt(Integer::parseInt).toArray();
        oArray1.cargaPorcentajeNombre(palabras, porcentajesCarga);
        System.out.println();

        Arrays2Iniciales oArray2 = new Arrays2Iniciales();
        System.out.print("Ingresa el tamaño de la matriz: ");
        int tamaño = reader.nextInt();
        System.out.print("Ingresa el caracter que deseas usar: ");
        char caracter = reader.next().charAt(0);
        oArray2.incialesletras(tamaño,caracter);
        System.out.println();

        Arrays3NombrePlano oArray3 = new Arrays3NombrePlano();
        System.out.print("[ Array 3] - Ingrese su nombre completo: ");
        String name = reader.nextLine();
        oArray3.imprimirNombreEscaleraHaciaLaDerecha(name);

        Arrays4NombreMatriz oArray4 = new Arrays4NombreMatriz();
        System.out.print("Ingrese su nombre: ");
        String nombre=reader.nextLine();
        nombre=reader.nextLine();
        System.out.print("Ingrese su apellido: ");
        String apellido=reader.nextLine();
        System.out.println("Nombre en una matriz en X: ");
        oArray4.nombreMatriz(nombre, apellido);
        System.out.println();

        Arrays5MatrizAleatoria oArrray5 = new Arrays5MatrizAleatoria();
        System.out.print("Ingrese su nombre Completo: ");
        String nombreCompleto=reader.nextLine();
        System.out.println("Matrices Aleatorias");
        oArrray5.MatrizAleatoria(nombreCompleto);
        System.out.println();
        


        reader.close();
        }

}
