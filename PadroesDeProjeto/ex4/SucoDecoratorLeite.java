package PadroesDeProjeto.ex4;

public class SucoDecoratorLeite extends SucoDecorator {
    
    public SucoDecoratorLeite(Suco suco) {
        super(suco);
    }

    @Override
    public String getNome() {
        return this.getSuco().getNome() + " com Leite";
    }

    @Override
    public double getPreco() {
        return this.getSuco().getPreco() + 0.5;
    }
}
