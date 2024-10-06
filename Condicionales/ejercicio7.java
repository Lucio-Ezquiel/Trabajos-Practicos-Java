package Condicionales;
import java.util.Scanner;

public class ejercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("¿Cómo te sientes hoy? (feliz, triste, enérgico, relajado): ");
        String estadoAnimo = scanner.nextLine().toLowerCase();

        switch (estadoAnimo) {
            case "feliz":
                System.out.println("¡Genial! Puedes salir a dar un paseo, escuchar música alegre o llamar a un amigo.");
                break;
            case "triste":
                System.out.println("¡Ánimo! Puedes intentar meditar, leer un libro inspirador o ver una comedia.");
                break;
            case "enérgico":
                System.out.println("¡Aprovecha tu energía! Puedes hacer ejercicio, bailar o trabajar en un proyecto creativo.");
                break;
            case "relajado":
                System.out.println("¡Relájate aún más! Puedes tomar un baño caliente, leer una novela o practicar yoga.");
                break;
            default:
                System.out.println("No he entendido tu estado de ánimo. Intenta escribirlo de nuevo.");
        }
    }
}
