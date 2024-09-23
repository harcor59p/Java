public class Main {
    public static void main(String[] args) {
        System.out.println("Bienvenido(a) a Screen Match ");
        System.out.println("Película Matrix");

        int fechaDeLanzamiento = 1999 ;
        boolean incluidoEnElPlan = true ;
        double notaDeLaPelicula = 8.2;

        double media = (8.2 + 6.0 + 9.0) / 3 ;

        System.out.println(media);

        String synopsis = """
                Matrix es una peligula paradoja 
                que se desarrolla en una realidad 
                distopica que se estreno en el año: 
                """ + fechaDeLanzamiento ;

        System.out.println(synopsis);
    }
}