import java.util.Scanner;

public class ejercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la distancia del viaje en kilómetros: ");
        double distancia = scanner.nextDouble();

        System.out.print("Ingrese el consumo de combustible en litros por kilómetro: ");
        double consumoPorKm = scanner.nextDouble();

        System.out.print("Ingrese el precio del combustible por litro: ");
        double precioPorLitro = scanner.nextDouble();

        double consumoTotal = distancia * consumoPorKm;

        double costoTotal = consumoTotal * precioPorLitro;

        System.out.println("El costo total del viaje es: $" + costoTotal);
    }
}
