package com.company;

import java.util.Date;

public class Main {

    public static void main(String[] args) {
        Integer valor1 = 1;
        Integer valor2 = 30;
        Integer valor3 = 30;
        int comparar;

        if(valor1.equals(valor2) && valor2.equals(valor3)) {
            System.out.println("Son iguales");
        } else{
            comparar=valor1.compareTo(valor2);
            if(comparar>0) {
                System.out.println("valor1 es mayor que valor2");
            } else {
                System.out.println("valor2 es mayor que valor1");

                Date fecha = new Date(122, 2, 1);
                System.out.println(fecha.toString());
            }
        }




    }
}
