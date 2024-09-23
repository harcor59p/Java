import java.util.Random;
import java.util.Scanner;

public class Adivinar {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in) ;
        int numeroAleatorio = new Random().nextInt(100);
        int numeroIngresado = 0 ;
        int numeroIntentos = 1 ;

        System.out.println(numeroAleatorio);
        for (int i = 1; i <= 5; i++) {
            System.out.println("Ingresa un numero de 1 a 100 intento " + numeroIntentos + " de 5" );
            numeroIngresado = teclado.nextInt();
            numeroIntentos++;
            if (numeroAleatorio == numeroIngresado) {
                System.out.println("Lo Lograste");
                break;
            }

        }
    }
}
