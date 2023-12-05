package CodigoMEITOR.GestionDeVentas.Clases;

import java.io.Serializable;

public class Prenda implements Serializable {
    private String id;
    private String nombre;
    private String image;

    public Prenda(){

    }

    public Prenda(String id, String nombre, String image) {
        this.id = id;
        this.nombre = nombre;
        this.image=image;
    }

    // Getters y setters...

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
