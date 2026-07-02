package classes.Viagem;

public class Principal {
    public static void main(String[] args){

        Agencia a1 = new Agencia();
        a1.jeffersonCaminhoesSama("São Paulo", "500km", "Jefferson");
        a1.print();

        Agencia a2 = new Agencia();
        a2.jeffersonCaminhoesSama("Casa do Caralho", "100km", "Caralho");
        a2.print();
    }
}
