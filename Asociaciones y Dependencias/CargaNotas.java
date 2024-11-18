import java.util.ArrayList;
import java.util.Scanner;

public class CargaNotas {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Alumno> alumnos = new ArrayList<Alumno>();

        System.out.print("Ingrese la cantidad de alumnos a registrar: ");
        int cantidadAlumnos = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < cantidadAlumnos; i++) {
            System.out.println("Ingrese los datos del alumno " + (i + 1));

            System.out.print("Nombre Completo: ");
            String nombreCompleto = scanner.nextLine();

            System.out.print("Legajo: ");
            long legajo = scanner.nextLong();
            scanner.nextLine();

            Alumno alumno = new Alumno(nombreCompleto, legajo);

            System.out.print("Ingrese la cantidad de notas para " + nombreCompleto + ": ");
            int cantidadNotas = scanner.nextInt();
            scanner.nextLine();

            while (cantidadNotas < 1) {
                System.out.print("Debe ingresar al menos una nota. Ingrese la cantidad de notas nuevamente: ");
                cantidadNotas = scanner.nextInt();
                scanner.nextLine();
            }

            for (int j = 0; j < cantidadNotas; j++) {
                System.out.print("Ingrese la cátedra para la nota " + (j + 1) + ": ");
                String catedra = scanner.nextLine();

                System.out.print("Ingrese la nota para la cátedra " + catedra + ": ");
                double notaExamen = scanner.nextDouble();
                scanner.nextLine();

                Nota nota = new Nota(catedra, notaExamen);
                alumno.agregarNota(nota);
            }

            alumnos.add(alumno);
        }
        
        System.out.println("\nInformación de los alumnos:");
        for (Alumno alumno : alumnos) {
            System.out.println("\nAlumno: " + alumno.getNombreCompleto());
            System.out.println("Legajo: " + alumno.getLegajo());
            System.out.println("Notas:");
            for (Nota nota : alumno.getNotas()) {
                System.out.println("Cátedra: " + nota.getCatedra() + " - Nota: " + nota.getNotaExamen());
            }
            System.out.println("Promedio de Notas: " + alumno.calcularPromedio());
        }

        scanner.close();
    }
}
