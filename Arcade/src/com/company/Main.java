package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /*String cadena1 = "skgn";
        String cadena2 = "srgkns";
        if (cadena1.equals(cadena2)){
            System.out.println("Son iguales");
        } else {
            System.out.println("no son iguales");
        }

        Integer num1 = 2333332;
        Integer num2 = 4321;

        switch ((num1.compareTo(num2))){
            case -1:
                System.out.println(num1 + " es menor que " + num2);
                break;
            case 0:
                System.out.println(num1 + " es igual que " + num2);
                break;
            case 1:
                System.out.println(num1 + " es mayor que " + num2);
                break;
        }
         */

        /*Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa tu nombre:");
        String nombre = scanner.nextLine();

        System.out.println("Ingresa tu apellido:");
        String apellido = scanner.nextLine();

        char inicialA = nombre.charAt(0);
        char inicialB = apellido.charAt(0);
        System.out.println("Las iniciales son " + inicialA + inicialA);
         */

        /*int num1 = 2;
        int num2 = 1;

        if(num1%num2==0) {
            System.out.println("La división entera da como resultado: " + num1/num2);
        } else {
            System.out.println("No es divisible");
        }
         */

        int indice = 4;
        String[] nombres = new String[indice];

        for (int i = 0; i < nombres.length; i++) {
            nombres[i] = "Nombre " + (i+1);
            System.out.println(nombres[i]);
        }

        String cadena = "Masita triunfante";
        System.out.println(cadena.hashCode()*-13);
    }
}



