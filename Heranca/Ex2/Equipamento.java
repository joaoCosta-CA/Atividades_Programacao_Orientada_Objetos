package Ex2;
public class Equipamento {
    public boolean ligado;

    public Equipamento(boolean ligado){
        this.ligado = ligado;
    }

    public void ligar(){
        ligado = true;
    }

    public void desligar(){
        ligado = false;
    }
}