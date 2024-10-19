import java.util.Scanner;

public class ejercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int horas_estudio = 0, horas_ejercicio = 0, horas_leer = 0, tiempo_libre = 0;
        int contador = 0, tiempo_total = 0;
        while (contador == 0){
            System.out.println("¿Cúantas horas le dedicas al estudio? ");
            horas_estudio = scanner.nextInt();
            System.out.println("¿Cúantas horas le dedicas a hacer ejercicios? ");
            horas_ejercicio = scanner.nextInt();
            System.out.println("Cúantas horas le dedicas a leer? ");
            horas_leer = scanner.nextInt();
            System.out.println("Cúantas horas tienes de tiempo libre ");
            tiempo_libre = scanner.nextInt();
            contador += 1;
        }
        tiempo_total = (horas_estudio + horas_ejercicio + horas_leer + tiempo_libre);
        System.out.println("En total dedicas " + tiempo_total + " horas de tu tiempo.");
    }
}
