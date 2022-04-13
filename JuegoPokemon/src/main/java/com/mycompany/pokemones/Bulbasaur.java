package com.mycompany.pokemones;

import com.mycompany.imagenes.Imagen;

/**
 *
 * @author michael
 */
public class Bulbasaur extends Pokemon {
    
    private static final String IMAGEN_PATH = "Bulbasaur.png";

    public Bulbasaur(String nombre, String estado, int nivel, int peticionesComida, int peticionesLimpieza, int peticionesPaseo, int excrementos, int enfermedades, int batallasGanadas, String procesoDevida, Imagen imagen) {
        super(nombre, estado, nivel, peticionesComida, peticionesLimpieza, peticionesPaseo, excrementos, enfermedades, batallasGanadas, procesoDevida, imagen);
        imagen.definirImagen(IMAGEN_PATH);
    }
    
    
}
