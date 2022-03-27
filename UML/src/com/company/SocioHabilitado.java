package com.company;

public class SocioHabilitado extends Socio {

    private Double costoPileta;
    private Boolean estaHabilitado;

    public SocioHabilitado(String numeroDeSocio, String nombre, Double cuotaMensual, String actividad, Double costoPileta){
        super(numeroDeSocio, nombre, cuotaMensual, actividad);
        this.costoPileta = costoPileta;
        this.estaHabilitado = false;
    }


}
