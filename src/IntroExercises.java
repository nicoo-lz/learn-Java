// importo la clase Scanner
import java.util.Scanner;

public class IntroExercises {
    public static void main(String[] args) {
        /* EJ 1) Imprime un mensaje que diga tu nombre en lugar de "¡Hola Mundo!". */

        // instancio la clase Scanner
        Scanner teclado = new Scanner(System.in);

        // prompteo al usuario por su nombre
        System.out.print("¿Cómo te llamas?: ");

        // leo el input del usuario, que sera String
        String name = teclado.nextLine();

        // saludo al usuario con un format specifier para el tipo String
        System.out.printf("¡Hola %s!", name);

        // cerramos el objeto
        teclado.close();

        /* EJ 2) Imprime dos líneas: "Hola" y luego "Mundo" con un solo println. */

        // uso el escape sequence \n para insertar un salto de linea
        System.out.println("Hola\nMundo");

        /* EJ 3) Imprime tu edad, tu color favorito y tu ciudad. */

        Scanner keyboard = new Scanner(System.in);
        System.out.print("¿Cual es tu edad?: ");

        /*
            preferimos usar nextLine() al leer ints para no tener problemas con el \n
            si luego queremos leer Strings por terminal. Entonces, leemos el int como String
            y luego lo convertimos a int con parseInt()
        */
        int age = Integer.parseInt(keyboard.nextLine());

        System.out.print("¿Cual es tu color fav?: ");
        String colour = keyboard.nextLine();
        System.out.print("¿Donde vivis?: ");
        String city = keyboard.nextLine();
        keyboard.close();
        System.out.printf("Edad: %d, Color: %s, Ciudad: %s\n", age, colour, city);

        /* EJ 4) Explora los diferentes System.XXX.println(); más allá de "out". */

        System.out.println("Error grave LOL");

        // muestra el mismo mensaje pero en rojo
        System.err.println("Error grave LOL");

    }
}