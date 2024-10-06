package Condicionales;
import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el precio de su producto: $");
        double precioOriginal = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("¿Cuál es tu categoría? (jubilado, adulto, estudiante): ");
        String categoria = scanner.nextLine();

        double descuento = 0;

        switch (categoria.toLowerCase()) {
            case "estudiante":
                descuento = 0.1;
                break;
            case "adulto":
                descuento = 0.05;
                break;
            case "jubilado":
                descuento = 0.15;
                break;
            default:
                System.out.println("Categoría no válida.");
                return;
        }

        double precioFinal = precioOriginal * (1 - descuento);
        System.out.printf("Su precio final es: $"+ precioFinal);
    }
}
