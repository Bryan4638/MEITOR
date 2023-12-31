package CodigoMEITOR.LoginRegister.Clases;

import CodigoMEITOR.GestionDeVentas.Clases.CompraInterface;
import Controlers.BaseDatos;
import java.util.Date;

import java.util.*;
import java.io.*;

public class Proveedor extends Usuario implements Serializable {
    private static final long serialVersionUID = 1L;
    private float dinero;
    private PermisoInterface permiso;
    private CompraInterface compra;

    public Proveedor() {

    }

    public Proveedor(String id, String nombre, String email, String password, float dinero, PermisoInterface permiso,
            CompraInterface compra, Date fechaDeNacimiento) {
        super(id, nombre, email, password, fechaDeNacimiento);
        this.dinero = dinero;
        this.permiso = permiso;
        this.compra = compra;
    }

    // Getters y setters...

    public PermisoInterface getPermiso() {
        return permiso;
    }

    public CompraInterface getCompra() {
        return compra;
    }

    public void actualizar() {
        ArrayList<Proveedor> proveedores = new BaseDatos().leerDatosProveedor();
        for (Proveedor proveedor : proveedores) {
            if (proveedor.getId().equals(this.getId())) {
                proveedores.remove(proveedores.indexOf(proveedor));
                proveedores.add(this);
                try (ObjectOutputStream oos = new ObjectOutputStream(
                        new FileOutputStream("src/BaseDeDatos/Proveedor.txt", false))) {
                    oos.writeObject(proveedores);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }

    public float getDinero() {
        return dinero;
    }

    public void setDinero(float dinero) {
        this.dinero = dinero;
    }

    public void actualizarPermiso(PermisoInterface permiso) {
        this.permiso = permiso;
    }

    public void setCompra(CompraInterface compra) {
        this.compra = compra;
    }

    public void elimiarDatos() {
        ArrayList<Proveedor> proveedoresBD = new BaseDatos().leerDatosProveedor();
        proveedoresBD.removeIf(proveedor -> proveedor.getId().equals(this.getId()));
        try (ObjectOutputStream oos = new ObjectOutputStream(
                new FileOutputStream("src/BaseDeDatos/Proveedor.txt", false))) {
            oos.writeObject(proveedoresBD);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
