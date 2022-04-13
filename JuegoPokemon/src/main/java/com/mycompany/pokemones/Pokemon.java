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
    protected Imagen imagen;

    public Pokemon(String nombre, String estado, int nivel, int peticionesComida, int peticionesLimpieza, int peticionesPaseo, int excrementos, int enfermedades, int batallasGanadas) {
        this.nombre = nombre;
        this.estado = estado;
        this.nivel = nivel;
        this.peticionesComida = peticionesComida;
        this.peticionesLimpieza = peticionesLimpieza;
        this.peticionesPaseo = peticionesPaseo;
        this.excrementos = excrementos;
        this.enfermedades = enfermedades;
        this.batallasGanadas = batallasGanadas;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public int getBatallasGanadas() {
        return batallasGanadas;
    }

    public void setBatallasGanadas(int batallasGanadas) {
        this.batallasGanadas = batallasGanadas;
    }

    public void subirNivel() {
        this.setNivel(((int) (Math.random() * 10) + 5) * this.getNivel());
    }

}
