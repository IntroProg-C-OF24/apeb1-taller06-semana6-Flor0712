package ejercicio3_taller6;
import java.util.Scanner;
public class Ejercicio3_Taller6 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        int region, costo1, costo2, costo3;
        double pesoPaquete;
        System.out.println("Ingrese el peso del paquete en KG: ");
        pesoPaquete = teclado.nextDouble();
        System.out.println("[1] Local: ");
        System.out.println("[2] Nacional: ");
        System.out.println("[3]Otra: ");
        region = teclado.nextInt();
        costo1 = 5;
        costo2 = 10;
        costo3 = 15;
        switch (region){
            case 1:
                System.out.println("Local");
                break;
            case 2:
                System.out.println("Nacional");
                break;
            case 3:
                System.out.println("Otras");
                break;
        }
        if (pesoPaquete < 5 && region == 1){
            System.out.println("El costo de envío es de: " + costo1 + "Dolares");
        } else {
            if (pesoPaquete >= 5 && pesoPaquete < 10 && region == 2){
                System.out.println("El costo de envío es de: " + costo2 + "Dolares");
            } else {
                System.out.println("El costo de envio es de: " + costo3 + "Dolares");
            }
        }
    }   
    }   
    
