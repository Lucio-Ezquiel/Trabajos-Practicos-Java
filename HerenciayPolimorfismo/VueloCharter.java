import java.util.Date;

public class VueloCharter extends Vuelo implements Promocionable {
    private double precioTotal;

    public VueloCharter(String numeroVuelo, String origen, String destino, Date fecha, double precioTotal) {
        super(numeroVuelo, origen, destino, fecha);
        this.precioTotal = precioTotal;
    }

    @Override
    public double calcularPrecio() {
        return precioTotal;
    }

    @Override
    public void aplicarPromocion() {
        System.out.println("Aplicando promoción al vuelo charter " + numeroVuelo);
    }

    @Override
    public String toString() {
        return super.toString() + ", Vuelo Charter, Precio Total: " + precioTotal;
    }
}
