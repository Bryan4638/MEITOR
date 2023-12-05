package CodigoMEITOR.LoginRegister.Interfaz;

import CodigoMEITOR.LoginRegister.Clases.Cliente;
import Controlers.BaseDatos;

import java.awt.*;
import java.util.ArrayList;

public class AdminPanelCliente extends javax.swing.JPanel {

    public AdminPanelCliente() {
        initComponents();
        initModel();
    }
    public void initModel() {
        ArrayList<Cliente> clientes = new BaseDatos().leerDatosCliente();
        javax.swing.JPanel panel = new javax.swing.JPanel();
        panel.setBackground(new java.awt.Color(245, 245, 245));
        panel.setLayout(new GridLayout(0, 1, 10, 10));
        boolean isOne = true;
        for (Cliente cliente: clientes) {
            if (isOne){
                panel.add(new CardClienteInit());
                isOne=false;
            }
            panel.add(new CardCliente(cliente, this));
        }
        scrollPanel.setViewportView(panel);
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        buttonAddClientes = new javax.swing.JButton();
        buttonDeleteClientes = new javax.swing.JButton();
        scrollPanel = new javax.swing.JScrollPane();

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        buttonAddClientes.setBackground(new java.awt.Color(102, 255, 102));
        buttonAddClientes.setFont(new java.awt.Font("Noto Sans CJK SC Medium", 0, 18)); // NOI18N
        buttonAddClientes.setText("Agregar Cliente");
        buttonAddClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAddClientesbuttonAddProveedorActionPerformed(evt);
            }
        });

        buttonDeleteClientes.setBackground(new java.awt.Color(255, 51, 51));
        buttonDeleteClientes.setFont(new java.awt.Font("Noto Sans CJK SC Medium", 0, 18)); // NOI18N
        buttonDeleteClientes.setText("Eliminar Clientes");
        buttonDeleteClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonDeleteClientesbuttonDeleteProveedorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(132, 132, 132)
                                .addComponent(buttonAddClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 255, Short.MAX_VALUE)
                                .addComponent(buttonDeleteClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(104, 104, 104))
        );
        jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addContainerGap(29, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(buttonAddClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(buttonDeleteClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(38, 38, 38))
        );

        scrollPanel.setBackground(new java.awt.Color(255, 255, 255));
        scrollPanel.setBorder(null);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(scrollPanel)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(scrollPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 401, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>

    private void buttonAddClientesbuttonAddProveedorActionPerformed(java.awt.event.ActionEvent evt) {
        AddCliente addCliente = new AddCliente();
        addCliente.setSize(913, 510);
        addCliente.setLocation(0,0);

        this.removeAll();
        this.add(addCliente, BorderLayout.CENTER);
        this.revalidate();
        this.repaint();
    }

    private void buttonDeleteClientesbuttonDeleteProveedorActionPerformed(java.awt.event.ActionEvent evt) {
        new BaseDatos().borrarDatosCliente();
    }


    // Variables declaration - do not modify
    private javax.swing.JButton buttonAddClientes;
    private javax.swing.JButton buttonDeleteClientes;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane scrollPanel;
    // End of variables declaration
}

