package com.mycompany.pokemones;

/**
 *
 * @author michael
 */
public class Slowbro extends Pokemon {

    private static final String IMAGEN_PATH = "Slowbro.png";

    public Slowbro(String nombre, String estado, int nivel, int peticionesComida, int peticionesLimpieza, int peticionesPaseo, int excrementos, int enfermedades, int batallasGanadas) {
        super(nombre, estado, nivel, peticionesComida, peticionesLimpieza, peticionesPaseo, excrementos, enfermedades, batallasGanadas);
        imagen.definirImagen(IMAGEN_PATH);
    }
}
