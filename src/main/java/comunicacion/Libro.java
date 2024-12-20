package comunicacion;

public class Libro extends Escrito{
    private String co_autor;
    private String editorial;
    private String edicion;
    private String interpretacion;

    public Libro(String origen, String titulo, String autor, int paginas,
                 String co_autor, String editorial, String edicion, String interpretacion){
        super(origen, titulo, autor, paginas);
        this.co_autor = co_autor;
        this.editorial = editorial;
        this.edicion = edicion;
        this.interpretacion = interpretacion;
    }

    public int palabrasTotales(int texto){
        return this.getPaginas() * 5;
    }

    public String interpretacion(){
        return interpretacion;
    }

    public String toString(){
        return this.getOrigen() + "\n" +
               this.getTitulo() + "\n" +
               this.getAutor() + "\n" +
               this.getPaginas() + "\n" +
               this.co_autor + "\n" +
               this.editorial + "\n" +
               this.edicion + "\n" +
               this.interpretacion;
    }

    public String getCo_autor(){
        return co_autor;
    }

    public void setCo_autor(String nuevoCoAutor){
        co_autor = nuevoCoAutor;
    }

    public String getEditorial(){
        return editorial;
    }

    public void setEditorial(String nuevaEditorial){
        editorial = nuevaEditorial;
    }

    public String getEdicion(){
        return edicion;
    }

    public void setEdicion(String nuevaEdicion){
        edicion = nuevaEdicion;
    }

    public String getInterpretacion(){
        return interpretacion;
    }

    public void setInterpretacion(String nuevaInterpretacion){
        interpretacion = nuevaInterpretacion;
    }
}