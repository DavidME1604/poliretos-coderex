package CadenaCaracteres;

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
