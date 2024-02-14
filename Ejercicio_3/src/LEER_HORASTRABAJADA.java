import java.util.Scanner;

public class LEER_HORASTRABAJADA {
    public static int LECTURA() {
        // Leer las horas trabajadas
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese las horas trabajadas: ");
        int horasTrabajadas = scanner.nextInt();
        return horasTrabajadas;
    }

}
