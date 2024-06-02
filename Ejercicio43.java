public class Ejercicio43 {
    public static void main(String[] args) {
        System.out.println("Este programa les mostrara una carta al azar");
        String palo = "";
        String carta = "";
        int numeroDePalo =(int)((Math.random() * 4 ) + 1);
        switch (numeroDePalo) {
            case 1:
                palo = "Pica";
                break;
            case 2:
                palo = "Corazones";
                break;
            case 3:
                palo = "Trebol";
                break;
            case 4:
                palo = "Diamantes";
                break;
        }
        int numeroCarta = (int)(Math.random()*13) + 1;
    
        switch(numeroCarta) {
          case 1:
            carta = "As";
            break;
          case 11:
            carta = "J";
            break;
          case 12:
            carta = "Q";
            break;
          case 13:
            carta = "K";
            break;
          default:
            carta = String.valueOf(numeroCarta);
        }
        
        System.out.println(carta + " de " + palo);
    }
}


