package CodigoMEITOR.GestionDeVentas.Clases;
import CodigoMEITOR.Empresa.Clases.EmpresaInterface;
import CodigoMEITOR.LoginRegister.Clases.Proveedor;

import javax.swing.*;
import java.io.Serializable;
import java.util.ArrayList;

public class Compra implements Serializable, CompraInterface {
    private int idCompra;
    private Proveedor proveedor; // Asociación con Proveedor
    private EmpresaInterface empresa; // Asociación con Empresa
    private ArrayList<ArticuloInterface> articulos; // Asociación con Articulo

    public Compra(ArrayList<ArticuloInterface> articulos){
        this.articulos= articulos;
    }

    public Compra(int idCompra, ArrayList<ArticuloInterface> articulos) {
        this.idCompra = idCompra;
        this.articulos= articulos;
    }

    // Getters y setters...

    @Override
    public int getIdCompra() {
        return idCompra;
    }
    @Override
    public Proveedor getProveedor() {
        return proveedor;
    }
    @Override
    public EmpresaInterface getEmpresa() {
        return empresa;
    }

    @Override
    public ArrayList<ArticuloInterface> getArticulos() {
        return articulos;
    }
    @Override
    public void setProveedor(Proveedor proveedor) {
        this.proveedor = proveedor;
    }

    @Override
    public void setArticulos(ArticuloInterface articulos) {
        this.articulos.add(articulos);
    }
    @Override
    public float calcularValorDeCompra(){
        float montoACobrar = 0;
        for (ArticuloInterface articulo : articulos) {
            montoACobrar = montoACobrar + articulo.getStock().getPrecio();
        }
        return montoACobrar;
    }

    @Override
    public void finalizarCompra(){
        this.articulos = null;
    }

    @Override
    public void eliminarArticulo(String id){
        for (ArticuloInterface articulo : articulos) {
            if (articulo.getId().equals(id)){
                articulos.remove(articulos.indexOf(articulo));
            }
        }
        JOptionPane.showMessageDialog(null, "Articulo eliminado.");
    }

}

