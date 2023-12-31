package CadenaCaracteres;

/**
 * Clase que invierte una frase y coloca las vocales en mayúsculas.
 * 
 * @author Jonathan Paredes
 * @version 2.43
 * @since 2023-12-03
 */
public class Cadena5InvertirFrase {

    /**
     * Invierte una frase y coloca las vocales en mayúsculas.
     * 
     * @param frase La frase a invertir.
     * @return La frase invertida con vocales en mayúsculas.
     */
    public String invertirFrase(String frase) {
        StringBuilder resultado = new StringBuilder();

        
        for (int i = frase.length() - 1; i >= 0; i--) {
            char caracter = frase.charAt(i);

            
            if (esVocal(caracter)) {
                resultado.append(Character.toUpperCase(caracter));
            } else {
                resultado.append(caracter);
            }
        }

        return resultado.toString();
    }

    /**
     * Verifica si un caracter es una vocal (mayúscula o minúscula).
     * 
     * @param c El caracter a verificar.
     * @return true si es una vocal, false de lo contrario.
     */
    private boolean esVocal(char c) {
        char caracterEnMinuscula = Character.toLowerCase(c);
        return caracterEnMinuscula == 'a' || caracterEnMinuscula == 'e' || caracterEnMinuscula == 'i'
                || caracterEnMinuscula == 'o' || caracterEnMinuscula == 'u';
    }

}
