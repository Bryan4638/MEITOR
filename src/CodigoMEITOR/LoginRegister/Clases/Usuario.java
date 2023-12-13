package CodigoMEITOR.LoginRegister.Clases;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.Period;
import java.util.Calendar;
import java.util.Date;
//import java.sql.Date;

public class Usuario implements Serializable {
    private static final long serialVersionUID = 1L;
    private String id;
    private String name;
    private String email;
    private String password;
    private Date fechaDeNacimineto;

    public Usuario() {
    }

    public Usuario(String id, String name, String email, String password, Date fechaDeNacimineto) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.fechaDeNacimineto = fechaDeNacimineto;
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

    public Date getFechadeNacimiento() {
        return fechaDeNacimineto;
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

    public void setFechaDeNacimiento(Date fechaDeNacimineto) {
        this.fechaDeNacimineto = fechaDeNacimineto;
    }

    public void actualizarPerfil(String name, String email, String password, Date fechaDeNacimineto) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.fechaDeNacimineto = fechaDeNacimineto;

    }

    public int edad() {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(fechaDeNacimineto);
        int año = calendar.get(Calendar.YEAR);
        LocalDate actual = LocalDate.now();
        int actualInt = actual.getYear();
        return actualInt - año;
    }
}
