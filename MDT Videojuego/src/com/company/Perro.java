package com.company;

import java.util.Calendar;

import static java.lang.Integer.parseInt;

public class Perro {
    /*ATRIBUTOS*/
    private Boolean estaEnAdopcion;
    private String raza;
    private Integer nacimiento;
    private Double peso;
    private Boolean tieneChip;
    private Boolean lastimado;
    private String nombre;


    /*CONSTRUCTORES*/
    public Perro(String raza, Integer nacimiento, Double peso, Boolean tieneChip, Boolean lastimado, String nombre, Boolean estaEnAdopcion) {
        this.estaEnAdopcion = estaEnAdopcion;
        this.raza = raza;
        this.nacimiento = nacimiento;
        this.peso = peso;
        this.tieneChip = tieneChip;
        this.lastimado = lastimado;
        this.nombre = nombre;
    }

    public Perro(String raza, Integer nacimiento, Double peso, Boolean tieneChip, Boolean lastimado, String nombre) {
        this.raza = raza;
        this.nacimiento = nacimiento;
        this.peso = peso;
        this.tieneChip = tieneChip;
        this.lastimado = lastimado;
        this.nombre = nombre;
    }

    /*GETTERS*/
    public Boolean getEstaEnAdopcion() {
        return this.estaEnAdopcion;
    }

    public String getRaza() {
        return this.raza;
    }

    public Integer getNacimiento() {
        return this.nacimiento;
    }

    public Double getPeso() {
        return this.peso;
    }

    public Boolean getTieneChip() {
        return this.tieneChip;
    }

    public Boolean getLastimado() {
        return this.lastimado;
    }

    public String getNombre() {
        return this.nombre;
    }


    /*SETTERS*/
    public void setEstaEnAdopcion(Boolean estaEnAdopcion) {
        this.estaEnAdopcion = estaEnAdopcion;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public void setNacimiento(Integer nacimiento) {
        this.nacimiento = nacimiento;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public void setTieneChip(Boolean tieneChip) {
        this.tieneChip = tieneChip;
    }

    public void setLastimado(Boolean lastimado) {
        this.lastimado = lastimado;
    }

    public void getNombre(String nombre) {
        this.nombre = nombre;
    }

    /*RESPONSABILIDADES*/
    public Integer edadPerro(){
        Calendar calendar = Calendar.getInstance();
        Integer year = calendar.get(Calendar.YEAR);
        Integer edad = year - this.nacimiento;
        return edad;
    }

    public Boolean puedePerderse() {
        if(tieneChip.equals(false)) {
            return true;
        }
        return false;
    }

    public Boolean puedeAdoptarse() {
        if (this.peso > 5.0 && this.lastimado.equals(false)) {
            return true;
        } else {
            return false;
        }
    }
}
