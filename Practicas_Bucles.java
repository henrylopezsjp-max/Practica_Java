import java.util.Scanner;
public class Practicas_Bucles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //---ciclos for ejercicios---
        //1.
        /*for (int i = 1; i <= 20; i++){
            System.out.println(i);
        }

        //2.
        System.out.println("Numeros pares del 1 al 20:");
        for (int i = 1; i <= 20; i++){
            if (i%2 == 0){
                System.out.println(i);

            } 
        }

        //3.
        System.out.println("Cuenta regresesiva del 10 al 1 para despegue:");
        for (int i = 10; i >=0 ; i--){
            System.out.println(i);
           
        }
        System.out.println("¡¡Despegue!!");


        //4.
        System.out.println("Tablas de multplicar del 1 al 10: ");
        System.out.println("¿Qué tabla deseas?");
        double tabla = sc.nextDouble();

        if (tabla > 10){
            System.out.println("Dato invalido");
        }else{

            for (int i =1; i <=10; i++){
            System.out.printf("%.2f%n",(tabla * i));     
        }
        System.out.println("Gracias por usar la creadora de tablas :D");
        }

        //5.
        System.out.println("Suma del 1 al 100: ");
        int suma = 0;  
        for (int n = 1; n <=100; n++){
            suma += n;
        }
        System.out.println(suma);


        //6.
        System.out.println("Multiplos de 5 de 1 a 100:");
        int b = 5;
        for (int i = 1; i <=100; i++){
            if (i%b == 0){
                System.out.println(i + " es multiplo de 5 :D");
            }else {
                i++;
            }
        }

        //7.
        int k = 9;
        for (int i = 100; i <=200 ;i++){
            if (i%k ==0){
                System.out.println("Primer multiplo de 9 despues de 100: " + i);
                break;
            }
        }*/
        

        //8.
        System.out.println("Promedio con dos decimales:");
        
        double sumaprecios = 0;
        for (int i = 0; i < 5; i++){
            System.out.println("Ingresa un precio:");
            int precio = sc.nextInt();
            sumaprecios += precio;
        }
        System.out.println("Total suma: "+ sumaprecios);
        System.out.printf("Promedio: %.2f%n",(sumaprecios/5));
        

        
    sc.close();
    }

}


