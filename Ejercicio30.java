import java.util.Scanner;

public class Ejercicio30 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int promedioNota;
        System.out.println("Ingrese sus notas");
        System.out.println("Nota 1");
        int nota1 = s.nextInt();
        System.out.println("Nota 2");
        int nota2 = s.nextInt();
        System.out.println("Nota 3");
        int nota3 = s.nextInt();
        promedioNota = (nota1 + nota2 + nota3) / 3;
        System.out.println("El promedio de sus 3 notas es de :" + promedioNota);
        if ((promedioNota > 0) && (promedioNota < 3)); {
            System.out.println("Insuficiente");   
        }
        if ((promedioNota >= 4) || (promedioNota <= 6)); {
            System.out.println("Suficiente");
        }
        if ((promedioNota >= 7) || (promedioNota <= 9)); {
            System.out.println("Bien");
        }
        if (promedioNota == 10) {
            System.out.println("Notable");     
        }              
        
          
    }
}
