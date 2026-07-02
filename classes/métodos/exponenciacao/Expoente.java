package classes.métodos.exponenciacao;

public class Expoente {
    Expoente(int a, int b){
        double resultado = expoente(a,b);
        System.out.println("O resultado de " + a + " elevado a " + b + " é: " + resultado);
    }

    private double expoente(int a, int b){
        return Math.pow(a,b);
    }
}
