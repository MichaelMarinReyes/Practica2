package com.mycompany.pokemones;

import com.mycompany.imagenes.Imagen;

/**
 *
 * @author michael
 */
public class Pokemon {
    private String nombre;
    private String estado;
    private int nivel;
    private int peticionesComida;
    private int peticionesLimpieza;
    private int peticionesPaseo;
    private int excrementos;
    private int enfermedades;
    private int batallasGanadas;
    private String procesoDevida;
    private Imagen imagen;

    public Pokemon(String nombre, String estado, int nivel, int peticionesComida, int peticionesLimpieza, int peticionesPaseo, int excrementos, int enfermedades, int batallasGanadas, String procesoDevida, Imagen imagen) {
        this.nombre = nombre;
        this.estado = estado;
        this.nivel = nivel;
        this.peticionesComida = peticionesComida;
        this.peticionesLimpieza = peticionesLimpieza;
        this.peticionesPaseo = peticionesPaseo;
        this.excrementos = excrementos;
        this.enfermedades = enfermedades;
        this.batallasGanadas = batallasGanadas;
        this.procesoDevida = procesoDevida;
        this.imagen = imagen;
        
    }
    
    
    
    
}
