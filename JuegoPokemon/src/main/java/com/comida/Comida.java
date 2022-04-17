package com.comida;

import com.usuario.Usuario;

/**
 *
 * @author michael
 */
public abstract class Comida {

    Usuario usuario;
    protected String nombre;
    protected int costo;
    protected String descripcion;

    public Comida(String nombre, int costo, String descripcion) {
        this.nombre = nombre;
        this.costo = costo;
        this.descripcion = descripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    
    public int getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void aumentarPeticiones() {
    }
;

}
