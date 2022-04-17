package com.comida;

/**
 *
 * @author michael
 */
public class Cereal extends Comida {

    public Cereal(String nombre, int costo, String descripcion) {
        super(nombre, costo, descripcion);
    }


    @Override
    public void aumentarPeticiones() {
        super.costo = 30;
        super.descripcion = "El número de peticiones \n"
                + "de comida aumenta a 7";
        super.usuario.setMonedas(usuario.getMonedas() - costo);
    }

}
