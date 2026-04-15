package c02;

public class OperatorsExercises {
    public static void main(String[] args) {
        /* 1. Crea una variable con el resultado de cada operación aritmética. */
        int a = 1 + 2;
        a = a - 5;
        a = a * 3;
        a = a / -2;
        a = a % 2;

        /* 2. Crea una variable para cada tipo de operación de asignación. */
        int b = 10;
        b += 3;
        b -= 3;
        b *= 3;
        b /= 3;
        b %= 3;

        /* 3. Imprime 3 comparaciones verdaderas con diferentes operadores de comparación. */
        System.out.println(3 > 0);
        System.out.println(-4 < 1);
        System.out.println(5 != 2);

        /* 4. Imprime 3 comparaciones falsas con diferentes operadores de comparación. */
        System.out.println(5 <= 2);
        System.out.println(1 == 0);
        System.out.println(7 >= 10);

        /* 5. Utiliza el operador lógico and. */
        int health = 50;
        boolean isAlive = (0 < health) && (health <= 100);

        /* 6. Utiliza el operador lógico or. */
        int age = 20;
        boolean cantVote = (age < 16) || (age > 100);

        /* 7. Combina ambos operadores lógicos. */
        char gender = 'M';
        boolean canRetire = (gender == 'W' && age >= 60) || (gender == 'M' && age >= 65);

        /* 8. Añade alguna negación. */
        boolean isPrime = true;
        boolean isNotPrime = !isPrime;

        /* 9. Imprime 3 ejemplos de uso de operadores unarios. */
        int c = 5;
        System.out.printf("Si a %d le sumo 1 obtengo %d\n", c, ++c);
        System.out.printf("Y si ahora le resto 1 obtengo %d\n", --c);

    }
}