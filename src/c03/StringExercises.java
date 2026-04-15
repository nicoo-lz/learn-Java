package c03;

public class StringExercises {
    public static void main(String[] args) {
        /* 1. Concatena dos cadenas de texto. */
        String word1 = "Hello";
        String word2 = "World";
        System.out.println(word1.concat(word2));

        /* 2. Muestra la longitud de una cadena de texto. */
        System.out.println(word1.length());

        /* 3. Muestra el primer y último carácter de un string. */
        System.out.println(word1.charAt(0));

        // la ultima posicion siempre es |s| - 1
        System.out.println(word1.charAt(word1.length()-1));

        /* 4. Convierte a mayúsculas y minúsculas un string. */
        System.out.println(word1.toUpperCase());
        System.out.println(word1.toLowerCase());

        /* 5. Comprueba si una cadena de texto contiene una palabra concreta. */
        System.out.println(word1.contains(word2));

        /* 6. Formatea un string con un entero. */
        int year = 2026;

        // uso el format specifier %d para integers
        System.out.printf("Estamos en el anio %d\n", year);

        /* 7. Elimina los espacios en blanco al principio y final de un string. */
        String test1 = "   hola  ";
        System.out.println(test1.trim());

        /* 8. Sustituye todos los espacios en blanco de un string por un guión (-). */
        String test2 = "hola me llamo Nicolas";
        System.out.println(test2.replace(' ', '-'));

        /* 9. Comprueba si dos strings son iguales. */

        // es crucial el uso de equals al comparar objetos, ya que == se reserva
        // para tipos primitivos
        System.out.println(word1.equals(word2));

        /* 10. Comprueba si dos strings tienen la misma longitud. */
        System.out.println(word1.length() == word2.length());

    }
}