package Condicionales;
import java.util.Scanner;

public class ejercicio3 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("¿Cúal es tu género de libro favorito (fantasia, misterio, romance, cienca ficción)");
        String genero = scanner.nextLine();

        switch (genero.toLowerCase()) {
            case "fantasia":
                System.out.println("Te recomiendo 'El señor de los anillos'");
                break;
            case "misterio":
                System.out.println("Te recomiendo 'Sherlock Holmes'");
                break;
            case "romance":
                System.out.println("Te recomiendo 'Orgullo y Prejuicio'");
                break;
            case "ciencia ficcion":
                System.out.println("Te recomiendo 'Duner'");
            default:
                System.out.println("No coincide con ningun genero.");
        }
    }
}
