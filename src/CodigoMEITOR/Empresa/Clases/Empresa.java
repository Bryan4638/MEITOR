package CodigoMEITOR.Empresa.Clases;
import CodigoMEITOR.LoginRegister.Clases.Proveedor;
import Controlers.BaseDatos;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

public class Empresa implements Serializable, EmpresaInterface {
    private String nombre;
    private ArrayList<Proveedor> proveedores;

    private ArrayList<Jefe> jefes;
    private ArrayList<Empleado> empleados;

    public Empresa(){

    }

    public Empresa(String nombre, ArrayList<Proveedor> proveedores,ArrayList<Jefe> jefes, ArrayList<Empleado> empleados ) {
        this.nombre = nombre;
        this.jefes=jefes;
        this.empleados=empleados;
        this.proveedores = proveedores;
    }

    // Getters y setters...

    @Override
    public String getNombre() {
        return nombre;
    }
    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    @Override
    public ArrayList<Proveedor> getProveedores() {
        return proveedores;
    }
    @Override
    public void setProveedores(ArrayList<Proveedor> proveedores) {
        this.proveedores = proveedores;
    }
    @Override
    public ArrayList<Jefe> getJefe() {
        return jefes;
    }
    @Override
    public void setJefe(ArrayList<Jefe> jefes) {
        this.jefes = jefes;
    }
    @Override
    public ArrayList<Empleado> getEmpleado() {
        return empleados;
    }
    @Override
    public void setEmpleado(ArrayList<Empleado> empleados) {
        this.empleados = empleados;
    }

    @Override
    public void despedirEmpleado(Empleado empleado){
        ArrayList<Empleado> empleados1 = new BaseDatos().leerDatosEmpleado();
        empleados1.removeIf(empleado1 -> empleado1.getId().equals(empleado.getId()));
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("src/BaseDeDatos/Empleados.txt", false))) {
            oos.writeObject(empleados1);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void despedirJefes(Jefe jefe){
        ArrayList<Jefe> jefes1 = new BaseDatos().leerDatosJefe();
        jefes1.removeIf(jefe1 -> jefe1.getId().equals(jefe.getId()));
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("src/BaseDeDatos/Jefes.txt", false))) {
            oos.writeObject(jefes1);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
