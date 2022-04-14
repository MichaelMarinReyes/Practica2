package com.mycompany.imagenes;

import java.awt.Dimension;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author michael
 */
public abstract class Imagen extends JLabel {

    public static final int TAMAÑO_ALTURA = 100;
    public static final int TAMAÑO_ANCHO = 100;
    public static final String PATH = "/com/com/mycompany/imagenes/";
    
    public Imagen(){
        this.setSize(TAMAÑO_ALTURA, TAMAÑO_ANCHO);
        this.setMaximumSize(new Dimension(TAMAÑO_ALTURA, TAMAÑO_ANCHO));
    }
    
    public void definirImagen(String imagenPath) {
        this.setIcon(new ImageIcon(getClass().getResource(PATH + imagenPath)));
    }
}
