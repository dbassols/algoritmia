import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
            int leer_horas = new LEER_HORASTRABAJADA().LECTURA();
            double leer_tarifa = new LEER_TARIFA().LECTURA();
            //obtener las horas y las tarifas
            int horasTrabajadas = leer_horas;
            double tarifa = leer_tarifa;
            // comprobar si hay horas extras y si las hay aumentar la tarifa para esas horas
            double salario;
            if (horasTrabajadas > 40) {
                int horasExtras = horasTrabajadas - 40; //las horas extras seran el total - las 40 horas normales
                double tarifaExtra = tarifa * 1.5; // Incremento del 50% para horas extras
                salario= (40 * tarifa) + (horasExtras * tarifaExtra); //cogemos las 40 horas con una tarifa normal y le sumamos el salario de las horas extras
            } else {
                //si no hay un aumento, calcular el salario base que no incluye el possible aumento
                salario = horasTrabajadas * tarifa;
            }
            // Mostrar el salario total
            System.out.println("Salario recibido por el trabajador es " + salario);
        }
}
