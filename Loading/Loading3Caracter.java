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

   public void movCaracter() throws InterruptedException {
       System.out.println("Loading 4: ");
       for (int porcentaje = 0; porcentaje <= 100; porcentaje++) {
           int nSpacios = 2 - (porcentaje % 3);
           String bStatus = "";
           for (int espacio = 0; espacio < nSpacios; espacio++) {
               bStatus += "o";
           }
           bStatus += "0";
           for (int espacio = 0; espacio < 2 - nSpacios; espacio++) {
               bStatus += "o";
           }
           System.out.print(bStatus + " " + porcentaje + "%\r");
           Thread.sleep(200);
       }
   }
}

