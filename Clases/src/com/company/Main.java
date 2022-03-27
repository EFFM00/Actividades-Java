package com.company;

public class Main {

    public static void main(String[] args) {
        //clase articulo: nombre, precio compra, precio venta, stock
        //informar si hay stock disponible y ganacia segun precios

        Articulo copas = new Articulo("Copa", "Copas de cristal", 15, 14.6, 25.0);

        System.out.println(copas.getDescripcion());
    }
}
