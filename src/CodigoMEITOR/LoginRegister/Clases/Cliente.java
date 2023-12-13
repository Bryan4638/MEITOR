package CodigoMEITOR.LoginRegister.Clases;
<<<<<<< HEAD

import CodigoMEITOR.GestionDeVentas.Clases.VentaInterface;
import Controlers.BaseDatos;
//import java.sql.Date;
=======
import CodigoMEITOR.GestionDeVentas.Clases.VentaInterface;
import Controlers.BaseDatos;
>>>>>>> d08e3af713587066e5fa8cc066051b51c391f622

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.*;
import java.io.Serializable;

<<<<<<< HEAD
public class Cliente extends Usuario implements Serializable {
=======

public class Cliente extends Usuario implements Serializable{
>>>>>>> d08e3af713587066e5fa8cc066051b51c391f622
    private static final long serialVersionUID = 1L;
    private float dinero;
    private PermisoInterface permiso;
    private VentaInterface venta;

<<<<<<< HEAD
    public Cliente() {

    }

    public Cliente(String id, String nombre, String email, String password, float dinero, PermisoInterface permiso,
            VentaInterface venta, Date fechaDeNacimiento) {
        super(id, nombre, email, password, fechaDeNacimiento);
=======
    public Cliente(){

    }

    public Cliente(String id, String nombre, String email, String password, float dinero, PermisoInterface permiso, VentaInterface venta) {
        super(id, nombre, email, password);
>>>>>>> d08e3af713587066e5fa8cc066051b51c391f622
        this.dinero = dinero;
        this.permiso = permiso;
        this.venta = venta;
    }

    // Getters y setters...
    public float getDinero() {
        return dinero;
    }
<<<<<<< HEAD

    public PermisoInterface getPermiso() {
        return permiso;
    }

=======
    public PermisoInterface getPermiso() {
        return permiso;
    }
>>>>>>> d08e3af713587066e5fa8cc066051b51c391f622
    public VentaInterface getVenta() {
        return venta;
    }

    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

<<<<<<< HEAD
    public void actualizar() {
        ArrayList<Cliente> clientes = new BaseDatos().leerDatosCliente();
        clientes.removeIf(cliente -> cliente.getId().equals(this.getId()));
        clientes.add(this);
        try (ObjectOutputStream oos = new ObjectOutputStream(
                new FileOutputStream("src/BaseDeDatos/Cliente.txt", false))) {
=======
    public void actualizar(){
        ArrayList<Cliente> clientes = new BaseDatos().leerDatosCliente();
        clientes.removeIf(cliente -> cliente.getId().equals(this.getId()));
        clientes.add(this);
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("src/BaseDeDatos/Cliente.txt", false))) {
>>>>>>> d08e3af713587066e5fa8cc066051b51c391f622
            oos.writeObject(clientes);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
<<<<<<< HEAD

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
=======
    public void actualizarDinero(float dinero){
        this.dinero = dinero;
    }
    public void actualizarPermiso(PermisoInterface permiso){
        this.permiso = permiso;
    }
    public void setVenta(VentaInterface venta){
        this.venta= venta;
    }
    public void elimiarDatos(){
        ArrayList<Cliente> clientesBD = new BaseDatos().leerDatosCliente();
        clientesBD.removeIf(cliente -> cliente.getId().equals(this.getId()));
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("src/BaseDeDatos/Cliente.txt", false))) {
>>>>>>> d08e3af713587066e5fa8cc066051b51c391f622
            oos.writeObject(clientesBD);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}