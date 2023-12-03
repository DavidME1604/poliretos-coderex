package Loading;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);


        Loading4Bolitas oLoading4 = new Loading4Bolitas();
        System.out.println("Cargando bolitas (oo0)...");
        oLoading4.bolitas();
        System.out.println();

        Loading5BarraPorciento oLoading5 = new Loading5BarraPorciento();
        System.out.println("Cargando el porcentaje");
        oLoading5.BarraPorciento();
        System.out.println();


        Loading9Nombre oLoading9 = new Loading9Nombre();
        System.out.println("Cargando con nombre...");
        System.out.print("Ingresa tu nombre y apellido sin espacios");
        String nombre = reader.nextLine();
        oLoading9.Nombre(nombre);
        System.out.println();

        Loading10Figura oLoading10 = new Loading10Figura();
        System.out.println("Figura moviendose");
        oLoading10.Figura();
        System.out.println();

        reader.close();
    }
}
