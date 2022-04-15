package com.gui.menutienda;

import com.dinamicajuego.ListadoPokemones;
import com.dinamicajuego.Tienda;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author michael
 */
public class PokemonesJPanel extends javax.swing.JPanel {

    DefaultTableModel modelo;
    ListadoPokemones[] pokemones;

    /**
     * Creates new form PokemonesJPanel
     */
    public PokemonesJPanel() {
        initComponents();
        setSize(880, 570);
        modelo = new DefaultTableModel();
        pokemones = new ListadoPokemones[151];
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        textoTiendaJLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        mostrarCostojTextField = new javax.swing.JTextField();
        botonComprarjButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        listadoPokemonesjTable = new javax.swing.JTable();

        setBackground(new java.awt.Color(140, 143, 92));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        textoTiendaJLabel.setFont(new java.awt.Font("Meslo LG L DZ for Powerline", 1, 24)); // NOI18N
        textoTiendaJLabel.setText("Tienda de Pokemones");
        add(textoTiendaJLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jLabel1.setFont(new java.awt.Font("Meslo LG L DZ for Powerline", 1, 24)); // NOI18N
        jLabel1.setText("Costo:");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 106, -1, -1));

        mostrarCostojTextField.setEditable(false);
        mostrarCostojTextField.setFont(new java.awt.Font("Meslo LG L DZ for Powerline", 1, 24)); // NOI18N
        add(mostrarCostojTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 200, -1, -1));

        botonComprarjButton.setFont(new java.awt.Font("Meslo LG L DZ for Powerline", 1, 24)); // NOI18N
        botonComprarjButton.setText("Comprar");
        botonComprarjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonComprarjButtonActionPerformed(evt);
            }
        });
        add(botonComprarjButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 340, -1, -1));

        listadoPokemonesjTable.setBackground(new java.awt.Color(68, 61, 39));
        listadoPokemonesjTable.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        listadoPokemonesjTable.setFont(new java.awt.Font("Meslo LG L DZ for Powerline", 0, 14)); // NOI18N
        listadoPokemonesjTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "No.", "Imagen", "Nombre", "Tipo", "Costo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        listadoPokemonesjTable.setRowHeight(100);
        listadoPokemonesjTable.setSelectionBackground(new java.awt.Color(13, 123, 107));
        listadoPokemonesjTable.setSelectionForeground(new java.awt.Color(93, 173, 108));
        listadoPokemonesjTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(listadoPokemonesjTable);
        if (listadoPokemonesjTable.getColumnModel().getColumnCount() > 0) {
            listadoPokemonesjTable.getColumnModel().getColumn(0).setMinWidth(40);
            listadoPokemonesjTable.getColumnModel().getColumn(0).setPreferredWidth(40);
            listadoPokemonesjTable.getColumnModel().getColumn(0).setMaxWidth(40);
            listadoPokemonesjTable.getColumnModel().getColumn(1).setMinWidth(150);
            listadoPokemonesjTable.getColumnModel().getColumn(1).setPreferredWidth(150);
            listadoPokemonesjTable.getColumnModel().getColumn(1).setMaxWidth(150);
            listadoPokemonesjTable.getColumnModel().getColumn(2).setMinWidth(100);
            listadoPokemonesjTable.getColumnModel().getColumn(2).setPreferredWidth(100);
            listadoPokemonesjTable.getColumnModel().getColumn(2).setMaxWidth(100);
            listadoPokemonesjTable.getColumnModel().getColumn(3).setMinWidth(100);
            listadoPokemonesjTable.getColumnModel().getColumn(3).setPreferredWidth(100);
            listadoPokemonesjTable.getColumnModel().getColumn(3).setMaxWidth(100);
            listadoPokemonesjTable.getColumnModel().getColumn(4).setMinWidth(60);
            listadoPokemonesjTable.getColumnModel().getColumn(4).setPreferredWidth(60);
            listadoPokemonesjTable.getColumnModel().getColumn(4).setMaxWidth(60);
        }

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 70, 460, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void botonComprarjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonComprarjButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonComprarjButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonComprarjButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable listadoPokemonesjTable;
    private javax.swing.JTextField mostrarCostojTextField;
    private javax.swing.JLabel textoTiendaJLabel;
    // End of variables declaration//GEN-END:variables

    public void mostrarPokemones() {
        modelo = (DefaultTableModel) listadoPokemonesjTable.getModel();
        Object[] objeto = new Object[151];
        for (int i = 0; i < pokemones.length; i++) {
            objeto[0] = pokemones[i];
            objeto[0] = pokemones[i];
            objeto[0] = pokemones[i];

        }
    }
}
