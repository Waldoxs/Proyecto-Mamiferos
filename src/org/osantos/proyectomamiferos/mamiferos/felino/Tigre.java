package org.osantos.proyectomamiferos.mamiferos.felino;

public class Tigre extends Felino{
    private String especieTigre;

    public Tigre(String habitat, String nombreCientifico, float peso, float largo, float altura, String especieTigre) {
        super(habitat, nombreCientifico, peso, largo, altura);
        this.especieTigre = especieTigre;
    }

    public String getEspecieTigre() {
        return especieTigre;
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
