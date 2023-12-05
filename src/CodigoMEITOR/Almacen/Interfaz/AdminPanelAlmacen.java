package CodigoMEITOR.Almacen.Interfaz;

import CodigoMEITOR.GestionDeVentas.Interfaz.CardCompra;
import CodigoMEITOR.GestionDeVentas.Interfaz.CardVenta;
import CodigoMEITOR.Almacen.Clases.RegistroCompra;
import CodigoMEITOR.Almacen.Clases.RegistroVenta;

import java.awt.*;
import java.util.ArrayList;

public class AdminPanelAlmacen extends javax.swing.JPanel {

    private boolean venta = true;

    public AdminPanelAlmacen() {
        initComponents();
        initModelVenta();
    }
    public void initModelVenta() {
        ArrayList<RegistroVenta> registroVentas = new RegistroVenta().leerLogRegistroVenta();
        javax.swing.JPanel panel = new javax.swing.JPanel();
        panel.setBackground(new java.awt.Color(245, 245, 245));
        panel.setLayout(new GridLayout(0, 1, 10, 10)); // Grid de 4 columnas
        for (RegistroVenta registroVenta: registroVentas) {
            panel.add(new CardVenta(registroVenta));
        }
        scrollPanel.setViewportView(panel);
    }
    public void initModelCompra() {
        ArrayList<RegistroCompra> registroCompras = new RegistroCompra().leerLogRegistroCompra();
        javax.swing.JPanel panel = new javax.swing.JPanel();
        panel.setBackground(new java.awt.Color(245, 245, 245));
        panel.setLayout(new GridLayout(0, 1, 10, 10)); // Grid de 4 columnas
        for (RegistroCompra registroCompra: registroCompras) {
            panel.add(new CardCompra(registroCompra));
        }
        scrollPanel.setViewportView(panel);
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        buttonDeleteRegistro = new javax.swing.JButton();
        buttonCambairRegistro = new javax.swing.JButton();
        scrollPanel = new javax.swing.JScrollPane();

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        buttonDeleteRegistro.setBackground(new java.awt.Color(255, 51, 51));
        buttonDeleteRegistro.setFont(new java.awt.Font("Noto Sans CJK SC Medium", 0, 18)); // NOI18N
        buttonDeleteRegistro.setText("Eliminar Registros");
        buttonDeleteRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonDeleteRegistrobuttonDeleteProveedorActionPerformed(evt);
            }
        });

        buttonCambairRegistro.setBackground(new java.awt.Color(102, 255, 102));
        buttonCambairRegistro.setFont(new java.awt.Font("Noto Sans CJK SC Medium", 0, 18)); // NOI18N
        buttonCambairRegistro.setText("Cambiar a Registro Compra");
        buttonCambairRegistro.setPreferredSize(new java.awt.Dimension(275, 33));
        buttonCambairRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCambairRegistroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGap(133, 133, 133)
                                .addComponent(buttonCambairRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 152, Short.MAX_VALUE)
                                .addComponent(buttonDeleteRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(78, 78, 78))
        );
        jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addContainerGap(35, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(buttonDeleteRegistro, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                                        .addComponent(buttonCambairRegistro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(32, 32, 32))
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
    }

    private void buttonDeleteRegistrobuttonDeleteProveedorActionPerformed(java.awt.event.ActionEvent evt) {
        new RegistroVenta().eliminarRegistro();
        new RegistroCompra().eliminarRegistro();
    }

    private void buttonCambairRegistroActionPerformed(java.awt.event.ActionEvent evt) {
        if (venta){
            initModelCompra();
            buttonCambairRegistro.setText("Cambiar a Registro Venta");
            venta=false;
        }else {
            initModelVenta();
            buttonCambairRegistro.setText("Cambiar a Registro Compra");
            venta=true;
        }
    }


    // Variables declaration - do not modify
    private javax.swing.JButton buttonCambairRegistro;
    private javax.swing.JButton buttonDeleteRegistro;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane scrollPanel;
    // End of variables declaration
}

