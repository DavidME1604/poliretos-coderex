package Figuras;

public class Figura17NumerosX {
    public void NumerosX(int tamanioFigura) {
        int espacios = 0;
        for (int i = 1; i <= tamanioFigura + 1; i++) {
            for (int j = 1; j <= ((tamanioFigura + 1) * 2); j++) {
                System.out.print((j == 1 + espacios || j == ((tamanioFigura + 1) * 2) - espacios)
                        ? (tamanioFigura + 1 - i) + "     "
                        : "      ");
            }
            espacios++;
            System.out.println();
        }
        for (int i = 1; i <= espacios; i++) {
            System.out.print((i == espacios) ? "   " + 1 : "      ");
        }
        System.out.println();
        espacios--;
        for (int i = 1; i <= tamanioFigura + 1; i++) {
            for (int j = 1; j <= ((tamanioFigura + 1) * 2); j++) {
                System.out.print((j == 1 + espacios || j == ((tamanioFigura + 1) * 2) - espacios) ? (i - 1) + "     "
                        : "      ");
            }
            espacios--;
            System.out.println();
        }
    }
}
