package com.dinamicajuego;

import com.imagenes.Imagen;
import com.pokemones.Pokemon;
import com.usuario.Usuario;

/**
 *
 * @author michael
 */
public class Batalla {

    Pokemon salvaje;
    Usuario jugador;
    Imagen[] imagenes;

    public Batalla(Pokemon salvaje, Usuario jugador) {
        this.salvaje = salvaje;
        this.jugador = jugador;
    }

    public void indicarTurno() {

    }

    public Pokemon generarPokemonSalvaje() {
        int probabilidad = (int) (Math.random() * 100);

        if (probabilidad <= 34) {
            //tener un nivel menor al mio
        } else if (probabilidad > 34 && probabilidad <= 67) {
            //tener un nivel mas que el mio
        } else if (probabilidad > 67 && probabilidad <= 100) {
            //tener dos niveles mas que el mio
        }
        return salvaje;
    }

    public Imagen mostrarNumeroDeParejas(int nivel) {
        int pares = 0;
        // nivel 0
        if (nivel == 0) {
            pares = 8;
            //nivel 1
        } else if (nivel== 1) {
            pares = 12;
        } else if (nivel == 2) {
            pares = 16;
        } else if (nivel == 3) {
            pares = 20;
        } else if (nivel == 4) {
            pares = 24;
        } else if (nivel == 5) {
            pares = 28;
        } else if (nivel == 6) {
            pares = 32;
        } else if (pares == 7) {
            pares = 40;
        }
        return imagenes[pares];
    }

    public void indicarGanador() {

        if (1 > 0) {
            jugador.sumarMonedasGanadas(0);
        } else {
            System.out.println("Has perdido, no has ganado ninguna moneda");
        }
    }

}
