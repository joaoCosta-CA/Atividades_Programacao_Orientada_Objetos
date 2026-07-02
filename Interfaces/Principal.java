package Interfaces;

public class Principal{

    public static void main(String[] args){
        Quadrado q = new Quadrado();
        int numLados = q.obterNumeroLados();

        System.out.println("O número de lados do quadrado é: " + numLados);
    }
}




