package org.osantos.proyectomamiferos.mamiferos.felino;

public class Leon extends Felino {
    private int numManada;
    private float potenciaRugidoDecibel;

    public Leon(String habitat, String nombreCientifico, float peso, float largo, float altura, float tamanoGarras, int velocidad, int numManada, float potenciaRugidoDecibel) {
        super(habitat, nombreCientifico, peso, largo, altura, tamanoGarras, velocidad);
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
        return "El " + this.nombreCientifico + " junto a su manda de " + this.numManada + " cazan sus presas para seguir consevando su peso de" + this.peso + "kg";
    }

    @Override
    public String dormir() {
        return "El León tiene un hábitat llamada " + this.habitat + " donde en compañía de su manada descansan juntos";
    }

    @Override
    public String correr() {
        return "El " + this.nombreCientifico + " tiene una velocidad de " + this.velocidad + "m/s";
    }

    @Override
    public String comunicarse() {
        return "El León tiene un rugido que tiene un alcance de " + this.potenciaRugidoDecibel + " Db";
    }
}
