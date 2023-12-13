package CodigoMEITOR.GestionDeVentas.Clases;

import CodigoMEITOR.LoginRegister.Clases.Cliente;

import java.util.ArrayList;

public interface VentaInterface {
    // Getters y setters...
    String getIdVenta();

    void setCliente(Cliente cliente);

    Cliente getCliente();

    ArrayList<ArticuloInterface> getArticulos();

    void setArticulos(ArticuloInterface articulo);

    float calcularValorDeVenta();

    void finalizarVenta();

    void eliminarArticulo(String id);

    void eliminarArticulo(Object id);
}
