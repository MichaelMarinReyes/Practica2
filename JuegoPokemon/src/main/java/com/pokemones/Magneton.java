package com.pokemones;

/**
 *
 * @author michael
 */
public class Magneton extends Pokemon {

    private static final String IMAGEN_PATH = "Magneton.png";

    public Magneton(String nombre, String estado, int nivel, int peticionesComida, int peticionesLimpieza, int peticionesPaseo, int excrementos, int enfermedades, int batallasGanadas) {
        super(nombre, estado, nivel, peticionesComida, peticionesLimpieza, peticionesPaseo, excrementos, enfermedades, batallasGanadas);
        imagen.definirImagen(IMAGEN_PATH);
    }
}
