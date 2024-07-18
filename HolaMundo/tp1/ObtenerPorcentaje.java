import java.util.Scanner;

public class ObtenerPorcentaje {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que ingrese un número real
        System.out.print("Ingrese un número real: ");
        double numeroReal = scanner.nextDouble();

        // Pedir al usuario que ingrese un número entero
        System.out.print("Ingrese un número entero: ");
        int numeroEntero = scanner.nextInt();

        // Calcular el porcentaje
        double porcentaje = (numeroEntero / 100.0) * numeroReal;

        // Mostrar el resultado
        System.out.println("El " + numeroEntero + "% de " + numeroReal + " es: " + porcentaje);

        // Cerrar el scanner
        scanner.close();
    }
}
