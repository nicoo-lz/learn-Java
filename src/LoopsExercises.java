import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class LoopsExercises {
    public static void main(String[] args) {
        /* 1. Imprime los números del 1 al 10 usando while. */
        int i = 1;

        while (i <= 10) {
            System.out.println(i);
            i++;
        }

        /* 2. Usa do-while para mostrar todos los valores de un ArrayList. */
        ArrayList<String> names = new ArrayList<>();
        names.add("nico");
        names.add("facu");
        names.add("mati");
        i = 0;

        do {
            System.out.println(names.get(i));
            i++;
        }
        while (i < names.size());

        /* 3. Imprime los múltiplos de 5 del 1 al 50 usando for. */
        for (int index = 5; index < 51; index += 5) {
            System.out.println(index);
        }

        /* 4. Recorre un Array de 5 números e imprime la suma total. */
        int[] numbers = {4, 10, 7, 2, 0};
        int res = 0;

        for (int number : numbers) {
            res += number;
        }
        System.out.println(res);

        /* 5. Usa un for para recorrer un Array y mostrar sus valores. */
        char[] vocals = {'a', 'e', 'i', 'o', 'u'};

        for (char vocal : vocals) {
            System.out.println(vocal);
        }

        /* 6. Usa for-each para recorrer un HashSet y un HashMap. */
        HashSet<String> countries = new HashSet<>();
        HashMap<String, Integer> ages = new HashMap<>();
        countries.add("Arg");
        countries.add("Italia");
        countries.add("Francia");

        ages.put("Nico", 24);
        ages.put("Facu", 27);
        ages.put("Mati", 22);

        for (String country : countries) {
            System.out.println(country);
        }

        // utilizo el metodo entrySet() que me muestra los pares key, value
        // como un conjunto, el cual puede ser iterado con un for
        Set<Map.Entry<String, Integer>> elements = ages.entrySet();
        for (Map.Entry<String, Integer> elem : elements) {
            System.out.println(elem);
        }

        /* 7. Imprime los números del 10 al 1 (descendiente) con un bucle for. */
        for (int j = 10; j > 0; j--) {
            System.out.println(j);
        }

        /* 8. Usa continue para saltar los múltiplos de 3 del 1 al 20. */
        for (int j = 1; j < 21; j++) {
            if (j % 3 == 0) {
                continue;
            }
            System.out.println(j);
        }

        /* 9. Usa break para detener un bucle cuando encuentres un
        número negativo en un array. */
        int[] nums = {3, 4, 10, 0, -3, 8, 2};

        for (int num : nums) {
            if (num < 0) {
                break;
            }
            System.out.println(num);
        }

        /* 10. Crea un programa que calcule el factorial de un número dado. */
        int factorial = 1;
        int number = 7;
        i = 1;

        while (i <= number) {
            factorial *= i;
            i++;
        }
        System.out.println(factorial);
    }
}