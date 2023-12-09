package Figuras;

import java.util.Scanner;

public class AppFiguras {
    public void presentar3(){
        Scanner reader = new Scanner(System.in);

        System.out.print("Ingrese el numero de elementos: ");
        int tamanioFigura = reader.nextInt();

        Figura1CuadradoAsteristico oFigura1 = new Figura1CuadradoAsteristico();
        System.out.println("\n[ Figura 1 ] - Cuadrado con asterísticos(*): ");
        oFigura1.CuadroConAsteriscos(tamanioFigura);

        Figura2AteriscoMas oFigura2 = new Figura2AteriscoMas();
        System.out.println("\nFigura del cuadrado con For (*+): ");
        oFigura2.AteriscoMasCuadradoFor(tamanioFigura);

        Figura3TrianguloIzquierda oFigura3 = new Figura3TrianguloIzquierda();
        System.out.print("\nTriangulos: ");
        oFigura3.TrianguloIzquierda(tamanioFigura);

        Figura4 oFigura4 = new Figura4();
        System.out.print("Niveles/tamaño para la Figura4: ");
        System.out.println("\nFigura4:");
        oFigura4.generarFigura4(tamanioFigura);

        Figura5Piramide oFigura5 = new Figura5Piramide();
        System.out.println("\nFigura piramide invertida con(*):");
        oFigura5.Piramideasterisco(tamanioFigura);
        System.out.println();

        Figura6TrianguloLleno oFigura6 = new Figura6TrianguloLleno();
        System.out.println("\n[Figura 6 ]- Triángulo lleno con asteriscos(*) : ");
        oFigura6.TrianguloLleno(tamanioFigura);

        Figura7EscalerasIzq oFigura7 = new Figura7EscalerasIzq();
        System.out.println("\nEscaleras hacia la izquierda: ");
        oFigura7.EscalerasIzqFor(tamanioFigura);
        System.out.println();

        Figura8EscalerasDer oFigura8 = new Figura8EscalerasDer();
        System.out.println("\nEscaleras hacia la derecha: ");
        oFigura8.EscalerasDer(tamanioFigura);
        
        Figura9PrimamideSegmentos oFigura9 = new Figura9PrimamideSegmentos();
        System.out.println("\nPiramide de segmentos: ");
        oFigura9.imprimirPiramide(tamanioFigura);

        Figura10Escalera oFigura10 = new Figura10Escalera();
        System.out.println("\nEscalera con dos patrones: ");
        oFigura10.Escalera(tamanioFigura);
        System.out.println();

        Figura11EscaleraIncrementa oFigura11 = new Figura11EscaleraIncrementa();
        System.out.println("\n[ Figura 11 ]- Escalera que incrementa con (-): ");
        oFigura11.EscaleraIncrementa(tamanioFigura);
        System.out.println();

        Figura12TrianguloInvertido oFigura12 = new Figura12TrianguloInvertido();
        System.out.println("\nTriangulo con numeros invertido: ");
        oFigura12.TrianguloInvertido(tamanioFigura);
        System.out.println();

        Figura13TrianguloNum oFigura13 = new Figura13TrianguloNum();
        System.out.println("\nTriangulo con numeros: ");
        oFigura13.TrianguloNum(tamanioFigura);
        System.out.println();

        Figura14triangulo figura14triangulo = new Figura14triangulo();
        System.out.print("Ingrese el número de filas para la Figura14triangulo: ");
        System.out.println("\nFigura14triangulo:");
        figura14triangulo.generarFigura14triangulo(tamanioFigura);

        Figura15EscaleraPascal oFigura15 = new Figura15EscaleraPascal();
        System.out.println("\nEscalera de Pascal: ");
        oFigura15.Pascal(tamanioFigura);
        System.out.println();

        Figura16MasMenosX oFigura16 = new Figura16MasMenosX();
        System.out.println("\n[ Figura 16 ] - Mas y menos X: ");
        oFigura16.MasMenosX(tamanioFigura);
        System.out.println();

        Figura17NumerosX oFigura17 = new Figura17NumerosX();
        System.out.println("\nNumeros en X: ");
        oFigura17.NumerosX(tamanioFigura);
        System.out.println();

        Figura18TrianguloNumPascal oFigura18 = new Figura18TrianguloNumPascal();
        System.out.println("\nTriangulo Numero Pascal: ");
        oFigura18.TrianguloNumPascal(tamanioFigura);
        System.out.println();
        
        Figura19EscaleraInvertidaNumeros oFigura19 = new Figura19EscaleraInvertidaNumeros();
        System.out.println("\nEscalera con numeros y simbolos: ");
        oFigura19.imprimirSecuencia(tamanioFigura);
        System.out.println();

        reader.close();

    }
    /*public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Ingrese el numero de elementos: ");
        int tamanioFigura = reader.nextInt();

        Figura1CuadradoAsteristico oFigura1 = new Figura1CuadradoAsteristico();
        System.out.println("\n[ Figura 1 ] - Cuadrado con asterísticos(*): ");
        oFigura1.CuadroConAsteriscos(tamanioFigura);

        Figura2AteriscoMas oFigura2 = new Figura2AteriscoMas();
        System.out.println("\nFigura del cuadrado con For (*+): ");
        oFigura2.AteriscoMasCuadradoFor(tamanioFigura);

        Figura3TrianguloIzquierda oFigura3 = new Figura3TrianguloIzquierda();
        System.out.print("\nTriangulos: ");
        oFigura3.TrianguloIzquierda(tamanioFigura);

        Figura4 oFigura4 = new Figura4();
        System.out.print("Niveles/tamaño para la Figura4: ");
        System.out.println("\nFigura4:");
        oFigura4.generarFigura4(tamanioFigura);

        Figura5Piramide oFigura5 = new Figura5Piramide();
        System.out.println("\nFigura piramide invertida con(*):");
        oFigura5.Piramideasterisco(tamanioFigura);
        System.out.println();

        Figura6TrianguloLleno oFigura6 = new Figura6TrianguloLleno();
        System.out.println("\n[Figura 6 ]- Triángulo lleno con asteriscos(*) : ");
        oFigura6.TrianguloLleno(tamanioFigura);

        Figura7EscalerasIzq oFigura7 = new Figura7EscalerasIzq();
        System.out.println("\nEscaleras hacia la izquierda: ");
        oFigura7.EscalerasIzqFor(tamanioFigura);
        System.out.println();

        Figura8EscalerasDer oFigura8 = new Figura8EscalerasDer();
        System.out.println("\nEscaleras hacia la derecha: ");
        oFigura8.EscalerasDer(tamanioFigura);
        
        Figura9PrimamideSegmentos oFigura9 = new Figura9PrimamideSegmentos();
        System.out.println("\nPiramide de segmentos: ");
        oFigura9.imprimirPiramide(tamanioFigura);

        Figura10Escalera oFigura10 = new Figura10Escalera();
        System.out.println("\nEscalera con dos patrones: ");
        oFigura10.Escalera(tamanioFigura);
        System.out.println();

        Figura11EscaleraIncrementa oFigura11 = new Figura11EscaleraIncrementa();
        System.out.println("\n[ Figura 11 ]- Escalera que incrementa con (-): ");
        oFigura11.EscaleraIncrementa(tamanioFigura);
        System.out.println();

        Figura12TrianguloInvertido oFigura12 = new Figura12TrianguloInvertido();
        System.out.println("\nTriangulo con numeros invertido: ");
        oFigura12.TrianguloInvertido(tamanioFigura);
        System.out.println();

        Figura13TrianguloNum oFigura13 = new Figura13TrianguloNum();
        System.out.println("\nTriangulo con numeros: ");
        oFigura13.TrianguloNum(tamanioFigura);
        System.out.println();

        Figura14triangulo figura14triangulo = new Figura14triangulo();
        System.out.print("Ingrese el número de filas para la Figura14triangulo: ");
        System.out.println("\nFigura14triangulo:");
        figura14triangulo.generarFigura14triangulo(tamanioFigura);

        Figura15EscaleraPascal oFigura15 = new Figura15EscaleraPascal();
        System.out.println("\nEscalera de Pascal: ");
        oFigura15.Pascal(tamanioFigura);
        System.out.println();

        Figura16MasMenosX oFigura16 = new Figura16MasMenosX();
        System.out.println("\n[ Figura 16 ] - Mas y menos X: ");
        oFigura16.MasMenosX(tamanioFigura);
        System.out.println();

        Figura17NumerosX oFigura17 = new Figura17NumerosX();
        System.out.println("\nNumeros en X: ");
        oFigura17.NumerosX(tamanioFigura);
        System.out.println();

        Figura18TrianguloNumPascal oFigura18 = new Figura18TrianguloNumPascal();
        System.out.println("\nTriangulo Numero Pascal: ");
        oFigura18.TrianguloNumPascal(tamanioFigura);
        System.out.println();
        
        Figura19EscaleraInvertidaNumeros oFigura19 = new Figura19EscaleraInvertidaNumeros();
        System.out.println("\nEscalera con numeros y simbolos: ");
        oFigura19.imprimirSecuencia(tamanioFigura);
        System.out.println();

        reader.close();

    }*/
}
