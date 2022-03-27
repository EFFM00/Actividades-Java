package com.company;
public class Nave extends Objeto{
    private double velocidad;
    private int vida;

    public Nave(int posx, int posy, char direccion, double velocidad, int vida) {
        super(posx, posy, direccion);
        this.velocidad = velocidad;
        this.vida = vida;
    }

    public void setVelocidad(double velocidad) {
        this.velocidad = velocidad;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public double getVelocidad() {
        return this.velocidad;
    }

    public int getVida() {
        return this.vida;
    }

    public void girar(char nuevaDireccion){
        super.setDireccion(nuevaDireccion);
    }

    public void restaVida(int valor){
        int vidaRestada = getVida() - valor;
        setVida(vidaRestada);
    }
}

