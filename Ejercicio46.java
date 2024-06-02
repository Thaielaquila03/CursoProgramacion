public class Ejercicio46 {
    public static void main(String[] args) {
        int maximo = 100;
        int minimo = 199;
        int suma = 0;
        int n;

        for(int i = 0; i < 50 ; i++ ){
           n = ((int)(Math.random() * 100) + 100);
           System.out.println(n + " ");
           suma += n;
           if(n < minimo ){
            minimo = n;
           }
           if(n>maximo){
            maximo = n;
           }
        }
        System.out.println("Numero Minimo "+ ""  + minimo +""+ " Numero Maximo" + maximo + "La media es de:" + suma / 50);
    }
}
