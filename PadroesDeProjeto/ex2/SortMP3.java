package PadroesDeProjeto.ex2;
import java.util.ArrayList;

public abstract class SortMP3{
    public final void sortMP3(ArrayList<Musicas> musicas){
        int n = musicas.size();

        for(int i=0; i<n; i++){
            for(int j= i + 1; j<n;j++){
                if(comparar(musicas.get(i), musicas.get(j))){
                    Musicas temp = musicas.get(i);
                    musicas.set(i, musicas.get(j));
                    musicas.set(j, temp);
                }    
            }
        }
    }
    
    public abstract boolean comparar(Musicas m1, Musicas m2);
}