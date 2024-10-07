import java.util.Scanner;

public class ejercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese su nivel de satisfacción con la vida (1-10): ");
        int satisfaccionVida = scanner.nextInt();

        System.out.print("Ingrese su nivel de estrés (1-10, siendo 1 bajo estrés): ");
        int nivelEstres = scanner.nextInt();

        System.out.print("Ingrese su nivel de salud (1-10): ");
        int nivelSalud = scanner.nextInt();

        double indiceFelicidad = (satisfaccionVida + (11 - nivelEstres) + nivelSalud) / 3.0;

        System.out.println("Tu índice de felicidad es: " + indiceFelicidad);
        
        if (indiceFelicidad >= 8) {
            System.out.println("¡Estás muy feliz! Sigue así.");
        } else if (indiceFelicidad >= 6) {
            System.out.println("Estás en un buen camino hacia la felicidad.");
        } else if (indiceFelicidad >= 4) {
            System.out.println("Podrías mejorar tu nivel de felicidad. ¿Quieres algunas sugerencias?");
        } else {
            System.out.println("Parece que estás pasando por un momento difícil. ¡Ánimo!");
        }
    }
}