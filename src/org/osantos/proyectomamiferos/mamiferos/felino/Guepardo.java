package org.osantos.proyectomamiferos.mamiferos.felino;

public class Guepardo extends Felino {


    public Guepardo(String habitat, String nombreCientifico, float peso, float largo, float altura, float tamanoGarras, int velocidad) {
        super(habitat, nombreCientifico, peso, largo, altura, tamanoGarras, velocidad);
    }

    @Override
    public String comer() {
        return "El " + this.nombreCientifico + "  debe comer carne fresca ya que cuenta con unas garras de " + this.tamanoGarras + "cm";
    }

    @Override
    public String dormir() {
        return "El Guepardo duerme en " + this.habitat;
    }

    @Override
    public String correr() {
        return "El Guepardo debido a su peso de " + this.peso + " debe correr 5km por día a una velocidad " + this.velocidad + "m/s";
    }

    @Override
    public String comunicarse() {
        return "A pesar de ser un Guepardo de " + this.altura + "cm de alto y con un largo de " + this.largo + "cm se comunican con un ladrido tartamudo ";
    }
}
