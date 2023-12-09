package CadenaCaracteres;

/**
 * @author David Esteban Morales Estrella
 * @Github DavidME1604
 * @version 2.0
 * 
 * @since 2023-11-21
 * 
 * @license
 * 
 *          Pide una palabra y una vocal y elimina la vocal de la palabra
 */

public class Cadena3EliminarVocal {

    /**
     * 
     * @param vocal
     * @param palabra
     */
    public void EliminarVocal(String vocal, String palabra) {
        System.out.println("Palabra sin la vocal " + vocal + " es: " + palabra.replaceAll(vocal, " "));
    }
}
