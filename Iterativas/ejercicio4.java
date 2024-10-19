import java.util.Scanner;

public class ejercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dias_semana = 1;
        int total_ventas = 0, venta = 0;

        while (dias_semana <= 7){
            System.out.println("Ingrese las ventas del día " + dias_semana + ": $");
            venta = scanner.nextInt();
            total_ventas += venta;
            dias_semana ++;
        }
        System.out.printf("El total de ventas de la semana es: $" + total_ventas);
    }
}
