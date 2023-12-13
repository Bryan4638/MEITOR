package CodigoMEITOR.Empresa.Clases;

import Controlers.BaseDatos;
import Controlers.GenerarID;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

public class Empleado extends Persona implements Serializable, EmpleadoInterface {
    private String id;
    private String zonaDeTrabajo;
    private String tiempoDetrabajo;
    private float sueldo;

    public Empleado() {

    }

    public Empleado(String name, String email, int edad, String zonaDeTrabajo, String tiempoDetrabajo, float sueldo) {
        super(name, email, edad);
        this.id = new GenerarID().generarRandomID();
        this.zonaDeTrabajo = zonaDeTrabajo;
        this.tiempoDetrabajo = tiempoDetrabajo;
        this.sueldo = sueldo;
    }

    @Override
    public String getId() {
        return id;
    }
    @Override
    public void setId(String id) {
        this.id = id;
    }
    @Override
    public String getZonaDeTrabajo() {
        return zonaDeTrabajo;
    }
    @Override
    public void setZonaDeTrabajo(String zonaDeTrabajo) {
        this.zonaDeTrabajo = zonaDeTrabajo;
    }
    @Override
    public String getTiempoDetrabajo() {
        return tiempoDetrabajo;
    }
    @Override
    public void setTiempoDetrabajo(String tiempoDetrabajo) {
        this.tiempoDetrabajo = tiempoDetrabajo;
    }
    @Override
    public float getSueldo() {
        return sueldo;
    }
    @Override
    public void setSueldo(float sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public void actualizar(){
        ArrayList<Empleado> empleados = new BaseDatos().leerDatosEmpleado();
        empleados.removeIf(empleado -> empleado.getId().equals(this.getId()));
        empleados.add(this);
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("src/BaseDeDatos/Empleados.txt", false))) {
            oos.writeObject(empleados);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }



}

