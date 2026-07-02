package PadroesDeProjeto.ex1;
import java.util.ArrayList;

public class Porta implements Subject{
    private boolean portaAberta;
    private String nome;

    public Porta(boolean aberta, String nome){
        this.portaAberta = aberta;
        this.nome = nome;
    }


    private ArrayList<Observer> interessados = new ArrayList<Observer>();
    
    public void listaInteressados(Observer interessado){
        this.interessados.add(interessado);
    }

    public void removerInteressado(Observer interessado){
        this.interessados.remove(interessado);
    }

    public void portaAberta(){
        this.portaAberta = true;
        notificar();
    }

    public boolean getPorta(){
        return this.portaAberta;
    }

    public String getNome(){
        return this.nome;
    }

    public void portaFechada(){
        this.portaAberta = false;
    }

    public void notificar(){
        for(Observer interessado : interessados){
            interessado.notificarPortaAberta(this);
        }
    }
}