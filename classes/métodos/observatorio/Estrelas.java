package classes.métodos.observatorio;

public class Estrelas {
    private  String nome;
    private String tipo;
    private double distancia;
    private static int qntEstrelas = 0;

    Estrelas(String nome, String tipo, double distancia){
        this.nome = nome;
        this.tipo = tipo;
        this.distancia = distancia;
        qntEstrelas++;
    }

    public void print(){
        System.out.println("Nome:" + this.nome);
        System.out.println("Tipo:" + this.tipo);
        System.out.println("Distancia:" + this.distancia + " anos luz");
        System.out.println("Quantidade de Estrelas:" + Estrelas.qntEstrelas + "\n");
    }


}
