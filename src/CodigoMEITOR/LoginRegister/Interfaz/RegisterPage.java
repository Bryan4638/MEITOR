package CodigoMEITOR.LoginRegister.Interfaz;
import CodigoMEITOR.GestionDeVentas.Interfaz.Home;
import CodigoMEITOR.LoginRegister.Clases.Cliente;
import CodigoMEITOR.LoginRegister.Clases.Permiso;
import CodigoMEITOR.GestionDeVentas.Clases.Venta;
import Controlers.BaseDatos;
import Controlers.GenerarID;

import javax.swing.*;
import java.awt.*;

public class RegisterPage extends javax.swing.JPanel {

    public RegisterPage() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        content = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        textName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        textEmail = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        textSaldo = new javax.swing.JTextField();
        textPassword = new javax.swing.JPasswordField();
        buttonRegister = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        buttonLogin = new javax.swing.JButton();
        buttonGoogle = new javax.swing.JButton();
        buttonGithub = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        buttonMeitor = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        content.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("JetBrains Mono NL Light", 1, 18)); // NOI18N
        jLabel1.setText("Registrate en MEITOR");

        jLabel5.setForeground(new java.awt.Color(153, 153, 153));
        jLabel5.setText("Nombre completo: ");

        textName.setBackground(new java.awt.Color(204, 204, 204));
        textName.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        textName.setBorder(null);
        textName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textNameActionPerformed(evt);
            }
        });

        jLabel3.setForeground(new java.awt.Color(153, 153, 153));
        jLabel3.setText("Email: ");

        textEmail.setBackground(new java.awt.Color(204, 204, 204));
        textEmail.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        textEmail.setBorder(null);

        jLabel4.setForeground(new java.awt.Color(153, 153, 153));
        jLabel4.setText("Contraseña: ");

        jLabel10.setForeground(new java.awt.Color(153, 153, 153));
        jLabel10.setText("Saldo: ");

        textSaldo.setBackground(new java.awt.Color(204, 204, 204));
        textSaldo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        textSaldo.setBorder(null);

        textPassword.setBackground(new java.awt.Color(204, 204, 204));
        textPassword.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        textPassword.setBorder(null);

        buttonRegister.setBackground(new java.awt.Color(255, 255, 51));
        buttonRegister.setFont(new java.awt.Font("JetBrainsMono Nerd Font", 1, 13)); // NOI18N
        buttonRegister.setText("Crear Cuenta");
        buttonRegister.setBorder(null);
        buttonRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonRegisterActionPerformed(evt);
            }
        });

        jLabel2.setForeground(new java.awt.Color(153, 153, 153));
        jLabel2.setText("Ya Tienes una cuenta?  ");

        buttonLogin.setBackground(new java.awt.Color(252, 252, 252));
        buttonLogin.setForeground(new java.awt.Color(255, 255, 0));
        buttonLogin.setText("Iniciar");
        buttonLogin.setBorder(null);
        buttonLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonLoginActionPerformed(evt);
            }
        });

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

        jLabel6.setForeground(new java.awt.Color(153, 153, 153));
        jLabel6.setText("Derechos reservados para");

        buttonMeitor.setBackground(new java.awt.Color(252, 252, 252));
        buttonMeitor.setForeground(new java.awt.Color(255, 255, 0));
        buttonMeitor.setText("@MEITOR");
        buttonMeitor.setBorder(null);

        javax.swing.GroupLayout contentLayout = new javax.swing.GroupLayout(content);
        content.setLayout(contentLayout);
        contentLayout.setHorizontalGroup(
                contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(contentLayout.createSequentialGroup()
                                .addGap(0, 96, Short.MAX_VALUE)
                                .addGroup(contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(textName, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel3)
                                                .addComponent(jLabel5)
                                                .addComponent(textEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGroup(contentLayout.createSequentialGroup()
                                                        .addGap(11, 11, 11)
                                                        .addComponent(jLabel2)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(buttonLogin)))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contentLayout.createSequentialGroup()
                                                .addGroup(contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel4)
                                                        .addComponent(textPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(72, 72, 72)
                                                .addGroup(contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addGroup(contentLayout.createSequentialGroup()
                                                                .addComponent(jLabel10)
                                                                .addGap(124, 124, 124))
                                                        .addComponent(textSaldo))))
                                .addGap(91, 91, 91))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contentLayout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                                .addGap(136, 136, 136))
                        .addGroup(contentLayout.createSequentialGroup()
                                .addGroup(contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(contentLayout.createSequentialGroup()
                                                .addGap(163, 163, 163)
                                                .addComponent(jLabel1))
                                        .addGroup(contentLayout.createSequentialGroup()
                                                .addGap(217, 217, 217)
                                                .addComponent(buttonRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        contentLayout.setVerticalGroup(
                contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(contentLayout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(textName, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(textEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel4)
                                        .addComponent(jLabel10))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(textSaldo, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                                        .addComponent(textPassword))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 78, Short.MAX_VALUE)
                                .addComponent(buttonRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(46, 46, 46)
                                .addGroup(contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel2)
                                        .addComponent(buttonLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(47, 47, 47)
                                .addGroup(contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(buttonGoogle, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(buttonGithub, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(34, 34, 34)
                                .addGroup(contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel6)
                                        .addComponent(buttonMeitor, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(33, 33, 33))
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
    }// </editor-fold>

    private void textNameActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void buttonGoogleActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void buttonGithubActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }


    private void buttonLoginActionPerformed(java.awt.event.ActionEvent evt) {
        LoginPage loginpage = new LoginPage();
        loginpage.setSize(583, 600);
        loginpage.setLocation(0,0);

        content.removeAll();
        content.add(loginpage, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
    }

    private void buttonRegisterActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        String name = textName.getText();
        String email = textEmail.getText();
        String password = textPassword.getText();
        String saldo = textSaldo.getText();
        GenerarID idUsuario = new GenerarID();

        if (name.isEmpty()||email.isEmpty()||password.isEmpty()||saldo.isEmpty())
            JOptionPane.showMessageDialog(this, "Llene todos los campos");
        else if ((int)password.length()<=7) {
            JOptionPane.showMessageDialog(this, "La contraseña debe tener más de 8 caracteres");
        } else if (!email.matches("^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$")) {
            JOptionPane.showMessageDialog(this, "El email no es correcto");
        } else {
            try {
                float floatSaldo = Float.parseFloat(saldo);
                String id = idUsuario.generarIDUsuario(name, email);
                Cliente cliente = new Cliente(id,name, email, password, floatSaldo, new Permiso(id, "Usuario"), new Venta());
                new BaseDatos().guardarDatos(cliente, false);
                //////////////////////////////////
                JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(RegisterPage.this);
                if (frame != null) {
                    frame.dispose();
                }
                Home home = new Home(cliente);
                home.setLocationRelativeTo(null);
                home.setVisible(true);

            }catch (NumberFormatException e){
                JOptionPane.showMessageDialog(this, "En el campo Salgo debe introducir un numero");
            }
        }
    }


    // Variables declaration - do not modify
    ;
    private javax.swing.JButton buttonGithub;
    private javax.swing.JButton buttonGoogle;
    private javax.swing.JButton buttonLogin;
    private javax.swing.JButton buttonMeitor;
    private javax.swing.JButton buttonRegister;
    private javax.swing.JPanel content;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField textEmail;
    private javax.swing.JTextField textName;
    private javax.swing.JPasswordField textPassword;
    private javax.swing.JTextField textSaldo;
    // End of variables declaration
}
