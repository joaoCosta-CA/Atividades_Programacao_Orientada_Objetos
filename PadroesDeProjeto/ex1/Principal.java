package PadroesDeProjeto.ex1;

public class Principal{
    public static void main(String[] args) {
        Observer p1 = new Pessoa("Pedro");
        Subject porta1 = new Porta(false,"Porta 1");
        porta1.listaInteressados(p1);
        porta1.portaAberta();
        
    }
}