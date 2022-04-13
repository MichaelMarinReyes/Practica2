package com.mycompany.estadopokemon;

import com.mycompany.pokemones.Pokemon;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author michael
 */
public class Nace {

    private Pokemon pokemon;
    private Pokemon[] poke;
    private Date fecha;
    private int precioDecompra;

    public Nace() {
    }

    public void definirFormaDeNacer() {
        //SI NACE POR COMPRA
        this.definirFecha();
        //SI NACE POR REVIVIR
        this.definirFecha();
    }

    public void nombrarPokemonNuevo() {

    }

    private String definirFecha() {
        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MMM/YYYY HH:mm");
        fecha = new Date();
        System.out.println(fecha);
        return formatoFecha.format(fecha);
    }
    
    
}
