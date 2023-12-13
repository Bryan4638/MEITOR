package CodigoMEITOR.GestionDeVentas.Clases;
import CodigoMEITOR.LoginRegister.Clases.Cliente;

import java.io.Serializable;
import java.util.ArrayList;

public class Venta implements Serializable, VentaInterface {
    private String idVenta;
    private Cliente cliente; // Asociación con Cliente
    private ArrayList<ArticuloInterface> articulos = new ArrayList<ArticuloInterface>(); // Asociación con Articulo

    public Venta(){

    }

    public Venta(String idVenta) {
        this.idVenta=idVenta;
    }

    // Getters y setters...
    @Override
    public String getIdVenta() {
        return idVenta;
    }

    @Override
    public void setCliente(Cliente cliente){
        this.cliente=cliente;
    }

    @Override
    public Cliente getCliente() {
        return cliente;
    }

    @Override
    public ArrayList<ArticuloInterface> getArticulos() {
        return articulos;
    }

    @Override
    public void setArticulos(ArticuloInterface articulo){
        this.articulos.add(articulo);
    }
    @Override
    public float calcularValorDeVenta(){
        float montoAPagar = 0;
        for (ArticuloInterface articulo : articulos) {
            montoAPagar = montoAPagar + articulo.getStock().getPrecio();
        }
        return montoAPagar;
    }
    @Override
    public void finalizarVenta(){
        this.articulos = new ArrayList<>();
    }
    @Override
    public void eliminarArticulo(String id){
        articulos.removeIf(articulo -> articulo.getId().equals(id));
    }

    @Override
    public void eliminarArticulo(Object id) {
        articulos.removeIf(articulo -> articulo.getId().equals(id));
    }
}

