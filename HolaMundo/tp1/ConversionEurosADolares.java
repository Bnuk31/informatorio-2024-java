import java.util.Scanner;

public class ConversionEurosADolares {
    public static void main(String[] args) {
        // Definir la tasa de cambio
        final double TASA_CAMBIO = 1.20; // 1 euro = 1.20 dólares

        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que ingrese una cantidad en euros
        System.out.print("Ingrese la cantidad en euros: ");
        double euros = scanner.nextDouble();

        // Calcular el equivalente en dólares
        double dolares = euros * TASA_CAMBIO;

        // Mostrar el resultado
        System.out.println(euros + " euros son " + dolares + " dólares.");

        // Cerrar el scanner
        scanner.close();
    }
}
