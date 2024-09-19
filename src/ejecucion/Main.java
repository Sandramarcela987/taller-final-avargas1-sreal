package ejecucion;

import ejemplos.Ejemplos;
import menu.MenuPrincipal;
import menu.SubMenus;

import java.awt.*;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int salir = 0;
        Scanner scanner = new Scanner(System.in);

        do {

            MenuPrincipal.MenuPrincipal();

            System.out.print("Seleccione la opción que desea consultar: ");
            int number = scanner.nextInt();

            switch (number) {
                case 1:
                    System.out.println("********************************************************************************");
                    System.out.println("|                        Datos primitivos                                       ");
                    System.out.println("********************************************************************************");
                    System.out.println("|En Java existen ocho tipos de datos primitivos: byte, short, int, long, char, |");
                    System.out.println("|float, double y boolean. A partir de estos tipos de datos, se pueden          |");
                    System.out.println("|clasificar en cuatro grupos:                                                  |");
                    System.out.println("********************************************************************************");

                    submenuDatosPrimitivos(scanner);
                    break;
                case 2:
                    System.out.println("**********************************************************************************");
                    System.out.println("                              String                                              ");
                    System.out.println("**********************************************************************************");
                    System.out.println("|Es una secuencia de caracteres que se utiliza para representar texto.Los strings|");
                    System.out.println("|son objetos, lo que significa que tienen propiedades y métodos para manipularlos|");
                    System.out.println("|Los strings se pueden crear con comillas simples o dobles y se pueden acceder a |");
                    System.out.println("|sus elementos por su posición en la cadena                                      |");
                    System.out.println("**********************************************************************************");

                    scanner.nextLine();
                    scanner.nextLine();
                    break;
                case 3:
                    System.out.println("************************************************************************************");
                    System.out.println("                                   Constantes                                       ");
                    System.out.println("************************************************************************************");
                    System.out.println("|En Java, una constante es un valor que no cambia durante la ejecución del programa|");
                    System.out.println("|Las constantes se utilizan para representar valores fijos y de lectura única, lo  |");
                    System.out.println("|que ayuda a queel código sea más legible y menos propenso a errores.Las constantes|");
                    System.out.println("|en Java se declaran usando la palabra clave final.                                |");
                    System.out.println("************************************************************************************");

                    scanner.nextLine();
                    scanner.nextLine();
                    break;

                case 4:
                    System.out.println("************************************************************************************");
                    System.out.println("                           Tipo de Operadores"                                       );
                    System.out.println("************************************************************************************");
                    submenuTiposOperadores(scanner);
                    break;

                case 5:
                    System.out.println("*****************************************************************************************************************");
                    System.out.println("                      Condicional: IF, ELSE, IF ELSE                                                             ");
                    System.out.println("*****************************************************************************************************************");
                    System.out.println("|El flujo de ejecución en Java es lineal por lo que se va ejecutando línea a línea en el orden en el que se     |");
                    System.out.println("|ejecutar partes del código en base a condiciones, La estructura condicional más simple en Java es el if se     |");
                    System.out.println("|evalua una condición y en caso de que se cumpla se ejecuta el contenido entre las llaves o en caso de que se   |");
                    System.out.println("|omitan se ejecuta el código hasta el primer «;» por lo tanto si no se usan los {} la condiciónaplica solo      |");
                    System.out.println("|a la siguiente instrucción al if. Con el if solo podemos hacer que se ejecute un fragmento de código o no pero |");
                    System.out.println("|en el caso de que no se cumpla la condición no se hace nada (sigue el flujo normal de ejecución)por lo que si  |");
                    System.out.println("|queremos que se ejecute otra cosa cuando no se cumpla la condición solo con el if tenemos que hacer otro con   |");
                    System.out.println("|la condición inversa provocando que se tenga que comprobar la condición 2 veces mientras que si usamos el else |");
                    System.out.println("|solo necesitamos hacer la comprobación una sola vez.                                                           |");
                    System.out.println("*****************************************************************************************************************");
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
                    Ejemplos.EjemploSwitch();
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
                    Ejemplos.EjemploTernaria();
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
                    Ejemplos.EjemploDoWhile();
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
                    Ejemplos.EjemploWhile();
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
                    Ejemplos.EjemploFor();
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

            SubMenus.SubMenuDatosPrimitivos();

            System.out.print("Seleccione la opción que desea consultar: ");
            int number1 = scanner.nextInt();

            switch (number1) {
                case 1:
                    System.out.println("********************************************************************************");
                    System.out.println("                                   Enteros                                      ");
                    System.out.println("********************************************************************************");
                    System.out.println("|Este grupo incluye byte, short, int y long.                                   |");
                    System.out.println("|Estos tipos de datos nos permiten trabajar con números enteros ya sean        |");
                    System.out.println("|positivos o negativos.                                                        |");
                    System.out.println("|------------------------------------------------------------------------------|");
                    System.out.println("|Nombre    | bytes	| Rango                                                    |");
                    System.out.println("|long	   | 8	    | –9,223,372,036,854,775,808 a 9,223,372,036,854,775,807   |");
                    System.out.println("|int	   | 4	    |–2,147,483,648 a 2,147,483,647                            |");
                    System.out.println("|short	   | 2	    | –32,768 to 32,767                                        |");
                    System.out.println("|byte	   | 1	    |–128 to 127                                               |");
                    System.out.println("|------------------------------------------------------------------------------|");
                    System.out.println("|En la mayoria de los casos usaremos el tipo de dato int para números positivos|");
                    System.out.println("|Ejemplos:                                                                     |");
                    System.out.println("|byte diasMes = 31; //Aproximadamente                                          |");
                    System.out.println("|short diasLustro = (12 * 31) * 5;                                             |");
                    System.out.println("|int velocidadLuz = 299792458;                                                 |");
                    System.out.println("|long añoLuz = velocidadLuz * 365;                                             |");
                    System.out.println("********************************************************************************");
                    scanner.nextLine();
                    scanner.nextLine();
                    break;

                case 2:
                    System.out.println("********************************************************************************");
                    System.out.println("                                Flotantes/Decimales                             ");
                    System.out.println("********************************************************************************");
                    System.out.println("|Este grupo incluye float y double. Estos tipos de datos nos permiten trabajar |");
                    System.out.println("|con números los cuales posean punto decimal ya sean positivos o negativos.    |");
                    System.out.println("|------------------------------------------------------------------------------|");
                    System.out.println("|Nombre    | bytes	| Rango                                                    |");
                    System.out.println("|double    | 8      | 4.9e–324 to 1.8e+308                                     |");
                    System.out.println("|float     |4       | 1.4e–045 to 3.4e+038                                     |");
                    System.out.println("|------------------------------------------------------------------------------|");
                    System.out.println("|Ejemplo:                                                                      |");
                    System.out.println("|float pi = 3.1415926535f                                                      |");
                    System.out.println("|double e = 2.718281828459045235360                                            |");
                    System.out.println("********************************************************************************");

                    scanner.nextLine();
                    scanner.nextLine();
                    break;
                case 3:
                    System.out.println("********************************************************************************");
                    System.out.println("                             Caracter                                           ");
                    System.out.println("********************************************************************************");
                    System.out.println("|En el grupo de caracteres únicamente encontraremos el tipo de dato char       |");
                    System.out.println("|Este tipo de datos nos permitirá trabajar con caracteres.                     |");
                    System.out.println("|Ejemplos:                                                                     |");
                    System.out.println("|char letraA = 'a'                                                             |");
                    System.out.println("|char letraANumerico = 61                                                      |");
                    System.out.println("********************************************************************************");
                    scanner.nextLine();
                    scanner.nextLine();
                    break;
                case 4:
                    System.out.println("********************************************************************************");
                    System.out.println("                             Boleanos"                                           );
                    System.out.println("********************************************************************************");
                    System.out.println("|Al igual que el grupo de caracteres, en el grupo de booleanos únicamente      |");
                    System.out.println("1encontraremos un tipo de dato, el boolean.Este tipo de datos nos permitirá    |");
                    System.out.println("|trabajar con valores                                                          |");
                    System.out.println("|lógicos, verdadero o falso                                                    |");
                    System.out.println("|Ejemplos:                                                                     |");
                    System.out.println("|boolean verdadero = true                                                      |");
                    System.out.println("|boolean falso = false;                                                        |");
                    System.out.println("********************************************************************************");

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

            SubMenus.SubMenuTipoOperadores();

            System.out.print("Seleccione la opción que desea consultar: ");
            int number2 = scanner.nextInt();

            switch (number2) {
                case 1:
                    System.out.println("****************************************************************************************");
                    System.out.println("|Los operadores aritméticos en Java son los siguientes:                                |");
                    System.out.println("| - Suma                                                                               |");
                    System.out.println("| - Resta                                                                              |");
                    System.out.println("| - Multiplicación                                                                     |");
                    System.out.println("| - División                                                                           |");
                    System.out.println("| - Módulo                                                                             |");
                    System.out.println("|Estas herramientas nos permiten realizar operaciones matemáticas básicas con facilidad|");
                    System.out.println("|Se utilizan para manipular tipos de datos numéricos y producir resultados que pueden  |");
                    System.out.println("|asignarse a variables o utilizarse en expresiones                                     |");
                    System.out.println("****************************************************************************************");





                    scanner.nextLine();
                    scanner.nextLine();
                    //submenuTiposOperadores(scanner);
                    break;
                case 2:
                    System.out.println("*********************************************************************************************");
                    System.out.println("Operadores Relacionales: Permiten comparar variables según relación de igualdad/desigualdad |");
                    System.out.println("|o relacción mayor/menor. Devuelven siempre un valor boolean.                               |");
                    System.out.println("|'>': Mayor que                                                                             |");
                    System.out.println("|'<': Menor que                                                                             |");
                    System.out.println("|'==': Iguales                                                                              |");
                    System.out.println("|'¡=': Distintos                                                                            |");
                    System.out.println("|'>=': Mayor o igual que                                                                    |");
                    System.out.println("|'<=': Menor o igual que                                                                    |");
                    System.out.println("*********************************************************************************************");

                    scanner.nextLine();
                    scanner.nextLine();
                    break;
                case 3:
                    System.out.println("********************************************************************************");
                    System.out.println("|Operadores Lógicos: Nos permiten construir expresiones lógicas.               |");
                    System.out.println("|'&&' : devuelve true si ambos operandos son true                              |");
                    System.out.println("|'||' : devuelve true si alguno de los operandos son true                      |");
                    System.out.println("|'!' : Niega el operando que se le pasa.                                       |");
                    System.out.println("|'&' : devuelve true si ambos operandos son true, evaluándolos ambos.          |");
                    System.out.println("|'|' : devuelve true uno de los operandos es true, evaluándolos ambos.         |");
                    System.out.println("********************************************************************************");

                    scanner.nextLine();
                    scanner.nextLine();
                    break;
                case 4:
                    System.out.println("*************************************************************************************");
                    System.out.println("Operadores de Asignación: El principal es '=' pero hay más operadores de asignación |");
                    System.out.println("|con distintas funciones que explicamos brevemente ahora                            |");
                    System.out.println("|'+=' : op1 += op2 à op1 = op1 + op2                                                |");
                    System.out.println("|'-=' : op1 -= op2 à op1 = op1 - op2                                                |");
                    System.out.println("|'*=' : op1 *= op2 à op1 = op1 * op2                                                |");
                    System.out.println("|'/=' : op1 /= op2 à op1 = op1 / op2                                                |");
                    System.out.println("|'%=' : op1 %= op2 à op1 = op1 % op2                                                |");
                    System.out.println("*************************************************************************************");

                    scanner.nextLine();
                    scanner.nextLine();
                    break;
                case 5:
                    System.out.println("********************************************************************************************************");
                    System.out.println("|Operadores Incrementales: Son los operadores que nos permiten incrementar las variables en una unidad.|");
                    System.out.println("|Se pueden usar delante y detrás de la variable dependiendo de lo que queramos es decir, si queremos   |");
                    System.out.println("|que incremente o viceversa antes de utilizar o lo contrario                                           |");
                    System.out.println("|'++'                                                                                                  |");
                    System.out.println("|'--'                                                                                                  |");
                    System.out.println("********************************************************************************************************");
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
