package com.company;

public class UsuarioJuego {

    private String nombre;
    private String clave;
    private Integer puntaje;
    private Integer nivel;

    public UsuarioJuego(String nombre, String clave) {
        this.nombre = nombre;
        this.clave = clave;
        //siempre se debe inicializar una variable porque sino arroja null
        this.puntaje = 0;
        this.nivel = 0;
    }

    public void aumentarPuntaje(Integer puntaje) {
        if (puntaje > 0) {
            this.puntaje += puntaje;
        }
    }

    public void subirNivel() {
        this.nivel += 1;
    }

    public void bonus(Integer valor) {
        this.puntaje += valor;
    }

    public void getPuntaje() {
        System.out.println(this.puntaje);
    }
}
