import java.util.Scanner;
public class Clase1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        

        System.out.println("Pequeño calculo de IVA");
        final double IVA = 0.12; 

        System.out.print("Ingresa una cantidad: ");
        double cantidad = scanner.nextDouble();
        double iva = cantidad * IVA;
        System.out.println("El IVA es: " + iva);


        scanner.close();

    }
}