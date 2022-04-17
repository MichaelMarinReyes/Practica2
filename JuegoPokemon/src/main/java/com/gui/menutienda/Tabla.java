package com.gui.menutienda;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author michael
 */
public class Tabla extends DefaultTableModel {

    String[] nombreColumnas;
    Object[][] datos;

    public Tabla(String[] nombreColumnas, Object[][] datos) {
        super();
        this.nombreColumnas = nombreColumnas;
        this.datos = datos;
        setDataVector(datos, nombreColumnas);
    }

    public Tabla() {
    
    }
}
