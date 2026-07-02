package ExParaEntrega.ex1;

public class Principal {
    public static void main(String[] args) {
        String nome;
        String sobrenome;
        int dataNascimento;

        System.out.println("Digite o nome: ");
        nome = System.console().readLine();

        System.out.println("Digite o sobrenome: ");
        sobrenome = System.console().readLine();

        System.out.println("Digite a data de nascimento: (AAAA)");
        dataNascimento = Integer.parseInt(System.console().readLine());

        double freqMax = 220 - (2026 - dataNascimento);
        

        System.out.println("Nome: " + nome);
        System.out.println("SObrenome: " + sobrenome);
        System.out.println("Data de nascimento: " + (2026 -dataNascimento) + " anos");
        System.out.println("Frequência Máxima: " + freqMax);
        System.out.println("Frequência cardíaca alvo é entre: " + (freqMax * 0.5) + " e " + (freqMax * 0.85));
        
    }
}