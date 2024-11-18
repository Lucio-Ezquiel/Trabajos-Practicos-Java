import java.util.Scanner;

public class Facturacion {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Factura factura = new Factura();

        System.out.print("Ingrese la fecha de la factura: ");
        factura.setFechaFactura(scanner.nextLine());

        long numeroFactura = 0;
        while (numeroFactura <= 0) {
            System.out.print("Ingrese el número de factura: ");
            try {
                numeroFactura = Long.parseLong(scanner.nextLine());
                if (numeroFactura <= 0) {
                    System.out.println("El número de factura debe ser mayor a cero.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Por favor, ingrese un número válido.");
            }
        }
        factura.setNumeroFactura(numeroFactura);

        String cliente = "";
        while (cliente.isEmpty()) {
            System.out.print("Ingrese el nombre del cliente: ");
            cliente = scanner.nextLine();
            if (cliente.isEmpty()) {
                System.out.println("El nombre del cliente no puede estar vacío.");
            }
        }
        factura.setCliente(cliente);

        String respuesta = "si";
        while (respuesta.equalsIgnoreCase("si")) {
            System.out.print("Ingrese el código del artículo: ");
            String codigo = scanner.nextLine();

            String[] articulo = factura.buscarArticulo(codigo);
            if (articulo == null) {
                System.out.println("El código ingresado no existe, intente nuevamente.");
            } else {
                System.out.println("Artículo encontrado: " + articulo[1] + " - Precio: " + articulo[2]);

                int cantidad = 0;
                while (cantidad <= 0) {
                    System.out.print("Ingrese la cantidad a facturar: ");
                    try {
                        cantidad = Integer.parseInt(scanner.nextLine());
                        if (cantidad <= 0) {
                            System.out.println("La cantidad debe ser mayor a cero.");
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("Por favor, ingrese una cantidad válida.");
                    }
                }

                double precioUnitario = Double.parseDouble(articulo[2]);
                double descuentoItem = 0;

                if (cantidad > 5) {
                    descuentoItem = precioUnitario * 0.1; 
                }

                DetalleFactura detalle = new DetalleFactura(codigo, articulo[1], cantidad, precioUnitario, descuentoItem);
                factura.getDetallesFactura().add(detalle);

                System.out.print("¿Desea continuar agregando artículos? (si/no): ");
                respuesta = scanner.nextLine();
            }
        }

        factura.calcularMontoTotal();

        factura.imprimirFactura();
    }
}

