package CodigoMEITOR.LoginRegister.Interfaz;

import CodigoMEITOR.LoginRegister.Clases.Proveedor;

import javax.swing.*;
import java.awt.*;

public class CardProveedor extends javax.swing.JPanel {

<<<<<<< HEAD
        private Proveedor proveedor;
        private JPanel panel;

        public CardProveedor(Proveedor proveedor, JPanel panel) {
                this.panel = panel;
                this.proveedor = proveedor;
                initComponents();
        }

        @SuppressWarnings("unchecked")
        // <editor-fold defaultstate="collapsed" desc="Generated Code">
        private void initComponents() {

                buttonEdit = new javax.swing.JButton();
                buttonDelete = new javax.swing.JButton();
                jLabel1 = new javax.swing.JLabel();
                jLabel2 = new javax.swing.JLabel();
                jLabel3 = new javax.swing.JLabel();
                labelFecha = new javax.swing.JLabel();

                buttonEdit.setBackground(new java.awt.Color(255, 255, 102));
                buttonEdit.setFont(new java.awt.Font("Noto Sans CJK SC Medium", 0, 12)); // NOI18N
                buttonEdit.setText("Editar");
                buttonEdit.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                buttonEditActionPerformed(evt);
                        }
                });

                buttonDelete.setBackground(new java.awt.Color(255, 51, 51));
                buttonDelete.setFont(new java.awt.Font("Noto Sans CJK SC Medium", 0, 12)); // NOI18N
                buttonDelete.setText("Eliminar");
                buttonDelete.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                buttonDeleteActionPerformed(evt);
                        }
                });

                jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                jLabel1.setText(proveedor.getName());

                labelFecha.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                labelFecha.setText(proveedor.edad() + "");

                jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                jLabel2.setText(proveedor.getEmail());

                jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                jLabel3.setText(proveedor.getDinero() + " $");

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
                this.setLayout(layout);
                layout.setHorizontalGroup(
                                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                                .addComponent(jLabel1,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                131,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(14, 14, 14)
                                                                .addComponent(labelFecha,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                131,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(14, 14, 14)
                                                                .addComponent(jLabel2,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                176,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(14, 14, 14)
                                                                .addComponent(jLabel3,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                130,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                                                205,
                                                                                Short.MAX_VALUE)
                                                                .addComponent(buttonEdit)
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(buttonDelete)
                                                                .addContainerGap()));
                layout.setVerticalGroup(
                                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                                .addGap(18, 18, 18)
                                                                .addGroup(layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(buttonEdit)
                                                                                .addComponent(buttonDelete)
                                                                                .addComponent(jLabel3)
                                                                                .addGroup(layout.createSequentialGroup()
                                                                                                .addGap(3, 3, 3)
                                                                                                .addGroup(layout
                                                                                                                .createParallelGroup(
                                                                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                                                .addComponent(jLabel1)
                                                                                                                .addComponent(labelFecha)
                                                                                                                .addComponent(jLabel2))))
                                                                .addGap(0, 16, Short.MAX_VALUE)));
        }// </editor-fold>

        private void buttonEditActionPerformed(java.awt.event.ActionEvent evt) {
                ProveedorEdit proveedorEdit = new ProveedorEdit(proveedor);
                proveedorEdit.setSize(913, 510);
                proveedorEdit.setLocation(0, 0);

                panel.removeAll();
                panel.add(proveedorEdit, BorderLayout.CENTER);
                panel.revalidate();
                panel.repaint();
        }

        private void buttonDeleteActionPerformed(java.awt.event.ActionEvent evt) {
                proveedor.elimiarDatos();
                AdminPanelProveedor adminPanelProveedor = new AdminPanelProveedor();
                adminPanelProveedor.setSize(913, 510);
                adminPanelProveedor.setLocation(0, 0);

                panel.removeAll();
                panel.add(adminPanelProveedor, BorderLayout.CENTER);
                panel.revalidate();
                panel.repaint();
        }

        // Variables declaration - do not modify
        private javax.swing.JButton buttonDelete;
        private javax.swing.JButton buttonEdit;
        private javax.swing.JLabel jLabel1;
        private javax.swing.JLabel jLabel2;
        private javax.swing.JLabel jLabel3;
        private javax.swing.JLabel labelFecha;
        // End of variables declaration
=======
    private Proveedor proveedor;
    private JPanel panel;
    public CardProveedor(Proveedor proveedor, JPanel panel) {
        this.panel=panel;
        this.proveedor=proveedor;
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        buttonEdit = new javax.swing.JButton();
        buttonDelete = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        buttonEdit.setBackground(new java.awt.Color(255, 255, 102));
        buttonEdit.setFont(new java.awt.Font("Noto Sans CJK SC Medium", 0, 12)); // NOI18N
        buttonEdit.setText("Editar");
        buttonEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEditActionPerformed(evt);
            }
        });

        buttonDelete.setBackground(new java.awt.Color(255, 51, 51));
        buttonDelete.setFont(new java.awt.Font("Noto Sans CJK SC Medium", 0, 12)); // NOI18N
        buttonDelete.setText("Eliminar");
        buttonDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonDeleteActionPerformed(evt);
            }
        });

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText(proveedor.getName());

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText(proveedor.getEmail());

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText(proveedor.getDinero()+" $");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(14, 14, 14)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(14, 14, 14)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 205, Short.MAX_VALUE)
                                .addComponent(buttonEdit)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(buttonDelete)
                                .addContainerGap())
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(buttonEdit)
                                        .addComponent(buttonDelete)
                                        .addComponent(jLabel3)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(3, 3, 3)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel1)
                                                        .addComponent(jLabel2))))
                                .addGap(0, 16, Short.MAX_VALUE))
        );
    }// </editor-fold>

    private void buttonEditActionPerformed(java.awt.event.ActionEvent evt) {
        ProveedorEdit proveedorEdit = new ProveedorEdit(proveedor);
        proveedorEdit.setSize(913, 510);
        proveedorEdit.setLocation(0,0);

        panel.removeAll();
        panel.add(proveedorEdit, BorderLayout.CENTER);
        panel.revalidate();
        panel.repaint();
    }

    private void buttonDeleteActionPerformed(java.awt.event.ActionEvent evt) {
        proveedor.elimiarDatos();
        AdminPanelProveedor adminPanelProveedor = new AdminPanelProveedor();
        adminPanelProveedor.setSize(913, 510);
        adminPanelProveedor.setLocation(0,0);

        panel.removeAll();
        panel.add(adminPanelProveedor, BorderLayout.CENTER);
        panel.revalidate();
        panel.repaint();
    }


    // Variables declaration - do not modify
    private javax.swing.JButton buttonDelete;
    private javax.swing.JButton buttonEdit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration
>>>>>>> d08e3af713587066e5fa8cc066051b51c391f622
}
