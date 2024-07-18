import java.util.Scanner;

public class CalculoDeDivisibilidad {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que ingrese el primer número
        System.out.print("Ingrese el primer número: ");
        int numero1 = scanner.nextInt();

        // Pedir al usuario que ingrese el segundo número
        System.out.print("Ingrese el segundo número: ");
        int numero2 = scanner.nextInt();

        // Sumar los dos números
        int suma = numero1 + numero2;

        // Determinar si el primer número es divisible por el segundo
        boolean esDivisible = (numero2 != 0) && (numero1 % numero2 == 0);

        // Mostrar el resultado por pantalla
        System.out.println("La suma de " + numero1 + " y " + numero2 + " es: " + suma);

        // Mostrar si el primer número es divisible por el segundo
        if (esDivisible) {
            System.out.println(numero1 + " es divisible por " + numero2);
        } else {
            System.out.println(numero1 + " no es divisible por " + numero2);
        }
    }
}