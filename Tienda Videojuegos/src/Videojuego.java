public class Videojuego {
    private String titulo;
    private String desarrolladora;
    private String codigo;
    private int year;

    public Videojuego(String titulo, String desarrolladora, String codigo, int year){
        this.titulo = titulo;
        this.desarrolladora = desarrolladora;
        this.codigo = codigo;
        this.year = year;
    }

    public String getTitulo(){
        return titulo;
    }
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    public String getDesarrolladora(){
        return desarrolladora;
    }
    public void setDesarrolladora(String desarrolladora){
        this.desarrolladora = desarrolladora;
    }

    public String getCodigo(){
        return codigo;
    }
    public void setCodigo(String codigo){
        this.codigo = codigo;
    }

    public int getYear(){
        return year;
    }
    public void setYear(int year){
        this.year = year;
    }

    @Override
    public String toString() {
       return titulo + "-" + desarrolladora + "-" + codigo + "-" + year;
    }

    public String tofileString(){ 
        return titulo + ";" + desarrolladora + ";" + codigo + ";" + year;
    }

    
    
}
