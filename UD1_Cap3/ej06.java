package UD1_Cap3;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

public class ej06 {
    public static void main(String[] args)throws IOException, InterruptedException {
        ProcessBuilder pbDisco = new ProcessBuilder("df", "-h");
        pbDisco.redirectOutput(new File("espacioDisco.txt"));

        ProcessBuilder pbInfo = new ProcessBuilder("uname", "-a");
        pbInfo.redirectOutput(new File("infoGeneral.txt"));

        Process espacioDisco = pbDisco.start();
        Process infoGeneral = pbInfo.start();

        int codigoDisco = espacioDisco.waitFor();
        int codigoInfo = infoGeneral.waitFor();

        System.out.println("Codigo de salida de df: " + codigoDisco);
        System.out.println("Codigo de salida de uname: " + codigoInfo);

    }
}
