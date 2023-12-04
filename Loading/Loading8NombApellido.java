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


public class Loading8NombApellido {
        public void Loading8Nombre(String nombreCompleto) {
            System.out.print("[");
            for (int i = 0; i < nombreCompleto.length(); i++) {
                System.out.print(nombreCompleto.charAt(i));
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
