package Loading;
/**
     * @author Elizabeth Lopez Zelaya
     * @Github Lorent777
     * @version 2.0
     * 
     * @since 2023-12-01
     * 
     * @license
     * 
     *         
     */

public class Loading8NombreApellido {

    public void loading8Nombre(String nombreCompleto) {
        char[] nombreArray = nombreCompleto.toCharArray();
        System.out.print("[");
        
        for (char c : nombreArray) {
            System.out.print(c);
            esperar(200);
        }
        
        System.out.println("] 100%");
    }

    private static void esperar(int milisegundos) {
        try {
            Thread.sleep(milisegundos);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

