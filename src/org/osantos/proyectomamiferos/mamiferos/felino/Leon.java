package org.osantos.proyectomamiferos.mamiferos.felino;

public class Leon extends Felino{
    private int numManada;
    private float potenciaRugidoDecibel;


    public Leon(String habitat, String nombreCientifico, float peso, float largo, float altura, int numManada, float potenciaRugidoDecibel) {
        super(habitat, nombreCientifico, peso, largo, altura);
        this.numManada = numManada;
        this.potenciaRugidoDecibel = potenciaRugidoDecibel;
    }

    public int getNumManada() {
        return numManada;
    }

    public float getPotenciaRugidoDecibel() {
        return potenciaRugidoDecibel;
    }

    @Override
    public String comer() {
        return "";
    }

    @Override
    public String dormir() {
        return "";
    }

    @Override
    public String correr() {
        return "";
    }

    @Override
    public String comunicarse() {
        return "";
    }
}
