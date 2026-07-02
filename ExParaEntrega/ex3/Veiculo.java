package ExParaEntrega.ex3;

public interface Veiculo {
    
    public void mover(double distancia);

    public void abastecer(double litros);

    public void exibirInformacoes();

    public String getPlaca();
}