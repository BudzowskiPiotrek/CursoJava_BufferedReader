package CursoJava_BufferedReader.Actividad4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String contrasena = null;

        do {
            System.out
                    .println("Dime una contraseña que tenga al menos una letra grande un numero y minimo 8 caracteres");
            try {
                contrasena = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } while (!contrasena.matches("^(?=.*[A-Z])(?=.*[0-9]).{8,}$"));
        System.out.println("La contraseña creada : " + contrasena);
        try {
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
