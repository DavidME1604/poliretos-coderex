package Figuras;

public class Figura7EscalerasIzq {
    public void EscalerasIzqFor(int tamanioFigura){
        
        for (int i = 0; i <= tamanioFigura; i++) {
            System.out.println((i==0)?"___":"|___");
                for (int j = 0; j < i+1; j++) {
                    System.out.print((j==0)?"   ":"    ");
                }
        }
    }
}
