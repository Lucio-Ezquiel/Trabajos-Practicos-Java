public class PayPal extends MetodoPago implements Cancelable {
    private String correoElectronico;

    public PayPal(String titular, String numero, String correoElectronico) {
        super(titular, numero);
        this.correoElectronico = correoElectronico;
    }

    @Override
    public void realizarPago() {
        System.out.println("Realizando pago con PayPal. Titular: " + titular + ", Correo electrónico: " + correoElectronico);
    }

    @Override
    public void cancelarPago() {
        System.out.println("Cancelando pago con PayPal. Titular: " + titular + ", Correo electrónico: " + correoElectronico);
    }

    @Override
    public String toString() {
        return super.toString() + ", PayPal, Correo: " + correoElectronico;
    }
