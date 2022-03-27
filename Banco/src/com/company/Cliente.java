package com.company;

public class Cliente {
    private String nroCliente;
    private String apellido;
    private String dni;
    private String cuit;

    public Cliente(String nroCliente, String apellido, String dni, String cuit) {
        this.nroCliente = nroCliente;
        this.apellido = apellido;
        this.dni = dni;
        this.cuit = cuit;
    }
}
