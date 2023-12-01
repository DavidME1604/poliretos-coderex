package CadenaCaracteres;

public class App {
    public static void main(String[] args) {
        Cadena3EliminarVocal oCadena3 = new Cadena3EliminarVocal();
        System.out.println("Elimina vocales de una palabra: ");
        oCadena3.EliminarVocal();
        System.out.println();

        System.out.println("\nJuego de los anagramas:");
        Cadena8Anagramas oCadena8 = new Cadena8Anagramas();
        oCadena8.Anagramas();
        System.out.println();
    }
}
