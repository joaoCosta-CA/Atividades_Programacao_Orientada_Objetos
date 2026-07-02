import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        int resp = 0;
        Scanner sc = new Scanner(System.in);
        ControleSenhas controle = new ControleSenhas();
        int senha = 0;
        ArrayList<Integer> fila = new ArrayList<>();

        while (resp != 6) {
            System.out.println("Digite a operação que deseja realizar:\n");
            System.out.println("1 - Gerar senha");
            System.out.println("2 - Desistir da Fila");
            System.out.println("3 - Atender cliente");
            System.out.println("4 - Buscar posição na fila");
            System.out.println("5 - Imprimir fila");
            System.out.println("6 - Sair");
            resp = sc.nextInt();

            switch (resp) {
                case 1:
                    System.out.println("Gerando senha...");
                    senha = controle.gerarSenha(fila);
                    break;
                case 2:
                    System.out.println("Retirando senha da fila...");
                    senha = sc.nextInt();
                    controle.retirarSenha(fila, senha);
                    break;
                case 3:
                    System.out.println("Fazendo atendimento...");
                    controle.atenderCliente(fila);
                    break;
                case 4:
                    System.out.println("Digite a senha: ");
                    senha = sc.nextInt();
                    System.out.println("Buscando posição na fila...");
                    controle.buscarPosição(fila, senha);
                    break;
                case 5:
                    System.out.println("Imprimindo fila...");
                    controle.imprimirFila(fila);
                    break;
                case 6:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Parametro inválido");
                    break;
            }

        }
        sc.close();
    }
}
