package Controlers;
import java.security.SecureRandom;

public class GenerarID {
    public String generarIDUsuario(String nombre, String email) {
        if (nombre == null || nombre.isEmpty() || email == null || email.isEmpty()) {
            throw new IllegalArgumentException("Nombre y email no pueden ser vacíos.");
        }

        // Tomar el primer carácter del nombre
        String idNombre = nombre.substring(0, 1).toLowerCase();

        // Tomar la parte del email antes de '@'
        String idEmail;
        int indiceArroba = email.indexOf('@');
        if (indiceArroba != -1) {
            idEmail = email.substring(0, indiceArroba).toLowerCase();
        } else {
            throw new IllegalArgumentException("Email inválido.");
        }

        // Concatenar para formar el ID
        return idNombre + "_" + idEmail;
    }


    public String generarRandomID() {
        final String CHARACTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%";
        final int LENGTH = 10; // Puedes cambiar la longitud del ID aquí
        final SecureRandom random = new SecureRandom();

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < LENGTH; i++) {
            sb.append(CHARACTERS.charAt(random.nextInt(CHARACTERS.length())));
        }
        return sb.toString();
    }

}
