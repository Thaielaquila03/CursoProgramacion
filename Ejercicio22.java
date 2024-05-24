import java.util.Scanner;
public class Ejercicio22 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese el radio");
        double radio = s.nextDouble();
        System.out.println("Ingrese altura");
        double altura = s.nextDouble();
        System.out.printf("El volumen del cilindro es de :%.2f\n " , 3.14 * altura * (radio % 2 ));
    }
}
