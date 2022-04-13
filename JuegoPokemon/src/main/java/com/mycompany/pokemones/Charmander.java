package com.mycompany.pokemones;

import com.mycompany.imagenes.Imagen;

/**
 *
 * @author michael
 */
public class Charmander extends Pokemon {

    private static final String IMAGEN_PATH = "Charmander.png";

    public Charmander(String nombre, String estado, int nivel, int peticionesComida, int peticionesLimpieza, int peticionesPaseo, int excrementos, int enfermedades, int batallasGanadas) {
        super(nombre, estado, nivel, peticionesComida, peticionesLimpieza, peticionesPaseo, excrementos, enfermedades, batallasGanadas);
        imagen.definirImagen(IMAGEN_PATH);
    }

}