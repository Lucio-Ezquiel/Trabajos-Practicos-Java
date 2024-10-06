package Condicionales;
import java.util.Scanner;

public class ejercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("¿Cuántas horas duermes al día? ");
        double horasSueno = scanner.nextDouble();

        System.out.print("¿Cuántas horas haces ejercicio al día? ");
        double horasEjercicio = scanner.nextDouble();

        System.out.print("¿Cuántas comidas saludables consumes al día? ");
        int comidasSaludables = scanner.nextInt();

        if (horasSueno >= 7 && horasEjercicio >= 1 && comidasSaludables >= 3) {
            System.out.println("¡Excelente! Tus hábitos de sueño, ejercicio y alimentación son muy saludables.");
        } else if (horasSueno >= 6 && horasEjercicio >= 0.5 && comidasSaludables >= 2) {
            System.out.println("Tus hábitos son buenos, pero podrías mejorar en algunas áreas.");
        } else {
            System.out.println("Te recomendamos mejorar tus hábitos de sueño, ejercicio o alimentación.");
        }

        if (horasSueno < 7) {
            System.out.println("Intenta dormir al menos 7 horas diarias para descansar adecuadamente.");
        }
        if (horasEjercicio < 1) {
            System.out.println("Incorpora al menos 30 minutos de ejercicio moderado a tu rutina diaria.");
        }
        if (comidasSaludables < 3) {
            System.out.println("Aumenta el consumo de frutas, verduras y alimentos nutritivos.");
        }
    }
}
