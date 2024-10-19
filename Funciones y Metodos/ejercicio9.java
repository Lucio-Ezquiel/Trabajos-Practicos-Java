public class ejercicio9 {
    public static void main(String[] args) {
        double precios_originales[] = {1200.50, 850.25, 2500.00, 1875.99, 3200.75};

        calcular_precio_final(precios_originales);
    }
    public static void calcular_precio_final(double precios[]){
        double total;
        for (int i=0;i<precios.length;i++){
            total=(precios[i]*10) / 100;
            total= precios[i] - total;
            System.out.println("El precio con el descuento aplicado para el producto "+(i+1)+" es de: $"+total);
        }
    }
}
