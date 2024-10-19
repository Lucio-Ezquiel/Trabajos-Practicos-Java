public class ejercicio4 {
    public static void main(String[] args) {
        String clientes[] = {"Juan","Jose","Ivan","Joaquin","Nahuel"};
        int compras[] = {5,11,12,34,9};

        calcular_descuentos(clientes,compras);
    }
    public static void calcular_descuentos(String clientes[], int compras[]){
        for (int i = 0; i < clientes.length; i++){
            if (compras[i] > 10){
                System.out.println("El cliente "+ clientes[i] +" tiene un descuento del %10.");
            }
        }
    }

}
