package CodigoMEITOR.Almacen.Clases;

import CodigoMEITOR.Empresa.Clases.EmpresaInterface;
import CodigoMEITOR.GestionDeVentas.Clases.ArticuloInterface;

import java.util.ArrayList;

public interface StockInterface {
    float getPrecio();

    String getIdStock();

    EmpresaInterface getEmpresa();

    void setEmpresa(EmpresaInterface empresa);

    ArrayList<ArticuloInterface> getArticulos();

    void setArticulos(ArticuloInterface articulo);

    int getCantidadEnStock();

    void incrementarStock(int stock);

    void decrementarStock(int stock);

    int verificarNivelStock();

    void actualizarPrecio(float precio);
}
