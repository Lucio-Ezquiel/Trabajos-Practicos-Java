import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese su peso en kilogramos: ");
        double peso = scanner.nextDouble();

        System.out.print("Ingrese la duración del ejercicio en minutos: ");
        int duracion = scanner.nextInt();

        System.out.println("Seleccione el tipo de ejercicio:");
        System.out.println("1. Correr");
        System.out.println("2. Nadar");
        System.out.println("3. Andar en bicicleta");
        int opcion = scanner.nextInt();

        double caloriasPorMinuto = 0;

        switch (opcion) {
            case 1:
                caloriasPorMinuto = 0.0175 * peso;
                break;
            case 2:
                caloriasPorMinuto = 0.015 * peso;
                break;
            case 3:
                caloriasPorMinuto = 0.012 * peso;
                break;
            default:
                System.out.println("Opción inválida.");
                return;
        }

        double caloriasTotales = caloriasPorMinuto * duracion;

        System.out.println("Calorías quemadas: " + caloriasTotales);
    }
}