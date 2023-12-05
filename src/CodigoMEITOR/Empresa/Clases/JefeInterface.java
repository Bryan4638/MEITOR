package CodigoMEITOR.Empresa.Clases;

public interface JefeInterface {
    String getId();

    String getCargo();

    void setCargo(String cargo);

    String getTiempoDeTrabajo();

    void setTiempoDeTrabajo(String tiempoDeTrabajo);

    float getSueldo();

    void setSueldo(float sueldo);

    void actualizar();
}
