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
     * Pide una palabra y una vocal y elimina la vocal de la palabra
     */

public class Cadena3EliminarVocal {

    /**
     * 
     * @param vocal
     * @param palabra
     */
    public void EliminarVocal(String vocal, String palabra){
        
        String palabraSinVocal=" ";
        for (int i = 0; i < palabra.length(); i++) {
            if (!palabra.substring(i, i+1).equalsIgnoreCase(vocal)) {
                palabraSinVocal+=palabra.substring(i, i+1);
            } 
        }
        System.out.println("Palabra sin la vocal "+vocal+" es: " +palabraSinVocal);
    }
}
