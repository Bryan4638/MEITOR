package CodigoMEITOR.GestionDeVentas.Interfaz;

import CodigoMEITOR.GestionDeVentas.Clases.Articulo;
import CodigoMEITOR.GestionDeVentas.Clases.ArticuloInterface;
import CodigoMEITOR.LoginRegister.Clases.Cliente;
import CodigoMEITOR.Almacen.Clases.RegistroVenta;

import javax.swing.*;
import java.awt.*;

public class ShoppingUserPage extends javax.swing.JPanel {

    private Cliente cliente;

    public ShoppingUserPage(Cliente cliente) {
        this.cliente = cliente;
        initComponents();
        initModel();
    }
    public void initModel() {
        javax.swing.JPanel panel = new javax.swing.JPanel();
        panel.setBackground(new java.awt.Color(245, 245, 245));
        panel.setLayout(new GridLayout(0, 5, 10, 10)); // Grid de 4 columnas
        for (ArticuloInterface articulo: cliente.getVenta().getArticulos()) {
            panel.add(new CardShopping(articulo, cliente, this));
        }
        scrollPanel.setViewportView(panel);
    }


    @SuppressWarnings("unchecked")
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        buttonCompra = new javax.swing.JButton();
        buttonVaciar = new javax.swing.JButton();
        scrollPanel = new javax.swing.JScrollPane();

        jPanel1.setBackground(new java.awt.Color(255, 255, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        buttonCompra.setBackground(new java.awt.Color(51, 255, 51));
        buttonCompra.setFont(new java.awt.Font("Noto Sans CJK HK Medium", 0, 13)); // NOI18N
        buttonCompra.setText("Realizar Compra");
        buttonCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCompraActionPerformed(evt);
            }
        });

        buttonVaciar.setBackground(new java.awt.Color(255, 0, 0));
        buttonVaciar.setFont(new java.awt.Font("Noto Sans CJK HK Medium", 0, 13)); // NOI18N
        buttonVaciar.setText("Vaciar Carrito");
        buttonVaciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonVaciarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(263, 263, 263)
                                .addComponent(buttonCompra)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 427, Short.MAX_VALUE)
                                .addComponent(buttonVaciar)
                                .addGap(273, 273, 273))
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap(27, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(buttonCompra)
                                        .addComponent(buttonVaciar))
                                .addGap(19, 19, 19))
        );

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
                                .addComponent(scrollPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 454, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>


    private void buttonCompraActionPerformed(java.awt.event.ActionEvent evt){
        float costo = cliente.getVenta().calcularValorDeVenta();
        float dinero = cliente.getDinero();
        if (dinero>=costo){
            new RegistroVenta(cliente, cliente.getVenta()).logRegistroVenta();
            cliente.actualizarDinero(dinero-costo);
            cliente.getVenta().finalizarVenta();
            JOptionPane.showMessageDialog(this, "Comprea realizada correctarmente saldo restante de "+(dinero-costo));
            recargarPanel();
        }else {
            JOptionPane.showMessageDialog(this, "Lo siento no tine dinero suficiente ...");
        }
    }
    private void buttonVaciarActionPerformed(java.awt.event.ActionEvent evt){
        cliente.getVenta().finalizarVenta();
        cliente.actualizar();
        recargarPanel();
    }
    private void recargarPanel(){
        ShoppingUserPage shoppingUserPage = new ShoppingUserPage(cliente);
        shoppingUserPage.setSize(1208, 534);
        shoppingUserPage.setLocation(0,0);

        this.removeAll();
        this.add(shoppingUserPage, BorderLayout.CENTER);
        this.revalidate();
        this.repaint();
    }


    // Variables declaration - do not modify
    private javax.swing.JButton buttonCompra;
    private javax.swing.JButton buttonVaciar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane scrollPanel;
    // End of variables declaration
}
