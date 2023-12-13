package CodigoMEITOR.Empresa.Interfaz;

import CodigoMEITOR.Empresa.Clases.Empleado;
import CodigoMEITOR.Empresa.Clases.Jefe;
import Controlers.BaseDatos;

import java.awt.*;
import java.util.ArrayList;

public class AdminPanelEmpresa extends javax.swing.JPanel {

    private boolean empleado = true;
    public AdminPanelEmpresa() {
        initComponents();
        initModelEmpleado();
    }
    public void initModelEmpleado() {
        ArrayList<Empleado> empleados = new BaseDatos().leerDatosEmpleado();
        javax.swing.JPanel panel = new javax.swing.JPanel();
        panel.setBackground(new java.awt.Color(245, 245, 245));
        panel.setLayout(new GridLayout(0, 1, 10, 10)); // Grid de 4 columnas
        boolean isOne = true;
        for (Empleado empleado: empleados) {
            if (isOne){
                panel.add(new CardEmpleadoInit("Empleado"));
                isOne=false;
            }
            panel.add(new CardEmpleado(empleado, this));
        }
        scrollPanel.setViewportView(panel);
    }
    public void initModelJefe() {
        ArrayList<Jefe> jefes = new BaseDatos().leerDatosJefe();
        javax.swing.JPanel panel = new javax.swing.JPanel();
        panel.setBackground(new java.awt.Color(245, 245, 245));
        panel.setLayout(new GridLayout(0, 1, 10, 10)); // Grid de 4 columnas
        boolean isOne=true;
        for (Jefe jefe: jefes) {
            if (isOne){
                panel.add(new CardEmpleadoInit("Jefe"));
                isOne=false;
            }
            panel.add(new CardJefe(jefe, this));
        }
        scrollPanel.setViewportView(panel);
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        buttonAdd = new javax.swing.JButton();
        buttonCambiar = new javax.swing.JButton();
        scrollPanel = new javax.swing.JScrollPane();

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        buttonAdd.setBackground(new java.awt.Color(102, 255, 102));
        buttonAdd.setFont(new java.awt.Font("Noto Sans CJK SC Medium", 0, 18)); // NOI18N
        buttonAdd.setText("Agregar Empleado");
        buttonAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAddbuttonAddActionPerformed(evt);
            }
        });

        buttonCambiar.setBackground(new java.awt.Color(255, 255, 102));
        buttonCambiar.setFont(new java.awt.Font("Noto Sans CJK SC Medium", 0, 18)); // NOI18N
        buttonCambiar.setText("Cambiar a Jefes");
        buttonCambiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCambiarbuttonCambiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(132, 132, 132)
                                .addComponent(buttonAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 255, Short.MAX_VALUE)
                                .addComponent(buttonCambiar, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(104, 104, 104))
        );
        jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addContainerGap(29, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(buttonAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(buttonCambiar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
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

    private void buttonAddbuttonAddActionPerformed(java.awt.event.ActionEvent evt) {
        if (empleado){
            AddEmpleado empleado1 = new AddEmpleado();
            empleado1.setSize(913, 510);
            empleado1.setLocation(0,0);

            this.removeAll();
            this.add(empleado1, BorderLayout.CENTER);
            this.revalidate();
            this.repaint();
        }else {
            AddJefe jefe = new AddJefe();
            jefe.setSize(913, 510);
            jefe.setLocation(0,0);

            this.removeAll();
            this.add(jefe, BorderLayout.CENTER);
            this.revalidate();
            this.repaint();
        }
    }

    private void buttonCambiarbuttonCambiarActionPerformed(java.awt.event.ActionEvent evt) {
        if (empleado){
            initModelJefe();
            buttonCambiar.setText("Cambiar a Empleados");
            buttonAdd.setText("Agregar Jefe");
            empleado=false;
        }else {
            initModelEmpleado();
            buttonCambiar.setText("Cambiar a Jefes");
            buttonAdd.setText("Agregar Empleado");
            empleado=true;
        }
    }


    // Variables declaration - do not modify
    private javax.swing.JButton buttonAdd;
    private javax.swing.JButton buttonCambiar;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane scrollPanel;
    // End of variables declaration
}

