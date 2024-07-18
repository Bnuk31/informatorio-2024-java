import java.util.Scanner;

public class PotenciaDe2y3 {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que ingrese un número
        System.out.print("Ingrese un número: ");
        double numero = scanner.nextDouble();

        // Calcular la potencia al cuadrado y al cubo
        double alCuadrado = Math.pow(numero, 2);
        double alCubo = Math.pow(numero, 3);

        // Mostrar los resultados
        System.out.println("El cuadrado de " + numero + " es: " + alCuadrado);
        System.out.println("El cubo de " + numero + " es: " + alCubo);

        // Cerrar el scanner
        scanner.close();
    }
}