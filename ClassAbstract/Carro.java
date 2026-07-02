package ClassAbstract;

public class Carro extends Veiculo{

    public Carro(String modelo, String marca, String placa){
        this.modelo = modelo;
        this.marca = marca;
        this.placa = placa;
    }

    public int obterNrEixos(){
        return 2;
    }
}