package CodigoMEITOR.Empresa.Clases;

import CodigoMEITOR.LoginRegister.Clases.Proveedor;

import java.util.ArrayList;

public interface EmpresaInterface {
    String getNombre();

    void setNombre(String nombre);

    ArrayList<Proveedor> getProveedores();

    void setProveedores(ArrayList<Proveedor> proveedores);

    ArrayList<Jefe> getJefe();

    void setJefe(ArrayList<Jefe> jefes);

    ArrayList<Empleado> getEmpleado();

    void setEmpleado(ArrayList<Empleado> empleados);

    void despedirEmpleado(Empleado empleado);

    void despedirJefes(Jefe jefe);
}
