package ExParaEntrega.ex3;

public class Carro implements Veiculo{
   public String modelo;
   public String placa;
   private double nivelCombustivel;
   private double consumoCombustivel;

   public Carro(String modelo, String placa, double nivelCombustivel){
      this.modelo = modelo;
      this.placa = placa;
      this.nivelCombustivel = nivelCombustivel;
      this.consumoCombustivel = 0.5;
   }
   
    public void mover(double distancia){
        if(distancia < 0){
            System.out.println("Não eh possível mover distâncias negativas!");
            return;
        }
        double consumido = distancia*(this.consumoCombustivel);
        if(consumido > this.nivelCombustivel){
           System.out.println("Carro: Combustível insuficiente para percorrer " + distancia + "km");
        }else{
            this.nivelCombustivel -= consumido;
            System.out.println("Carro: Combustível restante: " + this.nivelCombustivel + " litros");
        }
   }

   public void abastecer(double litros){
       if(litros < 0){
           System.out.println("Não eh possível retirar combustível do Carro!");
           return;
       }
       this.nivelCombustivel += litros;
       System.out.println("Carro: Tanque reabastecido com " + litros + " litros");
   }

   public void exibirInformacoes(){
       System.out.println("\n=============================== Carro =================================\n");
       System.out.println("Modelo: " + this.modelo + ", \nPlaca: " + this.placa + ", \nNível de Combustível: " 
           + this.nivelCombustivel + " litros\n");
   }

   public String getPlaca(){
       return this.placa;
   }
}
