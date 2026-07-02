package PadroesDeProjeto.ex2;

public class OrdenarporNome extends SortMP3{
    @Override
    public boolean comparar(Musicas m1, Musicas m2){
        return m1.getNome().compareToIgnoreCase(m2.getNome()) > 0;
    }
}