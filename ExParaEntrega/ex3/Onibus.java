package ExParaEntrega.ex3;

public class Onibus implements Veiculo, Manutencao{
    public String modelo;
    public String placa;
    private double nivelCombustivel;
    private double consumoCombustivel;
    public int nroPassageiros;
    private double kmPosManutencao;

    public Onibus(String modelo, String placa, int nroPassageiros, double nivelCombustivel){
        this.modelo = modelo;
        this.placa = placa;
        this.nroPassageiros = nroPassageiros;
        this.nivelCombustivel = nivelCombustivel;
        this.consumoCombustivel = 0.5;
    }

    private double litroPorPassageiro(){
        if(nroPassageiros == 0){
            return 0;
        }
        return this.nivelCombustivel / this.nroPassageiros;
    }

    public void mover(double distancia){
        if(distancia < 0){
            System.out.println("Não eh possível mover distâncias negativas!");
            return;
        }
        double consumido = distancia * (this.consumoCombustivel) + (this.litroPorPassageiro());
        if(consumido > this.nivelCombustivel){
            System.out.println("Onibus: Combustível insuficiente para percorrer " + distancia + " km");
        }else{
            this.nivelCombustivel -= consumido;
            System.out.println("Onibus: Combustível restante: " + this.nivelCombustivel + " litros");
            this.kmPosManutencao += distancia;
        }
    }

    public void abastecer(double litros){
        if(litros < 0){
            System.out.println("Não eh possível retirar combustível do Ônibus");
            return;
        }
        this.nivelCombustivel += litros;
        System.out.println("Onibus: Tanque reabastecido com " + litros + " litros");
    }

    public void realizarManutencao(){
        this.kmPosManutencao = 0;
        System.out.println("Manutenção realizada");
    }

    public void exibirInformacoes(){
        System.out.println("\n=============================== Onibus =================================\n");
        System.out.println("Modelo: " + this.modelo + ", \nPlaca: " + this.placa + ", \nPassageiros: " + this.nroPassageiros + ", \nNível de Combustível: " 
            + this.nivelCombustivel + " litros" + ", \nDistância percorrida após manutenção: " + this.kmPosManutencao + " km\n");
    }

    public String getPlaca(){
        return this.placa;
    }
}
