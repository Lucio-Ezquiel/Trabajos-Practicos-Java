public class ejercicio3 {
    public static void main(String[] args) {
        String clientes[] = {"Juan","Pedro","Dario","Roberto","Tomas"};
        int facturas_pendientes[] = {500,1000,100,2000,300};

        enviar_facturas(clientes, facturas_pendientes);
    }
    public static void enviar_facturas(String clientes[], int facturas[]){
        System.out.printf("Clientes con facturas mayores a $500:");
        System.out.println("");
        for (int i = 0; i < clientes.length; i++ ){
            if (facturas[i] > 500){
                System.out.println(clientes[i]);
            }
        }

    }
}
