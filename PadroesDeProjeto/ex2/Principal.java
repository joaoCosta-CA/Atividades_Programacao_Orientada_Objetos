package PadroesDeProjeto.ex2;
import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        ArrayList<Musicas> musicas = new ArrayList<Musicas>();
        
        Musicas musica1 = new Musicas("Homecoming", "Kanye West and Coldplay", "Qualquer album", "MP3");
        Musicas musica2 = new Musicas("Até que durou", "Pericles", "outro qualquer", "MP3");
        
        musica1.toString();
        musica2.toString();
        musicas.add(musica1);
        musicas.add(musica2);

        System.out.println("Qual tipo de ordenação deseja realizar?");
        System.out.println("1 - Ordenar por nome");
        System.out.println("2 - Ordenar por autor");
        int opcao = Integer.parseInt(System.console().readLine());

        ArrayList<Musicas> musicasOrdenadasPorNome = new ArrayList<Musicas>(musicas);
        switch(opcao){
            case 1:
                OrdenarporAutor ordenarporAutor = new OrdenarporAutor();
                ordenarporAutor.sortMP3(musicas);
                System.out.println("Músicas ordenadas por autor: " + musicas);
                break;
            case 2:
                OrdenarporNome ordenarporNome = new OrdenarporNome();
                ordenarporNome.sortMP3(musicasOrdenadasPorNome);
                System.out.println("Músicas ordenadas por nome: " + musicasOrdenadasPorNome);
                break;
            default:
                System.out.println("Opção inválida");
        }        
    }
}