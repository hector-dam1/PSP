package UD1_Cap3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ej04 {
    public static void main(String[] args) throws IOException, InterruptedException {
        Process grep = new ProcessBuilder("grep", "Java", "archivo.txt").start();

        BufferedReader salida = new BufferedReader(new InputStreamReader(grep.getInputStream()));
        BufferedReader error = new BufferedReader(new InputStreamReader(grep.getErrorStream()));

        System.out.println("Salida:");
        String linea;
        while ((linea = salida.readLine()) != null) {
            System.out.println(linea);
        }

        System.out.println();
         while ((linea = error.readLine()) != null) {
            System.out.println(linea);
        }

        int coidgoSalida = grep.waitFor();
        System.out.println("Código de salida: " + coidgoSalida);
    }
}