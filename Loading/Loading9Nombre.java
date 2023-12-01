package Loading;

import java.util.Scanner;

public class Loading9Nombre {
    public void Nombre() {
        Scanner reader = new Scanner(System.in);

        System.out.println("Ingresa tu nombre y apellido sin espacios");
        String nombre = reader.nextLine();
        String[] partes = new String[nombre.length()];
        for (int i = 0; i < nombre.length(); i++) {
            partes[i] = "";
        }
        for (int i = 0; i < nombre.length(); i++) {
            for (int j = 0; j < nombre.length(); j++) {
                if (i == j) {
                    partes[j] = partes[j] + nombre.charAt(i);
                } else {
                    partes[j] = partes[j] + " ";
                }
            }
        }
        int patron = (int) 100 / nombre.length();

        int acumulador = patron;
        for (int i = 0; i <= 100; i++) {
            System.out.print("\r[" + partes[(acumulador / patron) - 1] + "] " + i + "%");
            if (i == acumulador && (acumulador / patron) < partes.length) {
                acumulador = acumulador + patron;
            }
            try {
                Thread.sleep(250);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}
