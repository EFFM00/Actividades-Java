package com.company;

public class Asteroide extends Objeto{
    private int lesion;

    public Asteroide(int posx, int posy, char direccion, int lesion) {
        super(posx, posy, direccion);
        this.lesion = lesion;
    }

    public void setLesion(int lesion) {
        this.lesion = this.lesion - lesion;
    }

    public int getLesion() {
        return lesion;
    }

}

