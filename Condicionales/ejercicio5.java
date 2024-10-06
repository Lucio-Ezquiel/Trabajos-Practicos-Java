package Condicionales;
import java.util.Scanner;
import java.util.Random;

public class ejercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] opciones = {"piedra", "papel", "tijera"};

        System.out.println("Elige una opción: piedra, papel o tijera");
        String jugador = scanner.nextLine().toLowerCase();

        while (!jugador.equals("piedra") && !jugador.equals("papel") && !jugador.equals("tijera")) {
            System.out.println("Opción inválida. Elige piedra, papel o tijera.");
            jugador = scanner.nextLine().toLowerCase();
        }

        int indiceAleatorio = random.nextInt(opciones.length);
        String computadora = opciones[indiceAleatorio];

        System.out.println("Tú elegiste: " + jugador);
        System.out.println("La computadora eligió: " + computadora);

        if (jugador.equals(computadora)) {
            System.out.println("¡Empate!");
        } else if ((jugador.equals("piedra") && computadora.equals("tijera")) ||
                (jugador.equals("papel") && computadora.equals("piedra")) ||
                (jugador.equals("tijera") && computadora.equals("papel"))) {
            System.out.println("¡Ganaste!");
        } else {
            System.out.println("¡Perdiste!");
        }
    }
}
