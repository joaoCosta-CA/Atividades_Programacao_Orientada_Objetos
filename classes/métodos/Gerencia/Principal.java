package classes.métodos.Gerencia;

public class Principal {
    public static void main(String args[]){

        Gerente g1 = new Gerente("Baralho", 1000);
        g1.setSlary(20);
        g1.setSlary();

        g1.print();
    }
}
