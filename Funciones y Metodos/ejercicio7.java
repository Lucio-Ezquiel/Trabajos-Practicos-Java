public class ejercicio7 {
    public static void main(String[] args) {
        int compras[] = {347,812,595,921,678};

        aplicar_descuento(compras);
    }
    public static void aplicar_descuento(int compras[]){
        int descuento=15;
        double total;

        for(int i=0;i<compras.length;i++){
            if (compras[i]>500) {
                total = (compras[i] * descuento) / 100;
                total = compras[i] - total;
                System.out.println("La compra "+i+" con descuento es: $"+total);
            }
        }
    }
}
