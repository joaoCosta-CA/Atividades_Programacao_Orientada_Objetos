package PadroesDeProjeto.ex1;

public interface Subject {
    public void listaInteressados(Observer interessado);

    public void removerInteressado(Observer interessado);

    public String getNome();

    public void portaAberta();

    public void portaFechada();

    public void notificar();
}
