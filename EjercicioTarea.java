public class EjercicioTarea {
    public static void main(String[] args) {
        int [] n = new int[10];
        int i;
        System.out.println("Introduzca 10 numeros y pulse Enter cada vez que introduzca uno");
        for ( i = 0;i < 10 ; i ++ ){
            n[i] = Integer.parseInt(System.console().readLine());
        }
        System.out.println("Los numero al reves son:");
        for( i = 9; i >= 0;i-- ){
            System.out.println(n[i]);
        }
       



    }
}
