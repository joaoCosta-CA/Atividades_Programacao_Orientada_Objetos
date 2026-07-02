package PadroesDeProjeto.ex5;

public abstract class Pizza {
    private int type;

    public Pizza(int type) {
        this.type = type;
    }

    public int getType(){
        return type;
    }

    public abstract void abrir();
    public abstract void addMolho();
    public abstract void addCobertura();
    public abstract void assar();
    public abstract void cortar();
    
}