public class ConversionLibrasAKilogramos {
    public static void main(String[] args) {
        // Definir la constante para la conversión
        final double CONVERSION_LIBRAS_A_KILOS = 0.453592;

        // Guardar el valor en libras
        double libras = 150; // Reemplaza 150 con el valor que desees

        // Realizar la conversión a kilogramos
        double kilogramos = libras * CONVERSION_LIBRAS_A_KILOS;

        // Mostrar el resultado por pantalla
        System.out.println(libras + " libras son " + kilogramos + " kilogramos.");
    }
}
