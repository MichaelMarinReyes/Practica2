package com.gui;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author michael
 */
public class MiPokeJPanel extends javax.swing.JPanel {

    /**
     * Creates new form MiPokeJPanel
     */
    public MiPokeJPanel() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        miPokejTable = new javax.swing.JTable();
        alimentarjButton = new javax.swing.JButton();
        limpiarjButton = new javax.swing.JButton();
        curarjButton = new javax.swing.JButton();

        setForeground(new java.awt.Color(255, 153, 102));
        setPreferredSize(new java.awt.Dimension(880, 571));

        miPokejTable.setBackground(new java.awt.Color(115, 229, 151));
        miPokejTable.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        miPokejTable.setFont(new java.awt.Font("Meslo LG L DZ for Powerline", 0, 8)); // NOI18N
        miPokejTable.setForeground(new java.awt.Color(101, 226, 60));
        miPokejTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No.", "Imagen", "Nombre", "Nivel", "Peticiones de Comida", "Peticiones de limpieza", "Peticiones de paseo", "Enfermedades"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        miPokejTable.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        miPokejTable.setGridColor(new java.awt.Color(153, 153, 153));
        miPokejTable.setRowHeight(100);
        miPokejTable.setSelectionBackground(new java.awt.Color(13, 123, 107));
        miPokejTable.setSelectionForeground(new java.awt.Color(93, 173, 108));
        jScrollPane1.setViewportView(miPokejTable);
        if (miPokejTable.getColumnModel().getColumnCount() > 0) {
            miPokejTable.getColumnModel().getColumn(0).setMinWidth(30);
            miPokejTable.getColumnModel().getColumn(0).setPreferredWidth(30);
            miPokejTable.getColumnModel().getColumn(0).setMaxWidth(30);
            miPokejTable.getColumnModel().getColumn(1).setMinWidth(100);
            miPokejTable.getColumnModel().getColumn(1).setPreferredWidth(100);
            miPokejTable.getColumnModel().getColumn(1).setMaxWidth(100);
            miPokejTable.getColumnModel().getColumn(2).setMinWidth(75);
            miPokejTable.getColumnModel().getColumn(2).setPreferredWidth(75);
            miPokejTable.getColumnModel().getColumn(2).setMaxWidth(75);
            miPokejTable.getColumnModel().getColumn(3).setMinWidth(50);
            miPokejTable.getColumnModel().getColumn(3).setPreferredWidth(50);
            miPokejTable.getColumnModel().getColumn(3).setMaxWidth(50);
            miPokejTable.getColumnModel().getColumn(4).setMinWidth(150);
            miPokejTable.getColumnModel().getColumn(4).setPreferredWidth(150);
            miPokejTable.getColumnModel().getColumn(4).setMaxWidth(150);
            miPokejTable.getColumnModel().getColumn(5).setMinWidth(160);
            miPokejTable.getColumnModel().getColumn(5).setPreferredWidth(160);
            miPokejTable.getColumnModel().getColumn(5).setMaxWidth(160);
            miPokejTable.getColumnModel().getColumn(6).setMinWidth(150);
            miPokejTable.getColumnModel().getColumn(6).setPreferredWidth(150);
            miPokejTable.getColumnModel().getColumn(6).setMaxWidth(150);
            miPokejTable.getColumnModel().getColumn(7).setMinWidth(150);
            miPokejTable.getColumnModel().getColumn(7).setPreferredWidth(150);
            miPokejTable.getColumnModel().getColumn(7).setMaxWidth(150);
        }

        alimentarjButton.setText("Alimentar");
        alimentarjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alimentarjButtonActionPerformed(evt);
            }
        });

        limpiarjButton.setText("Limpiar");
        limpiarjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpiarjButtonActionPerformed(evt);
            }
        });

        curarjButton.setText("Curar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(alimentarjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(87, 87, 87)
                        .addComponent(limpiarjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 98, Short.MAX_VALUE)
                        .addComponent(curarjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 484, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(alimentarjButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(curarjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(limpiarjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(14, 14, 14))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void alimentarjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alimentarjButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_alimentarjButtonActionPerformed

    private void limpiarjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiarjButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_limpiarjButtonActionPerformed

    private void mostrarMiPoke() {
        String nombreColumnas[] = {"No.", "Imagen", "Nombre", "Nivel", "Peticiones de Comida", "Peticiones de Limpieza", "Peticiones de paseo", "Enfermedades"};
//        DefaultTableModel misPokes = new DefaultTableModel(nombreColumnas, );
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton alimentarjButton;
    private javax.swing.JButton curarjButton;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton limpiarjButton;
    private javax.swing.JTable miPokejTable;
    // End of variables declaration//GEN-END:variables
}
