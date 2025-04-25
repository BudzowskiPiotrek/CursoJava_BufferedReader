package CursoJava_BufferedReader.Actividad2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String texto = null;
        StringBuilder arreves = null;
        do {
            System.out.println("Escribe lininea de texto, para salir escribe salir");
            try {
                texto = br.readLine();
                arreves = new StringBuilder();

                for (int i = texto.length() - 1; i >= 0; i--) {
                    arreves.append(texto.charAt(i));
                }
                System.out.println(arreves);
            } catch (IOException e) {
                e.printStackTrace();
            }

        } while (!texto.equalsIgnoreCase("Salir"));

        try {
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
