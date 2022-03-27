package com.company;

public class Main {

    public static void main(String[] args) {
        Perro perro1 = new Perro ("caniche", 2020, 15.0, false, true, "Algodón");

        System.out.println(perro1);

        System.out.println(perro1.getEstaEnAdopcion());
        System.out.println(perro1.edadPerro());
        System.out.println(perro1.getLastimado());
        System.out.println(perro1.getNacimiento());
        System.out.println(perro1.getNombre());
        System.out.println(perro1.getRaza());
        System.out.println(perro1.getTieneChip());
        System.out.println(perro1.getPeso());
    }
}

