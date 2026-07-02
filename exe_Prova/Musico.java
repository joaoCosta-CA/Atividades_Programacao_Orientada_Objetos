import java.util.ArrayList;

public class Musico{
    public String nome;
    public static int identificador = 0;
    public int id;
    public ArrayList<Instrumento> instrumentos;

    public Musico(String nome){
        this.nome = nome;
        this.id = identificador;
        this.instrumentos = new ArrayList<>();
        identificador++;
    }

    public int listarInstrumentos(String tipo){
        int cont = 0;
        for(Instrumento instrumento : instrumentos){
            if(instrumento.tipo.equals(tipo)){
                cont++;;
            }
        }
        return cont;
    }
}