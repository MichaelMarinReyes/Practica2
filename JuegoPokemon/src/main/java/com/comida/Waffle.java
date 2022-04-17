package com.comida;

/**
 *
 * @author michael
 */
public class Waffle extends Comida {

    public Waffle(String nombre, int costo, String descripcion) {
        super(nombre, costo, descripcion);
    }


    @Override
    public void aumentarPeticiones() {
        super.costo = 50;
        super.descripcion = "El número de peticiones\n"
                + "aumenta a 10";
        super.usuario.setMonedas(usuario.getMonedas() - costo);
    }

}
