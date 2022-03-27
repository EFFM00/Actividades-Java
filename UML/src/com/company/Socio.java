package com.company;

public class Socio {

    private String numeroDeSocio;
    private String nombre;
    private  Double cuotaMensual;
    private String actividad;

    public Socio(String numeroDeSocio, String nombre, Double cuotaMensual, String actividad){
        this.numeroDeSocio = numeroDeSocio;
        this.nombre = nombre;
        this.cuotaMensual = cuotaMensual;
        this.actividad= actividad;
    }

    public Double calcularCuotaMensual(){
        return this.cuotaMensual;
    }
}