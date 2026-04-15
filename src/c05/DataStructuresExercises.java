package c05;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.HashMap;

public class DataStructuresExercises {
    public static void main(String[] args) {
        /* 1. Crea un Array con 5 valores e imprime su longitud. */
        double[] timeRecords = {25.98, 33.12, 21.19, 28.46, 19.03};
        System.out.println(timeRecords.length);

        /* 2. Modifica uno de los valores del Array e imprime el valor del
        índice antes y después de modificarlo. */
        System.out.printf("El valor de la posicion 0 es %.2f\n", timeRecords[0]);
        timeRecords[0] = 15.15;
        System.out.printf("El valor de la posicion 0 es %.2f\n", timeRecords[0]);

        /* 3. Crea un ArrayList vacío. */
        ArrayList<String> clubs = new ArrayList<>();

        /* 4. Añade 4 valores al ArrayList y elimina uno a continuación. */
        clubs.add("Boca");
        clubs.add("River");
        clubs.add("Independiente");
        clubs.add("Racing");
        clubs.remove("Racing");

        /* 5. Crea un HashSet con 2 valores diferentes. */
        HashSet<Integer> years = new HashSet<>();
        years.add(2022);
        years.add(2026);

        /* 6. Añade un nuevo valor repetido y otro sin repetir al HashSet. */
        years.add(2026);
        years.add(2027);

        /* 7. Elimina uno de los elementos del HashSet. */
        years.remove(2022);

        /* 8. Crea un HashMap donde la clave sea un nombre y el
        valor el número de teléfono. Añade tres contactos. */
        HashMap<String, Integer> telNumbers = new HashMap<>();
        telNumbers.put("Nico", 1133332222);
        telNumbers.put("Facu", 1199993333);
        telNumbers.put("Mati", 1100004444);

        /* 9. Modifica uno de los contactos y elimina otro. */
        telNumbers.replace("Nico", 1177776666);
        telNumbers.remove("Mati");
    }
}