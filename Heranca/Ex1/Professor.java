package Ex1;
import java.math.BigDecimal;

public class Professor extends Funcionario{

    public Professor(String nome, String sobrenome, String matricula, BigDecimal salario){
        super(nome, sobrenome, matricula, salario);
    }
    
    @Override
    public BigDecimal getSalarioPrimeiraParcela(){
        return this.salario;
    }

    @Override
    public BigDecimal getSalarioSegundaParcela(){
        return BigDecimal.ZERO;
    }
    
}