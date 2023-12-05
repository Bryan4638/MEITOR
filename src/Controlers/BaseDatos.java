package Controlers;

import CodigoMEITOR.Empresa.Clases.Empleado;
import CodigoMEITOR.Empresa.Clases.Jefe;
import CodigoMEITOR.GestionDeVentas.Clases.Articulo;
import CodigoMEITOR.GestionDeVentas.Clases.ArticuloInterface;
import CodigoMEITOR.LoginRegister.Clases.Cliente;
import CodigoMEITOR.LoginRegister.Clases.Proveedor;

import java.io.*;
import java.util.ArrayList;

public class BaseDatos {
    public void guardarDatos(Cliente cliente, boolean rescribir) {
        ArrayList<Cliente> c = leerDatosCliente();
        //ArrayList<Cliente> c = new ArrayList<Cliente>();
        c.add(cliente);
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("src/BaseDeDatos/Cliente.txt", rescribir))) {
            oos.writeObject(c);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void guardarDatos(Proveedor proveedor) {
        ArrayList<Proveedor> proveedors = leerDatosProveedor();
        //ArrayList<Proveedor> proveedors = new ArrayList<Proveedor>();
        proveedors.add(proveedor);
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("src/BaseDeDatos/Proveedor.txt"))) {
            oos.writeObject(proveedors);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void guardarDatos(ArrayList<ArticuloInterface> articulo){
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("src/BaseDeDatos/Articulos.txt"))) {
            oos.writeObject(articulo);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void guardarDatos(Empleado empleado) {
        ArrayList<Empleado> empleados = leerDatosEmpleado();
        //ArrayList<Proveedor> proveedors = new ArrayList<Proveedor>();
        empleados.add(empleado);
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("src/BaseDeDatos/Empleados.txt"))) {
            oos.writeObject(empleados);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void guardarDatos(Jefe jefe) {
        ArrayList<Jefe> jefes = leerDatosJefe();
        //ArrayList<Proveedor> proveedors = new ArrayList<Proveedor>();
        jefes.add(jefe);
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("src/BaseDeDatos/Jefes.txt"))) {
            oos.writeObject(jefes);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public ArrayList<Cliente> leerDatosCliente() {
        String archivo = "src/BaseDeDatos/Cliente.txt";
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        ArrayList<Cliente> clientes = null;
        try {
            fis = new FileInputStream(archivo);
            ois = new ObjectInputStream(fis);
            clientes = (ArrayList<Cliente>) ois.readObject();

        } catch (EOFException e) {
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace(System.out);
        } finally {
            try {
                if (ois != null) ois.close();
                if (fis != null) fis.close();
            } catch (IOException e) {
                e.printStackTrace(System.out);
            }
        }
        return clientes;
    }
    public ArrayList<Proveedor> leerDatosProveedor() {
        String archivo = "src/BaseDeDatos/Proveedor.txt";
        ArrayList<Proveedor> roveedores = null;
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        try {
            fis = new FileInputStream(archivo);
            ois = new ObjectInputStream(fis);
            roveedores = (ArrayList<Proveedor>) ois.readObject();
        } catch (EOFException e) {
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace(System.out);
        } finally {
            try {
                if (ois != null) ois.close();
                if (fis != null) fis.close();
            } catch (IOException e) {
                e.printStackTrace(System.out);
            }
        }
        return roveedores;
    }
    public ArrayList<Empleado> leerDatosEmpleado() {
        String archivo = "src/BaseDeDatos/Empleados.txt";
        ArrayList<Empleado> empleados = null;
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        try {
            fis = new FileInputStream(archivo);
            ois = new ObjectInputStream(fis);
            empleados = (ArrayList<Empleado>) ois.readObject();
        } catch (EOFException e) {
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace(System.out);
        } finally {
            try {
                if (ois != null) ois.close();
                if (fis != null) fis.close();
            } catch (IOException e) {
                e.printStackTrace(System.out);
            }
        }
        return empleados;
    }
    public ArrayList<Jefe> leerDatosJefe() {
        String archivo = "src/BaseDeDatos/Jefes.txt";
        ArrayList<Jefe> jefes = null;
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        try {
            fis = new FileInputStream(archivo);
            ois = new ObjectInputStream(fis);
            jefes = (ArrayList<Jefe>) ois.readObject();
        } catch (EOFException e) {
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace(System.out);
        } finally {
            try {
                if (ois != null) ois.close();
                if (fis != null) fis.close();
            } catch (IOException e) {
                e.printStackTrace(System.out);
            }
        }
        return jefes;
    }

    public Cliente validarLoginCliente(String emlai, String password){
        ArrayList<Cliente> clientes = new BaseDatos().leerDatosCliente();
        for (Cliente cliente : clientes) {
            if (cliente.getEmail().equals(emlai) && cliente.getPassword().equals(password)){
                return cliente;
            }
        }

        return null;
    }
    public Proveedor validarLoginProveedor(String emlai, String password){
        BaseDatos b = new BaseDatos();
        ArrayList<Proveedor> proveedores = b.leerDatosProveedor();
        for (Proveedor proveedor : proveedores) {
            if (proveedor.getEmail().equals(emlai) && proveedor.getPassword().equals(password)){
                return proveedor;
            }
        }

        return null;
    }

    public void borrarDatosCliente(){
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("src/BaseDeDatos/Cliente.txt"))) {
            oos.writeObject(new ArrayList<Cliente>());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void borrarDatosProveedor(){
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("src/BaseDeDatos/Proveedor.txt"))) {
            oos.writeObject(new ArrayList<Proveedor>());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void borrarDatosArticulo(){
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("src/BaseDeDatos/Articulo.txt"))) {
            oos.writeObject(new ArrayList<Articulo>());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
