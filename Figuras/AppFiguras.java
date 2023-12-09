package Figuras;

import java.util.Scanner;

public class AppFiguras {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Ingrese el numero de elementos: ");
        int tamanioFigura = reader.nextInt();

        Figura1CuadradoAsteristico oFigura1 = new Figura1CuadradoAsteristico();
        System.out.println("\n[ Figura 1 ] - Cuadrado con asterísticos(*): ");
        oFigura1.CuadroConAsteriscos(tamanioFigura);
        System.out.println();

        Figura2AteriscoMas oFigura2 = new Figura2AteriscoMas();
        System.out.println("\n[ Figura 2 ] - Figura del cuadrado con For (*+): ");
        oFigura2.AteriscoMasCuadradoFor(tamanioFigura);

        Figura3TrianguloIzquierda oFigura3 = new Figura3TrianguloIzquierda();
        System.out.print("\n[ Figura 3 ] - Triangulos: ");
        oFigura3.TrianguloIzquierda(tamanioFigura);

        Figura4 oFigura4 = new Figura4();
        System.out.println("\n[ Figura 4 ] - Triangulo a la derecha:");
        oFigura4.generarFigura4(tamanioFigura);

        Figura5Piramide oFigura5 = new Figura5Piramide();
        System.out.println("\n[ Figura 5 ] - Figura piramide invertida con(*):");
        oFigura5.Piramideasterisco(tamanioFigura);
        System.out.println();

        Figura6TrianguloLleno oFigura6 = new Figura6TrianguloLleno();
        System.out.println("\n[Figura 6 ]- Triángulo lleno con asteriscos(*) : ");
        oFigura6.TrianguloLleno(tamanioFigura);

        Figura7EscalerasIzq oFigura7 = new Figura7EscalerasIzq();
        System.out.println("\n[ Figura 7 ] - Escaleras hacia la izquierda: ");
        oFigura7.EscalerasIzqFor(tamanioFigura);
        System.out.println();

        Figura8EscalerasDer oFigura8 = new Figura8EscalerasDer();
        System.out.println("\n[ Figura 8 ] - Escaleras hacia la derecha: ");
        oFigura8.EscalerasDer(tamanioFigura);
        
        Figura9PrimamideSegmentos oFigura9 = new Figura9PrimamideSegmentos();
        System.out.println("\n[ Figura 9 ] - Piramide de segmentos: ");
        oFigura9.imprimirPiramide(tamanioFigura);

        Figura10Escalera oFigura10 = new Figura10Escalera();
        System.out.println("\n[ Figura 10 ] - Escalera con dos patrones: ");
        oFigura10.Escalera(tamanioFigura);
        System.out.println();

        Figura11EscaleraIncrementa oFigura11 = new Figura11EscaleraIncrementa();
        System.out.println("\n[ Figura 11 ]- Escalera que incrementa con (-): ");
        oFigura11.EscaleraIncrementa(tamanioFigura);
        System.out.println();

        Figura12TrianguloInvertido oFigura12 = new Figura12TrianguloInvertido();
        System.out.println("\n[ Figura 12 ] - Triangulo con numeros invertido: ");
        oFigura12.TrianguloInvertido(tamanioFigura);
        System.out.println();

        Figura13TrianguloNum oFigura13 = new Figura13TrianguloNum();
        System.out.println("\n[ Figura 13 ] - Triangulo con numeros: ");
        oFigura13.TrianguloNum(tamanioFigura);
        System.out.println();

        Figura14triangulo figura14triangulo = new Figura14triangulo();
        System.out.println("\n[ Figura 14 ] - Triangulo:");
        figura14triangulo.generarFigura14triangulo(tamanioFigura);

        Figura15EscaleraPascal oFigura15 = new Figura15EscaleraPascal();
        System.out.println("\n[ Figura 15 ] - Escalera de Pascal: ");
        oFigura15.Pascal(tamanioFigura);
        System.out.println();

        Figura16MasMenosX oFigura16 = new Figura16MasMenosX();
        System.out.println("\n[ Figura 16 ] - Mas y menos X: ");
        oFigura16.MasMenosX(tamanioFigura);
        System.out.println();

        Figura17NumerosX oFigura17 = new Figura17NumerosX();
        System.out.println("\n[ Figura 17 ] - Numeros en X: ");
        oFigura17.NumerosX(tamanioFigura);
        System.out.println();

        Figura18TrianguloNumPascal oFigura18 = new Figura18TrianguloNumPascal();
        System.out.println("\n[ Figura 18 ] - Triangulo Numero Pascal: ");
        oFigura18.TrianguloNumPascal(tamanioFigura);
        System.out.println();
        
        Figura19EscaleraInvertidaNumeros oFigura19 = new Figura19EscaleraInvertidaNumeros();
        System.out.println("\n[ Figura 19 ] - Escalera con numeros y simbolos: ");
        oFigura19.imprimirSecuencia(tamanioFigura);
        System.out.println();

    }
}
