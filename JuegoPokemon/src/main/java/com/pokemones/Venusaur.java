package com.pokemones;

import com.imagenes.Imagen;

/**
 *
 * @author michael
 */
public class Venusaur extends Pokemon {

    private static final String IMAGEN_PATH = "Venusaur.png";

    public Venusaur(String nombre, String estado, int nivel, int peticionesComida, int peticionesLimpieza, int peticionesPaseo, int excrementos, int enfermedades, int batallasGanadas) {
        super(nombre, estado, nivel, peticionesComida, peticionesLimpieza, peticionesPaseo, excrementos, enfermedades, batallasGanadas);
        imagen.definirImagen(IMAGEN_PATH);
    }

}
