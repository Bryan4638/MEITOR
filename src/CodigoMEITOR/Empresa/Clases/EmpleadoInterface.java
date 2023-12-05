package CodigoMEITOR.Empresa.Clases;

public interface EmpleadoInterface {
    String getId();

    void setId(String id);

    String getZonaDeTrabajo();

    void setZonaDeTrabajo(String zonaDeTrabajo);

    String getTiempoDetrabajo();

    void setTiempoDetrabajo(String tiempoDetrabajo);

    float getSueldo();

    void setSueldo(float sueldo);

    void actualizar();
}
