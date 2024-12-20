package comunicacion;

public class Tesis extends Escrito{
    private String idea;
    private String[] argumentos;
    private String conclusion;
    private String referencias;
    private String interpretacion;

    public Tesis(String origen, String titulo, String autor, int paginas,
                 String idea, String[] argumentos, String conclusion, String referencias, String interpretacion){
        super(origen, titulo, autor, paginas);
        this.idea = idea;
        this.argumentos = argumentos;
        this.conclusion = conclusion;
        this.referencias = referencias;
        this.interpretacion = interpretacion;
    }

    public int palabrasTotales(int factor){
        return this.getPaginas() * factor * 5;
    }

    public String interpretacion(){
        return interpretacion;
    }

    public String toString(){
        return this.getOrigen() + "\n" +
               this.getTitulo() + "\n" +
               this.getAutor() + "\n" +
               this.getPaginas() + "\n" +
               this.idea + "\n" +
               this.argumentos.length + "\n" +
               this.conclusion + "\n" +
               this.referencias;
    }

    public String getIdea(){
        return idea;
    }

    public void setIdea(String nuevaIdea){
        idea = nuevaIdea;
    }

    public String[] getArgumentos(){
        return argumentos;
    }

    public void setArgumentos(String[] nuevosArgumentos){
        argumentos = nuevosArgumentos;
    }

    public String getConclusion(){
        return conclusion;
    }

    public void setConclusion(String nuevaConclusion){
        conclusion = nuevaConclusion;
    }

    public String getReferencias(){
        return referencias;
    }

    public void setReferencias(String nuevasReferencias){
        referencias = nuevasReferencias;
    }

    public String getInterpretacion(){
        return interpretacion;
    }

    public void setInterpretacion(String nuevaInterpretacion){
        interpretacion = nuevaInterpretacion;
    }
}