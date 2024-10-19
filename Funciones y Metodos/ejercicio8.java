public class ejercicio8 {
    public static void main(String[] args) {
        String empleados[] = {"Juan Pérez", "María Rodríguez", "Pedro Gómez", "Ana López"};
        int horas_trabajadas[] = {40, 35, 42, 38};

        calcular_pago_semanal(empleados,horas_trabajadas);
    }
    public static void calcular_pago_semanal(String empleados[], int horas[]){
        int total;
        for(int i=0;i<empleados.length;i++){
            total=horas[i]*15;
            System.out.println("El pago correspondiente para "+empleados[i]+" es de: $"+total);
        }
    }
}
