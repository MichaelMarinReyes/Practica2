package com.mycompany.gui.menutienda;

import com.mycompany.pokemones.ArregloPokemones;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author michael
 */
public class PokemonesJPanel extends javax.swing.JPanel {

    DefaultTableModel modelo;
    ArregloPokemones[] pokemones;
    /**
     * Creates new form PokemonesJPanel
     */
    public PokemonesJPanel() {
        initComponents();
        setSize(880, 570);
        modelo = new DefaultTableModel();
        pokemones = new ArregloPokemones[151];

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

        textoTiendaJLabel.setFont(new java.awt.Font("Meslo LG L DZ for Powerline", 1, 24)); // NOI18N
        textoTiendaJLabel.setText("Tienda de Pokemones");

        jLabel1.setFont(new java.awt.Font("Meslo LG L DZ for Powerline", 1, 24)); // NOI18N
        jLabel1.setText("Costo:");

        mostrarCostojTextField.setFont(new java.awt.Font("Meslo LG L DZ for Powerline", 1, 24)); // NOI18N

        botonComprarjButton.setFont(new java.awt.Font("Meslo LG L DZ for Powerline", 1, 24)); // NOI18N
        botonComprarjButton.setText("Comprar");

        listadoPokemonesjTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null}
            },
            new String [] {
                "No.", "Imagen", "Nombre"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                true, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(listadoPokemonesjTable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(textoTiendaJLabel)
                        .addGap(72, 72, 72)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(mostrarCostojTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(100, 100, 100)
                        .addComponent(botonComprarjButton))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 762, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textoTiendaJLabel)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel1))
                    .addComponent(mostrarCostojTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonComprarjButton))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents


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
        Object [] objeto = new Object[151];
        for (int i = 0; i < pokemones.length; i++) {
            objeto[0] = pokemones[i];
            objeto[0] = pokemones[i];
            objeto[0] = pokemones[i];
            
        }
    }
}