import java.io.IOException;
public class cat_no_existe {
    public static void main(String[] args) throws IOException, InterruptedException{
        ProcessBuilder constructor = new ProcessBuilder("cat", "archivo_no_existe.txt");
        Process proceso = constructor.start();
        int codigoSalida = proceso.waitFor();
        if (codigoSalida == 0){
            System.out.println("Todo correcto.");
        } else {
            System.out.println("Ha habido un fallo.");
        }
    } 
}
