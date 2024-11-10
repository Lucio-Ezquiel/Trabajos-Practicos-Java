public class clasePlaneta {
    public static void main(String[] args) {
        Planeta p1 = new Planeta("Tierra", 1, 5.976e24, 1.08321e12, 12742, 150000000, Planeta.TipoPlaneta.TERRESTRE, true, 1, 1);
        Planeta p2 = new Planeta("Jupiter", 79, 1.898, 1.431, 139820, 778500000, Planeta.TipoPlaneta.GASEOSO, true, 12, 0.4);
        p1.imprimir();
        p2.imprimir();
    }

    public static class Planeta {
        String nombre;
        int cantidadSatelites;
        double masa;
        double volumen;
        int diametro;
        int distanciaSol;
        TipoPlaneta tipoPlaneta;
        boolean observable;
        int periodoOrbital;
        double periodoRotacion;

        public Planeta(String nombre, int cantidadSatelites, double masa, double volumen, int diametro, int distanciaSol, TipoPlaneta tipoPlaneta, boolean observable, int periodoOrbital, double periodoRotacion) {
            this.nombre = nombre;
            this.cantidadSatelites = cantidadSatelites;
            this.masa = masa;
            this.volumen = volumen;
            this.diametro = diametro;
            this.distanciaSol = distanciaSol;
            this.tipoPlaneta = tipoPlaneta;
            this.observable = observable;
            this.periodoOrbital = periodoOrbital;
            this.periodoRotacion = periodoRotacion;
        }

        public boolean esExterior() {
            final double CINTURON_INFERIOR = 2.1;
            final double CINTURON_SUPERIOR = 3.4;
            final double UA_KM = 149597870;

            double distanciaEnUA = (double) distanciaSol / UA_KM;

            return distanciaEnUA > CINTURON_SUPERIOR;
        }

        void imprimir() {
            System.out.println("Nombre del planeta = " + nombre);
            System.out.println("Cantidad de satélites = " + cantidadSatelites);
            System.out.println("Masa del planeta = " + masa + " kg");
            System.out.println("Volumen del planeta = " + volumen + " m³");
            System.out.println("Diámetro del planeta = " + diametro + " km");
            System.out.println("Distancia al sol = " + distanciaSol + " km");
            System.out.println("Tipo del planeta = " + tipoPlaneta);
            System.out.println("Es observable = " + observable);
            System.out.println("Densidad del planeta = " + calcularDensidad() + " kg/m³");
            System.out.println("Es planeta exterior = " + esExterior());
            System.out.println("El periodo orbital es de = " + periodoOrbital + " (año/s)");
            System.out.println("El periodo rotacional es de = " + periodoRotacion + " (dia/s)");
            System.out.println();
        }

        public double calcularDensidad() {
            return masa / volumen;
        }

        public enum TipoPlaneta {
            GASEOSO, TERRESTRE, ENANO
        }
    }
}

