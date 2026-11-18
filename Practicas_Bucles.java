import java.util.Scanner;
public class Practicas_Bucles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //---ciclos for ejercicios---
        //1.
        System.out.println("Numeros del 1 al 20:");
        for (int i = 1; i <= 20; i++){
            System.out.println(i);
        }

        //2.
        System.out.println("Numeros pares del 1 al 20:");
        for (int i = 1; i <= 20; i++){
            if (i%2 == 0){
                System.out.println("Numeros pares del 1 al 20:");
                System.out.println(i);

            } 
        }
    
        sc.close();
    }

}


