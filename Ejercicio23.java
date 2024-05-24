import java.util.Scanner;
public class Ejercicio23 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese la cantidad que desea convertir de mb a kb");
        int cambio = s.nextInt();
        System.out.println("La valor convertido es de :" + cambio * 1000 + " kb ");
    }
}
