package PadroesDeProjeto.ex1;

public class Pessoa implements Observer {
    private String nome;

    public Pessoa(String nome) {
        this.nome = nome;
    }

    @Override
    public void notificarPortaAberta(Subject subject) {
        System.out.println("Porta: " + subject.getNome() + " foi aberta!");
    }

    public String getNome(){
        return this.nome;
    }
}