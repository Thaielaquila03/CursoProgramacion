public class Ejercicio45 {
    public static void main(String[] args) {
        System.out.println("Este programa le mostrara 20 numeros aleatorios entre 0 y 10");
        for(int i = 0; i < 20 ; i ++){
            System.out.print((int)(Math.random() * 11) + " " );
        }
        System.out.println();

    }
}
