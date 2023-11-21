public class Serie3 {
    /* S3: 0/1  1/3  1/5  2/7  3/9  5/11  8/13  13/15 ... */
    int contador=8;
    public void fraccion_For(int contador){
        int numeradorantes=0;
        int numeradornow=1;
        int denominador = 1;
        for(int i=0;i<contador;i++){
            System.out.print(numeradorantes+"/"+denominador+" ");
                int newnumerador = numeradorantes+numeradornow;
                numeradorantes=numeradornow;
                numeradornow=newnumerador;
            denominador +=2;
        }
    } 

    public void fraccion_DoWhile(int contador) {
        int numeradorAntes = 0;
        int numeradornow = 1;
        int denominador = 1;
        int num = 0;

        do {
            System.out.print(numeradorAntes + "/" + denominador + " ");
            int newnumerador = numeradorAntes + numeradornow;
            numeradorAntes = numeradornow;
            numeradornow = newnumerador;
            denominador += 2;
        } while (++num < contador);
    }

    public void fraccion_While(int contador) {
        int numeradorAntes = 0;
        int numeradornow = 1;
        int denominador = 1;
        int num = 0;

        while (++num <= contador) {
            System.out.print(numeradorAntes + "/" + denominador + " ");
            int newnumerador = numeradorAntes + numeradornow;
            numeradorAntes = numeradornow;
            numeradornow = newnumerador;
            denominador += 2;
        }
    }
    public static void main(String[] args) {
        Serie3 serie = new Serie3();
        int contador = 8;
        System.out.println("\nSerie de fracciones con for: ");
        serie.fraccion_For(contador);
        System.out.println("\nSerie de fracciones con doWhile: ");
        serie.fraccion_DoWhile(contador);
        System.out.println("\nSerie de fracciones con while: ");
        serie.fraccion_While(contador);
    }
}
