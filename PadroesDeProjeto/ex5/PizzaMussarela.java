package PadroesDeProjeto.ex5;

public class PizzaMussarela extends Pizza{
    
    public PizzaMussarela() {
        super(1);
    }

    @Override
    public void abrir(){
        System.out.println("Abrindo a pizza de mussarela");
    }

    @Override
    public void addMolho(){
        System.out.println("Adicionando molho de tomate");
    }

    @Override
    public void addCobertura(){
        System.out.println("Adicionando queijo mussarela e tomates");
    }

    @Override
    public void assar(){
        System.out.println("Assando a pizza de mussarela");
    }

    @Override
    public void cortar()    {
        System.out.println("Cortando a pizza de mussarela");
    }
}