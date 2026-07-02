package Ex3;

public class Transporte{
    public boolean ligado;
    public int velocidade;

    public Transporte(boolean ligado){
        this.ligado = ligado;
        this.velocidade = 0;
    }

    public void ligar(){
        this.ligado = true;
    }

    public void desligar(){
        this.ligado = false;
        this.velocidade = 0;
    }


    public void setVelocidade(int velocidade){
        if(velocidade>=0){
            this.velocidade = velocidade;
        }
    }

    public int getVelocidade(){
        return this.velocidade;
    }
}