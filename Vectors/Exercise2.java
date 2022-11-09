package Vectors;

public class Exercise2 {
    /**
     * @param args
     */
    public static void main(String args[]) {
        // En un vector de 15 posiciones se almacenan las edades de 15 alumnos.
        // Se desea un programa que sea capaz de determinar cuál es la mayor edad y
        // cuál es la menor edad que se encuentra entre los estudiantes.

        int vector[] = new int[15];
        int increaseIndex = 0;
        int increaseAge = 10;

        for (int index : vector) {
            vector[increaseIndex] = increaseAge + 1;
            increaseAge++;
            increaseIndex++;
        }
        int max = vector[0];
        int min = vector[0];

        for (int i = 0; i < vector.length; i++) {
            if (vector[i] > max) {
                max = vector[i];
            } else if (vector[i] < min) {
                min = vector[i];
            }
        }
        System.out.println("el resultado es max: " + max + " y min: " + min);

    }
}
