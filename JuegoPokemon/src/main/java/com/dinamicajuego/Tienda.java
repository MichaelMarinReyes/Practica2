package com.dinamicajuego;

import javax.swing.JOptionPane;

/**
 *
 * @author michael
 */
public class Tienda {


public void confirmaciónDeCompra(int i) {
    if (i == 0) {
        JOptionPane.showMessageDialog(null, "Ha comprado");
    } else {
        JOptionPane.showMessageDialog(null, "Compra cancelada");
    }
}    
}
