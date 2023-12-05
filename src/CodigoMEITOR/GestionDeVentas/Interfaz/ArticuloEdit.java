package CodigoMEITOR.GestionDeVentas.Interfaz;

import CodigoMEITOR.GestionDeVentas.Clases.Articulo;
import CodigoMEITOR.Almacen.Clases.Stock;
import CodigoMEITOR.GestionDeVentas.Clases.ArticuloInterface;

import java.awt.*;
import java.util.ArrayList;

public class ArticuloEdit extends javax.swing.JPanel {

    public ArticuloEdit() {
        initComponents();
        initModel();
    }
    private void initModel(){
        ArrayList<ArticuloInterface> articulos = new Stock().getArticulos();
        javax.swing.JPanel panel = new javax.swing.JPanel();
        panel.setBackground(new java.awt.Color(245, 245, 245));
        panel.setLayout(new GridLayout(0, 4, 10, 10)); // Grid de 4 columnas
        for (ArticuloInterface articulo: articulos) {
            panel.add(new CardArticulo(articulo, this));
        }
        scrollPanel.setViewportView(panel);
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        scrollPanel = new javax.swing.JScrollPane();

        scrollPanel.setBorder(null);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(scrollPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 913, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(scrollPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 510, Short.MAX_VALUE)
        );
    }// </editor-fold>


    // Variables declaration - do not modify
    private javax.swing.JScrollPane scrollPanel;
    // End of variables declaration
}

