public class TrianguloAsteriscos {
    public static void main(String[] args) {
        int altura = 5; // Altura del triángulo

        // Bucle externo para las líneas del triángulo
        for (int i = 1; i <= altura; i++) {
            // Bucle interno para los asteriscos en cada línea
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // Salto de línea después de imprimir los asteriscos de cada línea
            System.out.println();
        }
    }
}