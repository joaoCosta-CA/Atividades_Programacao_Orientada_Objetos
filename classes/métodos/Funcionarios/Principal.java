package classes.métodos.Funcionarios;

public class Principal {
    public static void main(String args[]){
        Funcionario f1 = new Funcionario("Jefferson", 3000);
        f1.print();

        Funcionario f2 = new Funcionario("Milton Caralho", 2000);
        f2.print();

        Funcionario.setValeRef(10);
        f1.print();
        f2.print();
    }
}
