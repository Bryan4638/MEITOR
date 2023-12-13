package CodigoMEITOR.GestionDeVentas.Interfaz;

import CodigoMEITOR.GestionDeVentas.Clases.Articulo;
import CodigoMEITOR.GestionDeVentas.Clases.ArticuloInterface;
import CodigoMEITOR.LoginRegister.Clases.Cliente;

import javax.swing.*;
import java.awt.*;

public class Card extends javax.swing.JPanel {

    private Cliente cliente;
    private ArticuloInterface articulo;
    public Card(ArticuloInterface articulo, Cliente cliente) {
        this.cliente = cliente;
        this.articulo = articulo;
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        labelPrecio = new javax.swing.JLabel();
        labelname = new javax.swing.JLabel();
        buttonAdd = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        labelPrecio.setFont(new java.awt.Font("Noto Sans CJK SC Medium", 0, 13)); // NOI18N
        labelPrecio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelPrecio.setText(articulo.getStock().getPrecio() + " $");
        if (articulo.getStock().getCantidadEnStock()==0){
            labelPrecio.setForeground(new Color(255, 0,0));
        }


        labelname.setFont(new java.awt.Font("Noto Sans CJK HK Medium", 0, 13)); // NOI18N
        labelname.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelname.setText(articulo.getNombre());

        buttonAdd.setBackground(new java.awt.Color(102, 255, 102));
        buttonAdd.setFont(new java.awt.Font("Noto Sans CJK SC Medium", 0, 13)); // NOI18N
        buttonAdd.setText("Agregar");
        buttonAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAddActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(buttonAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(labelPrecio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addComponent(labelname, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(labelname, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(buttonAdd)
                                        .addComponent(labelPrecio))
                                .addContainerGap())
        );

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource(articulo.getImage()))); // NOI18N
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>

    private void buttonAddActionPerformed(java.awt.event.ActionEvent evt) {
        if (cliente.getVenta()==null){
            cliente.getVenta().setCliente(cliente);
        }
        if(articulo.getStock().getCantidadEnStock()==0){
            JOptionPane.showMessageDialog(null, "El articulo no esta disponible");
        }else {
            cliente.getVenta().setArticulos(articulo);
            cliente.actualizar();
        }
    }


    // Variables declaration - do not modify
    private javax.swing.JButton buttonAdd;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelPrecio;
    private javax.swing.JLabel labelname;
    // End of variables declaration
}
