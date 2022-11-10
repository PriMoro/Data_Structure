package Vectors;

public class Exercise4 {
    public static void main(String args[]) {
        // En un vector de 23 posiciones se tienen las temperaturas máximas de las
        // capitales de las 23 provincias argentinas en el último mes. A partir de esta
        // información, un noticiero desea determinar el top 5 de las temperaturas más
        // altas para poder mostrar en la pantalla de su programa, para ello se necesita
        // un programa que sea capaz de recorrer el vector de temperaturas, determinar
        // las 5 más altas y copiarlas en un nuevo vector de 5 posiciones
        int vectorTemperaturas[] = {
                0, 2, 1, 5, 6, 9, 11, 13, 17, 28, 30, 50, 40, 8, 36, 38, 37, 22, 20, 41, 7, 29, 26
        };
        int vectorTop5[] = new int[5];
        int top = 5;

        // Arrays.sort(vectorTemperaturas);

        // -> ordenar las temperaturas
        for (int i = 0; i < vectorTemperaturas.length - 1; i++) {
            for (int j = i + 1; j < vectorTemperaturas.length; j++) {
                if (vectorTemperaturas[i] < vectorTemperaturas[j]) {
                    int aux = vectorTemperaturas[i];
                    vectorTemperaturas[i] = vectorTemperaturas[j];
                    vectorTemperaturas[j] = aux;
                }
            }
        }

        // -> obtener top 5 de temperaturas
        for (int i = 0; i < top; i++) {
            vectorTop5[i] = vectorTemperaturas[i];
        }

        /*
         * for (int i = 0; i < vectorTop5.length; i++) {
         * System.out.println(vectorTop5[i]);
         * }
         */
    }
}
