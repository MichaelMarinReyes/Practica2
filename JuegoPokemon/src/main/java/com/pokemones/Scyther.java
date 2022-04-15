package com.pokemones;

/**
 *
 * @author michael
 */
public class Scyther extends Pokemon {

    private static final String IMAGEN_PATH = "Scyther.png";

    public Scyther(String nombre, String estado, int nivel, int peticionesComida, int peticionesLimpieza, int peticionesPaseo, int excrementos, int enfermedades, int batallasGanadas) {
        super(nombre, estado, nivel, peticionesComida, peticionesLimpieza, peticionesPaseo, excrementos, enfermedades, batallasGanadas);
        imagen.definirImagen(IMAGEN_PATH);
    }
}
