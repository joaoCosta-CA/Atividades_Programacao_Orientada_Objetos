package PadroesDeProjeto.ex4;
public class SucoDecoratorLeiteCond extends SucoDecorator{
    public SucoDecoratorLeiteCond(Suco suco){
        super(suco);
    }

    @Override
    public String getNome(){
        return this.getSuco().getNome() + " com Leite Condensado";
    }

    @Override
    public double getPreco(){
        return this.getSuco().getPreco() + 1.00;
    }
}