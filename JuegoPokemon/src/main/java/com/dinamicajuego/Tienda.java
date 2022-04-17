package com.dinamicajuego;

import com.pokemones.Pokemon;
import com.usuario.Usuario;
import javax.swing.JOptionPane;

/**
 *
 * @author michael
 */
public class Tienda {

    Usuario usuario;
    private int costoMascota;

    public void confirmaciónDeCompra(int i) {
        if (i == 0) {
            this.enviarPokemon();
            JOptionPane.showMessageDialog(null, "Ha comprado");
        } else if (i == 1){
            JOptionPane.showMessageDialog(null, "Compra cancelada");
        }
    }

    public void definirCostoMascota() {
        if (costoMascota == 50) {
            enviarPokemon();
        } else {
            //no enviarPokemon()
        }
    }

    public void enviarPokemon() {
        Pokemon mascota = null;
        
        
        usuario.guardarPokemon(mascota);
    }
}
