package co.edu.sena.miscelanea;

import java.util.Scanner;

/**
 * Menu y submenu
 *
 */
public class Main {
    public static void main(String[] args) {

        System.out.println("-------- MENÚ DE OPCIONES --------");
        System.out.println("Escoge alguna de las siguientes opciones");
        System.out.println("1. Operadores");
        System.out.println("2. Condicionales");
        System.out.println("3. Ciclos");
        System.out.println("4. Arreglos");
        System.out.println("99. Salir");

        System.out.println("Selecciona una opción: ");
        Scanner src = new Scanner(System.in);
        int option = src.nextInt();

        switch (option) {
            case 1:
                operadores();
                break;
            case 2:
                Condicionales();
                break;
            case 3:
                Ciclos();
                break;
            case 4:
                Arreglos();
                break;

        }
    }

    static void operadores() {

        System.out.println("-------- MENÚ DE OPCIONES --------");
        System.out.println("Escoge alguna de las siguientes opciones");
        System.out.println("1. Calcular el área de un triángulo");
        System.out.println("2. Suma de dos números");
        System.out.println("3. Número elevado al cuadrado");
        System.out.println("4. Convertidor de euros a dólares");
        System.out.println("5. Lado de un cuadrado mostrando el valor del área y del perímetro");
        System.out.println("6. Área y volumen de un cilindro");
        System.out.println("7. Radio de una circunferencia");
        System.out.println("8. Promedio de 3 números");

        System.out.println("Selecciona una opción: ");
        Scanner src = new Scanner(System.in);
        int opto = src.nextInt();

        switch (opto) {
            case 1:
                area();
                break;
            case 2:
                sum();
                break;
            case 3:
                raise();
                break;
            case 4:
                converter();
                break;
            case 5:
                square();
                break;
            case 6:
                cylinder();
                break;

        }
    }

    // Ejercicio 1
    static void area() {

        double base;
        double height;
        double result;

        Ejercicios ejercicios = new Ejercicios();

        System.out.println("Area de un triángulo");
        Scanner src = new Scanner(System.in);

        System.out.println("Ingrese la base");
        base = src.nextDouble();

        System.out.println("Ingrese la altura");
        height = src.nextDouble();

        result = ejercicios.area(base, height);
        System.out.println("El area del triángulo es: " + result);
    }

    // Ejercicio 2
    static void sum() {

        int number1;
        int number2;
        int number3;

        Ejercicios ejercicios = new Ejercicios();

        System.out.println("Suma de números");
        Scanner src = new Scanner(System.in);

        System.out.println("Ingrese un primer número: ");
        number1 = src.nextInt();

        System.out.println("Ingrese un segundo número: ");
        number2 = src.nextInt();

        number3 = ejercicios.sum(number1, number2);
        System.out.println("El resultado de la operación es: " + number3);
    }

    // Ejercicio 3
    static void raise() {

        int v1;
        int v2;

        Ejercicios ejercicios = new Ejercicios();

        System.out.println("Número elevado al cuadrado");

        System.out.println("Ingrese el número que desea elevar: ");
        Scanner src = new Scanner(System.in);

        v1 = src.nextInt();

        v2 = ejercicios.raise(v1);
        System.out.println("El número elevado es: " + v2);
    }

    // Ejercicio 4
    static void converter() {

        int value;
        double value2;

        Ejercicios ejercicios = new Ejercicios();

        System.out.println("Convertidor de euros a dólares");
        Scanner src = new Scanner(System.in);

        System.out.println("Ingrese el valor que desea convertir: ");
        value = src.nextInt();

        value2 = ejercicios.converter(value);
        System.out.println("Su valor de " + value + " euros " + "equivale a: " + value2 + " dólares");
    }

    // Ejercicio 5
    static void square() {

        int side;
        int area;
        int value;
        int perimeter;

        Ejercicios ejercicios = new Ejercicios();

        System.out.println("Lado de un cuadrado que muestre el área y el perímetro");
        Scanner src = new Scanner(System.in);

        System.out.println("Ingrese el lado del cuadrado: ");
        side = src.nextInt();

        area = ejercicios.square_area(side);
        perimeter = ejercicios.square_perimeter(side);
        System.out.println("El lado de su cuadrado es de: " + side + "," + " el área es de: " + area + ","
                + " y el perímetro de: " + perimeter);
    }

    // Ejercicio 6
    static void cylinder() {

        int radio;
        int height;
        double t_area;
        double volume;

        Ejercicios ejercicios = new Ejercicios();

        System.out.println("Área y volumen de un cilindro");
        Scanner src = new Scanner(System.in);

        System.out.println("Ingrese el radio del cilindro: ");
        radio = src.nextInt();

        System.out.println("Ingrese la altura del cilindro: ");
        height = src.nextInt();

        t_area = ejercicios.cylinder_area(radio, height);
        volume = ejercicios.cylinder_volume(radio, height);
        System.out.println("El área total es de: " + t_area + " y el volumen es de: " + volume);
    }


    static void Condicionales() {

        System.out.println("-------- MENÚ DE OPCIONES --------");
        System.out.println("Escoge alguna de las siguientes opciones");
        System.out.println("1. Numero positivo o negativo   ");
        System.out.println("2. Número mayor y menor");
        System.out.println("3. 3 números enteros mayor y menor");
        System.out.println("4. Números A y B sumar o restar");
        System.out.println("5. Números A y B división ");
        System.out.println("6. Números A y B multiplicar");
        System.out.println("7. Año bisiesto o no");

        System.out.println("Selecciona una opción: ");
        Scanner src = new Scanner(System.in);
        int optc = src.nextInt();

    }

    static void Ciclos() {

        System.out.println("-------- MENÚ DE OPCIONES --------");
        System.out.println("Escoge alguna de las siguientes opciones");
        System.out.println("1. Imprimir todos los múltiplos de 3 que hay entre 1 y 100");
        System.out.println("2. Imprimir los números impares entre 0 y 100");
        System.out.println("3. Imprimir los números pares del 1 al 100");
        System.out.println("4. cuadrados de los números del 1 al 30");
        System.out.println("5. Suma los cuadrados de los cien primeros números naturales ");
        System.out.println(
                "6. dos números naturales, el primero menor que el segundo, mostrar todos los números comprendidos entre ellos en secuencia ascendente");
        System.out.println("7. Sumar todos los números que se digitan por teclado mientras no sea cero");

        System.out.println("Selecciona una opción: ");
        Scanner src = new Scanner(System.in);
        int optci = src.nextInt();

    }

    static void Arreglos() {

    }

}
