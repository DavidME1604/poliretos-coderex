package CadenaCaracteres;
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
 C02)    Pedir una frase y contador las letras.                          1
            Ejemplo, frase : ballena
                    salida: tiene 4 letras
     */

public class Cadena2ContarVocal {
    public void ContarVocal(String palabraIngresada) {
        int contador = 0;
        char[] vocales = {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};
     
        for (int indice = 0; indice < palabraIngresada.length(); indice++) {
            char letraActual = palabraIngresada.charAt(indice);
            for (char vocal : vocales) {
                if (letraActual == vocal) {
                    contador++;
                    break;
                }
            }
        }
        System.out.println("La palabra \"" + palabraIngresada + "\" contiene " + contador + " vocales");
     }
     
}
