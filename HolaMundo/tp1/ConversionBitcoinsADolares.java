import java.util.Scanner;

public class ConversionBitcoinsADolares {
    public static void main(String[] args) {
        // Definir la tasa de cambio
        final double TASA_CAMBIO = 50000.0; // 1 bitcoin = 50000 dólares

        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que ingrese una cantidad en bitcoins
        System.out.print("Ingrese la cantidad en bitcoins: ");
        double bitcoins = scanner.nextDouble();

        // Calcular el equivalente en dólares
        double dolares = bitcoins * TASA_CAMBIO;

        // Mostrar el resultado
        System.out.println(bitcoins + " bitcoins son " + dolares + " dólares.");

        // Cerrar el scanner
        scanner.close();
    }
}
