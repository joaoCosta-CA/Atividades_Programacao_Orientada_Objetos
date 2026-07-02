package PadroesDeProjeto.ex2;

public class OrdenarporAutor extends SortMP3{
    @Override
    public boolean comparar(Musicas m1, Musicas m2){
        return m1.getAutor().compareToIgnoreCase(m2.getAutor()) > 0;
    }
}