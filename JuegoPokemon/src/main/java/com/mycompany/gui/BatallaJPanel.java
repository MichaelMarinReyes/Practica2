package com.mycompany.gui;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author michael
 */
public class BatallaJPanel extends javax.swing.JPanel {

    FondoPanel panelImagen = new FondoPanel();

    /**
     * Creates new form Batalla
     */
    public BatallaJPanel() {
        initComponents();
        setLocation(0, 0);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setBackground(new java.awt.Color(153, 255, 255));
        setPreferredSize(new java.awt.Dimension(880, 571));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
    class FondoPanel extends JPanel {

//        private Image imagen;
//
//        @Override
//        public void paint(Graphics g) {
//            imagen = new ImageIcon(getClass().getResource("/com/mycompany/gui/imagenes/CampoBatalla.png")).getImage();
//            g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
//            setOpaque(false);
//            super.paint(g);
//        }
    }
}
