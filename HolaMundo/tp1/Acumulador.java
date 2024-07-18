import java.util.Scanner;

public class Acumulador {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que ingrese los dos números enteros
        System.out.print("Ingrese el primer número entero: ");
        int numero1 = scanner.nextInt();

        System.out.print("Ingrese el segundo número entero: ");
        int numero2 = scanner.nextInt();

        // Inicializar el acumulador
        double acumulador = 0;

        // Calcular la acumulación de las multiplicaciones
        for (int i = 1; i <= 15; i++) {
            acumulador += (double) (numero1 * numero2) / i;
        }

        // Mostrar el resultado por pantalla
        System.out.println("El resultado de la acumulación es: " + acumulador);

        // Cerrar el scanner
        scanner.close();
    }
}