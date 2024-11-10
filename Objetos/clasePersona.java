public class clasePersona {
    public static void main(String[] args) {
         Persona p1 = new Persona("Juan","Rodriguez","1234567890",2000,"Dinamarca",'M');
         p1.imprimir();
    }
    public static class Persona{
        String nombre;
        String apellidos;
        String numeroDocumentoIdentidad;
        int añoNacimiento;
        String pais;
        char genero;

        public Persona(String nombre, String apellidos, String numeroDocumentoIdentidad, int añoNacimiento, String pais, char genero) {
            this.nombre = nombre;
            this.apellidos = apellidos;
            this.numeroDocumentoIdentidad = numeroDocumentoIdentidad;
            this.añoNacimiento = añoNacimiento;
            this.pais = pais;
            this.genero = genero;
        }

        void imprimir() {
            System.out.println("Nombre = " + nombre);
            System.out.println("Apellidos = " + apellidos);
            System.out.println("Número de documento de identidad = " + numeroDocumentoIdentidad);
            System.out.println("Año de nacimiento = " + añoNacimiento);
            System.out.println("Pais de origen = " + pais);
            System.out.println("Genero = " + genero);
            System.out.println();
        }
    }
}
