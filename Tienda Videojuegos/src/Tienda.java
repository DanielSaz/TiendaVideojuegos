import java.util.ArrayList;
import java.util.Scanner;
public class Tienda {
    Scanner sc = new Scanner(System.in);
    GestorPersistencia gestor = new GestorPersistencia();

    public void menuPrincipal(){
        int opcion;

        do { 
            System.out.println("--- MENU TIENDA DE VIDEOJUEGOS");
            System.out.println("1.- Añadir videojuego");
            System.out.println("2.- Buscar por codigo");
            System.out.println("3.- Buscar por desarrolladora");
            System.out.println("4.- Buscar por titulo");
            System.out.println("5.- Mostrar todos los videojuegos");
            System.out.println("6.- Salir");
            opcion = sc.nextInt();
            sc.nextLine();

            switch(opcion){
                case 1 -> this.añadirVideojuego();
                case 2 -> this.buscarVideojuegoPorCodigo();
                case 3 -> this.buscarVideojuegoPorDesarrolladora();
                case 4 -> this.buscarVideojuegoPorTitulo();
                case 5 -> this.mostratTodosVideojuegos();
                case 6 -> System.out.println("Saliendo del menu");

            }

        } while (opcion != 6);
    }

    public void añadirVideojuego(){
        ArrayList<Videojuego> videojuegos = gestor.actualizarVideojuegos();

        System.out.println("Titulo del videojuego: ");
        String titulo = sc.nextLine();
        sc.nextLine();

        System.out.println("Desarrolladora del videojuego: ");
        String desarrolladora = sc.nextLine();
        sc.nextLine();

        System.out.println("Codigo del videojuego: ");
        String codigo = sc.nextLine();
        sc.nextLine();

        System.out.println("Año del videojuego: ");
        String yearStr = sc.nextLine();
        sc.nextLine();

        if(titulo.isEmpty() || desarrolladora.isEmpty() || codigo.isEmpty() || yearStr.isEmpty()){
            System.out.println("Error todos los campos deben ser rellenados");
            return;
        }

        try{
            int year = Integer.parseInt(yearStr);
            Videojuego NuevoVideojuego = new Videojuego(titulo, desarrolladora, codigo, year);
            gestor.añadirVideojuego(NuevoVideojuego);
            System.out.println("Libro añadido");
        }
        catch(NumberFormatException e){
            System.err.println("Error al añadir el libro");
        }


    }
    
}
