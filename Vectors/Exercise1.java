package Vectors;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String args[]) {
        // Se necesita de un vector que sea capaz de almacenar 10 números enteros entre
        // 1 y 100.
        // Realizar un programa que permita la carga por teclado de los 10 números
        // solicitados.

        int vector[] = new int[10];
        int i = 0;

        Scanner keyboard = new Scanner(System.in);

        while (!(vector[9] >= 1)) {
            int key = keyboard.nextInt();
            if (key > 0 && key < 101) {
                vector[i] = key;
                System.out.println("saved");
                i++;
            } else {
                System.out.println("don't saved");
            }

        }
        for (int index : vector) {
            System.out.println(" - " + index + " - ");
        }
    }
}
