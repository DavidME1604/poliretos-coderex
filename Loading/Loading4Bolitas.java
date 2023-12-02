package Loading;

public class Loading4Bolitas {
    public void bolitas() {
        String[] figuras = { "0oo", "o0o", "oo0","o0o"};
        for (int i = 0; i <= 100; i ++) {
                System.out.print("\r" + figuras[i%4]+" "+ i+"%");
                try {
                    Thread.sleep(250);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
    }
}
