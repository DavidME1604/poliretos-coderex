package CadenaCaracteres;
import java.util.Scanner;
/**
     * @author Elizabeth Lopez Zelaya
     * @Github Lorent777
     * @version 2.0
     * 
     * @since 2023-12-01
     * 
     * @license
     * 
     *         
     */

public class Cadena7EliminarJ {

    public void  eliminarJota(String palabraJ) {

        String resultado = palabraJ.toUpperCase().replace("J", "");
        System.out.println("La palabra sin la letra 'J' es: " + resultado);

    }
}
