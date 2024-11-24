public class SistemaDePagos {

    public static void main(String[] args) {
        TarjetaCredito tarjeta = new TarjetaCredito("Juan Pérez", "1234 5678 9876 5432", "12/25", "123");
        PayPal paypal = new PayPal("Carlos Gómez", "12345", "carlos.gomez@example.com");

        Pagos pagos = new Pagos();
        pagos.agregarMetodoPago(tarjeta);
        pagos.agregarMetodoPago(paypal);

        System.out.println("Métodos de pago disponibles:");
        pagos.mostrarMetodosPago();

        System.out.println("\nRealizando pagos:");
        pagos.realizarPagos();

        System.out.println("\nCancelando pagos:");
        pagos.cancelarPagos();
    }
}

