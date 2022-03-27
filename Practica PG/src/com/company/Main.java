package com.company;

public class Main {

    public static void main(String[] args) {
	    String nombre = "";
        char inicial;
        int cantidad;

        cantidad = nombre.length();

        nombre=nombre.toUpperCase();

        if(nombre.equals("JUAN")) {
            System.out.println(nombre);
        } else if(nombre == null){
            System.out.println("Es null");
        }

        else {
            System.out.println("Tu nombre no es Juan, es " + nombre);
        }

        System.out.println(nombre.charAt(0));
    }
}
