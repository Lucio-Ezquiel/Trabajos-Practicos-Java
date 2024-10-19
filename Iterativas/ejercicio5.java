import java.util.Scanner;

public class ejercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int empleados, horas_trabajadas, horas_extra;
        int i=1;

        System.out.printf("Ingrese la cantidad de empleados: ");
        empleados = scanner.nextInt();

        do {
            System.out.println("Ingrese las horas trabajas del empleado " + i);
            horas_trabajadas = scanner.nextInt();
            if (horas_trabajadas>40){
                horas_extra = horas_trabajadas - 40;
                System.out.printf("Las horas extra que realizó son: " + horas_extra);
            }

            i++;
        } while (i<=empleados);

    }
}
