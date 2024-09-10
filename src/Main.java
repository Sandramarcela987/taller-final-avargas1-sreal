
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        int menu=0;
        int salir=0;
        do {
        System.out.println("************************************");
        System.out.println("|      Taller Programación         |");
        System.out.println("************************************");
        System.out.println("|            MENU                  |");
        System.out.println("************************************");
        System.out.println("| 1. Datos primitivos              |");
        System.out.println("| 2. String                        |");
        System.out.println("| 3. Constantes                    |");
        System.out.println("| 4. Tipo de operadores            |");
        System.out.println("| 5. Condicional: IF,ELSE,IF ELSE  |");
        System.out.println("| 6. Condicional Switch            |");
        System.out.println("| 7. Condicioanal ternaria         |");
        System.out.println("| 8. Bucle Do While                |");
        System.out.println("| 9. Bucle While                   |");
        System.out.println("| 10. Bucle For                    |");
        System.out.println("| 11. Salir                        |");
        System.out.println("************************************");



        System.out.println("Seleccione la opción que desea consultar");
        Scanner scanner1 = new Scanner(System.in);
        int number = scanner1.nextInt();


            switch (number) {
                case 1:
                    System.out.println("Datos primitivos");
                    System.out.println("explicacion dato primario");
                    scanner1.nextLine();
                    scanner1.nextLine();

                    break;
                case 2:
                    System.out.println("String");

                    scanner1.nextLine();
                    scanner1.nextLine();
                    break;
                case 3:
                    submenu();
                    System.out.println("Constantes");
                    scanner1.nextLine();
                    scanner1.nextLine();
                    break;
                case 4:
                    System.out.println("Tipo de operadores");
                    break;
                case 5:
                    System.out.println("Tipo de operadores");
                    break;
                case 11:
                    salir=1;
                    break;
            }
        }
        while (salir==0);
    }

    public static String submenu() {
        System.out.println("************************************");
        System.out.println("|      SUBMENU                     |");
        System.out.println("************************************");

        return "prueba";

    }
}