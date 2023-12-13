package CodigoMEITOR.LoginRegister.Clases;

import CodigoMEITOR.GestionDeVentas.Clases.VentaInterface;
import Controlers.BaseDatos;
//import java.sql.Date;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.*;
import java.io.Serializable;

public class Cliente extends Usuario implements Serializable {
    private static final long serialVersionUID = 1L;
    private float dinero;
    private PermisoInterface permiso;
    private VentaInterface venta;

    public Cliente() {

    }

    public Cliente(String id, String nombre, String email, String password, float dinero, PermisoInterface permiso,
            VentaInterface venta, Date fechaDeNacimiento) {
        super(id, nombre, email, password, fechaDeNacimiento);
        this.dinero = dinero;
        this.permiso = permiso;
        this.venta = venta;
    }

    // Getters y setters...
    public float getDinero() {
        return dinero;
    }

    public PermisoInterface getPermiso() {
        return permiso;
    }

    public VentaInterface getVenta() {
        return venta;
    }

    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public void actualizar() {
        ArrayList<Cliente> clientes = new BaseDatos().leerDatosCliente();
        clientes.removeIf(cliente -> cliente.getId().equals(this.getId()));
        clientes.add(this);
        try (ObjectOutputStream oos = new ObjectOutputStream(
                new FileOutputStream("src/BaseDeDatos/Cliente.txt", false))) {
            oos.writeObject(clientes);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void actualizarDinero(float dinero) {
        this.dinero = dinero;
    }

    public void actualizarPermiso(PermisoInterface permiso) {
        this.permiso = permiso;
    }

    public void setVenta(VentaInterface venta) {
        this.venta = venta;
    }

    public void elimiarDatos() {
        ArrayList<Cliente> clientesBD = new BaseDatos().leerDatosCliente();
        clientesBD.removeIf(cliente -> cliente.getId().equals(this.getId()));
        try (ObjectOutputStream oos = new ObjectOutputStream(
                new FileOutputStream("src/BaseDeDatos/Cliente.txt", false))) {
            oos.writeObject(clientesBD);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}