package Figuras;

/**
     * @author Elizabeth Lopez Zelaya
     * @Github Lorent777
     * @version 2.0
     * @since 2023-12-01 
     * @license
     * 
     *         
     *     F16:                                                                    1
            +				+
                -		-
                    +
                -		-
            +				+                                                    
     */



public class Figura16MasMenosX {

    public void imprimirMasMenosX(int tamanioFigura) {
        int espacios = 0;
        int anchoLinea = (tamanioFigura + 1) * 2;
 
        for (int i = 1; i <= tamanioFigura * 2 + 1; i++) {
            StringBuilder linea = new StringBuilder();
 
            for (int j = 1; j <= anchoLinea; j++) {
                if (i != tamanioFigura + 1) {
                   if (j == 1 + espacios || j == anchoLinea - espacios) {
                       linea.append((tamanioFigura % 2 == 0) ? ((i % 2 == 0) ? "+ " : "- ") :
                               ((i % 2 != 0) ? "+ " : "- "));
                   } else {
                       linea.append(" ");
                   }
                } else {
                   linea.append((j == espacios) ? "  + " : " ");
                }
            }
 
            System.out.println(linea);
 
            if (i <= tamanioFigura) {
                espacios++;
            } else {
                espacios--;
            }
        }
    }
}
