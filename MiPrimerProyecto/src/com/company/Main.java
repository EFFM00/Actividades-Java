package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa tu nombre: ");

        Integer edad = scanner.nextInt();



        if(edad>= 18) {
            System.out.println("sos mayor, podés pasar");
        } else {
            System.out.println("sos menor, volvé en " + (18 - edad));
        }

        for(Integer i = 0; i < edad; i++) {
            System.out.prinln(i);
        }

        public Boolean esPar(Integer numero){
            return numero % 2 == 0;
        }
    }
}
