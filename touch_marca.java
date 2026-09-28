import java.io.File;
import java.io.IOException;

public class touch_marca {
    public static void main(String[] args) throws IOException, InterruptedException {
        ProcessBuilder constructor = new ProcessBuilder("touch", "marca.txt");
        
        String rutaUsuario = System.getProperty("user.home") + "/Documentos/PSP/carpeta";
        constructor.directory(new File(rutaUsuario));
        
        Process proceso = constructor.start();
        int codigoSalida = proceso.waitFor();
        
        if (codigoSalida == 0) {
            System.out.println("Todo correcto.");
        } else {
            System.out.println("Ha habido un fallo.");
        }
    }
}