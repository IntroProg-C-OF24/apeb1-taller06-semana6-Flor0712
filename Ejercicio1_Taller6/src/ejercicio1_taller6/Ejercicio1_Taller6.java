package ejercicio1_taller6;
import java.util.Scanner;
public class Ejercicio1_Taller6 {
    public static void main(String[] args) {
         Scanner teclado = new Scanner (System.in);
        double iphone, ipad, iphoneCosto,ipadCosto, iphoneCosto1, ipadCosto1, subtotal, descuento1, descuento2, envio, subtotalIva, montoFactura1, montoFactura2;
       
        System.out.println("Ingrese la cantidad de Iphones Comprados: ");
        iphone = teclado.nextDouble();
        System.out.println("Ingrese la cantidad de Ipads Comprados: ");
        ipad = teclado.nextDouble();
        System.out.println("Ingrese el costo del Iphone por unidad: ");
        iphoneCosto = teclado.nextDouble();
        iphoneCosto1 = iphone * iphoneCosto;
        System.out.println("Ingrese el costo por unidad del Ipad: ");
        ipadCosto = teclado.nextDouble();
        System.out.println("Ingrese el costo del envio: ");
        envio = teclado.nextDouble();
        ipadCosto1 = ipad * ipadCosto;
        subtotal = (ipadCosto1 + iphoneCosto1);
        subtotalIva = ((ipadCosto1 + iphoneCosto1) * 0.12) + subtotal;
        descuento1 = (subtotal * 0.20);
        descuento2 = (subtotal * 0.05);
        montoFactura1 = (subtotal + (subtotal - descuento1)*0.12)+envio;
        montoFactura2 = (subtotal + (subtotal - descuento1)*0.12);
        System.out.println("Costo Iphones: " + iphoneCosto1);
        System.out.println("Costo Ipads. " + ipadCosto1);
        System.out.println("Subtotal: " + subtotal);
        System.out.println("Subtotal + IVA: " + subtotalIva);
        if (montoFactura1>1000)
            System.out.println("Descuento: " + descuento1);
        else
            System.out.println("Descuento: " + descuento2);
        if (subtotal < 5000)
            System.out.println("Envío: " + envio);
            System.out.println("Monto Factura: " + montoFactura1);
    }
    
}
