package CadenaCaracteres;

import java.util.Scanner;

public class Cadena3EliminarVocal {
    public void EliminarVocal(){
        Scanner reader = new Scanner(System.in);
        System.out.print("Ingresa una vocal: ");
        String vc = reader.nextLine();
        System.out.print("Ingrese una palabra: ");
        String palabra = reader.nextLine();
        String palabraSinVocal=" ";
        for (int i = 0; i < palabra.length(); i++) {
            if (!palabra.substring(i, i+1).equalsIgnoreCase(vc)) {
                palabraSinVocal+=palabra.substring(i, i+1);
            } 
        }
        System.out.println("Palabra sin la vocal "+vc+" es: " +palabraSinVocal);
    }
}
