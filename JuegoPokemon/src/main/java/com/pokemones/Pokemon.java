package com.pokemones;

import com.imagenes.Imagen;

/**
 *
 * @author michael
 */
public class Pokemon implements Runnable {

    private final int TIEMPO_HILO = 20000;
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

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getPeticionesComida() {
        return peticionesComida;
    }

    public void setPeticionesComida(int peticionesComida) {
        this.peticionesComida = peticionesComida;
    }

    public int getPeticionesLimpieza() {
        return peticionesLimpieza;
    }

    public void setPeticionesLimpieza(int peticionesLimpieza) {
        this.peticionesLimpieza = peticionesLimpieza;
    }

    public int getPeticionesPaseo() {
        return peticionesPaseo;
    }

    public void setPeticionesPaseo(int peticionesPaseo) {
        this.peticionesPaseo = peticionesPaseo;
    }

    public int getExcrementos() {
        return excrementos;
    }

    public void setExcrementos(int excrementos) {
        this.excrementos = excrementos;
    }

    public int getEnfermedades() {
        return enfermedades;
    }

    public void setEnfermedades(int enfermedades) {
        this.enfermedades = enfermedades;
    }

    public String getProcesoDevida() {
        return procesoDevida;
    }

    public void setProcesoDevida(String procesoDevida) {
        this.procesoDevida = procesoDevida;
    }

    public Imagen getImagen() {
        return imagen;
    }

    public void setImagen(Imagen imagen) {
        this.imagen = imagen;
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

    @Override
    public void run() {
        try {
            if (this.getNivel() == 5) {
            Thread.sleep(TIEMPO_HILO);
        }
        } catch (InterruptedException e) {
        }
        
        
    
    }

}
