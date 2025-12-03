package org.osantos.proyectomamiferos.mamiferos.canino;

public class Lobo extends Canino {
    private int numCamada;
    private String especieLobo;

    public Lobo(String habitat, String nombreCientifico, float peso, float largo, float altura, String color, float tamanoColmillos, int numCamada, String especieLobo) {
        super(habitat, nombreCientifico, peso, largo, altura, color, tamanoColmillos);
        this.numCamada = numCamada;
        this.especieLobo = especieLobo;
    }

    public int getNumCamada() {
        return numCamada;
    }

    public String getEspecieLobo() {
        return especieLobo;
    }

    @Override
    public String comer() {
        return "El " + this.nombreCientifico + " le es fácil cortar las carne debido al tamaño de sus colmillos de " + this.tamanoColmillos + " cm";
    }

    @Override
    public String dormir() {
        return "La especie de lobos " + this.especieLobo + " duerme en un habitat " + this.habitat;
    }

    @Override
    public String correr() {
        return "Gracias a su color " + this.color + " se puede camuflajear entre las montañas para correr libremente";
    }

    @Override
    public String comunicarse() {
        return "Su manera de comunicarse es por medio del aullido";
    }
}
