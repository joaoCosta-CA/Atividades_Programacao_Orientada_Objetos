package Ex1;
import java.math.BigDecimal;


public class Principal {
    public static void main(String[] args){
        Pessoa pessoa1 = new Pessoa("Mario", "Lopes");
        Funcionario pessoa2 = new Funcionario("Lucas", "Mendes", "489762", new BigDecimal("2000"));
        Professor pessoa3 = new Professor("Rafael", "Lira", "123456", new BigDecimal("500") );

        System.out.println("\nNome completo: " + pessoa1.getNomeCompleto());
        System.out.println("\nNome completo do Funcionário: " + pessoa2.getNomeCompleto());
        System.out.println("Primeira parcela do salário do Funcionário: R$" + pessoa2.getSalarioPrimeiraParcela());
        System.out.println("Segunda parcela do salário do Funcionário: R$" + pessoa2.getSalarioSegundaParcela());
        
        System.out.println("\nNome completo do Professor: " + pessoa3.getNomeCompleto());
        System.out.println("Primeira parcela do salário do Professor: R$" + pessoa3.getSalarioPrimeiraParcela());
        System.out.println("Segunda parcela do salário do Professor: R$" + pessoa3.getSalarioSegundaParcela());

    }
}