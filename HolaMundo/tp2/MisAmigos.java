package tp2;

import java.util.ArrayList;
import java.util.Scanner;

public class MisAmigos {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Crear una lista para guardar los nombres de los amigos
        ArrayList<String> amigos = new ArrayList<>();

        // Pedir al usuario que ingrese la cantidad de amigos
        System.out.print("Ingrese la cantidad de amigos: ");
        int cantidadAmigos = scanner.nextInt();

        // Limpiar el buffer del scanner después de leer un entero
        scanner.nextLine();

        // Leer los nombres de los amigos
        for (int i = 1; i <= cantidadAmigos; i++) {
            System.out.print("Ingrese el nombre del amigo " + i + ": ");
            String nombreAmigo = scanner.nextLine();
            amigos.add(nombreAmigo);
        }

        // Iterar sobre la lista y mostrar los nombres de los amigos
        System.out.println("Los nombres de tus amigos son:");
        for (String amigo : amigos) {
            System.out.println(amigo);
        }

        // Cerrar el scanner
        scanner.close();
    }
}
