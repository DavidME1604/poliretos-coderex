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
        char[] letras = {'b','c','d','f','g','h','j','k','l','m','n','ñ','p','q','r','s','t','v','w','x','y','z'};

        
        StringBuilder fraseCaps = new StringBuilder();

        for (int i = 0; i < fraseoriginal.length(); i++) {
            char letractual = fraseoriginal.charAt(i);
            for (char letra : letras) {
                if (letractual == letra) {
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
