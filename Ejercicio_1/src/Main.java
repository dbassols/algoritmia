import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        int leer_numero = new LEER_NUMERO().LECTURA();
        int NUMERO = leer_numero;

        // con %2 vemos si es par o impar (si se puede %2 == 0 entonces es par)
        if (NUMERO % 2 == 0) {
            System.out.println("El número introducido es par");
            System.out.println("Pares desde el " + NUMERO + " hasta el 0 ");
            //mostramos los numeros descendientes pares utilizando un bucle ( -= 2 porque solo queremos los numeros pares, no todos)
            for (int i = NUMERO; i >= 0; i -= 2) {
                System.out.println(i);
            }
        } else {
            System.out.println("El número introducido es impar.");
            System.out.println("impares desde eol " + NUMERO + " hasta el 1");
            //mostramos los numeros descendientes impares utilizando un bucle
            for (int i = NUMERO; i >= 1; i -= 2) {
                System.out.println(i);
            }
        }
    }
}