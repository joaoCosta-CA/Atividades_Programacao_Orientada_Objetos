package ClassAbstract;

public class Principal{
    public static void main(String[] args){
     Veiculo carro = new Carro("etios", "Toyota", "qwer123a");

     System.out.println("O número de eixos é: " + carro.obterNrEixos());
     carro.licenciar();
    }
}