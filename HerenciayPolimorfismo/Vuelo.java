import java.util.Date;

public abstract class Vuelo {
    protected String numeroVuelo;
    protected String origen;
    protected String destino;
    protected Date fecha;

    public Vuelo(String numeroVuelo, String origen, String destino, Date fecha) {
        this.numeroVuelo = numeroVuelo;
        this.origen = origen;
        this.destino = destino;
        this.fecha = fecha;
    }

    public abstract double calcularPrecio();

    @Override
    public String toString() {
        return "Vuelo [numeroVuelo=" + numeroVuelo + ", origen=" + origen + ", destino=" + destino + ", fecha=" + fecha + "]";
    }
}
