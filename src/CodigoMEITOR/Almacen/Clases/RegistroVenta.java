package CodigoMEITOR.Almacen.Clases;

import CodigoMEITOR.GestionDeVentas.Clases.VentaInterface;
import CodigoMEITOR.LoginRegister.Clases.Cliente;

import java.io.*;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

public class RegistroVenta implements Serializable {
    private Cliente cliente;
    private VentaInterface venta;
    private LocalDate fecha ;
    private LocalTime hora;

    public RegistroVenta(){

    }
    public RegistroVenta(Cliente cliente, VentaInterface ventaInterface){
        this.cliente=cliente;
        this.venta= ventaInterface;
        this.fecha = LocalDate.now();
        this.hora= LocalTime.now();

    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public VentaInterface getVenta() {
        return venta;
    }

    public void setVenta(VentaInterface ventaInterface) {
        this.venta = ventaInterface;
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

    public void logRegistroVenta(){
        ArrayList<RegistroVenta> registroVentas = leerLogRegistroVenta();
        registroVentas.add(this);
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("src/BaseDeDatos/LogRegistroVenta.txt"))) {
            oos.writeObject(registroVentas);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public ArrayList<RegistroVenta> leerLogRegistroVenta(){
        String archivo = "src/BaseDeDatos/LogRegistroVenta.txt";
        ArrayList<RegistroVenta> registroVentas = null;
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        try {
            fis = new FileInputStream(archivo);
            ois = new ObjectInputStream(fis);
            registroVentas = (ArrayList<RegistroVenta>) ois.readObject();
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
        return registroVentas;
    }
    public void eliminarRegistro(){
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("src/BaseDeDatos/LogRegistroVenta.txt"))) {
            oos.writeObject(new ArrayList<RegistroVenta>());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
