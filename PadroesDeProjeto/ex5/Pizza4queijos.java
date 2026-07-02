package PadroesDeProjeto.ex5;

public class Pizza4queijos extends Pizza {
    public Pizza4queijos(){
        super(2);
    }

    @Override
    public void abrir(){
        System.out.println("Abrindo pizza de 4 queijos");
    }

    @Override
    public void addMolho(){
        System.out.println("Adicionando o molho de tomate");
    }

    @Override
    public void addCobertura(){
        System.out.println("Adicionando o queijo mussarela, queijo parmesão, queijo provolone e queijo gorgonzola");
    }

    @Override
    public void assar(){
        System.out.println("Assando pizza de 4 queijos");
    }

    @Override
    public void cortar(){
        System.out.println("Cortando a pizza de 4 queijos");
    }
}
