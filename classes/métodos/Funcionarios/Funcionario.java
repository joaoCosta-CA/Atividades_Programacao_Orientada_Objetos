package classes.métodos.Funcionarios;

public class Funcionario {
    private String nome;
    private double salario;
    private static double valeRef = 500;

    Funcionario(String nome, double salarios){
        this.nome = nome;
        this.salario = salarios;
    }

    public static void setValeRef(double porcent){
        valeRef = valeRef - (valeRef * porcent / 100);
    }

    public void print(){
        System.out.println("Nome:" + this.nome);
        System.out.println("Salario:" + this.salario);
        System.out.println("Vale Refeição:" + Funcionario.valeRef + "\n");
    }
}
