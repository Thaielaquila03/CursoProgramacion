import java.util.Scanner;
public class Ejercicio20 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese la base imponible de la factura");
        double total = s.nextDouble();
        System.out.printf("el total de la factura con iva es de:%.2f\n", total * 1.21 );
    }
}
