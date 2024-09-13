
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
                    System.out.println("Escoja la opcion a consultar");{

                    switch (number) {
                        case 12:
                            System.out.println("Datos primitivos");
                            System.out.println("explicacion dato primario");
                            scanner1.nextLine();
                            scanner1.nextLine();
                            break;
                    }
                }
                    scanner1.nextLine();
                    scanner1.nextLine();
                    break;

                case 6:
                    System.out.println("********************************************************************************");
                    System.out.println("|                         Condicional Switch                                   |");
                    System.out.println("********************************************************************************");
                    System.out.println("|El condicional switch case es una estructura que evalúa más de un caso y se   |");
                    System.out.println("|caracteriza por: Selección de una opción entre varias                         |");
                    System.out.println("|Switch recibe un “caso” y lo evalúa hasta encontrar el caso que corresponda   |");
                    System.out.println("|Se puede usar la opción “default” para cuando no se encuentra el caso dado.   |");
                    System.out.println("|EJEMPLO");
                    System.out.println("********************************************************************************");
                    scanner1.nextLine();
                    scanner1.nextLine();
                    break;

                    case 7:
                    System.out.println("********************************************************************************");
                    System.out.println("|                         Condicional Ternaria                                 |");
                    System.out.println("********************************************************************************");
                    System.out.println("|Es una estructura de control que permite evaluar una condición y retornar un  |");
                    System.out.println("|valor en función de esa condición. El operador ternario se llama así  porque, |");
                    System.out.println("|en general, es el único operador de un lenguaje que tiene tres parámetros.    |");
                    System.out.println("|EJEMPLO");
                    System.out.println("********************************************************************************");
                    scanner1.nextLine();
                    scanner1.nextLine();
                    break;

                case 8:
                    System.out.println("********************************************************************************");
                    System.out.println("|                            Bucle Do While                                    |");
                    System.out.println("********************************************************************************");
                    System.out.println("|Es una estructura de control que permite que un bloque de código se ejecute   |");
                    System.out.println("|repetidamente mientras se cumpla cierta condición expresada en la cláusula    |");
                    System.out.println("|while.                                                                        |");
                    System.out.println("|EJEMPLO");
                    System.out.println("********************************************************************************");
                    scanner1.nextLine();
                    scanner1.nextLine();
                    break;

                case 9:
                    System.out.println("********************************************************************************");
                    System.out.println("|                            Bucle While                                       |");
                    System.out.println("********************************************************************************");
                    System.out.println("|Un bucle while es una estructura de control en programación que repite un     |");
                    System.out.println("|bloque de código mientras una condición se evalúe como verdadera.             |");
                    System.out.println("|EJEMPLO");
                    System.out.println("********************************************************************************");
                    scanner1.nextLine();
                    scanner1.nextLine();
                    break;

                case 10:
                    System.out.println("********************************************************************************");
                    System.out.println("|                            Bucle For                                         |");
                    System.out.println("********************************************************************************");
                    System.out.println("|Un bucle FOR es una estructura de control que permite repetir un bloque de    |");
                    System.out.println("|código un número específico de veces. Se utiliza en programación para         |");
                    System.out.println("|automatizar tareas y procesar datos de manera eficiente.                      |");
                    System.out.println("********************************************************************************");
                    scanner1.nextLine();
                    scanner1.nextLine();
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
        System.out.println("|      CONSTANTES                  |");
        System.out.println("************************************");
        return "prueba";

    }
}