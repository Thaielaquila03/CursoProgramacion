public class Ejercicio32 {
    public static void main(String[] args) {
        System.out.print("Por favor, introduzca un número: ");
        int n = Integer.parseInt(System.console().readLine());

        if ((n % 2) == 0) {
        System.out.print("El número introducido es par");
       } else {
       System.out.print("El número introducido es impar");
       }

       if ((n % 5) == 0) {
      System.out.println(" y divisible por 5.");
      } else {
      System.out.println(" y no es divisible por 5.");
      }
    }
}
