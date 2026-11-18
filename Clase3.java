import java.util.Scanner;
public class Clase3 {
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);

        //-----Ejercicios con ciclo for----- 
        System.out.println("¿Qué tabla deseas ver?");
        int tabla = sc.nextInt();

        for (int i = 1; i <=10; i++){
            System.out.println(tabla + "x" + i +" = " + (tabla*i));

        }


        //ciclo while 
        int contador = 0;
        double suma = 0; 
        System.out.println("Ingrese 0 para terminar: ");
        double precio = sc.nextDouble();

        while(precio != 0){
            suma += precio;
            contador++;
            System.out.println("Ingrese 0 para terminar: ");
            precio = sc.nextDouble();
        }
        System.out.println("contador: " + contador);
        System.out.printf("Total: %.2f%n", suma);
        

        //ciclo do while
        int edad;
        do {
            System.out.println("Ingresa una edad entre 18 y 50:");
            edad = sc.nextInt();
            System.out.println("Edad ingresada: " + edad);


        } while(edad < 18 || edad > 50);

        for (int n = 1; n <= 0; n++) {
            if (n%3 == 0) {
                continue;
                
            }
            System.out.println(n);
        }

        for (int n = 51; n <= 100; n++) {
            if (n%7 == 0) {
                System.out.println("Primer multiplo de 7 encontrado: " + n);
                break;   
            }
        }

        int k = 10; 
        while (k > 5){
            System.out.println(k);
            k--;
        }

        sc.close();
    }
}
