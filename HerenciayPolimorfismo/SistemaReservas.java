import java.util.Date;

public class SistemaReservas {

    public static void main(String[] args) {
        VueloRegular vueloRegular = new VueloRegular("REG123", "Buenos Aires", "Córdoba", new Date(), 50);
        VueloCharter vueloCharter = new VueloCharter("CHA456", "Buenos Aires", "Miami", new Date(), 5000.0);

        Reservas reservas = new Reservas();
        reservas.agregarVuelo(vueloRegular);
        reservas.agregarVuelo(vueloCharter);

        System.out.println("Vuelos disponibles:");
        reservas.mostrarVuelos();

        double precioTotal = reservas.calcularPrecioTotal();
        System.out.println("Precio total de las reservas: " + precioTotal);

        System.out.println("\nAplicando promociones:");
        reservas.aplicarPromociones();
    }
}
