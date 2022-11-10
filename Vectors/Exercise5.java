package Vectors;

import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        // Se necesita un vector que permita cargar por teclado el nombre de 10
        // animales. A partir de esta carga, se desea otro vector que copie los mismos
        // nombres pero en el orden inverso, es decir, si los nombres son: perro, gato,
        // lagartija, el nuevo vector debe contener: lagartija, gato, perro. Una vez
        // realizado el cambio, mostrar por pantalla ambos vectores para compararlos.

        String nombresDeAnimales[] = new String[10];
        String nombresInvertidos[] = new String[10];

        int i = 0;
        String aux;
        int j;

        Scanner keyboard = new Scanner(System.in);

        while (i < 10) {
            String key = keyboard.next();
            nombresDeAnimales[i] = key;
            // System.out.println("name: " + nombresDeAnimales[i] + " was saved");
            i++;
        }

        for (i = 0; i < nombresDeAnimales.length / 2; i++) {
            aux = nombresDeAnimales[i];
            j = nombresDeAnimales.length - 1 - i; // -> guardar el indice contrario para revertir
            nombresInvertidos[i] = nombresDeAnimales[j];
            nombresInvertidos[j] = aux;
        }
        /*
         * for (String name : nombresInvertidos) {
         * System.out.println(name);
         * }
         */
    }
}
