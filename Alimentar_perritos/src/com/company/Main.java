package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        cualGana("Juan", "Pedrito");
    }

    public static void cualGana(String jugador1, String jugador2) {
        Scanner scanner = new Scanner(System.in);
        int puntuacionJugador1 = 0;
        int puntuacionJugador2 = 0;

        System.out.println("Ingrese nombre del primer jugador: ");
        jugador1 = scanner.nextLine();

        System.out.println("Ingrese nombre del segundo jugador: ");
        jugador2 = scanner.nextLine();

        Integer opcionJugador1;
        Integer opcionJugador2;

        System.out.println("Jugada de " + jugador1 + ": 1 para piedra, 2 para tijera y 3 para papel: ");
        opcionJugador1 = scanner.nextInt();

        System.out.println("Jugada de " + jugador2 + ": 1 para piedra, 2 para tijera y 3 para papel: ");
        opcionJugador2 = scanner.nextInt();

        if(opcionJugador1.equals(1) == false || opcionJugador1.equals(2) == false || opcionJugador1.equals(3) == false)
        if (opcionJugador1 == 1) {
            if (opcionJugador2 == 1) {
                System.out.println("Empate");
            }

            if (opcionJugador2 == 2) {
                System.out.println(jugador1 + " seleccionó piedra y " + jugador2 + " tijera. " + jugador1 + " es el ganador");
                puntuacionJugador1++;
            }

            if (opcionJugador2 == 3) {
                System.out.println(jugador1 + " seleccionó piedra y " + jugador2 + " papel. " + jugador2 + " es el ganador");
                puntuacionJugador2++;
            }

        } else if (opcionJugador1 == 2) {
            if (opcionJugador2 == 1) {
                System.out.println(jugador1 + " seleccionó tijera y " + jugador2 + " piedra. " + jugador2 + " es el ganador");
                puntuacionJugador2++;
            }

            if (opcionJugador2 == 2) {
                System.out.println("Empate");
            }

            if (opcionJugador2 == 3) {
                System.out.println(jugador1 + " seleccionó tijera y " + jugador2 + " papel. " + jugador1 + " es el ganador");
                puntuacionJugador1++;
            }

        } else if (opcionJugador1 == 3) {
            if (opcionJugador2 == 1) {
                System.out.println(jugador1 + " seleccionó papel y " + jugador2 + " piedra. " + jugador1 + " es el ganador");
                puntuacionJugador1++;
            }

            if (opcionJugador2 == 2) {
                System.out.println(jugador1 + " seleccionó papel y " + jugador2 + " tijera " + jugador2 + " es el ganador");
                puntuacionJugador2++;
            }

            if (opcionJugador2 == 3) {
                System.out.println("Empate");
            }

        } else {
            System.out.println("Opción inválida. Intenta de nuevo");
        }
    }
}