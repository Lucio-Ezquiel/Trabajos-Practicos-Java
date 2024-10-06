package Condicionales;
import java.util.Scanner;

public class ejercicio1 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("¿Cúal es tu género de película favorito (acción, comedia, drama, cienca ficción)");
        String genero = scanner.nextLine();

        switch (genero.toLowerCase()) {
            case "accion":
                System.out.println("Te recomiendo 'Mision Imposible'");
                break;
            case "comedia":
                System.out.println("Te recomiendo 'Son como niños'");
                break;
            case "drama":
                System.out.println("Te recomiendo 'Titanic'");
                break;
            case "ciencia ficcion":
                System.out.println("Te recomiendo 'Interstellar'");
            default:
                System.out.println("No coincide con ningun genero.");
        }
    }
}