import java.util.Date;

public class VueloRegular extends Vuelo implements Promocionable {
    private int numeroAsientos;
    private static final double PRECIO_POR_ASIENTO = 100.0;

    public VueloRegular(String numeroVuelo, String origen, String destino, Date fecha, int numeroAsientos) {
        super(numeroVuelo, origen, destino, fecha);
        this.numeroAsientos = numeroAsientos;
    }

    @Override
    public double calcularPrecio() {
        return numeroAsientos * PRECIO_POR_ASIENTO;
    }

    @Override
    public void aplicarPromocion() {
        System.out.println("Aplicando promoción al vuelo regular " + numeroVuelo);
    }

    @Override
    public String toString() {
        return super.toString() + ", Vuelo Regular, Asientos: " + numeroAsientos;
    }
}
