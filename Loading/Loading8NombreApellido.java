package Loading;
/**
     * @author Elizabeth Lopez Zelaya
     * @Github Lorent777
     * @version 2.0
     * @since 2023-12-01
     * @license         
     */

public class Loading8NombreApellido {
    
    public void loading8NombreApellido(String nombreCompleto) {
        int longitudBarra = 20;

        for (int i = 0; i <= nombreCompleto.length(); i++) {
            String nombreCargando = "[";

            for (int j = 0; j < nombreCompleto.length(); j++) {
                nombreCargando += (j < i) ? nombreCompleto.charAt(j) : " ";
            }

            nombreCargando += "]";
            
            int porcentaje = i * 100 / nombreCompleto.length();
            System.out.print("\r" + nombreCargando + " " + porcentaje + "%");

            esperar(200);
        }
    }

    private static void esperar(int milisegundos) {
        try {
            Thread.sleep(milisegundos);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }   
}

