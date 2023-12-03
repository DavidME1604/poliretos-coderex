/*
 * L07) Crear una barra es de 20 caracteres, la barra avanza cambiando la punta con movimiento rotacional signos \|/-|
    [====/           ] 20%
 */
/*
    * @author Johann Vladimir Pasquel Montenegro
    * @Github Vladimirjon
    * version 1.0  
    *
    * @since 2023-12-01
    * 
    * @license
    * L07) Crear una barra es de 20 caracteres, la barra avanza cambiando la punta con movimiento rotacional signos \|/-|
    * [====/           ] 20%
    * 
    *La serie se carga con (===) y va cambiando la punta de la flecha    
*/

package Loading;

public class Loading7flecha {
   public void barraflecha(){
      int longitudBarra = 20;
      char[] puntaFlecha = {'\\', '|', '/', '-'};
      int indicePunta = 0;

      String[] figuras = {
         "[" + new String(new char[longitudBarra]).replace('\0', ' ') + "] 0%"
      };

      for (int i = 1; i <= 100; i++) {
         int cantidadRelleno = i * longitudBarra / 100;
         figuras[0] = "[" + new String(new char[cantidadRelleno]).replace('\0', '=') + puntaFlecha[indicePunta] + new String(new char[longitudBarra - cantidadRelleno]).replace('\0', ' ') + "] " + i + "%";

         System.out.print("\r" + figuras[0]);

         indicePunta = (indicePunta + 1) % puntaFlecha.length;

         try {
            Thread.sleep(200);
         } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
         }
      }      
      System.out.println("\r[" + new String(new char[longitudBarra]).replace('\0', '=') + "] 100%");
   }
}
