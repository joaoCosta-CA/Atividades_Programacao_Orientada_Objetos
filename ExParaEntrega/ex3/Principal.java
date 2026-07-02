package ExParaEntrega.ex3;
import java.util.ArrayList;


public class Principal{

    public static void main(String[] args){
        ArrayList<Veiculo> veiculos = new ArrayList<>();

        boolean sair = true;
        while(sair){
            boolean placaValida = false;
            System.out.println("===========Menu===========");
            System.out.println("1. Adicionar veículo");
            System.out.println("2. Mover veículo");
            System.out.println("3. Abastecer veículo");
            System.out.println("4. Realizar a manutenção de um Ônibus");
            System.out.println("5. Exibir informações");
            System.out.println("6. Sair");
            int opcao = Integer.parseInt(System.console().readLine());
            switch(opcao){
                case 1:
                    System.out.println("\nQual tipo de veículo deseja adicionar:");
                    System.out.println("1. Carro");
                    System.out.println("2. Caminhão");
                    System.out.println("3. Ônibus");
                    int escolha = Integer.parseInt(System.console().readLine());
                    switch(escolha){
                        case 1:
                            System.out.println("\nDigite o modelo do carro:");
                            String modelo = System.console().readLine();
                            System.out.println("Digite a placa do carro:");
                            String placa = System.console().readLine();
                            System.out.println("Digite o nível de combustível do carro:");
                            double nivelCombustivel = Double.parseDouble(System.console().readLine());
                            if(nivelCombustivel < 0){
                                System.out.println("Não pode cadastrar um carro com nível negativo!");
                                break;
                            }
                            veiculos.add(new Carro(modelo, placa, nivelCombustivel));
                            break;
                        case 2:
                            System.out.println("\nDigite o modelo do caminhão:");
                            modelo = System.console().readLine();
                            System.out.println("Digite a placa do caminhão:");
                            placa = System.console().readLine();
                            System.out.println("Digite o nível de combustível do caminhão:");
                            nivelCombustivel = Double.parseDouble(System.console().readLine());
                            if(nivelCombustivel < 0){
                                System.out.println("Não pode cadastrar um caminhão com nível negativo!");
                                break;
                            }
                            System.out.println("Digite a carga do caminhão:");
                            double carga = Double.parseDouble(System.console().readLine());
                            if(carga < 0){
                                System.out.println("Não existe carga negativa!");
                                break;
                            }
                            veiculos.add(new Caminhao(modelo, placa, nivelCombustivel, carga));
                            break;
                        case 3:
                            System.out.println("\nDigite o modelo do ônibus:");
                            modelo = System.console().readLine();
                            System.out.println("Digite a placa do ônibus:");
                            placa = System.console().readLine();
                            System.out.println("Digite o nível de combustível do ônibus:");
                            nivelCombustivel = Double.parseDouble(System.console().readLine());
                            if(nivelCombustivel < 0){
                                System.out.println("Não pode cadastrar um ônibus com nível negativo!");
                                break;
                            }
                            System.out.println("Digite o número de passageiros do ônibus:");
                            int passageiros = Integer.parseInt(System.console().readLine());
                            if(passageiros < 0){
                                System.out.println("Não pode cadastrar passageiros negativos!");
                                break;
                            }
                            veiculos.add(new Onibus(modelo, placa, passageiros, nivelCombustivel));
                            break;
                        default:
                            System.out.println("Opção inválida");
                    }
                    break;
                case 2:
                    System.out.println("\nQual veículo deseja mover?");
                    System.out.println("1. Carro");
                    System.out.println("2. Caminhão");
                    System.out.println("3. Ônibus");
                    int opcaoMover = Integer.parseInt(System.console().readLine());
                    switch(opcaoMover){
                        case 1:
                            System.out.println("\nDigite a placa do carro: ");
                            String placaCarro = System.console().readLine();
                            if(placaCarro != null && !placaCarro.isEmpty()){
                                for(Veiculo carro : veiculos){
                                    if(placaCarro.equals(carro.getPlaca())){
                                        placaValida = true;
                                        System.out.println("Qual distância deseja percorrer?");
                                        double dist = Double.parseDouble(System.console().readLine());
                                        carro.mover(dist);
                                        break;
                                    }
                                }
                            }else{
                                System.out.println("Placa inválida");
                                break;
                            }
                            if(!placaValida){
                                System.out.println("Placa não encontrada");
                            }
                            break;
                        case 2:
                            System.out.println("\nDigite a placa do caminhão: ");
                            String placaCaminhao = System.console().readLine();
                            if(placaCaminhao != null && !placaCaminhao.isEmpty()){
                                for(Veiculo caminhao: veiculos){
                                    if(placaCaminhao.equals(caminhao.getPlaca())){
                                        placaValida = true;
                                        System.out.println("Qual distância deseja percorrer?");
                                        double dist = Double.parseDouble(System.console().readLine());
                                        caminhao.mover(dist);
                                        break;
                                    }
                                }
                            }else{
                                System.out.println("Placa inválida");
                            }
                            if(!placaValida){
                                System.out.println("Placa não encontrada");
                            }
                            break;
                        case 3:
                            System.out.println("\nDigite a placa do ônibus: ");
                            String placaOnibus = System.console().readLine();
                            if(placaOnibus != null && !placaOnibus.isEmpty()){
                                for(Veiculo onibus : veiculos){
                                    if(placaOnibus.equals(onibus.getPlaca())){
                                        placaValida = true;
                                        System.out.println("Qual distância deseja percorrer?");
                                        double dist = Double.parseDouble(System.console().readLine());
                                        onibus.mover(dist);
                                        break;
                                    }
                                }
                            }else{
                                System.out.println("Placa inválida");
                            }
                            if(!placaValida){
                                System.out.println("Placa não encontrada");
                            }
                            break;
                        default:
                            System.out.println("Opção inválida");
                    }
                    
                    break;
                case 3:
                    System.out.println("\nQual veículo deseja abastecer?");
                    System.out.println("1. Carro\n2. Caminhão\n3. Ônibus");
                    int opcaoAbastecer = Integer.parseInt(System.console().readLine());
                    switch(opcaoAbastecer){
                        case 1:
                            System.out.println("\nDigite a placa do carro: ");
                            String placaCarro = System.console().readLine();
                            if(placaCarro != null && !placaCarro.isEmpty()){
                                for(Veiculo carro : veiculos){
                                    if(placaCarro.equals(carro.getPlaca())){
                                        placaValida = true;
                                        System.out.println("\nDigite quanto deseja abastecer: ");
                                        double litros = Double.parseDouble(System.console().readLine());
                                        carro.abastecer(litros);
                                        break;
                                    }
                                }
                            }else{
                                System.out.println("Placa inválida");
                            }
                            if(!placaValida){
                                System.out.println("Placa não encontrada");
                            }
                            break;
                        case 2:
                            System.out.println("\nDigite a placa do Caminhão: ");
                            String placaCaminhao = System.console().readLine();
                            if(placaCaminhao != null && !placaCaminhao.isEmpty()){
                                for(Veiculo caminhao : veiculos){
                                    if(placaCaminhao.equals(caminhao.getPlaca())){
                                        placaValida = true;
                                        System.out.println("\nQuanto deseja abastecer?");
                                        double litros = Double.parseDouble(System.console().readLine());
                                        caminhao.abastecer(litros);
                                        break;
                                    }
                                }
                            }else{
                                System.out.println("Placa inválida");
                            }
                            if(!placaValida){
                                System.out.println("Placa não encontrada");
                            }
                            break;
                        case 3:
                            System.out.println("\nDigite a placa do Ônibus: ");
                            String placaOnibus = System.console().readLine();
                            if(placaOnibus != null && !placaOnibus.isEmpty()){
                                for(Veiculo onibus : veiculos){
                                    if(placaOnibus.equals(onibus.getPlaca())){
                                        placaValida = true;
                                        System.out.println("\nQuanto deseja abastecer?");
                                        double litros = Double.parseDouble(System.console().readLine());
                                        onibus.abastecer(litros);
                                        break;
                                    }
                                }
                            }else{
                                System.out.println("Placa inválida");
                            }
                            if(!placaValida){
                                System.out.println("Placa não encontrada");
                            }
                            break;
                        default:
                            System.out.println("Opção inválida");
                    }
                    break;
                case 4:
                    System.out.println("\nDigite a placa do Ônibus: ");
                    String placaOnibus = System.console().readLine();
                    if(placaOnibus != null && !placaOnibus.isEmpty()){
                        for(Veiculo onibus : veiculos){
                            if(placaOnibus.equals(onibus.getPlaca())){
                                placaValida = true;
                                if(onibus instanceof Manutencao onibusEsp){
                                    onibusEsp.realizarManutencao();
                                    break;
                                }
                            }
                        }
                    }else{
                        System.out.println("Placa inválida");
                    }
                    if(!placaValida){
                        System.out.println("Placa não encontrada");
                    }
                    break;
                case 5:
                    if(!veiculos.isEmpty()){
                      System.out.println("\nVeículos cadastrados: ");
                      for(Veiculo veiculo : veiculos){
                          veiculo.exibirInformacoes();
                      }
                    }else{
                      System.out.println("Veículos cadastrados: Nenhum");
                    }
                    break;
                case 6:
                    sair = false;
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida");
            }
        }
    }
}
