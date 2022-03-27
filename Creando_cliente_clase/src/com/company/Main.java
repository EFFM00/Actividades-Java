package com.company;

import java.sql.SQLClientInfoException;

public class Main {

    public static void main(String[] args) {

        Cliente cliente1 = new Cliente(1, "Ana", 500.0);

        System.out.println(cliente1.getDeuda());
    }
}
