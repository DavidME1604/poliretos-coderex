package Loading;

import java.util.Scanner;

public class AppLoading {
    public static void main(String[] args) throws InterruptedException {
        Scanner reader = new Scanner(System.in);

        Loading1carga oloading1 = new Loading1carga();
        System.out.println("\n[ Loading. 1 ] - Indicador de carga con movimiento rotacional: ");
        oloading1.cargaRotacional();
        System.out.println();

        Loading2caracter oLoading2 = new Loading2caracter();
        System.out.println("\n[ Loading. 2 ] - Barra de carga con caracter: ");
        System.out.print("Ingresa un caracter: ");
        char caracter = reader.next().charAt(0);
        oLoading2.hashtagload(caracter);
        System.out.println();

        Loading3movCaracter oLoading3 = new Loading3movCaracter();
        System.out.print("[ Loading. 3 ] - Ingrese un carácter:");
        reader.nextLine();
        String simbolo = reader.nextLine();
        oLoading3.movCaracter(simbolo);
        System.out.println("\n");

        Loading4Bolitas oLoading4 = new Loading4Bolitas();
        System.out.println("[ Loading. 4 ] - Cargando bolitas (oo0)...");
        oLoading4.bolitas();
        System.out.println("\n");

        Loading5BarraPorciento oLoading5 = new Loading5BarraPorciento();
        System.out.println("[ Loading. 5 ] - Cargando el porcentaje");
        oLoading5.BarraPorciento();
        System.out.println();

        Loading6Barra loading6 = new Loading6Barra();
        System.out.println("\n[ Loading. 6 ] - Indicador de carga con barra desplazante: ");
        loading6.movimientoBarra();
        System.out.println();

        Loading7flecha oLoading7 = new Loading7flecha();
        System.out.println("\n[ Loading. 7 ] - Barra de carga con flecha: ");
        oLoading7.barraflecha();
        System.out.println();

        Loading8NombreApellido oLoading8 = new Loading8NombreApellido();
        System.out.println("[ Loading. 8 ] - Ingresa tu nombre y apellido: ");
        String nombreCompleto = reader.next();
        oLoading8.loading8NombreApellido(nombreCompleto);
        System.out.println("\n");

        Loading9Nombre oLoading9 = new Loading9Nombre();
        System.out.println("[ Loading. 9 ] - Cargando con nombre...");
        System.out.print("Ingresa tu nombre y apellido sin espacios: ");
        String nombre = reader.next();
        oLoading9.Nombre(nombre);
        System.out.println("\n");

        Loading10Figura oLoading10 = new Loading10Figura();
        System.out.println("[ Loading. 10 ] - Figura moviendose");
        oLoading10.Figura();
        System.out.println();
    }
}
