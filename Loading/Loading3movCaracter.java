package Loading;

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
       
           for (int retroceso = 19; retroceso >= 0; --retroceso) {
               System.out.print("[");
               for (int indice = 0; indice < 20; indice++) {
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
               Thread.sleep(200);
           }
    }
}
