package CodigoMEITOR.LoginRegister.Interfaz;
import CodigoMEITOR.Empresa.Interfaz.AdminHome;
import CodigoMEITOR.GestionDeVentas.Interfaz.Home;
import CodigoMEITOR.LoginRegister.Clases.Cliente;
import CodigoMEITOR.LoginRegister.Clases.Proveedor;
import Controlers.BaseDatos;

import javax.swing.*;
import java.awt.*;

public class LoginPage extends javax.swing.JPanel {

    private boolean clienteIsSelected = true;
    public LoginPage() {
        initComponents();
    }

    @SuppressWarnings("unchecked")

    private void initComponents() {

        content = new javax.swing.JPanel();
        buttonMeitor = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        buttonGoogle = new javax.swing.JButton();
        buttonGithub = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        buttonRegister = new javax.swing.JButton();
        buttonIniciarSecion = new javax.swing.JButton();
        textPassword = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        textEmail = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        radioButtonCliente = new javax.swing.JRadioButton();
        radioButtonProveedor = new javax.swing.JRadioButton();

        content.setBackground(new java.awt.Color(252, 252, 252));

        buttonMeitor.setBackground(new java.awt.Color(252, 252, 252));
        buttonMeitor.setForeground(new java.awt.Color(255, 255, 0));
        buttonMeitor.setText("@MEITOR");
        buttonMeitor.setBorder(null);

        jLabel6.setForeground(new java.awt.Color(153, 153, 153));
        jLabel6.setText("Derechos reservados para");

        buttonGoogle.setBackground(new java.awt.Color(252, 252, 252));
        buttonGoogle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ButtonGoogle (1).png"))); // NOI18N
        buttonGoogle.setBorder(null);
        buttonGoogle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonGoogleActionPerformed(evt);
            }
        });

        buttonGithub.setBackground(new java.awt.Color(252, 252, 252));
        buttonGithub.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ButtonGitHub.png"))); // NOI18N
        buttonGithub.setBorder(null);
        buttonGithub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonGithubActionPerformed(evt);
            }
        });

        jLabel2.setForeground(new java.awt.Color(153, 153, 153));
        jLabel2.setText("Aún no tienes una cuenta? ");

        buttonRegister.setBackground(new java.awt.Color(252, 252, 252));
        buttonRegister.setForeground(new java.awt.Color(255, 255, 0));
        buttonRegister.setText("Registarte");
        buttonRegister.setBorder(null);
        buttonRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonRegisterActionPerformed(evt);
            }
        });

        buttonIniciarSecion.setBackground(new java.awt.Color(255, 255, 51));
        buttonIniciarSecion.setFont(new java.awt.Font("JetBrainsMono Nerd Font", 1, 13)); // NOI18N
        buttonIniciarSecion.setText("Iniciar Sesión");
        buttonIniciarSecion.setBorder(null);
        buttonIniciarSecion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonIniciarSecionActionPerformed(evt);
            }
        });

        textPassword.setBackground(new java.awt.Color(204, 204, 204));
        textPassword.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        textPassword.setBorder(null);

        jLabel4.setForeground(new java.awt.Color(153, 153, 153));
        jLabel4.setText("Contraseña: ");

        textEmail.setBackground(new java.awt.Color(204, 204, 204));
        textEmail.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        textEmail.setBorder(null);
        textEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textEmailActionPerformed(evt);
            }
        });

        jLabel3.setForeground(new java.awt.Color(153, 153, 153));
        jLabel3.setText("Email: ");

        jLabel1.setFont(new java.awt.Font("JetBrains Mono NL Light", 1, 18)); // NOI18N
        jLabel1.setText("Inicia sesión en MEITOR");

        radioButtonCliente.setText("Cliente");
        radioButtonCliente.setSelected(true);
        radioButtonCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioButtonClienteActionPerformed(evt);
            }
        });

        radioButtonProveedor.setText("Proveedor");
        radioButtonProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioButtonProveedorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout contentLayout = new javax.swing.GroupLayout(content);
        content.setLayout(contentLayout);
        contentLayout.setHorizontalGroup(
                contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contentLayout.createSequentialGroup()
                                .addGap(144, 144, 144)
                                .addGroup(contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(contentLayout.createSequentialGroup()
                                                .addComponent(buttonGoogle)
                                                .addGap(78, 78, 78))
                                        .addGroup(contentLayout.createSequentialGroup()
                                                .addComponent(jLabel6)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                .addGroup(contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(buttonGithub)
                                        .addComponent(buttonMeitor))
                                .addGap(137, 137, 137))
                        .addGroup(contentLayout.createSequentialGroup()
                                .addGap(95, 95, 95)
                                .addGroup(contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(contentLayout.createSequentialGroup()
                                                .addComponent(jLabel4)
                                                .addGap(0, 0, Short.MAX_VALUE))
                                        .addGroup(contentLayout.createSequentialGroup()
                                                .addGroup(contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                        .addGroup(contentLayout.createSequentialGroup()
                                                                .addComponent(radioButtonCliente)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addComponent(radioButtonProveedor))
                                                        .addGroup(contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addGroup(contentLayout.createSequentialGroup()
                                                                        .addGap(67, 67, 67)
                                                                        .addComponent(jLabel1))
                                                                .addGroup(contentLayout.createSequentialGroup()
                                                                        .addGap(121, 121, 121)
                                                                        .addComponent(buttonIniciarSecion, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addComponent(jLabel3)
                                                                .addComponent(textEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGroup(contentLayout.createSequentialGroup()
                                                                        .addGap(11, 11, 11)
                                                                        .addComponent(jLabel2)
                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                        .addComponent(buttonRegister))
                                                                .addComponent(textPassword, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        contentLayout.setVerticalGroup(
                contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(contentLayout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(jLabel1)
                                .addGap(34, 34, 34)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(textEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(textPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(45, 45, 45)
                                .addGroup(contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(radioButtonCliente)
                                        .addComponent(radioButtonProveedor))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                                .addComponent(buttonIniciarSecion, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(46, 46, 46)
                                .addGroup(contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel2)
                                        .addComponent(buttonRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(47, 47, 47)
                                .addGroup(contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(buttonGoogle, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(buttonGithub, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(34, 34, 34)
                                .addGroup(contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel6)
                                        .addComponent(buttonMeitor, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(29, 29, 29))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(content, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(content, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        ButtonGroup grupo = new ButtonGroup();
        grupo.add(radioButtonCliente);
        grupo.add(radioButtonProveedor);
    }// </editor-fold>

    private void buttonGoogleActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void buttonGithubActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void buttonRegisterActionPerformed(java.awt.event.ActionEvent evt) {
        RegisterPage registerPage = new RegisterPage();
        registerPage.setSize(583,610);
        registerPage.setLocation(0,0);

        content.removeAll();
        content.add(registerPage, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
    }

    private void buttonIniciarSecionActionPerformed(java.awt.event.ActionEvent evt) {
        String email = textEmail.getText();
        String password = String.valueOf(textPassword.getPassword());
        Cliente cliente = new BaseDatos().validarLoginCliente(email, password);
        Proveedor proveedor = new BaseDatos().validarLoginProveedor(email, password);
        JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(LoginPage.this);
        if(cliente!= null && frame != null && clienteIsSelected){
            if (cliente.getPermiso().getNombre().equals("Administrador")){
                frame.dispose(); // Cierra el JFrame
                AdminHome adminHome = new AdminHome(cliente);
                adminHome.setLocationRelativeTo(null);
                adminHome.setVisible(true);
            }
            else {
                frame.dispose(); // Cierra el JFrame
                Home home = new Home(cliente);
                home.setLocationRelativeTo(null);
                home.setVisible(true);
            }

        } else if (proveedor!=null && !clienteIsSelected) {
            frame.dispose(); // Cierra el JFrame
            ProveedorHome proveedorHome = new ProveedorHome(proveedor);
            proveedorHome.setLocationRelativeTo(null);
            proveedorHome.setVisible(true);
        }else {
            JOptionPane.showMessageDialog(null, "Email o Contraseñas incorrectos");
        }
    }

    private void textEmailActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }
    private void radioButtonProveedorActionPerformed(java.awt.event.ActionEvent evt) {
        clienteIsSelected = false;
    }

    private void radioButtonClienteActionPerformed(java.awt.event.ActionEvent evt) {
        clienteIsSelected = true;
    }


    // Variables declaration - do not modify
    private javax.swing.JButton buttonGithub;
    private javax.swing.JButton buttonGoogle;
    private javax.swing.JButton buttonIniciarSecion;
    private javax.swing.JButton buttonMeitor;
    private javax.swing.JButton buttonRegister;
    private javax.swing.JPanel content;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JRadioButton radioButtonCliente;
    private javax.swing.JRadioButton radioButtonProveedor;
    private javax.swing.JTextField textEmail;
    private javax.swing.JPasswordField textPassword;
    // End of variables declaration
}
