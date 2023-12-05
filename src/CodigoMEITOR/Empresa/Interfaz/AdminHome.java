package CodigoMEITOR.Empresa.Interfaz;

import CodigoMEITOR.Almacen.Interfaz.AdminPanelAlmacen;
import CodigoMEITOR.GestionDeVentas.Interfaz.ArticuloEdit;
import CodigoMEITOR.GestionDeVentas.Interfaz.Home;
import CodigoMEITOR.LoginRegister.Interfaz.AdminPanelCliente;
import CodigoMEITOR.LoginRegister.Interfaz.AdminPanelProveedor;
import CodigoMEITOR.LoginRegister.Interfaz.InitDashboard;
import CodigoMEITOR.LoginRegister.Interfaz.UserEdit;
import CodigoMEITOR.LoginRegister.Clases.Cliente;

import java.awt.*;

public class AdminHome extends javax.swing.JFrame {
    private Cliente cliente;
    public AdminHome(Cliente cliente) {
        this.cliente=cliente;
        initComponents();
        initModel();
    }
    private void initModel(){

        ArticuloEdit articuloEdit = new ArticuloEdit();
        articuloEdit.setSize(913, 510);
        articuloEdit.setLocation(0,0);

        content.removeAll();
        content.add(articuloEdit, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        buttonUsuarios = new javax.swing.JButton();
        buttonAlmacen = new javax.swing.JButton();
        buttonEmpresa = new javax.swing.JButton();
        buttonProveedores = new javax.swing.JButton();
        buttonArticulos = new javax.swing.JButton();
        buttonEditUserAdmin = new javax.swing.JButton();
        buttonStore = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        buttonLogout = new javax.swing.JButton();
        content = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Ellipse 4.png"))); // NOI18N

        buttonUsuarios.setBackground(new java.awt.Color(204, 204, 204));
        buttonUsuarios.setFont(new java.awt.Font("Noto Sans CJK SC Medium", 0, 20)); // NOI18N
        buttonUsuarios.setText("Usuarios");
        buttonUsuarios.setBorder(null);
        buttonUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonUsuariosActionPerformed(evt);
            }
        });

        buttonAlmacen.setBackground(new java.awt.Color(204, 204, 204));
        buttonAlmacen.setFont(new java.awt.Font("Noto Sans CJK SC Medium", 0, 20)); // NOI18N
        buttonAlmacen.setText("Almacen");
        buttonAlmacen.setBorder(null);
        buttonAlmacen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAlmacenActionPerformed(evt);
            }
        });

        buttonEmpresa.setBackground(new java.awt.Color(204, 204, 204));
        buttonEmpresa.setFont(new java.awt.Font("Noto Sans CJK SC Medium", 0, 20)); // NOI18N
        buttonEmpresa.setText("Empresa");
        buttonEmpresa.setBorder(null);
        buttonEmpresa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEmpresaActionPerformed(evt);
            }
        });

        buttonProveedores.setBackground(new java.awt.Color(204, 204, 204));
        buttonProveedores.setFont(new java.awt.Font("Noto Sans CJK SC Medium", 0, 20)); // NOI18N
        buttonProveedores.setText("Proveedores");
        buttonProveedores.setBorder(null);
        buttonProveedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonProveedoresActionPerformed(evt);
            }
        });

        buttonArticulos.setBackground(new java.awt.Color(204, 204, 204));
        buttonArticulos.setFont(new java.awt.Font("Noto Sans CJK SC Medium", 0, 20)); // NOI18N
        buttonArticulos.setText("Articulos de Venta");
        buttonArticulos.setBorder(null);
        buttonArticulos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonArticulosActionPerformed(evt);
            }
        });

        buttonEditUserAdmin.setBackground(new java.awt.Color(204, 204, 204));
        buttonEditUserAdmin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/user1.png"))); // NOI18N
        buttonEditUserAdmin.setBorder(null);
        buttonEditUserAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEditUserAdminActionPerformed(evt);
            }
        });

        buttonStore.setBackground(new java.awt.Color(204, 204, 204));
        buttonStore.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/RectangleTienda.png"))); // NOI18N
        buttonStore.setBorder(null);
        buttonStore.setPreferredSize(new java.awt.Dimension(20, 20));
        buttonStore.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonStoreActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(buttonUsuarios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(buttonEmpresa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(buttonAlmacen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(buttonProveedores, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(buttonArticulos, javax.swing.GroupLayout.DEFAULT_SIZE, 283, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(buttonEditUserAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(buttonStore, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(60, 60, 60))
        );
        jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(43, 43, 43)
                                .addComponent(buttonArticulos, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(buttonProveedores, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(buttonUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(buttonAlmacen, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(buttonEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(buttonEditUserAdmin, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                                        .addComponent(buttonStore, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 204));

        jLabel2.setFont(new java.awt.Font("Noto Sans CJK SC Medium", 0, 36)); // NOI18N
        jLabel2.setText("Panel de Administración Empresa MEITOR");

        buttonLogout.setBackground(new java.awt.Color(255, 255, 204));
        buttonLogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Ellipse 26.png"))); // NOI18N
        buttonLogout.setBorder(null);
        buttonLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonLogoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                                .addContainerGap(71, Short.MAX_VALUE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 743, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(53, 53, 53)
                                .addComponent(buttonLogout)
                                .addGap(17, 17, 17))
        );
        jPanel3Layout.setVerticalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addGap(27, 27, 27)
                                                .addComponent(buttonLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(20, Short.MAX_VALUE))
        );

        content.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout contentLayout = new javax.swing.GroupLayout(content);
        content.setLayout(contentLayout);
        contentLayout.setHorizontalGroup(
                contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 913, Short.MAX_VALUE)
        );
        contentLayout.setVerticalGroup(
                contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 510, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(content, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(content, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>

    private void buttonArticulosActionPerformed(java.awt.event.ActionEvent evt) {
        initModel();
    }

    private void buttonProveedoresActionPerformed(java.awt.event.ActionEvent evt) {
        AdminPanelProveedor adminPanelProveedor = new AdminPanelProveedor();
        adminPanelProveedor.setSize(913, 510);
        adminPanelProveedor.setLocation(0,0);

        content.removeAll();
        content.add(adminPanelProveedor, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
    }

    private void buttonUsuariosActionPerformed(java.awt.event.ActionEvent evt) {
        AdminPanelCliente adminPanelCliente = new AdminPanelCliente();
        adminPanelCliente.setSize(913, 510);
        adminPanelCliente.setLocation(0,0);

        content.removeAll();
        content.add(adminPanelCliente, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
    }

    private void buttonAlmacenActionPerformed(java.awt.event.ActionEvent evt) {
        AdminPanelAlmacen adminPanelAlmacen = new AdminPanelAlmacen();
        adminPanelAlmacen.setSize(913, 510);
        adminPanelAlmacen.setLocation(0,0);

        content.removeAll();
        content.add(adminPanelAlmacen, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
    }

    private void buttonEmpresaActionPerformed(java.awt.event.ActionEvent evt) {
        AdminPanelEmpresa adminPanelEmpresa = new AdminPanelEmpresa();
        adminPanelEmpresa.setSize(913, 510);
        adminPanelEmpresa.setLocation(0,0);

        content.removeAll();
        content.add(adminPanelEmpresa, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
    }

    private void buttonEditUserAdminActionPerformed(java.awt.event.ActionEvent evt) {
        UserEdit userEdit = new UserEdit(cliente);
        userEdit.setSize(1208, 534);
        userEdit.setLocation(0,0);

        content.removeAll();
        content.add(userEdit, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
    }

    private void buttonLogoutActionPerformed(java.awt.event.ActionEvent evt) {
        this.dispose(); // Cierra el JFrame
        InitDashboard dashboard = new InitDashboard();
        dashboard.setLocationRelativeTo(null);
        dashboard.setVisible(true);

    }

    private void buttonStoreActionPerformed(java.awt.event.ActionEvent evt) {
        this.dispose(); // Cierra el JFrame
        Home home = new Home(cliente);
        home.setLocationRelativeTo(null);
        home.setVisible(true);
    }


    // Variables declaration - do not modify
    private javax.swing.JButton buttonAlmacen;
    private javax.swing.JButton buttonArticulos;
    private javax.swing.JButton buttonEditUserAdmin;
    private javax.swing.JButton buttonEmpresa;
    private javax.swing.JButton buttonLogout;
    private javax.swing.JButton buttonProveedores;
    private javax.swing.JButton buttonStore;
    private javax.swing.JButton buttonUsuarios;
    private javax.swing.JPanel content;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration
}
