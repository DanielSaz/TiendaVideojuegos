import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class GestorPersistencia {
    private static final String RUTA = "Tienda Videojuegos/src/texto.txt";

    public void añadirVideojuego(Videojuego videojuego){
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(RUTA, true))) {
        writer.write(videojuego.tofileString());
        writer.newLine();

        } catch (IOException e) {
            System.err.println("Error al guardar el libro" + e.getMessage());
        }
    }

    public ArrayList<Videojuego>  actualizarVideojuegos(){
     ArrayList<Videojuego> videojuegos = new ArrayList<>();
       try (BufferedReader reader = new BufferedReader(new FileReader(RUTA))) {
          String linea; 
          while ((linea = reader.readLine())!= null){
            String[] campos = linea.split(";");
            if(campos.length == 4){
                videojuegos.add(new Videojuego(campos[0], campos[1], campos[2], Integer.parseInt(campos[3].trim())));
            }
          }
     } catch (IOException e) {
       System.err.println("Error al leer el fichero" + e.getMessage());
      }
      return videojuegos;
    }

    public void existeCodigo(ArrayList <Videojuego> videojuegos, String codigo ){

    }



}
