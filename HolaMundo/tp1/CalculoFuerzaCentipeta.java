import java.util.Scanner;

public class CalculoFuerzaCentipeta {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que ingrese la masa del objeto
        System.out.print("Ingrese la masa del objeto (en kg): ");
        double masa = scanner.nextDouble();

        // Pedir al usuario que ingrese la velocidad angular
        System.out.print("Ingrese la velocidad angular (en m/s): ");
        double velocidadAngular = scanner.nextDouble();

        // Pedir al usuario que ingrese el radio de la trayectoria
        System.out.print("Ingrese el radio de la trayectoria (en metros): ");
        double radio = scanner.nextDouble();

        // Calcular la fuerza centrípeta
        double fuerzaCentripeta = (masa * Math.pow(velocidadAngular, 2)) / radio;

        // Mostrar el resultado
        System.out.println("La fuerza centrípeta necesaria es: " + fuerzaCentripeta + " N");

        // Cerrar el scanner
        scanner.close();
    }
}