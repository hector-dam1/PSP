package UD1_Cap3;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

public class ej05 {
    public static void main(String[] args) throws IOException, InterruptedException {
        ProcessBuilder lista = new ProcessBuilder("seq", "1", "20");
        ProcessBuilder ultimas5 = new ProcessBuilder("tail", "-n", "5");

        List<Process> Procesos = ProcessBuilder.startPipeline(List.of(lista, ultimas5));

        Process ultimo = Procesos.get(Procesos.size() -1);
        BufferedReader lector = new BufferedReader(new InputStreamReader(ultimo.getInputStream()));

        String liena;
        while ((liena = lector.readLine()) != null) {
            System.out.println(liena);
        }

        int codigoSeq = Procesos.get(0).waitFor();
        int codigoTail = Procesos.get(0).waitFor();

        System.out.println("Codigo de salida de seq: " + codigoSeq);
        System.out.println("Codigo de salida de tail: " + codigoTail);
        
    }
}