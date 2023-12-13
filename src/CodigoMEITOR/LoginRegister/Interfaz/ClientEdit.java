package CodigoMEITOR.LoginRegister.Interfaz;

import CodigoMEITOR.LoginRegister.Clases.Cliente;
import CodigoMEITOR.LoginRegister.Clases.Permiso;

import javax.swing.*;
import java.awt.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ClientEdit extends javax.swing.JPanel {

        private Cliente cliente;

        public ClientEdit(Cliente cliente) {
                this.cliente = cliente;
                initComponents();
        }

        @SuppressWarnings("unchecked")
        private void initComponents() {

                content = new javax.swing.JPanel();
                jLabel1 = new javax.swing.JLabel();
                jLabel2 = new javax.swing.JLabel();
                jLabel3 = new javax.swing.JLabel();
                jLabel4 = new javax.swing.JLabel();
                jLabel5 = new javax.swing.JLabel();
                labelFecha = new javax.swing.JLabel();
                buttonEdit = new javax.swing.JButton();
                buttonCancel = new javax.swing.JButton();
                textName = new javax.swing.JTextField();
                textFecha = new javax.swing.JTextField();
                textEmail = new javax.swing.JTextField();
                textPassword = new javax.swing.JTextField();
                textDinero = new javax.swing.JTextField();
                jLabel6 = new javax.swing.JLabel();
                comboBoxPermiso = new javax.swing.JComboBox<>();

                content.setBackground(new java.awt.Color(255, 255, 255));

                jLabel1.setFont(new java.awt.Font("Noto Sans CJK SC Medium", 0, 36)); // NOI18N
                jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                jLabel1.setText("Editar Cliente");

                jLabel2.setFont(new java.awt.Font("Noto Sans CJK SC Medium", 0, 14)); // NOI18N
                jLabel2.setText("Nombre :");

                jLabel3.setFont(new java.awt.Font("Noto Sans CJK SC Medium", 0, 14)); // NOI18N
                jLabel3.setText("Email :");

                jLabel4.setFont(new java.awt.Font("Noto Sans CJK SC Medium", 0, 14)); // NOI18N
                jLabel4.setText("Contraseña :");

                jLabel5.setFont(new java.awt.Font("Noto Sans CJK SC Medium", 0, 14)); // NOI18N
                jLabel5.setText("Dinero :");

                labelFecha.setFont(new java.awt.Font("Noto Sans CJK SC Medium", 0, 14)); // NOI18N
                labelFecha.setText("Fecha de nacimiento :");

                // stextFecha.setText(cliente.edad() + "");

                buttonEdit.setBackground(new java.awt.Color(102, 255, 102));
                buttonEdit.setFont(new java.awt.Font("Noto Sans CJK SC Medium", 0, 18)); // NOI18N
                buttonEdit.setText("Editar");
                buttonEdit.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                buttonEditActionPerformed(evt);
                        }
                });

                buttonCancel.setBackground(new java.awt.Color(255, 51, 51));
                buttonCancel.setFont(new java.awt.Font("Noto Sans CJK SC Medium", 0, 18)); // NOI18N
                buttonCancel.setText("Cancelar");
                buttonCancel.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                buttonCancelActionPerformed(evt);
                        }
                });

                jLabel6.setFont(new java.awt.Font("Noto Sans CJK SC Medium", 0, 14)); // NOI18N
                jLabel6.setText("Permiso :");

                comboBoxPermiso.setModel(
                                new javax.swing.DefaultComboBoxModel<>(new String[] { "Cliente", "Administrador" }));

                textName.setText(cliente.getName());
                textEmail.setText(cliente.getEmail());
                textPassword.setText(cliente.getPassword());
                textDinero.setText(String.valueOf(cliente.getDinero()));
                comboBoxPermiso.setSelectedItem(cliente.getPermiso().getNombre());

                javax.swing.GroupLayout contentLayout = new javax.swing.GroupLayout(content);
                content.setLayout(contentLayout);
                contentLayout.setHorizontalGroup(
                                contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(contentLayout.createSequentialGroup()
                                                                .addGap(120, 120, 120)
                                                                .addComponent(buttonEdit,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                200,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                                                290, Short.MAX_VALUE)
                                                                .addComponent(buttonCancel,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                199,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(104, 104, 104))
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contentLayout
                                                                .createSequentialGroup()
                                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE)
                                                                .addComponent(jLabel1,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                332,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(285, 285, 285))
                                                .addGroup(contentLayout.createSequentialGroup()
                                                                .addGap(258, 258, 258)
                                                                .addGroup(contentLayout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addGroup(contentLayout
                                                                                                .createSequentialGroup()
                                                                                                .addComponent(jLabel6)
                                                                                                .addPreferredGap(
                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                .addComponent(comboBoxPermiso,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                255,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                .addGroup(contentLayout
                                                                                                .createSequentialGroup()
                                                                                                .addComponent(jLabel2)
                                                                                                .addPreferredGap(
                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                .addComponent(textName,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                255,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                .addGroup(contentLayout
                                                                                                .createSequentialGroup()
                                                                                                .addComponent(labelFecha)
                                                                                                .addPreferredGap(
                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                .addComponent(textFecha,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                255,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                .addGroup(contentLayout
                                                                                                .createSequentialGroup()
                                                                                                .addComponent(jLabel5)
                                                                                                .addPreferredGap(
                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                .addComponent(textDinero,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                254,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                .addGroup(contentLayout
                                                                                                .createSequentialGroup()
                                                                                                .addComponent(jLabel3)
                                                                                                .addPreferredGap(
                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                .addComponent(textEmail,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                255,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                .addGroup(contentLayout
                                                                                                .createSequentialGroup()
                                                                                                .addComponent(jLabel4)
                                                                                                .addPreferredGap(
                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                .addComponent(textPassword,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                255,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE)));
                contentLayout.setVerticalGroup(
                                contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(contentLayout.createSequentialGroup()
                                                                .addGap(22, 22, 22)
                                                                .addComponent(jLabel1)
                                                                .addGap(45, 45, 45)
                                                                .addGroup(contentLayout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(jLabel2)
                                                                                .addComponent(textName,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                21,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(45, 45, 45)
                                                                .addGroup(contentLayout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(labelFecha)
                                                                                .addComponent(textFecha,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                21,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(35, 35, 35)
                                                                .addGroup(contentLayout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(jLabel3)
                                                                                .addComponent(textEmail,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(35, 35, 35)
                                                                .addGroup(contentLayout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(jLabel4)
                                                                                .addComponent(textPassword,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(35, 35, 35)
                                                                .addGroup(contentLayout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(jLabel5)
                                                                                .addComponent(textDinero,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(35, 35, 35)
                                                                .addGroup(contentLayout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(jLabel6)
                                                                                .addComponent(comboBoxPermiso,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                                                72, Short.MAX_VALUE)
                                                                .addGroup(contentLayout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING,
                                                                                false)
                                                                                .addComponent(buttonCancel,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                Short.MAX_VALUE)
                                                                                .addComponent(buttonEdit,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                35,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(24, 24, 24)));

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
                this.setLayout(layout);
                layout.setHorizontalGroup(
                                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(content, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
                layout.setVerticalGroup(
                                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(content, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
        }// </editor-fold>

        private void buttonEditActionPerformed(java.awt.event.ActionEvent evt) {
                String name = textName.getText();
                String email = textEmail.getText();
                String password = textPassword.getText();
                SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
                Date fechaDeNacimiento = new Date();
                try {
                        fechaDeNacimiento = format.parse(textFecha.getText());

                } catch (ParseException e) {
                        JOptionPane.showMessageDialog(this, e);
                }
                float dinero = Float.parseFloat(textDinero.getText());
                cliente.actualizarPerfil(name, email, password, fechaDeNacimiento);
                cliente.actualizarDinero(dinero);
                cliente.actualizarPermiso(
                                new Permiso(cliente.getPermiso().getId(), (String) comboBoxPermiso.getSelectedItem()));
                cliente.actualizar();
                System.out.println(cliente.edad());
                JOptionPane.showMessageDialog(this, "Cliente Editado con Exito");
                cerrarPanel();
        }

        private void buttonCancelActionPerformed(java.awt.event.ActionEvent evt) {
                cerrarPanel();
        }

        private void cerrarPanel() {
                AdminPanelCliente adminPanelCliente = new AdminPanelCliente();
                adminPanelCliente.setSize(913, 510);
                adminPanelCliente.setLocation(0, 0);

                content.removeAll();
                content.add(adminPanelCliente, BorderLayout.CENTER);
                content.revalidate();
                content.repaint();
        }

        // Variables declaration - do not modify
        private javax.swing.JButton buttonCancel;
        private javax.swing.JButton buttonEdit;
        private javax.swing.JComboBox<String> comboBoxPermiso;
        private javax.swing.JPanel content;
        private javax.swing.JLabel jLabel1;
        private javax.swing.JLabel jLabel2;
        private javax.swing.JLabel jLabel3;
        private javax.swing.JLabel jLabel4;
        private javax.swing.JLabel jLabel5;
        private javax.swing.JLabel jLabel6;
        private javax.swing.JLabel labelFecha;
        private javax.swing.JTextField textDinero;
        private javax.swing.JTextField textEmail;
        private javax.swing.JTextField textName;
        private javax.swing.JTextField textFecha;
        private javax.swing.JTextField textPassword;
        // End of variables declaration
}
