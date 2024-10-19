import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int productos = 0, cantidad_disponible = 0;

        System.out.println("Ingrese cuantos productos tiene: ");
        productos = scanner.nextInt();

        for (int i = 1; i <= productos; i++){
            System.out.println("Ingrese la cantidad disponible del producto " + i);
            cantidad_disponible = scanner.nextInt();

            if (cantidad_disponible < 5){
                System.out.println("Necesitas hacer un pedido del producto " + i);
            }
        }

    }
}
