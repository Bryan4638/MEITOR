package CodigoMEITOR.Empresa.Clases;

import java.io.Serializable;

public class Persona implements Serializable {
    private String name;
    private String email;
    private int edad;

    public Persona() {
    }

    public Persona(String name, String email, int edad) {
        this.name = name;
        this.email = email;
        this.edad = edad;
    }

    public String getName() {
        return name;
    }
    public String getEmail() {
        return email;
    }
    public int getEdad() {
        return edad;
    }

    public void actualizarPerfil(String name, String email, int edad){
        this.name = name;
        this.email= email;
        this.edad = edad;
    }
}
