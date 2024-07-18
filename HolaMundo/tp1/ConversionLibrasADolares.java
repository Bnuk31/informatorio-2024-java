import java.util.Scanner;

public class ConversionLibrasADolares {
    public static void main(String[] args) {
        // Definir la tasa de cambio
        final double TASA_CAMBIO = 1.40; // 1 libra esterlina = 1.40 dólares

        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que ingrese una cantidad en libras esterlinas
        System.out.print("Ingrese la cantidad en libras esterlinas: ");
        double libras = scanner.nextDouble();

        // Calcular el equivalente en dólares
        double dolares = libras * TASA_CAMBIO;

        // Mostrar el resultado
        System.out.println(libras + " libras esterlinas son " + dolares + " dólares.");

        // Cerrar el scanner
        scanner.close();
    }
}