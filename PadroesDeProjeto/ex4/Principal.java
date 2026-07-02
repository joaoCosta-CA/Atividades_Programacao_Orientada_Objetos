package PadroesDeProjeto.ex4;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Qual o suco que você deseja?");
        String choice = input.nextLine();
        
        Suco suco = new SucoBasico(choice, 7.777);

        System.out.println(suco.getNome());
        System.out.printf("Preço: %.2f%n", suco.getPreco());

        Suco comLeite = new SucoDecoratorLeite(suco);
        System.out.println(comLeite.getNome());
        System.out.printf("Preço: %.2f%n", comLeite.getPreco());

        Suco comLeiteELeiteCond = new SucoDecoratorLeiteCond(comLeite);
        System.out.println(comLeiteELeiteCond.getNome());
        System.out.printf("Preço: %.2f%n", comLeiteELeiteCond.getPreco());

        

        input.close();
    }
}