package Vectors;

public class Exercise3 {
    public static void main(String args[]) {
        // Se tienen tres vectores. En el primero de ellos se guarda un número de dni,
        // en el segundo un nombre y en el tercero un apellido.
        // Se desea un programa que sea capaz de recorrer los tres vectores AL MISMO
        // TIEMPO y mostrar cada uno de estos datos por pantalla.
        // Pista: tener en cuenta que el índice de cada vector es correspondiente al
        // índice de los demás,
        // es decir, los datos contenidos en el índice cero del vector de dni,
        // se corresponde con el índice cero del vector de nombres y el de apellidos.

        int vectorDni[] = new int[1];
        vectorDni[0] = 12345678;
        String vectorNombre[] = new String[1];
        vectorNombre[0] = "Manolo";
        String vectorApellido[] = new String[1];
        vectorApellido[0] = "Perez";

        for (int i = 0; i < vectorDni.length; i++) {
            System.out.println(vectorDni[i] + " es el DNI de " + vectorApellido[i] + ", " + vectorNombre[i]);
        }
    }
}
