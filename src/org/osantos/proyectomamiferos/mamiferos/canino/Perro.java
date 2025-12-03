package org.osantos.proyectomamiferos.mamiferos.canino;

public class Perro extends Canino{
    private int fuerzaMordida;

    public Perro(String habitat, String nombreCientifico, float peso, float largo, float altura, String color, float tamanoColmillos, int fuerzaMordida) {
        super(habitat, nombreCientifico, peso, largo, altura, color, tamanoColmillos);
        this.fuerzaMordida = fuerzaMordida;
    }

    public int getFuerzaMordida() {
        return fuerzaMordida;
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
