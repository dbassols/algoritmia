import java.util.Scanner;

public class LEER_NUMERO {
    public int LECTURA() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número entero: ");
        //te pedira que introduzcas un numero
        int NUMERO = scanner.nextInt();
        return NUMERO;
    }
}
