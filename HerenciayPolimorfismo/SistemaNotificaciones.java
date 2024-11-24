public class SistemaNotificaciones {

    public static void main(String[] args) {
        CorreoElectronico correo = new CorreoElectronico("Juan Pérez", "¡Hola! Tienes un nuevo mensaje.", "juan.perez@example.com");
        MensajeTexto mensaje = new MensajeTexto("Carlos Gómez", "¡Hola! Tienes un nuevo mensaje.", "555-1234");

        Notificaciones notificaciones = new Notificaciones();
        notificaciones.agregarCanalNotificacion(correo);
        notificaciones.agregarCanalNotificacion(mensaje);

        System.out.println("Canales de notificación disponibles:");
        notificaciones.mostrarCanales();

        System.out.println("\nEnviando notificaciones:");
        notificaciones.enviarNotificaciones();

        System.out.println("\nPersonalizando mensajes:");
        notificaciones.personalizarMensajes("Este es un mensaje actualizado.");

        System.out.println("\nEnviando notificaciones después de personalizar los mensajes:");
        notificaciones.enviarNotificaciones();
    }
}

