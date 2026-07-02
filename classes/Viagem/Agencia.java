package classes.Viagem;

public class Agencia {
    private String destiny;
    private String distance;
    private String driverName;

    public void jeffersonCaminhoesSama(String destiny, String distance, String driverName){
        this.destiny = destiny;
        this.distance= distance;
        this.driverName = driverName;
    }

    public void print(){
        System.out.println("Destino:" + this.destiny);
        System.out.println("Distancia:" + this.distance);
        System.out.println("Motorista:" + this.driverName);
    }
}
