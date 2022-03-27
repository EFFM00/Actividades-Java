package com.company;

public abstract class Cuenta {
    private Cliente cliente;
    private Double saldo;

    public Cuenta(Cliente cliente, Double saldo) {
        this.cliente = cliente;
        this.saldo = saldo;
    }

    public void depositar(Double cantidad){
        this.saldo += cantidad;
    }


}
