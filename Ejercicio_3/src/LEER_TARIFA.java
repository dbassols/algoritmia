import java.util.Scanner;

public class LEER_TARIFA {
    public static double LECTURA() {
        //leer la tarifa por hora
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la tarifa por hora: ");
        double tarifa = scanner.nextDouble();
        return tarifa;
    }
}
