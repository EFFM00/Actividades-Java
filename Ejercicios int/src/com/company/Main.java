package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Integer num1 = 20*5;
        Integer num2 = 100;

        Integer resultado = num1.compareTo(num2);
        if (resultado.equals(-1)){
            System.out.println("El " + num2 + " es el mayor y el " + num1 + " es el menor");
        } else if (resultado.equals(1)){
            System.out.println("El " + num1 + " es el mayor y el " + num2 + " es el menor");
        } else {
            System.out.println("Ambos números son iguales");
        }
    }
}
