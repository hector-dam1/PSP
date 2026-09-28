import java.io.IOException;
public class mkdir {
    public static void main(String[] args) throws IOException, InterruptedException{
        ProcessBuilder constructor = new ProcessBuilder("mkdir", "carpetaPrueba");
        Process proceso = constructor.start();
        int codigoSalida = proceso.waitFor();
        if (codigoSalida == 0){
            System.out.println("Todo correcto.");
        } else {
            System.out.println("No se ha podido crear la carpeta.");
        }
    } 
}
