package Loading;

import java.util.Scanner;

public class AppLoading {
    public static void main(String[] args) throws InterruptedException {
        Scanner reader = new Scanner(System.in);

        Loading1carga oloading1 = new Loading1carga();
        System.out.println("\nIndicador de carga con movimiento rotacional: ");
        oloading1.cargaRotacional();
        System.out.println();

        Loading2caracter oLoading2 = new Loading2caracter();
        System.out.println("\nBarra de carga con caracter: ");
        System.out.print("Ingresa un caracter: ");
        char caracter = reader.next().charAt(0);
        oLoading2.hashtagload(caracter);
        System.out.println();

        Loading3movCaracter oLoading3 = new Loading3movCaracter();
        System.out.println("[Loading 3]- Ingrese un carácter:");
        String character = reader.nextLine();
        oLoading3.movCaracter(character);
        System.out.println();
        System.out.println();

        Loading4Bolitas oLoading4 = new Loading4Bolitas();
        System.out.println("Cargando bolitas (oo0)...");
        oLoading4.bolitas();
        System.out.println("\n");

        Loading5BarraPorciento oLoading5 = new Loading5BarraPorciento();
        System.out.println("Cargando el porcentaje");
        oLoading5.BarraPorciento();
        System.out.println();

        Loading6Barra loading6 = new Loading6Barra();
        System.out.println("\nIndicador de carga con barra desplazante: ");
        loading6.iniciarBarraDeslizante();
        System.out.println();

        Loading7flecha oLoading7 = new Loading7flecha();
        System.out.println("\nBarra de carga con flecha: ");
        oLoading7.barraflecha();
        System.out.println();

        Loading8NombApellido oLoading8 = new Loading8NombApellido();
        System.out.println("Ingresa tu nombre y apellido: ");
        String nombreCompleto = reader.nextLine();
        oLoading8.Loading8Nombre(nombreCompleto);
        System.out.println();

        Loading9Nombre oLoading9 = new Loading9Nombre();
        System.out.println("Cargando con nombre...");
        System.out.print("Ingresa tu nombre y apellido sin espacios: ");
        String nombre = reader.nextLine();
        oLoading9.Nombre(nombre);
        System.out.println("\n");

        Loading10Figura oLoading10 = new Loading10Figura();
        System.out.println("Figura moviendose");
        oLoading10.Figura();
        System.out.println();

        reader.close();
    }
}
