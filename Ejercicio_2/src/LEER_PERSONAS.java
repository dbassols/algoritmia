import java.util.Scanner;

public class LEER_PERSONAS {
    public Persona[] LECTURA(){
        //Leer los datos de 50 personas i almacenarlas en una array
        Scanner scanner = new Scanner(System.in);
        Persona[] personas = new Persona[50];
        for(int i=0;i<personas.length;i++){
            System.out.println("La persona " +(i+1));
            //para decir el sexo usar M(male) o F(female)
            System.out.print("Ingrese el sexo(M/F)");
            char sexo=scanner.next().charAt(0);
            //edad en numeros enteros (int)
            System.out.print("Ingrese la edad(numero)");
            int edad=scanner.nextInt();
            personas[i]=new Persona(sexo,edad);
        }
        return personas;
    }
}
