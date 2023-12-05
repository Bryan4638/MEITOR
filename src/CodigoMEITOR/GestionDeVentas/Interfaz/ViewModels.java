package CodigoMEITOR.GestionDeVentas.Interfaz;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */

import CodigoMEITOR.GestionDeVentas.Clases.Articulo;
import CodigoMEITOR.GestionDeVentas.Clases.ArticuloInterface;
import CodigoMEITOR.LoginRegister.Clases.Cliente;

import java.awt.*;
import java.util.ArrayList;

/**
 *
 * @author brayan
 */
public class ViewModels extends javax.swing.JPanel {

    private Cliente cliente;
    private ArrayList<ArticuloInterface> articulos;

    public ViewModels(Cliente cliente, ArrayList<ArticuloInterface> articulos) {
        this.articulos=articulos;
        this.cliente=cliente;
        initComponents();
        initModel();
    }
    public void initModel() {
        javax.swing.JPanel panel = new javax.swing.JPanel();
        panel.setBackground(new java.awt.Color(245, 245, 245));
        panel.setLayout(new GridLayout(0, 5, 10, 10)); // Grid de 4 columnas
        for (ArticuloInterface articulo: articulos) {
            panel.add(new Card(articulo, cliente));
        }
        scrollPanel.setViewportView(panel);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        scrollPanel = new javax.swing.JScrollPane();

        scrollPanel.setBorder(null);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(scrollPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 1208, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(scrollPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 534, Short.MAX_VALUE)
        );
    }// </editor-fold>


    // Variables declaration - do not modify
    private javax.swing.JScrollPane scrollPanel;
    // End of variables declaration
}

