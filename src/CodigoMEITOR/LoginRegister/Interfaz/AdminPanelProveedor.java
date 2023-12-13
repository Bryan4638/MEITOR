package CodigoMEITOR.LoginRegister.Interfaz;

import CodigoMEITOR.LoginRegister.Clases.Proveedor;
import Controlers.BaseDatos;

import java.awt.*;
import java.util.ArrayList;

public class AdminPanelProveedor extends javax.swing.JPanel {

    public AdminPanelProveedor() {
        initComponents();
        initModel();
    }
    public void initModel() {
        ArrayList<Proveedor> proveedors = new BaseDatos().leerDatosProveedor();
        javax.swing.JPanel panel = new javax.swing.JPanel();
        panel.setBackground(new java.awt.Color(245, 245, 245));
        panel.setLayout(new GridLayout(0, 1, 10, 10)); // Grid de 4 columnas
        boolean isOne = true;
        for (Proveedor proveedor: proveedors) {
            if (isOne){
                panel.add(new CardClienteInit());
                isOne=false;
            }
            panel.add(new CardProveedor(proveedor, this));
        }
        scrollPanel.setViewportView(panel);
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        buttonAddProveedor = new javax.swing.JButton();
        buttonDeleteProveedor = new javax.swing.JButton();
        scrollPanel = new javax.swing.JScrollPane();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        buttonAddProveedor.setBackground(new java.awt.Color(102, 255, 102));
        buttonAddProveedor.setFont(new java.awt.Font("Noto Sans CJK SC Medium", 0, 18)); // NOI18N
        buttonAddProveedor.setText("Agregar Proveedor");
        buttonAddProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAddProveedorActionPerformed(evt);
            }
        });

        buttonDeleteProveedor.setBackground(new java.awt.Color(255, 51, 51));
        buttonDeleteProveedor.setFont(new java.awt.Font("Noto Sans CJK SC Medium", 0, 18)); // NOI18N
        buttonDeleteProveedor.setText("Eliminar Proveedores");
        buttonDeleteProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonDeleteProveedorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(132, 132, 132)
                                .addComponent(buttonAddProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 255, Short.MAX_VALUE)
                                .addComponent(buttonDeleteProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(104, 104, 104))
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap(29, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(buttonAddProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(buttonDeleteProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(38, 38, 38))
        );

        scrollPanel.setBackground(new java.awt.Color(255, 255, 255));
        scrollPanel.setBorder(null);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(scrollPanel)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(scrollPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 401, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }

    private void buttonDeleteProveedorActionPerformed(java.awt.event.ActionEvent evt) {
        new BaseDatos().borrarDatosProveedor();
    }

    private void buttonAddProveedorActionPerformed(java.awt.event.ActionEvent evt) {
        AddProveedor addProveedor = new AddProveedor();
        addProveedor.setSize(913, 510);
        addProveedor.setLocation(0,0);

        this.removeAll();
        this.add(addProveedor, BorderLayout.CENTER);
        this.revalidate();
        this.repaint();
    }


    // Variables declaration - do not modify
    private javax.swing.JButton buttonAddProveedor;
    private javax.swing.JButton buttonDeleteProveedor;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane scrollPanel;
    // End of variables declaration
}
