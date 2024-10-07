import java.util.Scanner;

public class ejercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("¿Cuántas horas al día puedes dedicar al estudio? ");
        int horasEstudioDia = scanner.nextInt();

        int horasEstudioSemana = horasEstudioDia * 7;

        System.out.println("Puedes dedicar " + horasEstudioSemana + " horas a la semana para estudiar.");

        System.out.print("Ingrese las materias separadas por coma (ej: Matemáticas, Física, Historia): ");
        String materiasString = scanner.next();
        String[] materias = materiasString.split(",");

        int horasPorMateria = horasEstudioSemana / materias.length;
        System.out.println("Puedes dedicar aproximadamente " + horasPorMateria + " horas a cada materia.");

        System.out.println("Tu plan de estudio semanal es:");
        for (String materia : materias) {
            System.out.println("- " + materia + ": " + horasPorMateria + " horas");
        }
    }
}
