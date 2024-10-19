import java.util.Scanner;

public class ejercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         int arreglo[];
         arreglo = new int[30];

         for (int i = 0; i < 30; i++){
             System.out.println("Ingrese las ventas del dia " + i);
             arreglo[i] = scanner.nextInt();
         }

         calcular_ingresos_mensuales(arreglo);

    }
    public static void calcular_ingresos_mensuales(int[] arr){
           double suma_total = 0;
           for (int i = 0; i < arr.length; i++ ){
               suma_total += arr[i];
           }
           System.out.println("La cantidad total de ventas es de: $"+suma_total);
    }
}
