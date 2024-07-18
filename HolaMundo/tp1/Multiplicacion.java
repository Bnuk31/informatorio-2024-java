public class Multiplicacion {
    public static void main(String[] args) {
        // Declarar y asignar valores a las variables de números reales
        double numReal1 = 5.5;
        double numReal2 = 4.5;

        // Multiplicar los números reales
        double multiplicacionReal = numReal1 * numReal2;

        // Declarar y asignar valores a las variables de números enteros
        int numEntero1 = 3;
        int numEntero2 = 2;

        // Multiplicar los números enteros
        int multiplicacionEntera = numEntero1 * numEntero2;

        // Sumar los resultados de las multiplicaciones
        double sumaMultiplicaciones = multiplicacionReal + multiplicacionEntera;

        // Mostrar el resultado
        System.out.println("El resultado de la suma de las multiplicaciones es: " + sumaMultiplicaciones);

        // Verificar el tipo del resultado
        if (sumaMultiplicaciones == (int) sumaMultiplicaciones) {
            System.out.println("El resultado es un número entero.");
        } else {
            System.out.println("El resultado es un número real.");
        }
    }
}