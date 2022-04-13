package com.mycompany.pokemones;

/**
 *
 * @author michael
 */
public class Nidoran2 extends Pokemon {

    private static final String IMAGEN_PATH = "Nidoran♂.png";

    public Nidoran2(String nombre, String estado, int nivel, int peticionesComida, int peticionesLimpieza, int peticionesPaseo, int excrementos, int enfermedades, int batallasGanadas) {
        super(nombre, estado, nivel, peticionesComida, peticionesLimpieza, peticionesPaseo, excrementos, enfermedades, batallasGanadas);
        imagen.definirImagen(IMAGEN_PATH);
    }

}
