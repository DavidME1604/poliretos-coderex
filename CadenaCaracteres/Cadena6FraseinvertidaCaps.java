/*
    * @author Johann Vladimir Pasquel Montenegro
    * @Github Vladimirjon
    * version 1.0  
    *
    * @since 2023-12-01
    * 
    * @license
    *
    * Pedir una frase y presentarla inverida con las letras en mayusculas.                    5
    *       Ejemplo, frase: ballena
    *                salida: aNeLLaB    
*/
package CadenaCaracteres;
public class Cadena6FraseinvertidaCaps {
    /**
     * Se modificara la frase que sea ingresada
     * @param fraseoriginal
     */
    public void InversoYmayuscula(String fraseoriginal){
        char[] vocales = {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};

        
        StringBuilder fraseCaps = new StringBuilder();

        for (int i = 0; i < fraseoriginal.length(); i++) {
            char letractual = fraseoriginal.charAt(i);
            for (char vocal : vocales) {
                if (letractual == vocal) {
                    letractual = Character.toUpperCase(letractual);
                }
            }
            fraseCaps.append(letractual);
        }
        fraseCaps.reverse();
        String fraseinversaCaps = fraseCaps.toString();
        
        System.out.println("La nueva frase es: "+fraseinversaCaps.toString());
    }
    
}
