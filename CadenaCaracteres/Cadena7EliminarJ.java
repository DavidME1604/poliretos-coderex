package CadenaCaracteres;

import java.util.Scanner;

public class Cadena7EliminarJ {
    public void  eliminarJota(String palabraJ) {

        // Convertir la palabra a mayúsculas y eliminar la letra 'J'
        String resultado = palabraJ.toUpperCase().replace("J", "");

        // Mostrar el resultado
        System.out.println("La palabra sin la letra 'J' es: " + resultado);

    }
}
