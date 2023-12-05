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
public class Loading3movCaracter {

 public void movCaracter(String character) throws InterruptedException {
   System.out.print("[");
   for (int espacio = 0; espacio < 20; espacio++) {
       System.out.print(" ");
   }
   System.out.print("]\r");

   for (int progreso = 0; progreso < 20; progreso++) {
       System.out.print("[");
       for (int indice = 0; indice < 20; indice++) {
           if (indice == progreso) {
             System.out.print(character);
           } else {
             System.out.print(" ");
           }
       }
       System.out.print("] " + (progreso * 5) + "%\r");
       Thread.sleep(200);
   }

   System.out.print("[");
   for (int indice = 0; indice < 20; indice++) {
       System.out.print(character);
   }
   System.out.print("] 100%\r");
 }
}

