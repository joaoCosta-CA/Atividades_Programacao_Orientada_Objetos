package PadroesDeProjeto.ex3.adapter;

public class Adapter extends ControleDePonto{

    private ControleDePontoNovo newControl = new ControleDePontoNovo();
    
    @Override
    public void registrarEntrada(Funcionario f){
        newControl.registrar(f, true);
    }
    
    @Override
    public void registrarSaida(Funcionario f){
        newControl.registrar(f, false);
    }
}