package CodigoMEITOR.LoginRegister.Interfaz;

import CodigoMEITOR.LoginRegister.Clases.Cliente;

import javax.swing.*;

public class UserEdit extends javax.swing.JPanel {

    private Cliente cliente;
    public UserEdit(Cliente cliente) {
        this.cliente=cliente;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        textUserName = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        textUserPasword = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        textUserEmail = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        textUserDinero = new javax.swing.JTextField();
        buttonUserDelete = new javax.swing.JButton();
        buttonUserSave = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1208, 534));

        jLabel1.setFont(new java.awt.Font("Noto Sans CJK HK Medium", 0, 18)); // NOI18N
        jLabel1.setText("Nombre: ");

        textUserName.setText(cliente.getName());

        jLabel2.setFont(new java.awt.Font("Noto Sans CJK HK Medium", 0, 24)); // NOI18N
        jLabel2.setText("Editar tu Usuario");

        jLabel3.setFont(new java.awt.Font("Noto Sans CJK HK Medium", 0, 18)); // NOI18N
        jLabel3.setText("Contraseña: ");

        textUserPasword.setText(cliente.getPassword());

        jLabel4.setFont(new java.awt.Font("Noto Sans CJK HK Medium", 0, 18)); // NOI18N
        jLabel4.setText("Email:");

        textUserEmail.setText(cliente.getEmail());

        jLabel5.setFont(new java.awt.Font("Noto Sans CJK HK Medium", 0, 18)); // NOI18N
        jLabel5.setText("Dinero:");

        textUserDinero.setText(String.valueOf(cliente.getDinero()));

        buttonUserDelete.setBackground(new java.awt.Color(255, 51, 51));
        buttonUserDelete.setFont(new java.awt.Font("Noto Sans CJK HK Medium", 0, 14)); // NOI18N
        buttonUserDelete.setText("Elimiar");
        buttonUserDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonUserDeleteActionPerformed(evt);
            }
        });

        buttonUserSave.setBackground(new java.awt.Color(102, 255, 102));
        buttonUserSave.setFont(new java.awt.Font("Noto Sans CJK HK Medium", 0, 14)); // NOI18N
        buttonUserSave.setText("Guardar");
        buttonUserSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonUserSaveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2)
                                .addGap(478, 478, 478))
                        .addGroup(layout.createSequentialGroup()
                                .addGap(322, 322, 322)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(jLabel1)
                                                        .addComponent(jLabel3)
                                                        .addComponent(jLabel4)
                                                        .addComponent(jLabel5))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(textUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(textUserPasword, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(textUserEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(textUserDinero, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(buttonUserSave, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(279, 279, 279)
                                                .addComponent(buttonUserDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(349, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(jLabel2)
                                .addGap(49, 49, 49)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel1)
                                        .addComponent(textUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(54, 54, 54)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel3)
                                        .addComponent(textUserPasword, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(54, 54, 54)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel4)
                                        .addComponent(textUserEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(54, 54, 54)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel5)
                                        .addComponent(textUserDinero, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(buttonUserSave, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(buttonUserDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(62, 62, 62))
        );
    }

    private void buttonUserSaveActionPerformed(java.awt.event.ActionEvent evt) {
        cliente.actualizarPerfil(textUserName.getText(), textUserEmail.getText(), textUserPasword.getText());
        cliente.actualizar();
        JOptionPane.showMessageDialog(null, "Cliente Editado Correctamente. ");
    }
    private void buttonUserDeleteActionPerformed(java.awt.event.ActionEvent evt) {
        cliente.elimiarDatos();
        JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(UserEdit.this);
        if (frame != null) {
            frame.dispose(); // Cierra el JFrame
        }
        JOptionPane.showMessageDialog(null ,"Cliente eliminado correctamente. ");
        InitDashboard dashboard = new InitDashboard();
        dashboard.setLocationRelativeTo(null);
        dashboard.setVisible(true);
    }

    // Variables declaration - do not modify
    private javax.swing.JTextField textUserDinero;
    private javax.swing.JTextField textUserEmail;
    private javax.swing.JTextField textUserName;
    private javax.swing.JTextField textUserPasword;
    private javax.swing.JButton buttonUserDelete;
    private javax.swing.JButton buttonUserSave;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;

    // End of variables declaration
}
