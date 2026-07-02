package classes.métodos.Gerencia;

public class Gerente {
    
    String nome;
    double salario;
    Gerente(String nome, double salario){
        this.nome = nome;
        this.salario = salario;
    }

    public double setSlary(){
        this.salario += this.salario * 0.10;
        return this.salario;
    }

    public double setSlary(double variable){
        this.salario += this.salario * variable / 100;
        return this.salario;
    }

    public void print(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Salário: " + this.salario);
        System.out.println("Salário com variável: " + setSlary(10));
        System.out.println("Salario constante: " + setSlary());
    }

}
