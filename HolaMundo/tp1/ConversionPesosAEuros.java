import java.util.Scanner;

public class ConversionPesosAEuros {
    public static void main(String[] args) {
        // Definir la tasa de cambio
        final double TASA_CAMBIO = 20.0; // 1 euro = 20 pesos

        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que ingrese una cantidad en pesos
        System.out.print("Ingrese la cantidad en pesos: ");
        double pesos = scanner.nextDouble();

        // Calcular el equivalente en euros
        double euros = pesos / TASA_CAMBIO;

        // Mostrar el resultado
        System.out.println(pesos + " pesos son " + euros + " euros.");

        // Cerrar el scanner
        scanner.close();
    }
}