import java.util.Scanner;
public class Ejercicio28 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int HorasOrdinarias = 12;
        int HorasExtra = 16;
        System.out.println("Ingrese la cantidad de horas trabajadas");
        int HorasUsuario = s.nextInt();
        if ((HorasUsuario > 0) && (HorasUsuario <= 40)) {
            System.out.println("Su salario es de :" + HorasOrdinarias * HorasUsuario);
        }else{
            System.out.println("Su salario es de :" + (HorasOrdinarias + HorasExtra) * HorasUsuario);
        }

    }
}
