public class ejercicio6 {
    public static void main(String[] args) {
        int facturas[] = {500,1000,200,300,4000};

        calcular_impuesto(facturas);
    }
    public static void calcular_impuesto(int facturas[]){
        int impuesto = 21, total;

        for (int i = 0; i < facturas.length; i++){
            total = (facturas[i] * impuesto) / 100 + facturas[i];
            System.out.println("El impuesto para la factura "+ (i+1)+ " es de " + total);
        }

    }
}
