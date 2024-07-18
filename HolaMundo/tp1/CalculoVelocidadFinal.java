import java.util.Scanner;

public class CalculoVelocidadFinal {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que ingrese la velocidad inicial
        System.out.print("Ingrese la velocidad inicial (en m/s): ");
        double velocidadInicial = scanner.nextDouble();

        // Pedir al usuario que ingrese la aceleración de la gravedad
        System.out.print("Ingrese la aceleración de la gravedad (en m/s²): ");
        double gravedad = scanner.nextDouble();

        // Pedir al usuario que ingrese el tiempo transcurrido
        System.out.print("Ingrese el tiempo transcurrido (en segundos): ");
        double tiempo = scanner.nextDouble();

        // Calcular la velocidad final
        double velocidadFinal = velocidadInicial + gravedad * tiempo;

        // Mostrar el resultado
        System.out.println("La velocidad final del objeto es: " + velocidadFinal + " m/s");

        // Cerrar el scanner
        scanner.close();
    }
}