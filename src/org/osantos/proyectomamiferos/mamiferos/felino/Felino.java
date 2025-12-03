package org.osantos.proyectomamiferos.mamiferos.felino;

import org.osantos.proyectomamiferos.mamiferos.Mamifero;

abstract public class Felino extends Mamifero {
    protected float tamanoGarras;
    protected int velocidad;

    public Felino(String habitat, String nombreCientifico, float peso, float largo, float altura) {
        super(habitat, nombreCientifico, peso, largo, altura);
    }

    public float getTamanoGarras() {
        return tamanoGarras;
    }

    public int getVelocidad() {
        return velocidad;
    }
}
