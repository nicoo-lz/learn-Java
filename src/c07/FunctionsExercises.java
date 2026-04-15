package c07;

import java.util.ArrayList;

public class FunctionsExercises {
    /* 1. Crea una función que imprima "¡Te doy la bienvenida al curso de
    Java desde cero!". */
    public static void sayHi() {
        System.out.println("Bienvenido al curso de Java!");
    }

    /* 2. Escribe una función que reciba un nombre como parámetro y salude a esa persona. */
    public static void sayHiToSb(String name) {
        System.out.printf("Hola %s\n", name);
    }

    /* 3. Haz un metodo que reciba dos números enteros y devuelva su resta. */
    public static int subtraction(int a, int b) {
        return a - b;
    }

    /* 4. Crea un metodo que calcule el cuadrado de un número (n * n). */
    public static int toThePowerOf2(int n) {
        return n * n;
    }

    /* 5. Escribe una función que reciba un número y diga si es par o impar. */
    public static boolean isEven(int n) {
        return n % 2 == 0;
    }

    /* 6. Crea un metodo que reciba una edad y retorne true si es mayor de edad
     (y false en caso contrario). */
    public static boolean isAdult(int age) {
        return age >= 18;
    }

    /* 7. Implementa una función que reciba una cadena y retorne su longitud. */
    public static int length(String s) {
        return s.length();
    }

    /*  8. Crea un metodo que reciba un array de enteros, calcula su media y lo retorna. */
    public static double average(int[] numbers) {
        int total = 0;

        for (int number : numbers) {
            total += number;
        }

        // hay que castear total a double sino tira error
        return ((double) total / numbers.length);
    }

    /* 9. Escribe un metodo que reciba un número y retorna su factorial. */
    public static int factorial(int n) {
        int fact = 1;

        for (int i = 1; i <= n; i++) {
            fact *= i;
        }

        return fact;
    }

    /* 10. Crea una función que reciba un ArrayList<String> y lo recorra mostrando
    cada elemento. */
    public static void showElements(ArrayList<String> list) {
        for (String element : list) {
            System.out.println(element);
        }
    }

}