public class ejercicio2 {
    public static void main(String[] args) {
        String productos[] = {"celular","computadora","televisor","teclado","mouse"};
        int stock[] = {3,10,5,6,8};

        generar_reporte_bajo_stock(productos, stock);
    }
    public static void generar_reporte_bajo_stock(String productos[], int stock[]) {
        System.out.println("Productos con bajo stock:");
        for (int i = 0; i < productos.length; i++) {
            if (stock[i] < 5) {
                System.out.println(productos[i] + " - Unidades: " + stock[i]);

            }
        }
    }
 }