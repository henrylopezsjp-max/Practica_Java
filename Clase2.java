import java.util.Scanner;
public class Clase2 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Instrucciones para pedir algo en consola
        System.out.println("Ingrese un numero entero:");
        int numero = sc.nextInt();
        System.out.println("El numero ingresado es: " + numero);


        System.out.println("Ingrese un numero decimal: ");
        double decimal = sc.nextDouble();
        System.out.println("El decimal ingresado es: " + decimal);

        System.out.println("Ingrea una cadena de texto: ");
        sc.nextLine(); // Limpiar el buffer
        String texto = sc.nextLine();
        System.out.println("Texto ingresado: " + texto);

        System.out.println("Ingrese una letra:");
        char letra = sc.next().charAt(0);
        System.out.println("Letra ingresada:" + letra);

        System.out.println("Ingres un valor booleano (true/false): ");
        boolean datoboleano = sc.nextBoolean();
        System.out.println("El booleano ingresado es: " + datoboleano);

        //----Condicionales----
        System.out.println("Ingresa tu edad: ");
        int dato1 = sc.nextInt();

        if (dato1 >= 18) {
            System.out.println("Eres mayor de edad.");
        } else {
            System.out.println("Eres menor de edad.");
        }

        System.out.println("Ingres un numero: ");
        int num1 = sc.nextInt();
        System.out.println("Ingrese otro numero: ");
        int num2 = sc.nextInt();

        if (num1 != num2) {
            System.out.println("Los numeros son diferentes.");
        } else {
            System.out.println("Los numeros son iguales.");
        }

        // Distinciones con strings
        sc.nextLine(); // limpiar buffer
        System.out.println("Ingrese un dia de la semana (Lunes - Domingo): ");
        String dia = sc.nextLine();
        System.out.println("Ingrese otro dia de la semana (Lunes - Domingo): ");
        String dia2 = sc.nextLine();


        if (dia.equals(dia2)){
            System.out.println("Los dias ingresados son iguales.");
        } else {
            System.out.println("Los dias ingresados son diferenes.");
        }

            // --- Intruccion a switch ---

            System.out.println("Selecciona una opcion del (1-3): ");
            int opcion = sc.nextInt();
            switch (opcion) {
                case 1:

                    System.out.println("Opcion 1 seleccionada.");
                    System.out.println("Ingresa un numero: ");
                    int data1 = sc.nextInt();
                    System.out.println("Ingresa otro numero: ");
                    int data2 = sc.nextInt();

                    if (data1 != data2){
                        System.out.println("Los numeros son diferentes.");
                    } else {
                        System.out.println("Los numeros son iguales.");
                    }
                    break;         

                case 2:
                    System.out.println("Opcion 2 seleccionada.");
                    System.out.println("---- Mini sumatoria ----");
                    System.out.println("Ingresa un numero entero: ");
                    int plus1 = sc.nextInt();
                    System.out.println("Ingresa otro numero entero: ");
                    int plus2 = sc.nextInt();

                    if (plus1 != plus2){
                        System.out.println("Los nuemros son diferentes.");
                        int suma = plus1 + plus2;
                        System.out.println("La suma es: " + suma);

                    } else {
                        System.out.println("Los numeros son iguales.");
                    }
                    break;

                case 3:
                    System.out.println("Opcion 3 seleccionada.");
                    System.out.println("Ingresa un texto: ");
                    sc.nextLine();
                    String text1 = sc.nextLine();
                    System.out.println("Minúsculas: " + text1.toLowerCase());
                    System.out.println("Mayúsculas: " + text1.toUpperCase());
                    break;

                default:
                    System.out.println("Opcion invalida.");
                    break;
            }

       sc.close();
    }
}
