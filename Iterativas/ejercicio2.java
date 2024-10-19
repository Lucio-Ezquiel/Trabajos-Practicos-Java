import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int empleados = 0, horas_trabajadas = 0;
        double tarifa = 15, salario = 0;

        System.out.println("Ingresa la cantidad de empleados de la empresa: ");
        empleados = scanner.nextInt();

        for (int i = 1; i <= empleados; i++){
            System.out.println("Ingrese las horas trabajadas del empleado: " + i);
            horas_trabajadas = scanner.nextInt();

            salario = horas_trabajadas * tarifa;

            System.out.println("El salario del empleado " + i + " es " + salario);
        }
    }
}
