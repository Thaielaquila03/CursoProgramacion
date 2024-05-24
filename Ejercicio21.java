import java.util.Scanner;
public class Ejercicio21 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de horas trabajadas en la semana");
        double horast = s.nextDouble();
        System.out.printf("El total ganado en la semana es de : %.2f\n " , horast * 15);
    }
}