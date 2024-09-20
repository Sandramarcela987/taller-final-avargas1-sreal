package ejemplos;

public class Ejemplos {

    public static void EjemploSwitch() {
        System.out.println("| switch (expression) {                                                        |\n" +
                "|   case value1:                                                               |\n" +
                "|    // secuencia de sentencias.                                               |\n" +
                "|    break;                                                                    |\n" +
                "|   case value2:                                                               |\n" +
                "|    // secuencia de sentencias.                                               |\n" +
                "|    break;                                                                    |\n" +
                "|   .                                                                          |\n" +
                "|   .                                                                          |\n" +
                "|   .                                                                          |\n" +
                "|   case valueN :                                                              |\n" +
                "|    // secuencia de sentencias.                                               |\n" +
                "|    break;                                                                    |\n" +
                "|   default:                                                                   |\n" +
                "|    // Default secuencia de sentencias.x                                      |\n" +
                "| }                                                                            |");

    }

    public static void EjemploTernaria() {
        System.out.println("|  int vble1 = 5;                                                             |\n" +
                "|  int vble2 = 4;                                                              |\n" +
                "|  int mayor;                                                                  |\n" +
                "|                                                                              |\n" +
                "|  mayor = (vble1 > vble2)?vble1:vble2;                                        |\n" +
                "|                                                                              |\n" +
                "|  System.out.println(\"El mayor de los dos números es \" + mayor);              |");

    }

    public static void EjemploDoWhile() {
        System.out.println("|   int i = 1;                                                                 |\n" +
                "|  do {                                                                        |\n" +
                "|      System.out.println(i);                                                  |\n" +
                "|      i++;                                                                    |\n" +
                "|  } while (i <= 10);                                                          |");
    }


    public static void EjemploWhile() {
        System.out.println("| while (condición) {                                                          |\n" +
                "|    // bloque de código a ejecutar mientras se cumpla la condición            |\n" +
                "|}                                                                             |");

    }

    public static void EjemploFor() {
        System.out.println("|for (int i = 1; i <= 10; i++) {                                               |\n" +
                "|    System.out.println(i);                                                    |\n" +
                "|}                                                                             |");

    }
}