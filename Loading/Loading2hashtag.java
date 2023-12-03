/*
 * Pedir un caracter para la simular la carga y la logitud de la barra es de 20 caracteres 
    [###         ] 20%
 */

package Loading;

public class Loading2hashtag {
   public void hashtagload() {
      int longitudBarra = 20;
        char caracter = '#';

        String[] figuras = {
                "[" + new String(new char[longitudBarra]).replace('\0', ' ') + "] 0%",
                "[" + new String(new char[1]).replace('\0', caracter) + new String(new char[longitudBarra - 1]).replace('\0', ' ') + "] 0%"
        };

        for (int i = 1; i <= 100; i++) {
            figuras[0] = "[" + new String(new char[i * longitudBarra / 100]).replace('\0', caracter) + new String(new char[longitudBarra - i * longitudBarra / 100]).replace('\0', ' ') + "] " + i + "%";

            System.out.print("\r" + figuras[0]);

            try {
                Thread.sleep(200);  
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }

        System.out.println("\r[" + new String(new char[longitudBarra]).replace('\0', caracter) + "] 100%");
   }
}
