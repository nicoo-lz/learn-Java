public class Exercises1 {
    public static void main(String[] args) {
        /* 1. Declara una variable de tipo String y asígnale tu nombre. */
        String name = "Nicolas";

        /* 2. Crea una variable de tipo int y asígnale tu edad. */
        int age = 24;

        /* 3. Crea una variable double con tu altura en metros. */
        double height = 1.63;

        /* 4. Declara una variable de tipo boolean que indique si te gusta programar. */
        boolean likesProgramming = true;

        /* 5. Declara una constante con tu email. */

        // usamos la keyword final para indicar que la variable no cambia
        final String EMAIL = "nicohuamani6470@gmail.com";

        /* 6. Crea una variable de tipo char y guárdale tu inicial. */

        // atencion, hay que usar comillas simples para los char
        char myFirstLetter = 'N';

        /* 7. Declara una variable de tipo String con tu localidad,
        y a continuación cambia su valor y vuelve a imprimirla. */
        String miCity = "Colonia";
        miCity = "Buenos Aires";
        System.out.printf("I live in %s\n", miCity);

        /* 8. Crea una variable int llamada a, otra b, e imprime la suma de ambas. */
        int a = 10;
        int b = 5;
        System.out.printf("Suma de a y b es %d\n", a + b);

        /* 9. Imprime el tipo de dos variables creadas anteriormente. */

        // para un objeto podemos usar los metodos getClass() y luego getSimpleName()
        System.out.println("miCity variable type: " + miCity.getClass().getSimpleName());

        // para el caso de una variable de tipo primitivo lo que hago es castear a su
        // wrapper class, en este caso Integer. Luego uso los metodos mencionados arriba
        Integer ageInteger = (Integer) age;
        System.out.println("age variable type: " + ageInteger.getClass().getSimpleName());

        /* 10. Intenta declarar una variable sin inicializarla y luego asígnale
         un valor antes de imprimirla. */
        double piAprox;
        piAprox = 3.14;
        System.out.printf("Aprox value of Pi: %.2f\n", piAprox);
    }
}
