import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double nota = 0 ;
        double mediaEvaluaciones = 0 ;

        for (int i = 0; i < 3; i++) {
            System.out.println("Escribe la nota que le datremos a la Pelicula Matrix");
            nota = teclado.nextDouble();
            mediaEvaluaciones = mediaEvaluaciones + nota ;

        }
        System.out.println("La media de evaluaciones para matrix es: " + mediaEvaluaciones / 3);

    }
}
