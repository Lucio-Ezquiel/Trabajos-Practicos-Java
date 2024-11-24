public class TarjetaCredito extends MetodoPago implements Cancelable {
    private String fechaExpiracion;
    private String codigoSeguridad;

    public TarjetaCredito(String titular, String numero, String fechaExpiracion, String codigoSeguridad) {
        super(titular, numero);
        this.fechaExpiracion = fechaExpiracion;
        this.codigoSeguridad = codigoSeguridad;
    }

    @Override
    public void realizarPago() {
        System.out.println("Realizando pago con tarjeta de crédito. Titular: " + titular + ", Número: " + numero +
                ", Expiración: " + fechaExpiracion);
    }

    @Override
    public void cancelarPago() {
        System.out.println("Cancelando pago con tarjeta de crédito. Titular: " + titular + ", Número: " + numero);
    }

    @Override
    public String toString() {
        return super.toString() + ", Tarjeta de Crédito, Expiración: " + fechaExpiracion + ", Código Seguridad: " + codigoSeguridad;
    }
}
