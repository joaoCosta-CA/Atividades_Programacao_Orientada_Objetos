package Ex3;

public class Principal {
    public static void main(String[] args) {
        Carro carro = new Carro(true, 2000);
        Transporte transporte = new Transporte(true);
        carro.ligar();
        transporte.ligar();


        boolean loop = true;

        while(loop){
            System.out.println("Paínel de escolhas:");
            System.out.println("1 - Ligar");
            System.out.println("2 - Desligar");
            System.out.println("3 - Velocidade");
            System.out.println("4 - Quilometragem");
            System.out.println("5 - Sair");
            int escolha = Integer.parseInt(System.console().readLine());
            switch(escolha){
                case 1:
                    carro.ligar();
                    transporte.ligar();
                    System.out.println("Carro e transporte ligados....");
                    break;
                case 2:
                    carro.desligar();
                    transporte.desligar();
                    System.out.println("Carro e transporte desligados....");
                    break;
                case 3:
                    System.out.println("1 - Mudar a Velocidade");
                    System.out.println("2 - Visualizar Velocidade");
                    int escolhaVelocidade = Integer.parseInt(System.console().readLine());
                    switch(escolhaVelocidade){
                        case 1:
                            System.out.println("Digite a velocidade desejada:");
                            int velocidade = Integer.parseInt(System.console().readLine());
                            System.out.println("Mudando velocidade...");
                            carro.setVelocidade(velocidade);
                            transporte.setVelocidade(velocidade);
                            break;
                        case 2:
                            System.out.println("Velocidade do carro: " + carro.getVelocidade());
                            System.out.println("Velocidade do transporte: " + transporte.getVelocidade());
                            break;
                    }
                    break;
                case 4:
                    System.out.println("1 - Mudar quilometragem.");
                    System.out.println("2 - Visualizar quilometragem.");
                    int escolhaQuilometragem = Integer.parseInt(System.console().readLine());
                    switch(escolhaQuilometragem){
                        case 1:
                            System.out.println("Digite a quilometragem desejada:");
                            int quilometragem = Integer.parseInt(System.console().readLine());
                            System.out.println("Mudando quilometragem do carro...");
                            carro.setQuilometragem(quilometragem);
                            break;
                        case 2:
                            System.out.println("Quilometragem do carro: " + carro.getQuilometragem());
                            break;
                    }
                    break;
                case 5:
                    loop = false;
                    System.out.println("Saindo...");
                    break;
            }
        }
    }
}