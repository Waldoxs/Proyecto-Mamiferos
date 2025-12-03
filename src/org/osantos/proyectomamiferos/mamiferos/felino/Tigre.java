package org.osantos.proyectomamiferos.mamiferos.felino;

public class Tigre extends Felino {
    private String especieTigre;

    public Tigre(String habitat, String nombreCientifico, float peso, float largo, float altura, float tamanoGarras, int velocidad, String especieTigre) {
        super(habitat, nombreCientifico, peso, largo, altura, tamanoGarras, velocidad);
        this.especieTigre = especieTigre;
    }

    public String getEspecieTigre() {
        return especieTigre;
    }

    @Override
    public String comer() {
        return "El Tigre con una tamaño de garras de " + this.tamanoGarras + " caza a sus presas con la velocidad de " + this.velocidad + "m/s";
    }

    @Override
    public String dormir() {
        return "La especie de Tigre " + this.especieTigre + " suele dormir sin manda";
    }

    @Override
    public String correr() {
        return "Con una altura de " + this.altura + " cm y un largo de " +this.largo + " cm, no se le dificulta correr";
    }

    @Override
    public String comunicarse() {
        return "El Tigre se comunica con el sonido llamado prusten ";
    }
}
