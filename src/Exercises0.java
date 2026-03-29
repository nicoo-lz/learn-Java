// importo la clase Scanner
import java.util.Scanner;

public class Exercises0 {
    public static void main(String[] args) {
        // EJ 1) Imprime un mensaje que diga tu nombre en lugar de "¡Hola Mundo!".

        // instancio la clase Scanner
        Scanner teclado = new Scanner(System.in);
        System.out.print("¿Cómo te llamas?: ");
        // leo el input del usuario, que sera String
        String name = teclado.nextLine();
        // saludo con un format specifier para el String
        System.out.printf("¡Hola %s!", name);

        // EJ 2) Imprime dos líneas: "Hola" y luego "Mundo" con un solo println.
        // EJ 3) Añade un comentario sobre lo que hace cada línea del programa.
        // EJ 4) Crea un comentario en varias líneas.
        // EJ 5) Imprime tu edad, tu color favorito y tu ciudad.
        // EJ 6) Explora los diferentes System.XXX.println(); más allá de "out".
        // EJ 7) Utiliza varios println para imprimir una frase.
        // EJ 8) Imprime un diseño ASCII (por ejemplo, una cara feliz usando símbolos).
        // EJ 9) Intenta ejecutar el programa sin el metodo main y observa el error.
        // EJ 10) Intenta cambiar el nombre del archivo a uno diferente del de la clase y compílalo. ¿Qué pasa?
    }
}