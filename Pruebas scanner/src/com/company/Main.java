package com.company;

public class Main {

    public static void main(String[] args) {
        /*
        Scanner scanner;
        scanner = new Scanner(System.in);

        int num1;
        Integer num2;
        float num3;
        Float num4;
        String cadena;
        char inicial;

        System.out.println("Ingrese su primer valor");
        num1 = scanner.nextInt();
        System.out.println("Su número fue " + num1);
        System.out.println("Ingrese su segundo valor");
        num2 = scanner.nextInt();
        System.out.println("Su número fue " + num2);
        */

        /*String nombre;
        char inicial;

        Scanner scanner;
        scanner = new Scanner(System.in);
        nombre = scanner.nextLine();
        Integer caracteres = nombre.length();
        inicial = nombre.charAt(0);

        System.out.println("La inicial de " + nombre + " es " + inicial + " y tiene " + caracteres + " caracteres");
         */

        /*char inicialNombre;
        char inicialApellido;
        String nombre;
        String apellido;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa tu nombre: ");
        nombre = scanner.next();
        inicialNombre = nombre.charAt(0);

        System.out.println("Ingresa tu apellido: ");
        apellido = scanner.next();
        inicialApellido = apellido.charAt(0);

        System.out.println("Las iniciales son " + (inicialNombre) + (inicialApellido));
         */
    }

     public boolean divisibles(int num, int divisor) {
        if(num % divisor == 0) {
            return true;
        } else {
            return false;
        }
     }

}
