package Matrix;

import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {
        int matrix[][] = new int[5][5];

        Scanner keyboardScanner = new Scanner(System.in);

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.println("Ingrese un valor para la fila " + i + " columna " + j);
                int key = keyboardScanner.nextInt();
                matrix[i][j] = key;
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.println("Fila " + (i + 1) + " - Columna " + (j + 1) + " = " + matrix[i][j]);
            }
        }

    }
}
