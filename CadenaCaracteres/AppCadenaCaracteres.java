package CadenaCaracteres;

import java.util.Scanner;

public class AppCadenaCaracteres {
        public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        Cadena1Contarvocales oCadena1 = new Cadena1Contarvocales();
        System.out.print("[ Cad. 1 ]- Ingresa una frase: ");
        String fraseingresada = reader.nextLine();
        oCadena1.contarvocal(fraseingresada);
        System.out.println();

        Cadena2ContarLetras oCadena2 = new Cadena2ContarLetras();
        System.out.print("[ Cad. 2 ]- Ingresa una palabra: ");
        String palabraIngresada = reader.nextLine();
        oCadena2.contarLetras(palabraIngresada);
        System.out.println();

        Cadena3EliminarVocal oCadena3 = new Cadena3EliminarVocal();
        System.out.println("[ Cad. 3 ]- Elimina vocales de una palabra");
        System.out.print("Ingresa una vocal: ");
        String vocal = reader.nextLine();
        System.out.print("Ingrese una palabra: ");
        String palabra = reader.nextLine();
        oCadena3.EliminarVocal(vocal, palabra);
        System.out.println();

        Cadena4EliminarLetra oCadena4 = new Cadena4EliminarLetra();
        System.out.print("[ Cad. 4 ]- Elimina las letras repetidas de la frase: \n");
        oCadena4.EliminarLetra();
        System.out.println();

        Cadena5InvertirFrase oCadena5 = new Cadena5InvertirFrase();
        System.out.print("[ Cad. 5 ]- Ingrese una frase: ");
        String frase = reader.nextLine();
        String resultado = oCadena5.invertirFrase(frase);
        System.out.println("Frase invertida con vocales en mayúsculas: " + resultado);
        System.out.println();

        Cadena6FraseinvertidaCaps oCadean6 = new Cadena6FraseinvertidaCaps();
        System.out.print("[ Cad. 6 ]- Ingresa una frase: ");
        String fraseoriginal = reader.nextLine();
        oCadean6.InversoYmayuscula(fraseoriginal);
        System.out.println();

        Cadena7EliminarJ oCadena7 = new Cadena7EliminarJ();
        System.out.print("[ Cad. 7 ]- Ingresa una palabra y eliminare la \"J\": ");
        String palabraJ = reader.nextLine();
        oCadena7.eliminarJota(palabraJ);
        System.out.println();

        System.out.println("\n[ Cad. 8  ]-Juego de los anagramas");
        Cadena8Anagramas oCadena8 = new Cadena8Anagramas();
        oCadena8.Anagramas();
        System.out.println();

        Cadena9LetrasAlternantes oCadena9 = new Cadena9LetrasAlternantes();
        oCadena9.LetrasAlternantes();
        System.out.println();
        
        }
}
