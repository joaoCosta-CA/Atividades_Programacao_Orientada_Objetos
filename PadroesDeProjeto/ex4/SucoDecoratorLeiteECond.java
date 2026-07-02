package PadroesDeProjeto.ex4;

public class SucoDecoratorLeiteECond extends SucoDecorator{
    public SucoDecoratorLeiteECond(Suco suco){
        super(suco);
    }
    @Override
    public String getNome(){
        return this.getSuco().getNome() + " com Leite Condensado e Leite";
    }
    @Override
    public double getPreco(){
        return this.getSuco().getPreco() + 1.00;
    }
}