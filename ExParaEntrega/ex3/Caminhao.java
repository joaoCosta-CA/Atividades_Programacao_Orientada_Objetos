package ExParaEntrega.ex3;

public class Caminhao implements Veiculo {
    public String modelo;
    public String placa;
    private double nivelCombustivel;
    private double consumoCombustivel;
    public double carga;

    public Caminhao(String modelo, String placa, double nivelCombustivel, double carga){
        this.modelo = modelo;
        this.placa = placa;
        this.nivelCombustivel = nivelCombustivel;
        this.consumoCombustivel = 0.5;
        this.carga = carga;
    }
    
    private double cargaConsumo(double carga){
        double consumo = 0;
        for(int i = 0;i<carga;i++){
            consumo += 0.1;
        }
        return consumo;
    }

    public void mover(double distancia){
        if(distancia < 0){
            System.out.println("Não eh possível mover distâncias negativas!");
            return;
        }
        double consumo = distancia*(this.consumoCombustivel);
        consumo += this.cargaConsumo(this.carga);
        if(consumo > this.nivelCombustivel){
            System.out.println("Caminhao: Combustível insuficiente para percorrer " + distancia + " km");
        }else{
            this.nivelCombustivel -= consumo;
            System.out.println(String.format("Caminhao: Combustível restante: %.2f litros", this.nivelCombustivel));
        }
    }

    public void abastecer(double litros){
        if(litros < 0){
            System.out.println("Não eh possível retirar combustível do Caminhão!");
            return;
        }
        this.nivelCombustivel += litros;
        System.out.println("Caminhao: Tanque reabastecido com " + litros + " litros");
    }

    public void exibirInformacoes(){
        System.out.println("\n=============================== Caminhao =================================\n");
        System.out.println(String.format("Modelo: %s, \nPlaca: %s, \nNível de Combustível: %.2f litros, \nCarga: %.2f toneladas\n", this.modelo, this.placa, this.nivelCombustivel, this.carga));
    }

    public String getPlaca(){
        return this.placa;
    }
}
