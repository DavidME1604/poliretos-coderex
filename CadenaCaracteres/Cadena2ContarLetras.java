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

public class Cadena2ContarLetras {
    public void contarLetras(String fraseIngresada) {
        int contador = 0;
        char[] vocales = {'a', 'e', 'i', 'o', 'u'};
    
        for (int i = 0; i < fraseIngresada.length(); i++) {
            char letraActual = fraseIngresada.charAt(i);
            boolean esVocal = false;
    
            // Verificar si la letra actual es una vocal
            for (char vocal : vocales) {
                if (letraActual == vocal) {
                    esVocal = true;
                    break;
                }
            }
    
            if (!esVocal) {
                contador++;
            }
        }
    
        System.out.println("La frase: " + fraseIngresada + " contiene " + contador + " letras.");
    }       
}



