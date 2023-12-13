package CodigoMEITOR.Almacen.Clases;
import CodigoMEITOR.Empresa.Clases.EmpresaInterface;
import CodigoMEITOR.GestionDeVentas.Clases.ArticuloInterface;

import java.io.*;
import java.util.ArrayList;

public class Stock implements Serializable, StockInterface {
    private String idStock;
    private float precioTotal;
    private float precio;
    private int cantidadEnStock;
    private EmpresaInterface empresaInterface; // Asociación con Empresa
    private ArrayList<ArticuloInterface> articulos; // Asociación con Articulo

    public Stock(){

    }
    public Stock( float precio, int cantidadEnStock, ArrayList<ArticuloInterface> articulos) {
        this.precio=precio;
        this.cantidadEnStock=cantidadEnStock;
        this.articulos = articulos;
    }

    public Stock( float precio, int cantidadEnStock) {
        this.precio=precio;
        this.cantidadEnStock=cantidadEnStock;
    }

    // Getters y setters...

    @Override
    public float getPrecio() {
        return precio;
    }
    @Override
    public String getIdStock() {
        return idStock;
    }
    @Override
    public EmpresaInterface getEmpresa() {
        return empresaInterface;
    }
    @Override
    public void setEmpresa(EmpresaInterface empresaInterface) {
        this.empresaInterface = empresaInterface;
    }


    @Override
    public ArrayList<ArticuloInterface> getArticulos() {
        String archivo = "src/BaseDeDatos/Articulos.txt";
        ArrayList<ArticuloInterface> articulos = null;
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        try {
            fis = new FileInputStream(archivo);
            ois = new ObjectInputStream(fis);
            articulos = (ArrayList<ArticuloInterface>) ois.readObject();
        } catch (EOFException e) {
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace(System.out);
        } finally {
            try {
                if (ois != null) ois.close();
                if (fis != null) fis.close();
            } catch (IOException e) {
                e.printStackTrace(System.out);
            }
        }
        return articulos;
    }


    @Override
    public void setArticulos(ArticuloInterface articuloInterface) {
        ArrayList<ArticuloInterface> articulos = getArticulos();
        articulos.add(articuloInterface);
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("src/BaseDeDatos/Articulos.txt", false))) {
            oos.writeObject(articulos);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public int getCantidadEnStock() {
        return cantidadEnStock;
    }

    @Override
    public void incrementarStock(int stock){
        this.cantidadEnStock = cantidadEnStock + stock;
    }

    @Override
    public void decrementarStock(int stock){
        this.cantidadEnStock = cantidadEnStock - stock;
    }

    @Override
    public int verificarNivelStock(){
        return cantidadEnStock;
    }

    @Override
    public void actualizarPrecio(float precio){
        this.precio= precio;
    }

}
