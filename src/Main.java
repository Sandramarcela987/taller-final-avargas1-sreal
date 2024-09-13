
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        int menu=0;
        int salir=0;
        do {
        System.out.println("************************************");
        System.out.println("|      Taller Programación         |");
        System.out.println("************************************");
        System.out.println("|         MENU Principal           |");
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
                    System.out.println("En Java existen ocho tipos de datos, también conocidos como tipos primitivos : byte, short, int, long, char, float, double y boolean. ");
                    System.out.println( "A partir de estos tipos de datos nosotros podemos clasificarlos en cuatro grupos:");
                    submenu();
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
                default:
                    System.out.println("Opción no válida. Inténtelo de nuevo.");
            }
        }
        while (salir==0);
    }


        public static String submenu () {
        int salir1=0;
        boolean regresar=true;
        while (regresar) {
        System.out.println("************************************");
        System.out.println("|      SUBMENU Datos Primitivos    |");
        System.out.println("************************************");
        System.out.println("| 1. Enteros                       |");
        System.out.println("| 2. Flotantes/Decimales           |");
        System.out.println("| 3. Caracter                      |");
        System.out.println("| 4. Boleanos                      |");
        System.out.println("| 5. Retornar Menu Pricipal        |");
        System.out.println("| 6. Salir                         |");
        System.out.println("************************************");

        System.out.println("Seleccione la opción que desea consultar");
        Scanner scanner1 = new Scanner(System.in);
        int number1 = scanner1.nextInt();

        //int salir1=0;

        switch (number1) {
            case 1:

                System.out.println("Enteros");
                System.out.println("Este grupo incluye byte, short, int y long.  ");
                System.out.println("Estos tipos de datos nos permiten trabajar con números enteros ya sean positivos o negativos.");
                System.out.println("Nombre	 bytes	 Rango ");
                System.out.println("long	    8	 –9,223,372,036,854,775,808 a 9,223,372,036,854,775,807 ");
                System.out.println("int	        4	 –2,147,483,648 a 2,147,483,647 ");
                System.out.println("short	    2	 –32,768 to 32,767");
                System.out.println("byte	    1	 –128 to 127");
                System.out.println("En la mayoria de los casos usaremos el tipo de dato int para números positivos.");
                System.out.println("Ejemplos:");
                System.out.println("byte diasMes = 31; //Aproximadamente  ");
                System.out.println("short diasLustro = (12 * 31) * 5;");
                System.out.println("int velocidadLuz = 299792458;");
                System.out.println("long añoLuz = velocidadLuz * 365; ");
                scanner1.nextLine();
                scanner1.nextLine();
                submenu();
                scanner1.nextLine();
                scanner1.nextLine();

                break;
            case 2:
                System.out.println("Flotantes/Decimales");
                System.out.println("Este grupo incluye float y double. Estos tipos de datos nos permiten trabajar con números los cuales posean punto decimal ya sean positivos o negativos.");
                System.out.println("\n" +
                        "Nombre\tbytes\tRango Apróximado\n" +
                        "double\t8\t4.9e–324 to 1.8e+308\n" +
                        "float\t4\t1.4e–045 to 3.4e+038 ");
                System.out.println(" Ejemplo:\n" +
                        "float pi = 3.1415926535f;\n" +
                        "double e = 2.718281828459045235360;");
                scanner1.nextLine();
                scanner1.nextLine();
                submenu();
                scanner1.nextLine();
                scanner1.nextLine();
                break;
            case 3:
                System.out.println("Caracter");
                System.out.println("En el grupo de caracteres únicamente encontraremos el tipo de dato char.\n " +
                        "Este tipo de datos nos permitirá trabajar con caracteres.");
                System.out.println("Ejemplos:\n " +
                        "char letraA = 'a';\n" +
                        "char letraANumerico = 61;");
                scanner1.nextLine();
                scanner1.nextLine();
                submenu();
                scanner1.nextLine();
                break;
            case 4:
                System.out.println("Boleanos");
                System.out.println("Al igual que el grupo de caracteres, en el grupo de booleanos únicamente encontraremos un tipo de dato, el boolean.\n" +
                        " Este tipo de datos nos permitirá trabajar con valores lógicos, verdadero o falso.\n" +
                        "Ejemplos:" +
                        "boolean verdadero = true;\n" +
                        "boolean falso = false;");
                scanner1.nextLine();
                scanner1.nextLine();
                submenu();
                scanner1.nextLine();
                break;
            case 5:
                regresar = false;
                break;
            case 6:
                salir1= 1;
                break;

            default:
                System.out.println("Opción no válida. Inténtelo de nuevo.");
                scanner1.nextLine();
            }
        }

        return "prueba";

    }

}