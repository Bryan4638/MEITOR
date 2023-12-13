package CodigoMEITOR.GestionDeVentas.Clases;
import java.io.Serializable;
import java.util.ArrayList;

public class Categoria implements Serializable {
    private String idCategoria;
    private String nombre;
    private String descripcion;

    private ArrayList<ArticuloInterface> articulos; // Asociación con Articulo

    public Categoria(){

    }
    public Categoria(String idCategoria, String nombre, String descripcion) {
        this.idCategoria = idCategoria;
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    // Getters y setters...

    public String getIdCategoria() {
        return idCategoria;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public ArrayList<ArticuloInterface> getArticulos() {
        return articulos;
    }

    public void editarDescripcion(String descripcion){
        this.descripcion = descripcion;
    }

}
