package org.osantos.proyectomamiferos;

import org.osantos.proyectomamiferos.mamiferos.Mamifero;
import org.osantos.proyectomamiferos.mamiferos.canino.*;
import org.osantos.proyectomamiferos.mamiferos.felino.*;

public class EjemploMamiferos {
    public static void main(String[] args) {

        Mamifero[] animales = new Mamifero[3];
        animales[0] = new Guepardo("Sierra", "Acinonyx jubatus", 34.5f, 60f, 35f, 4.5f, 35);
        animales[1] = new Perro("Bosque", "Lycaon pictus", 26f, 45f, 30f, "marrón", 3.8f, 60);
        animales[2] = new Tigre("Selva", "Panthera tigris", 120f, 81f, 50f, 6, 29, "siberiano");

        for (Mamifero a : animales) {
            System.out.println(" =============== " + a.getClass().getSimpleName() + " =============== ");
            System.out.println("Habitat:" + a.getHabitat());
            System.out.println("Altura:" + a.getAltura());
            System.out.println("Largo:" + a.getLargo());
            System.out.println("Peso:" + a.getPeso());

            if (a instanceof Canino) {
                System.out.println("Clomillos:" + ((Canino) a).getTamanoColmillos());
                System.out.println("Color:" + ((Canino) a).getColor());

                if (a instanceof Lobo) {
                    System.out.println("Especie Lobo:" + ((Lobo) a).getEspecieLobo());
                    System.out.println("Número Integrantes:" + ((Lobo) a).getNumCamada());
                }
                if (a instanceof Perro) {
                    System.out.println("Fuerza mordida kg:" + ((Perro) a).getFuerzaMordida());
                }


            }
        }
    }
}