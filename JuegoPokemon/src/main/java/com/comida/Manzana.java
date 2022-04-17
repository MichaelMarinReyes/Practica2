package com.comida;

/**
 *
 * @author michael
 */
public class Manzana extends Comida {

    public Manzana(String nombre, int costo, String descripcion) {
        super(nombre, costo, descripcion);
    }

    @Override
    public void aumentarPeticiones() {
        super.costo = 10;
        super.descripcion = "No afecta la cantidad de \n"
                + "peticiones de comida que\n"
                + "puede acumular la mascota.";
        super.usuario.setMonedas(usuario.getMonedas() - costo);
    }

}
