package CodigoMEITOR.GestionDeVentas.Clases;

import CodigoMEITOR.Empresa.Clases.EmpresaInterface;
import CodigoMEITOR.LoginRegister.Clases.Proveedor;

import java.util.ArrayList;

public interface CompraInterface {
    int getIdCompra();

    Proveedor getProveedor();

    EmpresaInterface getEmpresa();

    ArrayList<ArticuloInterface> getArticulos();

    void setProveedor(Proveedor proveedor);

    void setArticulos(ArticuloInterface articulos);

    float calcularValorDeCompra();

    void finalizarCompra();

    void eliminarArticulo(String id);
}
