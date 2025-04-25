package CursoJava_BufferedReader.Actividad3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String texto = null;
        int suma = 0;

        do {
            System.out.println("Dime los suma para sumar, para terminar escribe 'fin'");
            try {
                texto = br.readLine();
                if (texto.matches("\\d+")) {
                    suma += Integer.parseInt(texto);
                    System.out.println("La suma es de: " + suma);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        } while (!texto.equalsIgnoreCase("fin"));

        System.out.println("Saliendo de la app");
        try {
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
