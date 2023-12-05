package CodigoMEITOR.GestionDeVentas.Interfaz;

import CodigoMEITOR.GestionDeVentas.Clases.ArticuloInterface;
import CodigoMEITOR.LoginRegister.Interfaz.InitDashboard;
import CodigoMEITOR.LoginRegister.Interfaz.UserEdit;
import CodigoMEITOR.Empresa.Interfaz.AdminHome;
import CodigoMEITOR.LoginRegister.Clases.Cliente;
import CodigoMEITOR.Almacen.Clases.Stock;

import java.awt.*;
import java.util.ArrayList;

public class Home extends javax.swing.JFrame {

    private Cliente cliente;
    public Home(Cliente cliente) {
        this.cliente=cliente;
        initComponents();
        initModel();
    }
    public void initModel(){
        ArrayList<ArticuloInterface> articulos = new Stock().getArticulos();
        ViewModels viewModels = new ViewModels(cliente,articulos);
        viewModels.setSize(1208, 534);
        viewModels.setLocation(0,0);

        container.removeAll();
        container.add(viewModels, BorderLayout.CENTER);
        container.revalidate();
        container.repaint();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        homePanel = new javax.swing.JPanel();
        search = new javax.swing.JButton();
        navigation = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        userButton = new javax.swing.JButton();
        comprasButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        buttonLogout = new javax.swing.JButton();
        buttonPanelDeControl = new javax.swing.JButton();
        textSearch = new javax.swing.JTextField();
        modelPanel = new javax.swing.JPanel();
        buttonModel1 = new javax.swing.JButton();
        buttonModel2 = new javax.swing.JButton();
        buttonModel3 = new javax.swing.JButton();
        buttonModel4 = new javax.swing.JButton();
        buttonModel5 = new javax.swing.JButton();
        container = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setResizable(false);

        homePanel.setBackground(new java.awt.Color(255, 255, 255));

        search.setBackground(new java.awt.Color(252, 252, 252));
        search.setFont(new java.awt.Font("Noto Sans CJK JP Light", 1, 14)); // NOI18N
        search.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Lupa.png"))); // NOI18N
        search.setText("Search");
        search.setBorder(null);
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });

        navigation.setBackground(new java.awt.Color(204, 204, 204));

        jLabel1.setFont(new java.awt.Font("Noto Sans CJK SC Medium", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("MEITOR");
        jLabel1.setToolTipText("");

        userButton.setBackground(new java.awt.Color(204, 204, 204));
        userButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/user1.png"))); // NOI18N
        userButton.setBorder(null);
        userButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userButtonActionPerformed(evt);
            }
        });

        comprasButton.setBackground(new java.awt.Color(204, 204, 204));
        comprasButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Ellipse 12 (1).png"))); // NOI18N
        comprasButton.setBorder(null);
        comprasButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comprasButtonActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logoBurbuja.png"))); // NOI18N
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        buttonLogout.setBackground(new java.awt.Color(204, 204, 204));
        buttonLogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Ellipse 26.png"))); // NOI18N
        buttonLogout.setBorder(null);
        buttonLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonLogoutActionPerformed(evt);
            }
        });

        buttonPanelDeControl.setBackground(new java.awt.Color(204, 204, 204));
        buttonPanelDeControl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/user.png"))); // NOI18N
        buttonPanelDeControl.setBorder(null);
        buttonPanelDeControl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonPanelDeControlActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout navigationLayout = new javax.swing.GroupLayout(navigation);
        navigation.setLayout(navigationLayout);
        navigationLayout.setHorizontalGroup(
                navigationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(navigationLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(userButton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(buttonPanelDeControl, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel1)
                                .addGap(464, 464, 464)
                                .addComponent(comprasButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(buttonLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
        );
        navigationLayout.setVerticalGroup(
                navigationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(navigationLayout.createSequentialGroup()
                                .addGroup(navigationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(comprasButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(buttonLogout, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(navigationLayout.createSequentialGroup()
                                                .addGroup(navigationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(userButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(buttonPanelDeControl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                .addGap(0, 0, Short.MAX_VALUE)))
                                .addContainerGap())
        );

        textSearch.setBackground(new java.awt.Color(255, 255, 221));
        textSearch.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        textSearch.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 0)));

        buttonModel1.setBackground(new java.awt.Color(242, 242, 242));
        buttonModel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/modelos/Ellipse 1.png"))); // NOI18N
        buttonModel1.setBorder(null);
        buttonModel1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonModel1ActionPerformed(evt);
            }
        });

        buttonModel2.setBackground(new java.awt.Color(242, 242, 242));
        buttonModel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/modelos/Ellipse 2.png"))); // NOI18N
        buttonModel2.setBorder(null);
        buttonModel2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonModel2ActionPerformed(evt);
            }
        });

        buttonModel3.setBackground(new java.awt.Color(242, 242, 242));
        buttonModel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/modelos/Ellipse 3.png"))); // NOI18N
        buttonModel3.setBorder(null);
        buttonModel3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonModel3ActionPerformed(evt);
            }
        });

        buttonModel4.setBackground(new java.awt.Color(242, 242, 242));
        buttonModel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/modelos/Ellipse 4.png"))); // NOI18N
        buttonModel4.setBorder(null);
        buttonModel4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonModel4ActionPerformed(evt);
            }
        });

        buttonModel5.setBackground(new java.awt.Color(242, 242, 242));
        buttonModel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/modelos/Ellipse 5.png"))); // NOI18N
        buttonModel5.setBorder(null);
        buttonModel5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonModel5ActionPerformed(evt);
            }
        });

        if (!cliente.getPermiso().getNombre().equals("Administrador")){
            buttonPanelDeControl.setEnabled(false);
        }


        javax.swing.GroupLayout modelPanelLayout = new javax.swing.GroupLayout(modelPanel);
        modelPanel.setLayout(modelPanelLayout);
        modelPanelLayout.setHorizontalGroup(
                modelPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(modelPanelLayout.createSequentialGroup()
                                .addGap(60, 60, 60)
                                .addComponent(buttonModel1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(103, 103, 103)
                                .addComponent(buttonModel2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(buttonModel3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(126, 126, 126)
                                .addComponent(buttonModel4, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(99, 99, 99)
                                .addComponent(buttonModel5, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(65, 65, 65))
        );
        modelPanelLayout.setVerticalGroup(
                modelPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(buttonModel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(buttonModel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(buttonModel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(buttonModel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(buttonModel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        container.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout containerLayout = new javax.swing.GroupLayout(container);
        container.setLayout(containerLayout);
        containerLayout.setHorizontalGroup(
                containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 1208, Short.MAX_VALUE)
        );
        containerLayout.setVerticalGroup(
                containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 534, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout homePanelLayout = new javax.swing.GroupLayout(homePanel);
        homePanel.setLayout(homePanelLayout);
        homePanelLayout.setHorizontalGroup(
                homePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(navigation, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, homePanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(modelPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(textSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(search)
                                .addContainerGap())
                        .addComponent(container, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        homePanelLayout.setVerticalGroup(
                homePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(homePanelLayout.createSequentialGroup()
                                .addComponent(navigation, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(homePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(homePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(textSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(search))
                                        .addComponent(modelPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(container, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(homePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(homePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );


        pack();
    }// </editor-fold>
    private void searchActionPerformed(java.awt.event.ActionEvent evt) {
        String search = textSearch.getText();
        textSearch.setText("");
        switch (search){
            case "pantalón de hombre":
                this.cargarPagina("Pantalón De Hombre");
                break;
            case "pulover de hombre":
                this.cargarPagina("Pulover de Hombre");
                break;
            case "blusa de mujer":
                this.cargarPagina("Blusas de mujer");
                break;
            case "sudaderas":
                this.cargarPagina("Sudaderas");
                break;
            case "pantalón de mujer":
                this.cargarPagina("Pantalón de mujer");
                break;
            default:
                initModel();
                break;
        }
    }

    private void userButtonActionPerformed(java.awt.event.ActionEvent evt) {
        UserEdit userEdit = new UserEdit(cliente);
        userEdit.setSize(1208, 534);
        userEdit.setLocation(0,0);

        container.removeAll();
        container.add(userEdit, BorderLayout.CENTER);
        container.revalidate();
        container.repaint();
    }

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {
        initModel();
    }

    private void buttonLogoutActionPerformed(java.awt.event.ActionEvent evt) {

        this.dispose(); // Cierra el JFrame

        InitDashboard dashboard = new InitDashboard();
        dashboard.setLocationRelativeTo(null);
        dashboard.setVisible(true);

    }

    private void comprasButtonActionPerformed(java.awt.event.ActionEvent evt) {
        ShoppingUserPage shoppingUserPage = new ShoppingUserPage(cliente);
        shoppingUserPage.setSize(1208, 534);
        shoppingUserPage.setLocation(0,0);

        container.removeAll();
        container.add(shoppingUserPage, BorderLayout.CENTER);
        container.revalidate();
        container.repaint();
    }

    private void buttonModel1ActionPerformed(java.awt.event.ActionEvent evt) {
        //Sudaderas
        //ID: R1pF7GKUDo
        String id = "Sudaderas";
        this.cargarPagina(id);
    }

    private void buttonModel2ActionPerformed(java.awt.event.ActionEvent evt) {
        // Pantalones de Hombre
        //ID: HSC10NRl6b
        String id = "Pantalón De Hombre";
        this.cargarPagina(id);
    }

    private void buttonModel3ActionPerformed(java.awt.event.ActionEvent evt) {
        // Pantalones de mujer
        //ID: lI7bQ7zZyf
        String id = "Pantalón de mujer";
        this.cargarPagina(id);
    }

    private void buttonModel4ActionPerformed(java.awt.event.ActionEvent evt) {
        // Blusas de mujer
        //ID: 738C19SIvN
        String id = "Blusas de mujer";
        this.cargarPagina(id);
    }

    private void buttonModel5ActionPerformed(java.awt.event.ActionEvent evt) {
        // Pulover de hombre
        //ID: Gqoy%PKqA1
        String id = "Pulover de Hombre";
        this.cargarPagina(id);
    }
    public void cargarPagina(String categoria){
        ArrayList<ArticuloInterface> articulos = new Stock().getArticulos();
        ArrayList<ArticuloInterface> modelo = new ArrayList<ArticuloInterface>();
        for (ArticuloInterface articuloInterface : articulos) {
            if (articuloInterface.getCategoria().getNombre().equals(categoria)){
                modelo.add(articuloInterface);
            }
        }
        ViewModels viewModels = new ViewModels(cliente, modelo);
        viewModels.setSize(1208, 534);
        viewModels.setLocation(0,0);
        container.removeAll();
        container.add(viewModels, BorderLayout.CENTER);
        container.revalidate();
        container.repaint();
    }

    private void buttonPanelDeControlActionPerformed(java.awt.event.ActionEvent evt) {
        this.dispose();
        AdminHome adminHome = new AdminHome(cliente);
        adminHome.setLocationRelativeTo(null);
        adminHome.setVisible(true);
    }

    // Variables declaration - do not modify
    private javax.swing.JButton buttonLogout;
    private javax.swing.JButton buttonModel1;
    private javax.swing.JButton buttonModel2;
    private javax.swing.JButton buttonModel3;
    private javax.swing.JButton buttonModel4;
    private javax.swing.JButton buttonModel5;
    private javax.swing.JButton buttonPanelDeControl;
    private javax.swing.JButton comprasButton;
    private javax.swing.JPanel container;
    private javax.swing.JPanel homePanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel modelPanel;
    private javax.swing.JPanel navigation;
    private javax.swing.JButton search;
    private javax.swing.JTextField textSearch;
    private javax.swing.JButton userButton;
    // End of variables declaration
}
