package CodigoMEITOR.GestionDeVentas.Clases;
import CodigoMEITOR.Almacen.Clases.StockInterface;

import java.io.Serializable;

public class Articulo extends Prenda implements Serializable, ArticuloInterface {

    private Categoria categoria; // Asociación con Categoria
    private StockInterface stock; // Asociación con Stock

    public Articulo(){

    }

    public Articulo(String id, String nombre, StockInterface stockInterface, Categoria categoria, String image) {
        super(id, nombre, image);
        this.stock= stockInterface;
        this.categoria =  categoria;
    }

    // Getters y setters...
    @Override
    public Categoria getCategoria() {
        return categoria;
    }
    @Override
    public StockInterface getStock() {
        return stock;
    }

    @Override
    public boolean validarDisponibilidad(){
        if(stock.verificarNivelStock()==0){
            return false;
        }
        return true;
    }
    @Override
    public void aplicarDescuento(float porciento){
        float precio = stock.getPrecio();
        float precioActualizado = (porciento * precio)/100;
        stock.actualizarPrecio(precioActualizado);
    }

}

