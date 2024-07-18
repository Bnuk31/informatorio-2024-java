public class PromedioDeEdad {
    public static void main(String[] args) {
        // Guardar nombres y edades en diferentes variables
        String nombre1 = "Juan";
        int edad1 = 25;

        String nombre2 = "Ana";
        int edad2 = 30;

        String nombre3 = "Pedro";
        int edad3 = 28;

        String nombre4 = "Maria";
        int edad4 = 22;

        // Calcular el promedio de las edades
        double promedio = (edad1 + edad2 + edad3 + edad4) / 4.0;

        // Imprimir los nombres y sus edades
        System.out.println("Nombres y edades:");
        System.out.println(nombre1 + ": " + edad1);
        System.out.println(nombre2 + ": " + edad2);
        System.out.println(nombre3 + ": " + edad3);
        System.out.println(nombre4 + ": " + edad4);

        // Imprimir el promedio de las edades
        System.out.println("El promedio de las edades es: " + promedio);
    }
}
