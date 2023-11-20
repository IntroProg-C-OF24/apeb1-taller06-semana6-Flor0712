package ejercicio5_taller6;
import java.util.Scanner;
public class Ejercicio5_Taller6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Ingrese la operacion (1 al 4)");
        int opcion = sc.nextInt();
        if (opcion == 1)
            System.out.println("Suma");
        else if (opcion == 2)
            System.out.println("Resta");
        else if (opcion == 3)
            System.out.println("Multiplicación");
        else if (opcion == 4)
            System.out.println("Division");
        else if (opcion >= 5)
            System.out.println("Error de Operacion");
    }
}
