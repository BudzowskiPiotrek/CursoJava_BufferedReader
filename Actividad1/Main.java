package CursoJava_BufferedReader.Actividad1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int numeroLineas = 0;
        int numeroPalabras = 0;
        int numeroCaracteres = 0;
        boolean flag = true;

        while (flag) {
            System.out.println("Intraduce el texto, para terminar escribe 'fin'");
            String texto;
            try {
                texto = br.readLine();
                if (texto.equalsIgnoreCase("fin")) {
                    System.out.println("Num lineas:" + numeroLineas);
                    System.out.println("Num Palabras:" + numeroPalabras);
                    System.out.println("Num caracter:" + numeroCaracteres);
                    flag = false;
                } else {
                    numeroLineas++;
                    numeroPalabras += contarPalabras(texto);
                    numeroCaracteres += texto.length();
                }
            } catch (IOException e) {

                e.printStackTrace();
            }
        }
    }

    private static int contarPalabras(String texto) {
        if (texto == null) {
            return 0;
        }
        return texto.trim().split("\\s+").length;
        // TRIM PARA ELIMINAR ESPACIOS AL PRINCIPIO Y FINAL
        // SPLIT DIVIDE EN UYNA ARRAY DE STRING UNO O MAS ESPACIOS
    }

}