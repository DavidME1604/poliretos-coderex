package Loading;

public class Loading3movCaracter {

    public void movCaracter(String cr) {
        System.out.println();
        int espaciosAdelante = 20, espaciosAtras = 0;
        for (int i = 0; i <= 90; i += 10) {

            while (espaciosAtras <= 20) {
                System.out.print(
                        "\r " + "[" + " ".repeat(espaciosAtras) + cr + " ".repeat(espaciosAdelante) + "]" + i + "%");
                espaciosAtras++;
                espaciosAdelante--;
                try {
                    Thread.sleep(25);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
            while (espaciosAtras > 0) {
                espaciosAtras--;
                espaciosAdelante++;
                System.out.print(
                        "\r " + "[" + " ".repeat(espaciosAtras) + cr + " ".repeat(espaciosAdelante) + "]" + i + "%");
                try {
                    Thread.sleep(25);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        }
        System.out.print("\r " + "[" + " ".repeat(espaciosAtras) + cr + " ".repeat(espaciosAdelante) + "]" + 100 + "%");
    }
}
