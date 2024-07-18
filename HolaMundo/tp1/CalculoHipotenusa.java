import java.util.Scanner;

public class CalculoHipotenusa {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que ingrese los catetos
        System.out.print("Ingrese el valor del primer cateto (a): ");
        double catetoA = scanner.nextDouble();

        System.out.print("Ingrese el valor del segundo cateto (b): ");
        double catetoB = scanner.nextDouble();

        // Calcular la hipotenusa
        double hipotenusa = Math.sqrt(Math.pow(catetoA, 2) + Math.pow(catetoB, 2));

        // Mostrar el resultado
        System.out.println("La hipotenusa del triángulo es: " + hipotenusa);

        // Cerrar el scanner
        scanner.close();
    }
}