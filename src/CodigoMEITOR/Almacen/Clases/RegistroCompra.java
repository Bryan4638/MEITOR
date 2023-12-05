package CodigoMEITOR.Almacen.Clases;

import CodigoMEITOR.GestionDeVentas.Clases.CompraInterface;
import CodigoMEITOR.LoginRegister.Clases.Proveedor;

import java.io.*;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

public class RegistroCompra implements Serializable {
    private Proveedor proveedor;
    private CompraInterface compra;
    private LocalDate fecha ;
    private LocalTime hora;

    public RegistroCompra(){

    }
    public RegistroCompra(Proveedor proveedor, CompraInterface compraInterface){
        this.proveedor=proveedor;
        this.compra= compraInterface;
        this.fecha = LocalDate.now();
        this.hora= LocalTime.now();
    }

    public Proveedor getProveedor() {
        return proveedor;
    }
    public void setProveedor(Proveedor proveedor) {
        this.proveedor = proveedor;
    }
    public CompraInterface getCompra() {
        return compra;
    }
    public void setCompra(CompraInterface compraInterface) {
        this.compra = compraInterface;
    }
    public LocalDate getFecha() {
        return fecha;
    }
    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }
    public LocalTime getHora() {
        return hora;
    }
    public void setHora(LocalTime hora) {
        this.hora = hora;
    }

    public void logRegistroCompra(){
        ArrayList<RegistroCompra> registroCompras = leerLogRegistroCompra();
        registroCompras.add(this);
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("src/BaseDeDatos/LogRegistroCompra.txt"))) {
            oos.writeObject(registroCompras);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public ArrayList<RegistroCompra> leerLogRegistroCompra(){
        String archivo = "src/BaseDeDatos/LogRegistroCompra.txt";
        ArrayList<RegistroCompra> registroCompras = null;
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        try {
            fis = new FileInputStream(archivo);
            ois = new ObjectInputStream(fis);
            registroCompras = (ArrayList<RegistroCompra>) ois.readObject();
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
        return registroCompras;
    }

    public void eliminarRegistro(){
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("src/BaseDeDatos/LogRegistroCompra.txt"))) {
            oos.writeObject(new ArrayList<RegistroCompra>());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
