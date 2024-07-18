import java.util.Scanner;

public class CalculoEnergiaCinetica {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que ingrese la masa del objeto
        System.out.print("Ingrese la masa del objeto (en kg): ");
        double masa = scanner.nextDouble();

        // Pedir al usuario que ingrese la velocidad del objeto
        System.out.print("Ingrese la velocidad del objeto (en m/s): ");
        double velocidad = scanner.nextDouble();

        // Calcular la energía cinética
        double energiaCinetica = (1.0 / 2) * masa * Math.pow(velocidad, 2);

        // Mostrar el resultado
        System.out.println("La energía cinética del objeto es: " + energiaCinetica + " Joules");

        // Cerrar el scanner
        scanner.close();
    }
}