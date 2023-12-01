package CadenaCaracteres;

import java.util.Scanner;

public class Cadena8Anagramas {
    public void Anagramas() {
        Scanner reader = new Scanner(System.in);
        String[] conjunto = { "delira", "lidera", "ballena", "llenaba", "alondra", "ladrona", "España", "apañes",
                "Enrique", "quieren" };
        int indicePalabra = (int) (Math.random() * 10);
        String anagrama, anagramaCorrecto;
        System.out
                .println("Juguemos a los anagramas, tendras 3 intentos. Esta es tu palabra " + conjunto[indicePalabra]);
        if (indicePalabra % 2 == 0) {
            anagramaCorrecto = conjunto[indicePalabra + 1];
        } else {
            anagramaCorrecto = conjunto[indicePalabra - 1];
        }
        for (int i = 0; i < 3; i++) {
            System.out.print("Ingresa tu anagrama: ");
            anagrama = reader.nextLine();
            if (anagramaCorrecto.equalsIgnoreCase(anagrama)) {
                System.out.println("Bien hecho, tu anagrama es correcto");
                break;
            } else {
                System.out.println("Lo siento, no esta bien");
            }
            System.out.println((i==2&&!anagramaCorrecto.equalsIgnoreCase(anagrama))?"Se te acabaron las opportunidades, el anagrama era: "+anagramaCorrecto:" ");
        }
        
    }
}
