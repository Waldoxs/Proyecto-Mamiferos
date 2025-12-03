package org.osantos.proyectomamiferos.mamiferos.felino;

import org.osantos.proyectomamiferos.mamiferos.Mamifero;

abstract public class Felino extends Mamifero {
    protected float tamanoGarras;
    protected int velocidad;

    public Felino(String habitat, String nombreCientifico, float peso, float largo, float altura, float tamanoGarras, int velocidad) {
        super(habitat, nombreCientifico, peso, largo, altura);
        this.tamanoGarras = tamanoGarras;
        this.velocidad = velocidad;
    }


    public float getTamanoGarras() {
        return tamanoGarras;
    }

    public int getVelocidad() {
        return velocidad;
    }
}
