public class Arrays {
    public static void main(String args[]) {
        int vector[] = new int[5];
        vector[0] = 5;
        vector[1] = 10;
        vector[2] = 15;
        vector[3] = 20;
        vector[4] = 25;

        for (int i = 0; i < vector.length; i++) {
            System.out.println("estoy en la posicion: " + i);
            System.out.println("contiene el numero: " + vector[i]);
        }

        int[][] ejemplo3x3 = new int[2][2];
        int result2 = ejemplo3x3[1][1];
        System.out.print(result2);

    }
}