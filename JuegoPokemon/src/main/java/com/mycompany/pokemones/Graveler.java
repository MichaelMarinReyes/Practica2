package com.mycompany.pokemones;

/**
 *
 * @author michael
 */
public class Graveler extends Pokemon {

    private static final String IMAGEN_PATH = "Graveler.png";

    public Graveler(String nombre, String estado, int nivel, int peticionesComida, int peticionesLimpieza, int peticionesPaseo, int excrementos, int enfermedades, int batallasGanadas) {
        super(nombre, estado, nivel, peticionesComida, peticionesLimpieza, peticionesPaseo, excrementos, enfermedades, batallasGanadas);
        imagen.definirImagen(IMAGEN_PATH);
    }
}
