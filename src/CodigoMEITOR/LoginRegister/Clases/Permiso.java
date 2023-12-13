package CodigoMEITOR.LoginRegister.Clases;

import java.io.Serializable;

public class Permiso implements Serializable, PermisoInterface {
    private String id;
    private String nombre;

    public Permiso(String id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    // Getters y setters...

    @Override
    public String getId() {
        return id;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

}

