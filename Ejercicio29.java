import java.util.Scanner;
public class Ejercicio29 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese sus notas");
        System.out.println("Nota 1");
        int nota1 = s.nextInt();
        System.out.println("Nota 2");
        int nota2 = s.nextInt();
        System.out.println("Nota 3");
        int nota3 = s.nextInt();
        System.out.println("El promedio de sus 3 notas es de :" + (nota1 + nota2 + nota3) / 3);

            
        

    }
}
