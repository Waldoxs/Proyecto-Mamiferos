package org.osantos.proyectomamiferos.mamiferos.canino;

import org.osantos.proyectomamiferos.mamiferos.Mamifero;

abstract public class Canino extends Mamifero {
    protected String color;
    protected float tamanoColmillos;

    public Canino(String habitat, String nombreCientifico, float peso, float largo, float altura) {
        super(habitat, nombreCientifico, peso, largo, altura);
    }

    public String getColor() {
        return color;
    }

    public float getTamanoColmillos() {
        return tamanoColmillos;
    }
}
