public class ejercicio5 {
    public static void main(String[] args) {
        int[] calificaciones = {4, 5, 3, 2, 5, 4, 1};

        double promedio = calcularPromedioSatisfaccion(calificaciones);

        System.out.println("El promedio de satisfacción es: " + promedio);
    }

    public static double calcularPromedioSatisfaccion(int[] calificaciones) {
        if (calificaciones == null || calificaciones.length == 0) {
            return 0;
        }

        int suma = 0;
        for (int calificacion : calificaciones) {
            suma += calificacion;
        }

        return (double) suma / calificaciones.length;
    }
}