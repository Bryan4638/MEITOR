package CodigoMEITOR.GestionDeVentas.Clases;

import CodigoMEITOR.Almacen.Clases.StockInterface;

public interface ArticuloInterface {
    // Getters y setters...
    Categoria getCategoria();

    StockInterface getStock();

    boolean validarDisponibilidad();

    void aplicarDescuento(float porciento);

    Object getId();

    String getNombre();

    String getImage();
}
