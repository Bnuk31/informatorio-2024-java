import java.util.Scanner;

public class ConversionCelsiusAFahrenheit {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que ingrese la temperatura en Celsius
        System.out.print("Ingrese la temperatura en grados Celsius: ");
        double celsius = scanner.nextDouble();

        // Convertir Celsius a Fahrenheit
        double fahrenheit = (celsius * 9 / 5) + 32;

        // Mostrar el resultado
        System.out.println(celsius + " grados Celsius son " + fahrenheit + " grados Fahrenheit.");

        // Cerrar el scanner
        scanner.close();
    }
}