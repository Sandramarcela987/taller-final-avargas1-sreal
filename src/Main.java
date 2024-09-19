import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int salir = 0;
        Scanner scanner = new Scanner(System.in);

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
            System.out.println("| 5. Condicional: IF, ELSE, IF ELSE|");
            System.out.println("| 6. Condicional Switch            |");
            System.out.println("| 7. Condicional ternaria          |");
            System.out.println("| 8. Bucle Do While                |");
            System.out.println("| 9. Bucle While                   |");
            System.out.println("| 10. Bucle For                    |");
            System.out.println("| 11. Salir                        |");
            System.out.println("************************************");

            System.out.print("Seleccione la opción que desea consultar: ");
            int number = scanner.nextInt();

            switch (number) {
                case 1:
                    System.out.println("Datos primitivos");
                    System.out.println("En Java existen ocho tipos de datos primitivos: byte, short, int, long, char, float, double y boolean.");
                    System.out.println("A partir de estos tipos de datos, se pueden clasificar en cuatro grupos:");
                    submenuDatosPrimitivos(scanner);
                    break;
                case 2:
                    System.out.println("String:");
                    System.out.println("Es una secuencia de caracteres que se utiliza para representar texto.");
                    System.out.println("Los strings son objetos, lo que significa que tienen propiedades y métodos para manipularlos");
                    System.out.println("Los strings se pueden crear con comillas simples o dobles y se pueden acceder a sus elementos por su posición en la cadena");
                    scanner.nextLine();
                    scanner.nextLine();
                    break;
                case 3:
                    System.out.println("Constantes:");
                    System.out.println("En Java, una constante es un valor que no cambia durante la\n" +
                            "ejecución del programa. Las constantes se utilizan para\n" +
                            "representar valores fijos y de lectura única, lo que ayuda a que\n" +
                            "el código sea más legible y menos propenso a errores. Las\n" +
                            "constantes en Java se declaran usando la palabra clave final.");
                    scanner.nextLine();
                    scanner.nextLine();
                    break;
                case 4:
                    System.out.println("Tipo de Operadores");
                    submenuTiposOperadores(scanner);
                    break;
                case 5:
                    System.out.println("Condicional: IF, ELSE, IF ELSE");
                    System.out.println("El flujo de ejecución en Java es lineal por lo que se va ejecutando línea a línea en el orden en el que se va leyendo\n " +
                                        "por lo que las sentencias para controlar el flujo de ejecución son la base ya que permiten ejecutar partes del código en base a condiciones\n ");
                    System.out.println("La estructura condicional más simple en Java es el if, se evalúa una condición y en caso de que se cumpla se ejecuta el contenido entre las llaves {} \n" +
                                        "o en caso de que se omitan se ejecuta el código hasta el primer «;» por lo tanto si no se usan los {} la condición aplica solo a la siguiente instrucción al if.\n");
                    System.out.println("Con el if solo podemos hacer que se ejecute un fragmento de código o no pero en el caso de que no se cumpla la condición no se hace nada (sigue el flujo normal de ejecución)\n" +
                                        "por lo que si queremos que se ejecute otra cosa cuando no se cumpla la condición solo con el if tenemos que hacer otro con la condición inversa provocando que se tenga que comprobar la condición 2 veces\n " +
                                        "mientras que si usamos el else solo necesitamos hacer la comprobación una sola vez.");
                    scanner.nextLine();
                    scanner.nextLine();
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
                    scanner.nextLine();
                    scanner.nextLine();
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
                    scanner.nextLine();
                    scanner.nextLine();
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
                    scanner.nextLine();
                    scanner.nextLine();
                    break;

                case 9:
                    System.out.println("********************************************************************************");
                    System.out.println("|                            Bucle While                                       |");
                    System.out.println("********************************************************************************");
                    System.out.println("|Un bucle while es una estructura de control en programación que repite un     |");
                    System.out.println("|bloque de código mientras una condición se evalúe como verdadera.             |");
                    System.out.println("|EJEMPLO");
                    System.out.println("********************************************************************************");
                    scanner.nextLine();
                    scanner.nextLine();
                    break;

                case 10:
                    System.out.println("********************************************************************************");
                    System.out.println("|                            Bucle For                                         |");
                    System.out.println("********************************************************************************");
                    System.out.println("|Un bucle FOR es una estructura de control que permite repetir un bloque de    |");
                    System.out.println("|código un número específico de veces. Se utiliza en programación para         |");
                    System.out.println("|automatizar tareas y procesar datos de manera eficiente.                      |");
                    System.out.println("********************************************************************************");
                    scanner.nextLine();
                    scanner.nextLine();
                    break;

                case 11:
                    salir = 1;
                    break;
                default:
                    System.out.println("Opción no válida. Inténtelo de nuevo.");
                    scanner.nextLine();
                    scanner.nextLine();
            }
        } while (salir == 0);

        scanner.close(); // Cerrar el escáner
    }

    public static void submenuDatosPrimitivos(Scanner scanner) {
        int salir1 = 0;
        do {
            System.out.println("************************************");
            System.out.println("|      SUBMENU Datos Primitivos    |");
            System.out.println("************************************");
            System.out.println("| 1. Enteros                       |");
            System.out.println("| 2. Flotantes/Decimales           |");
            System.out.println("| 3. Caracter                      |");
            System.out.println("| 4. Booleanos                     |");
            System.out.println("| 5. Retornar al Menu Principal    |");
            System.out.println("************************************");

            System.out.print("Seleccione la opción que desea consultar: ");
            int number1 = scanner.nextInt();

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
                    scanner.nextLine();
                    scanner.nextLine();
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
                    scanner.nextLine();
                    scanner.nextLine();
                    break;
                case 3:
                    System.out.println("Caracter");
                    System.out.println("En el grupo de caracteres únicamente encontraremos el tipo de dato char.\n " +
                            "Este tipo de datos nos permitirá trabajar con caracteres.");
                    System.out.println("Ejemplos:\n " +
                            "char letraA = 'a';\n" +
                            "char letraANumerico = 61;");
                    scanner.nextLine();
                    scanner.nextLine();
                    break;
                case 4:
                    System.out.println("Boleanos");
                    System.out.println("Al igual que el grupo de caracteres, en el grupo de booleanos únicamente encontraremos un tipo de dato, el boolean.\n" +
                            "Este tipo de datos nos permitirá trabajar con valores lógicos, verdadero o falso.\n" +
                            "Ejemplos:" +
                            "boolean verdadero = true;\n" +
                            "boolean falso = false;");
                    scanner.nextLine();
                    scanner.nextLine();
                    break;
                case 5:
                    salir1 = 1; // Regresar al menú principal
                    break;

                default:
                    System.out.println("Opción no válida. Inténtelo de nuevo.");
                    scanner.nextLine();
                    scanner.nextLine();
            }
        } while (salir1 == 0);
    }

    public static void submenuTiposOperadores(Scanner scanner) {
        int salir2 = 0;
        do {
            System.out.println("************************************");
            System.out.println("|    SUBMENU Tipos de Operadores   |");
            System.out.println("************************************");
            System.out.println("| 1. Aritméticos                   |");
            System.out.println("| 2. Relacionales                  |");
            System.out.println("| 3. Lógicos                       |");
            System.out.println("| 4. Asignación                    |");
            System.out.println("| 5. Incremento/Decremento         |");
            System.out.println("| 6. Retornar al Menu Principal    |");
            System.out.println("************************************");

            System.out.print("Seleccione la opción que desea consultar: ");
            int number2 = scanner.nextInt();

            switch (number2) {
                case 1:
                    System.out.println(" Los operadores aritméticos en Java son los siguientes:\n" +
                            "Suma: (+)\n" +
                            "Resta: (–)\n" +
                            "Multiplicación: (*)\n" +
                            "División: (/)\n" +
                            "Módulo: (%)\n" +
                            "Estas herramientas nos permiten realizar operaciones matemáticas básicas con facilidad.\n " +
                            "Se utilizan para manipular tipos de datos numéricos y producir resultados que pueden asignarse a variables o utilizarse en expresiones");
                    scanner.nextLine();
                    scanner.nextLine();
                    //submenuTiposOperadores(scanner);
                    break;
                case 2:
                    System.out.println("Operadores Relacionales: Permiten comparar variables según relación de igualdad/desigualdad o relacción mayor/menor.\n " +
                            "Devuelven siempre un valor boolean.\n" +
                            "'>': Mayor que\n" +
                            "'<': Menor que\n" +
                            "'==': Iguales\n" +
                            "'¡=': Distintos\n" +
                            "'>=': Mayor o igual que\n" +
                            "'<=': Menor o igual que");
                    scanner.nextLine();
                    scanner.nextLine();
                    break;
                case 3:
                    System.out.println("Operadores Lógicos: Nos permiten construir expresiones lógicas.\n" +
                            "'&&' : devuelve true si ambos operandos son true.\n" +
                            "'||' : devuelve true si alguno de los operandos son true.\n" +
                            "'!' : Niega el operando que se le pasa.\n" +
                            "'&' : devuelve true si ambos operandos son true, evaluándolos ambos.\n" +
                            "'|' : devuelve true uno de los operandos es true, evaluándolos ambos.");
                    scanner.nextLine();
                    scanner.nextLine();
                    break;
                case 4:
                    System.out.println("Operadores de Asignación: El principal es '=' pero hay más operadores de asignación con distintas funciones que explicamos brevemente ahora.\n" +
                            "'+=' : op1 += op2 à op1 = op1 + op2\n" +
                            "'-=' : op1 -= op2 à op1 = op1 - op2\n" +
                            "'*=' : op1 *= op2 à op1 = op1 * op2\n" +
                            "'/=' : op1 /= op2 à op1 = op1 / op2\n" +
                            "'%=' : op1 %= op2 à op1 = op1 % op2");
                    scanner.nextLine();
                    scanner.nextLine();
                    break;
                case 5:
                    System.out.println("Operadores Incrementales: Son los operadores que nos permiten incrementar las variables en una unidad. \n" +
                            "Se pueden usar delante y detrás de la variable dependiendo de lo que queramos,\n " +
                            "es decir, si queremos que incremente o viceversa antes de utilizar o lo contrario.\n" +
                            "'++'\n" +
                            "'--'");
                    scanner.nextLine();
                    scanner.nextLine();
                    break;
                case 6:
                    salir2 = 1; // Regresar al menú principal
                    break;
                default:
                    System.out.println("Opción no válida. Inténtelo de nuevo.");
                    scanner.nextLine();
                    scanner.nextLine();

                    break;
            }
        } while (salir2 == 0);
    }
}
