package com.company;

public class Objeto {
    private int posx;
    private int posy;
    private  char direccion;

    public Objeto(int posx, int posy, char direccion) {
        this.posx = posx;
        this.posy = posy;
        this.direccion = direccion;
    }

    public void setPosX(int nuevoX){
        this.posx = nuevoX;
    }
    public void setPosY(int nuevoY){
        this.posy = nuevoY;
    }
    public void setDireccion(char nuevaDireccion){
        this.direccion = nuevaDireccion;
    }

    public int getPosX(){
        return this.posx;
    }
    public int getPosY(){
        return this.posy;
    }
    public char getDireccion(){
        return this.direccion;
    }

    public void irA(int posx, int posy, char direccion) {
    }
}


