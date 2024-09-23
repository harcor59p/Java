import java.util.Scanner;

public class Evaluaciones {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double nota = 0 ;
        double mediaEvaluaciones = 0;
        double numeroNotas = 0 ;

        while (nota != -1) {
            System.out.println("Que nota le da a la pelicula Matrix");
            nota = teclado.nextDouble();

            if (nota != -1) {
                mediaEvaluaciones += nota;
                numeroNotas++ ;
            }

        }
        System.out.println("La nota final promedio de la pelicula matrix es: " + mediaEvaluaciones /numeroNotas);
    }
}
