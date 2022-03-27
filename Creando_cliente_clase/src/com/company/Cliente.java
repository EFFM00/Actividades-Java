package com.company;

public class Cliente {

        //ATRIBUTOS
        private Integer numeroCliente;
        private String nombre;
        private Double deuda;

        //CONSTRUCTOR
        public Cliente(Integer numeroCliente, String nombre, Double deuda){
            this.numeroCliente = numeroCliente;
            this.nombre = nombre;
            this.deuda = deuda;
        }

        //GETTERS Y SETTERS
        public Double getDeuda(){
            return this.deuda;
        }

        public void setNombre(String nombre){
            this.nombre = nombre;
        }

        //METODOS
        public void pagarDeuda(Double pago){
            this.deuda = 0.0;
            //Setea la deuda
        }

        public void incrementarDeuda(Double nuevaDeuda){
            if (nuevaDeuda > 0) {
                this.deuda += nuevaDeuda;
            }
        }

}
