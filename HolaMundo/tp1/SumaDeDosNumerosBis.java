public class SumaDeDosNumerosBis {
    public static void main(String[] args) {
        // Declarar y asignar valores a las variables
        int numero1 = 5;
        int numero2 = 10;

        // Sumar los dos números
        int suma = numero1 + numero2;

        // Determinar si la suma es par o impar
        String paridad;
        if (suma % 2 == 0) {
            paridad = "par";
        } else {
            paridad = "impar";
        }

        // Mostrar el resultado por pantalla con el mensaje de paridad
        System.out.println("El resultado es " + suma + " y es " + paridad);
    }

}
