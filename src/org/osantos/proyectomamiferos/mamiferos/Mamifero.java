package org.osantos.proyectomamiferos.mamiferos;

abstract public class Mamifero {
    protected String habitat;
    protected float altura;
    protected float largo;
    protected float peso;
    protected String nombreCientifico;


    public Mamifero(String habitat, String nombreCientifico, float peso, float largo, float altura) {

        this.habitat = habitat;
        this.nombreCientifico = nombreCientifico;
        this.peso = peso;
        this.largo = largo;
        this.altura = altura;
    }

    public String getHabitat() {
        return habitat;
    }

    public String getNombreCientifico() {
        return nombreCientifico;
    }

    public float getPeso() {
        return peso;
    }

    public float getLargo() {
        return largo;
    }

    public float getAltura() {
        return altura;
    }

    //Metodos abstractos
    abstract public String comer();

    abstract public String dormir();

    abstract public String correr();

    abstract public String comunicarse();

}
