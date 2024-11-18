import java.util.ArrayList;
import java.util.Scanner;

public class MenuRestaurant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Plato> platosMenu = new ArrayList<>();

        System.out.print("¿Cuántos platos deseas agregar al menú? ");
        int cantidadPlatos = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < cantidadPlatos; i++) {
            System.out.println("\nPlato " + (i + 1));

            System.out.print("Nombre del plato: ");
            String nombrePlato = sc.nextLine();
            System.out.print("Precio del plato: ");
            double precioPlato = sc.nextDouble();
            sc.nextLine();

            System.out.print("¿Es bebida? (true/false): ");
            boolean esBebida = sc.nextBoolean();
            sc.nextLine();

            Plato plato = new Plato(nombrePlato, precioPlato, esBebida);

            if (!esBebida) {
                System.out.println("Agregando ingredientes al plato: " + nombrePlato);
                boolean seguir = true;
                while (seguir) {
                    System.out.print("Nombre del ingrediente: ");
                    String nombreIngrediente = sc.nextLine();
                    System.out.print("Cantidad del ingrediente: ");
                    double cantidadIngrediente = sc.nextDouble();
                    sc.nextLine();
                    System.out.print("Unidad de medida del ingrediente: ");
                    String unidadIngrediente = sc.nextLine();

                    Ingrediente ingrediente = new Ingrediente(nombreIngrediente, cantidadIngrediente, unidadIngrediente);
                    plato.agregarIngrediente(ingrediente);

                    System.out.print("¿Deseas agregar otro ingrediente? (true/false): ");
                    seguir = sc.nextBoolean();
                    sc.nextLine();
                }
            }

            platosMenu.add(plato);
        }
        
        System.out.println("\nMENÚ:");
        for (Plato plato : platosMenu) {
            System.out.println(plato);
        }

        sc.close();
    }
}
