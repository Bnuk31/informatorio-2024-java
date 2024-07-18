public class TrianguloDeAsteriscos {
    public static void main(String[] args) {
        // Definir el número de filas para el triángulo
        int numFilas = 5;

        // Bucle externo para las filas
        for (int i = 1; i <= numFilas; i++) {
            // Bucle interno para imprimir los asteriscos
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // Imprimir una nueva línea después de cada fila
            System.out.println();
        }
    }
}