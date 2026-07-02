package Ex1;
import java.math.BigDecimal;

public class Funcionario extends Pessoa{
    public String matricula;
    public BigDecimal salario; 

    public Funcionario(String nome, String sobrenome, String matricula, BigDecimal salario){
        super(nome, sobrenome);
        this.matricula = matricula;
        this.salario = salario;
    }


    public String getMatriula(){
        return this.matricula;
    } 

    public BigDecimal getSalario(){
        return this.salario;
    }

    public void setMatricula(String matricula){
        this.matricula = matricula;
    }

    public void setSalario(BigDecimal salario){
        this.salario = salario;
    }

    public BigDecimal getSalarioPrimeiraParcela(){
        return this.salario.multiply(new BigDecimal(0.6));
    }

    public BigDecimal getSalarioSegundaParcela(){
        return this.salario.subtract(this.salario.multiply(new BigDecimal(0.6)));
    }
}