package com.usuario;

import com.dinamicajuego.ListadoPokemones;
import com.pokemones.Pokemon;

/**
 *
 * @author michael
 */
public class Usuario {

    private Pokemon[] miPoke;
    ListadoPokemones lisPokes;
    private int monedas;

    public Usuario(Pokemon[] miPoke, int monedas) {
        this.miPoke = miPoke;
        this.monedas = monedas;
    }

    public Usuario() {

    }

    public int getMonedas() {
        return monedas;
    }

    public void setMonedas(int monedas) {
        this.monedas = monedas;
    }

    public void generarPokemonInicial() {
        int indice = 0;
        Pokemon[] copia;
        Pokemon[] original = lisPokes.almacenajePokemones();
        copia = new Pokemon[original.length];

        for (int i = 0; i < original.length; i++) {
            copia[i] = original[i];
        }

        int pokemonInicial = (int) (Math.random() * 151);
        miPoke[indice] = copia[pokemonInicial];
        indice++;
    }

    public void sumarMonedasGanadas(int monedasGanadas) {
        monedasGanadas = 10 + (20 * miPoke[0].getNivel()) + ((int) (Math.random() * 15));
        this.setMonedas(monedasGanadas + this.getMonedas());
    }

    public void restarMonedas(int costoPorCompra) {
        this.setMonedas(this.getMonedas() - costoPorCompra);
    }
}
