package CodigoMEITOR.Empresa.Interfaz;

import CodigoMEITOR.Empresa.Clases.Empleado;
import CodigoMEITOR.Empresa.Clases.Empresa;

import javax.swing.*;
import java.awt.*;

public class CardEmpleado extends javax.swing.JPanel {

    private JPanel panel;
    private Empleado empleado;
    public CardEmpleado(Empleado empleado,JPanel panel) {
        this.empleado= empleado;
        this.panel=panel;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        buttonEdit = new javax.swing.JButton();
        buttonDespedir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        buttonEdit.setBackground(new java.awt.Color(255, 255, 102));
        buttonEdit.setFont(new java.awt.Font("Noto Sans CJK SC Medium", 0, 12)); // NOI18N
        buttonEdit.setText("Editar");
        buttonEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEditActionPerformed(evt);
            }
        });

        buttonDespedir.setBackground(new java.awt.Color(255, 51, 51));
        buttonDespedir.setFont(new java.awt.Font("Noto Sans CJK SC Medium", 0, 12)); // NOI18N
        buttonDespedir.setText("Despedir");
        buttonDespedir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonDespedirActionPerformed(evt);
            }
        });

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText(empleado.getName());

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText(empleado.getZonaDeTrabajo());

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText(empleado.getSueldo()+" $");

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText(empleado.getTiempoDetrabajo());

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
                                .addGap(14, 14, 14)
                                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE)
                                .addGap(27, 27, 27)
                                .addComponent(buttonEdit)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(buttonDespedir)
                                .addContainerGap())
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(buttonEdit)
                                        .addComponent(buttonDespedir)
                                        .addComponent(jLabel3)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(3, 3, 3)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel1)
                                                        .addComponent(jLabel2))))
                                .addGap(0, 16, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel6)
                                .addGap(19, 19, 19))
        );
    }// </editor-fold>

    private void buttonEditActionPerformed(java.awt.event.ActionEvent evt) {
        EmpleadoEdit empleadoEdit = new EmpleadoEdit(empleado);
        empleadoEdit.setSize(913, 510);
        empleadoEdit.setLocation(0,0);

        panel.removeAll();
        panel.add(empleadoEdit, BorderLayout.CENTER);
        panel.revalidate();
        panel.repaint();
    }

    private void buttonDespedirActionPerformed(java.awt.event.ActionEvent evt) {
        new Empresa().despedirEmpleado(empleado);
        AdminPanelEmpresa adminPanelEmpresa = new AdminPanelEmpresa();
        adminPanelEmpresa.setSize(913, 510);
        adminPanelEmpresa.setLocation(0,0);

        panel.removeAll();
        panel.add(adminPanelEmpresa, BorderLayout.CENTER);
        panel.revalidate();
        panel.repaint();
    }



    // Variables declaration - do not modify
    // Variables declaration - do not modify
    private javax.swing.JButton buttonDespedir;
    private javax.swing.JButton buttonEdit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    // End of variables declaration
}

