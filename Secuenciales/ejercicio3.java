import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese su nivel de condición física (principiante, intermedio, avanzado): ");
        String nivel = scanner.nextLine().toLowerCase();

        String[] ejerciciosPrincipiante = {"correr", "caminar", "sentadillas", "flexiones", "abdominales"};
        String[] ejerciciosIntermedio = {"nadar", "bicicleta", "pesas ligeras", "sentadillas", "flexiones"};
        String[] ejerciciosAvanzado = {"HIIT", "pesas pesadas", "calistenia avanzada", "levantamiento de pesas"};

        String[] ejercicios;
        switch (nivel) {
            case "principiante":
                ejercicios = ejerciciosPrincipiante;
                break;
            case "intermedio":
                ejercicios = ejerciciosIntermedio;
                break;
            case "avanzado":
                ejercicios = ejerciciosAvanzado;
                break;
            default:
                System.out.println("Nivel no válido.");
                return;
        }

        int numDias = 5;
        for (int dia = 1; dia <= numDias; dia++) {
            System.out.println("Día " + dia + ":");
            for (int i = 0; i < 3; i++) {
                int ejercicioAleatorio = (int) (Math.random() * ejercicios.length);
                System.out.println("- " + ejercicios[ejercicioAleatorio]);
            }
        }
    }
}
