import CodigoMEITOR.LoginRegister.Interfaz.InitDashboard;

public class Main {
    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                InitDashboard init = new InitDashboard();
                init.setLocationRelativeTo(null);
                init.setVisible(true);//@
            }
        });
    }
}
