package ejemplos;
import java.util.Scanner;
public class Ejemplos {

    public static void EjemploIf(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite un número Entero");
        int numero = scanner.nextInt();
           // int numero = 3;
            if (numero > 0) {
                System.out.println("El número es positivo.");
            } else if (numero < 0) {
                System.out.println("El número es negativo.");
            } else {
                System.out.println("El número es cero.");
            }

    }

    public static void EjemploSwitch() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite un número de la semana: ");
        int dia = scanner.nextInt();
                //int dia = 3;
                String nombreDia;
                switch (dia) {
                    case 1:
                        nombreDia = "Lunes";
                        break;
                    case 2:
                        nombreDia = "Martes";
                        break;
                    case 3:
                        nombreDia = "Miércoles";
                        break;
                    case 4:
                        nombreDia = "Jueves";
                        break;
                    case 5:
                        nombreDia = "Viernes";
                        break;
                    case 6:
                        nombreDia = "Sábado";
                        break;
                    case 7:
                        nombreDia = "Domingo";
                        break;
                    default:
                        nombreDia = "Día inválido";
                        break;
                }

                System.out.println("El día de la semana es: " + nombreDia);



    }

    public static void EjemploTernaria() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite un número Entero");
        int numero = scanner.nextInt();
        String resultado = (numero % 2 == 0) ? "El número es par" : "El número es impar"; // Mostrar el resultado
        System.out.println(resultado);

    }

    public static void EjemploDoWhile() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite un número inicial:");
        int valor = scanner.nextInt();

                do {
                    System.out.println("Valor: " + valor);
                    valor++;
                } while (valor <= 5);

    }


    public static void EjemploWhile() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite un número inicial:");
        int num = scanner.nextInt();

                while (num <= 5) {
                    System.out.println("Contador: " + num);
                    num++;
                }

    }

    public static void EjemploFor() {

        for (int num1 = -5; num1 <= 5; num1++) {
            System.out.println("Numero: " + num1);
        }


    }


}