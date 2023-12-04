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
     */
public class Loading3Caracter {

   public void movCaracter(String character) throws InterruptedException {
       System.out.print("[");
       for (int espacio = 1; espacio < 21; espacio++) {
           System.out.print(" ");
       }
       System.out.print("]\r");

       for (int progreso = 1; progreso < 21; progreso++) {
           System.out.print("[");
           for (int indice = 1; indice < 21; indice++) {
               if (indice == progreso) {
                  System.out.print(character);
               } else {
                  System.out.print(" ");
               }
           }
           System.out.print("] " + (progreso * 5) + "%\r");
           Thread.sleep(100);
       }

       for (int retroceso = 20; retroceso >= 1; --retroceso) {
           System.out.print("[");
           for (int indice = 1; indice < 21; indice++) {
               if (indice == retroceso) {
                  System.out.print(character);
               } else {
                  System.out.print(" ");
               }
           }
           if (retroceso * 5 == 100) {
               System.out.print("] " + (retroceso * 5) + "%\r");
           } else if (retroceso * 5 >= 10 && retroceso * 5 <= 95) {
               System.out.print("] " + (retroceso * 5) + "%\r");
           } else {
               System.out.print("] " + (retroceso * 5) + "%\r");
           }
           Thread.sleep(100);
       }
   }
}

