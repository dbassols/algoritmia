import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Persona[] leer_personas = new LEER_PERSONAS().LECTURA();
        // Variables para almacenar los resultados
        Persona[] personas = leer_personas;

        int hombremayor = 0;
        int hombremenor = 0;
        int mujermayor = 0;
        int mujermenor = 0;


        // Calcular los resultados de las personas en la array personas
        for (Persona persona : personas) {
            if (persona.getEdad() >= 18) {
                if (persona.getSexo() == 'M') {
                    hombremayor++;
                }
                else{
                    mujermayor++;
                }
            } else {

                if (persona.getSexo() == 'M') {
                    hombremenor++;
                }
                else{
                    mujermenor++;
                }
            }
        }

       //sumar las variables obtenidas para obtener los totales
        int mayor = hombremayor + mujermayor;
        int menor = hombremenor + mujermenor;
        int mujer = mujermayor + mujermenor;
        // Calcular los porcentajes
        double porcentajeMayor = ((double) mayor / 50) * 100;
        double porcentajeMujer = ((double) mujer / 50) * 100;

        // Mostrar los resultados
        System.out.println("a. Cantidad de personas mayores de edad(18 años o más).: " + mayor);
        System.out.println("b. Cantidad de personas menores de edad: " + menor);
        System.out.println("c. Cantidad de personas masculinas mayores de edad: " + hombremayor);
        System.out.println("d. Cantidad de personas femeninas menores de edad: " + mujermenor);
        System.out.println("e. Porcentaje que representan las personas mayores de edad respecto al total de\n" +
                "personas.: " + porcentajeMayor + "%");
        System.out.println("f. Porcentaje que representan las mujeres respecto al total de personas.: " + porcentajeMujer + "%");
    }
}



