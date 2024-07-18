import java.util.Scanner;

public class ConversionDolaresAPesos {
    public static void main(String[] args) {
        // Definir la tasa de cambio
        final double TASA_CAMBIO = 1540.0; // 1 dólar = 1500 pesos

        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que ingrese una cantidad en dólares
        System.out.print("Ingrese la cantidad en dólares: ");
        double dolares = scanner.nextDouble();

        // Calcular el equivalente en pesos
        double pesos = dolares * TASA_CAMBIO;

        // Mostrar el resultado
        System.out.println(dolares + " dólares son " + pesos + " pesos.");

        // Cerrar el scanner
        scanner.close();
    }
}
