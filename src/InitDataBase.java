
import CodigoMEITOR.Almacen.Clases.RegistroCompra;
import CodigoMEITOR.Almacen.Clases.RegistroVenta;
import CodigoMEITOR.Almacen.Clases.Stock;
import CodigoMEITOR.Empresa.Clases.Empleado;
import CodigoMEITOR.Empresa.Clases.Empresa;
import CodigoMEITOR.Empresa.Clases.Jefe;
import CodigoMEITOR.GestionDeVentas.Clases.Articulo;
import CodigoMEITOR.GestionDeVentas.Clases.ArticuloInterface;
import CodigoMEITOR.GestionDeVentas.Clases.Categoria;
import CodigoMEITOR.GestionDeVentas.Clases.Venta;
import CodigoMEITOR.LoginRegister.Clases.Cliente;
import CodigoMEITOR.LoginRegister.Clases.Permiso;
import CodigoMEITOR.LoginRegister.Clases.Proveedor;
import Controlers.GenerarID;

import java.io.*;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

public class InitDataBase {
    public static void main(String[] args) {
        ArrayList<Cliente> c = new ArrayList<Cliente>();

        String name = "Admin";
        String email = "admin@gmail.com";
        String password = "admin123";

        String fechaString = String.valueOf(LocalDate.now());
        Date fecDate = new Date();
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        try {
            fecDate = format.parse(fechaString);
        } catch (Exception e) {
            // TODO: handle exception
        }
        Cliente cliente = new Cliente(new GenerarID().generarIDUsuario(name, email), name, email, password, 0,
                new Permiso(new GenerarID().generarRandomID(), "Administrador"), new Venta(), fecDate);
        c.add(cliente);
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("src/BaseDeDatos/Cliente.txt"))) {
            oos.writeObject(c);
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("src/BaseDeDatos/Empleados.txt"))) {
            oos.writeObject(new ArrayList<Empleado>());
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("src/BaseDeDatos/Empresa.txt"))) {
            oos.writeObject(new ArrayList<Empresa>());
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("src/BaseDeDatos/Jefes.txt"))) {
            oos.writeObject(new ArrayList<Jefe>());
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (ObjectOutputStream oos = new ObjectOutputStream(
                new FileOutputStream("src/BaseDeDatos/LogRegistroCompra.txt"))) {
            oos.writeObject(new ArrayList<RegistroCompra>());
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (ObjectOutputStream oos = new ObjectOutputStream(
                new FileOutputStream("src/BaseDeDatos/LogRegistroVenta.txt"))) {
            oos.writeObject(new ArrayList<RegistroVenta>());
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("src/BaseDeDatos/Proveedor.txt"))) {
            oos.writeObject(new ArrayList<Proveedor>());
        } catch (IOException e) {
            e.printStackTrace();
        }

        ArrayList<ArticuloInterface> articulos = new ArrayList<ArticuloInterface>();
        for (int i = 1; i <= 10; i++) {
            ArticuloInterface articulo = new Articulo(new GenerarID().generarRandomID(), "Blusa" + i,
                    new Stock(16 + i, 30 + i),
                    new Categoria(new GenerarID().generarRandomID(), "Blusas de mujer", "para mujeres" + i),
                    "/img/ModelosDePrendas/modeloBlusaMujer" + i + ".png");
            articulos.add(articulo);
        }
        for (int i = 1; i <= 10; i++) {
            ArticuloInterface articulo = new Articulo(new GenerarID().generarRandomID(), "Pantalon de hombre" + i,
                    new Stock(30 + i, 16 + i),
                    new Categoria(new GenerarID().generarRandomID(), "Pantalón De Hombre", "para hombre" + i),
                    "/img/ModelosDePrendas/modeloPantalonHombre" + i + ".png");
            articulos.add(articulo);
        }
        for (int i = 1; i <= 7; i++) {
            ArticuloInterface articulo = new Articulo(new GenerarID().generarRandomID(), "Pantalon de mujer" + i,
                    new Stock(20 + i, 12 + i),
                    new Categoria(new GenerarID().generarRandomID(), "Pantalón de mujer", "para mujeres" + i),
                    "/img/ModelosDePrendas/modeloPantalonMujer" + i + ".png");
            articulos.add(articulo);
        }
        for (int i = 1; i <= 8; i++) {
            ArticuloInterface articulo = new Articulo(new GenerarID().generarRandomID(), "Pulover" + i,
                    new Stock(12 + i, 8 + i),
                    new Categoria(new GenerarID().generarRandomID(), "Pulover de Hombre", "para hombres" + i),
                    "/img/ModelosDePrendas/modeloPuloberHombre" + i + ".png");
            articulos.add(articulo);
        }
        for (int i = 1; i <= 11; i++) {
            ArticuloInterface articulo = new Articulo(new GenerarID().generarRandomID(), "Sudadera" + i,
                    new Stock(12 + i, 8 + i),
                    new Categoria(new GenerarID().generarRandomID(), "Sudaderas", "para todos" + i),
                    "/img/ModelosDePrendas/modeloSudadera" + i + ".png");
            articulos.add(articulo);
        }
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("src/BaseDeDatos/Articulos.txt"))) {
            oos.writeObject(articulos);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
