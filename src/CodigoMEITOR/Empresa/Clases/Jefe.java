package CodigoMEITOR.Empresa.Clases;

import Controlers.BaseDatos;
import Controlers.GenerarID;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

public class Jefe extends Persona implements Serializable, JefeInterface {
    private String id;
    private String cargo;
    private String tiempoDeTrabajo;
    private float sueldo;

    public Jefe() {

    }

    public Jefe(String name, String email, int edad, String cargo, String tiempoDeTrabajo, float sueldo) {
        super(name, email, edad);
        this.id = new GenerarID().generarRandomID();
        this.cargo = cargo;
        this.tiempoDeTrabajo = tiempoDeTrabajo;
        this.sueldo = sueldo;
    }

    @Override
    public String getId() {
        return id;
    }
    @Override
    public String getCargo() {
        return cargo;
    }
    @Override
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    @Override
    public String getTiempoDeTrabajo() {
        return tiempoDeTrabajo;
    }
    @Override
    public void setTiempoDeTrabajo(String tiempoDeTrabajo) {
        this.tiempoDeTrabajo = tiempoDeTrabajo;
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
        ArrayList<Jefe> jefes = new BaseDatos().leerDatosJefe();
        jefes.removeIf(jefe -> jefe.getId().equals(this.getId()));
        jefes.add(this);
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("src/BaseDeDatos/Jefes.txt", false))) {
            oos.writeObject(jefes);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }



}

