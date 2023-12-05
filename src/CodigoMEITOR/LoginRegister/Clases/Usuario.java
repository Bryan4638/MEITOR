package CodigoMEITOR.LoginRegister.Clases;

import java.io.Serializable;

public class Usuario implements Serializable {
    private String id;
    private String name;
    private String email;
    private String password;
    public Usuario(){
    }
    public Usuario(String id, String name, String email, String password) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
    }
    // Getters y setters...
    public String getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String getEmail() {
        return email;
    }
    public String getPassword() {
        return password;
    }
    public void setId(String id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public void actualizarPerfil(String name, String email, String password){
        this.name = name;
        this.email= email;
        this.password = password;

    }
}
