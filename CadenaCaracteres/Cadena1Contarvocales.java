/*
    * @author Johann Vladimir Pasquel Montenegro
    * @Github Vladimirjon
    * version 1.0  
    *
    * @since 2023-12-01
    * 
    * @license
    * Pedir una frase y contador las vocales. 
    *        Ejemplo, frase: ballena
    *                salida: tiene 3 vocales    
*/
package CadenaCaracteres;
public class Cadena1Contarvocales {
    /**
     * @param fraseingresada 
     */
    public void contarvocal(String fraseingresada){
        int contador = 0;
        char[] vocales = {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};
        
        

        for (int i = 0; i < fraseingresada.length(); i++) {
            char letractual = fraseingresada.charAt(i);
            for (char vocal : vocales) {
                if (letractual == vocal) {
                    contador++;
                    break;
                }
            }
        }
        System.out.println("La frase: " + fraseingresada + " contiene " + contador + " vocales");
    }
    
}
    

