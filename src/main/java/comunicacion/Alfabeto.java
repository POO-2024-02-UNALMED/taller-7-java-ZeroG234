package comunicacion;

public class Alfabeto extends Pictograma{
    private String[] letras;
    private String interpretacion;

    public Alfabeto(String origen, String[] letras, String interpretacion){
        super(origen);
        this.letras = letras;
        this.interpretacion = interpretacion;
    }

    public int cantidadLetras(){
        return letras.length;
    }

    public String interpretacion(){
        return interpretacion;
    }

    public String toString(){
        String letras = "";
        for(String letra: this.letras){
            letras += letra + ", ";
        }

        letras = letras.substring(0, letras.length() - 2);
        return letras;
    }

    public String[] getLetras(){
        return letras;
    }

    public void setLetras(String[] nuevasLetras){
        letras = nuevasLetras;
    }

    public String getInterpretacion(){
        return interpretacion;
    }

    public void setInterpretacion(String nuevaInterpretacion){
        interpretacion = nuevaInterpretacion;
    }
}