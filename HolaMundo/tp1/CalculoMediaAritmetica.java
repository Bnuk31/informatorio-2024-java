import java.util.Scanner;

public class CalculoMediaAritmetica {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Definir la cantidad de números
        System.out.print("Ingrese la cantidad de números: ");
        int k = scanner.nextInt();

        // Inicializar la suma
        double suma = 0.0;

        // Leer los números y calcular la suma
        for (int i = 1; i <= k; i++) {
            System.out.print("Ingrese el número " + i + ": ");
            double numero = scanner.nextDouble();
            suma += numero; // Acumular la suma
        }

        // Calcular la media aritmética
        double media = suma / k;

        // Mostrar el resultado
        System.out.println("La media aritmética es: " + media);

        // Cerrar el scanner
        scanner.close();
    }
}
