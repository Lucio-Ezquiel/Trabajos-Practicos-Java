import java.util.Scanner;

public class ejercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese su fecha de nacimiento (DD/MM/AAAA): ");
        String fechaNacimiento = scanner.nextLine();

        String[] partesFecha = fechaNacimiento.split("/");
        int dia = Integer.parseInt(partesFecha[0]);
        int mes = Integer.parseInt(partesFecha[1]);
        int anio = Integer.parseInt(partesFecha[2]);

        if (mes < 1 || mes > 12 || dia < 1 || dia > 31) {
            System.out.println("Fecha inválida.");
            return;
        }

        String signo = "";
        String horoscopo = "";

        if ((mes == 3 && dia >= 21) || (mes == 4 && dia <= 19)) {
            signo = "Aries";
            horoscopo = "Eres una persona llena de energía y pasión.";
        } else if ((mes == 4 && dia >= 20) || (mes == 5 && dia <= 20)) {
            signo = "Tauro";
            horoscopo = "Eres una persona confiable y estable.";
        }
        //y así sucesivamente para los demás signos

        System.out.println("Tu signo zodiacal es: " + signo);
        System.out.println("Horóscopo: " + horoscopo);
    }
}