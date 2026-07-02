package PadroesDeProjeto.ex3.adapter;

public class Principal {

	public static void main(String[] args) throws InterruptedException {
		Adapter adapter = new Adapter();
		Funcionario funcionario = 
				new Funcionario("João de Souza");
		adapter.registrarEntrada(funcionario);
		Thread.sleep(3000);
		adapter.registrarSaida(funcionario);
		
		
	}

}
