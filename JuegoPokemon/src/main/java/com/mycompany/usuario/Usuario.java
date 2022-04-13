package com.mycompany.usuario;

import com.mycompany.pokemones.Pokemon;

/**
 *
 * @author michael
 */
public class Usuario {

    private Pokemon[] miPoke;
    private int monedas;

    public Usuario(Pokemon[] miPoke, int monedas) {
        this.miPoke = miPoke;
        this.monedas = monedas;
    }

    public int getMonedas() {
        return monedas;
    }

    public void setMonedas(int monedas) {
        this.monedas = monedas;
    }

    public void sumarMonedasGanadas(int monedasGanadas) {
        monedasGanadas = 10 + (20 * miPoke[0].getNivel()) + ((int) (Math.random() * 15));
        this.setMonedas(monedasGanadas + this.getMonedas());
    }

    public void restarMonedas(int costoPorCompra) {
        this.setMonedas(this.getMonedas() - costoPorCompra);
    }

    public void agregarPokemon() {

    }

}
