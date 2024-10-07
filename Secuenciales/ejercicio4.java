import java.util.Scanner;

public class ejercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("¡Hola! ¿Cómo te sientes hoy? (feliz, triste, enérgico, relajado): ");
        String estadoAnimo = scanner.nextLine().toLowerCase();

        switch (estadoAnimo) {
            case "feliz":
                System.out.println("¡Aquí tienes algunas canciones para animarte!");
                String[] cancionesFelices = {"Despacito - Luis Fonsi", "Bailando - Enrique Iglesias", "Vivir mi vida - Marc Anthony"};
                imprimirPlaylist(cancionesFelices);
                break;
            case "triste":
                System.out.println("Tranquilo, aquí hay algunas canciones para levantar el ánimo.");
                String[] cancionesTristes = {"Nada fue igual - Sin Bandera", "A Puro Dolor - Son By Four", "Te extraño - Alex Ubago"};
                imprimirPlaylist(cancionesTristes);
                break;
            case "energico":
                System.out.println("¡A mover el cuerpo! Aquí tienes algunas canciones para energizarte.");
                String[] cancionesEnergicas = {"Gasolina - Daddy Yankee", "Calentando - J Balvin", "Mi Gente - J Balvin"};
                imprimirPlaylist(cancionesEnergicas);
                break;
            case "relajado":
                System.out.println("Relájate y disfruta de estas canciones tranquilas.");
                String[] cancionesRelajadas = {"Contigo - Andrés Cepeda", "Mi primer amor - Fonseca", "Recuérdame - Coco"};
                imprimirPlaylist(cancionesRelajadas);
                break;
            default:
                System.out.println("Lo siento, no entiendo ese estado de ánimo.");
        }
    }

    public static void imprimirPlaylist(String[] canciones) {
        for (String cancion : canciones) {
            System.out.println("- " + cancion);
        }
    }
}
