public class ConditionalExercises {
    public static void main(String[] args) {
        /* 1. Establece la edad de un usuario y muestra si puede
        votar (mayor o igual a 18). */
        int age = 24;

        if (age >= 18) {
            System.out.println("Puede votar");
        }
        else {
            System.out.println("No puede votar");
        }

        /* 2. Declara dos números y muestra cuál es mayor, o si son iguales. */
        int a = 8;
        int b = 18;

        if (a > b) {
            System.out.println("a es mayor que b");
        }
        else if (a == b) {
            System.out.println("a y b son iguales");
        }
        else {
            System.out.println("a es menor que b");
        }

        /* 3. Dado un número, verifica si es positivo, negativo o cero. */
        int c = -10;

        if (c > 0) {
            System.out.println("c es positivo");
        }
        else if (c == 0) {
            System.out.println("c vale 0");
        }
        else {
            System.out.println("c es negativo");
        }

        /* 4. Crea un programa que diga si un número es par o impar. */
        int d = 8;

        // uso el operador mod para calcular resto al dividir por 2
        if (d % 2 == 0) {
            System.out.println("d es par");
        }
        else {
            // se que si no tiene resto 0 entonces tiene resto 1, es decir, es impar
            System.out.println("d es impar");
        }

        /* 5. Verifica si un número está en el rango de 1 a 100. */
        int e = 9;

        if (1 <= e && e <= 100) {
            System.out.println("e esta en el rango 1-100");
        }
        else {
            System.out.println("e no esta en el rango 1-100");
        }

        /* 6. Declara una variable con el día de la semana (1-7)
        y muestra su nombre con switch. */
        int day = 7;

        switch (day) {
            case 1:
                System.out.println("MON");
                break;
            case 2:
                System.out.println("TUE");
                break;
            case 3:
                System.out.println("WED");
                break;
            case 4:
                System.out.println("THU");
                break;
            case 5:
                System.out.println("FRI");
                break;
            case 6:
                System.out.println("SAT");
                break;
            case 7:
                System.out.println("SUN");
                break;
        }

        /* 7. Simula un sistema de notas: muestra "Sobresaliente", "Aprobado" o
        "Suspenso" según la nota (0-100). */
        int mark = 38;

        if (mark >= 80) {
            System.out.println("Sobresaliente");
        }
        else if (mark >= 60) {
            System.out.println("Aprobado");
        }
        else {
            System.out.println("Suspenso");
        }

        /* 8. Escribe un programa que determine si puedes entrar al cine: debes tener
        al menos 15 años o ir acompañado. */
        boolean hasCompany = false;
        age = 5;

        if (hasCompany || age >= 15) {
            System.out.println("Podes entrar al cine");
        }
        else {
            System.out.println("No podes entrar al cine");
        }
        /* 9. Crea un programa que diga si una letra es vocal o consonante. */
        char f = '-';

        if (f == 'a' || f == 'e' || f == 'i' || f == 'o' || f == 'u') {
            System.out.println("es vocal");
        }

        // aca aprovecho el codigo ASCII que asigna numeros a cada caracter
        // 'a' = 97 y 'z' = 122
        else if (97 <= f && f <= 122) {
            System.out.println("es consonante");
        }
        else {
            System.out.println("no es una letra");
        }

        /* 10. Usa tres variables a, b, c y muestra cuál es el mayor de las tres. */
        int x = 2;
        int y = 2;
        int z = 2;

        if (x > y && x > z) {
            System.out.println(x);
        }
        // si llego acA logrE descartar a x, asi que solo quedan y and z
        else if (y > z) {
            System.out.println(y);
        }
        // si llego acA logrE descartar a y, solo queda z
        else {
            System.out.println(z);
        }
    }
}