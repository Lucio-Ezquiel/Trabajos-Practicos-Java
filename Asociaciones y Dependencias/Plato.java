import java.util.ArrayList;

public class Plato {
    private String nombreCompleto;
    private double precio;
    private boolean esBebida;
    private ArrayList<Ingrediente> ingredientes;

    public Plato(String nombreCompleto, double precio, boolean esBebida) {
        this.nombreCompleto = nombreCompleto;
        this.precio = precio;
        this.esBebida = esBebida;
        this.ingredientes = new ArrayList<>();
    }

    public void agregarIngrediente(Ingrediente ingrediente) {
        ingredientes.add(ingrediente);
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public double getPrecio() {
        return precio;
    }

    public boolean esBebida() {
        return esBebida;
    }

    public ArrayList<Ingrediente> getIngredientes() {
        return ingredientes;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(nombreCompleto).append("\n");
        sb.append("Precio: $ ").append(precio).append("\n");
        if (!esBebida && !ingredientes.isEmpty()) {
            sb.append("Ingredientes:\n");
            sb.append("Nombre Cantidad Unidad de Medida\n");
            for (Ingrediente ingrediente : ingredientes) {
                sb.append(ingrediente).append("\n");
            }
        }
        return sb.toString();
    }
}

