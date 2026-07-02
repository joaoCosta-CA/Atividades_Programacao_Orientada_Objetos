package Ex3;

public class Carro extends Transporte {
    int quilometragem;

    public Carro(boolean ligado, int quilometragem){
        super(ligado);
        this.quilometragem = quilometragem;
    }

    @Override
    public void setVelocidade(int velocidade){
        if(velocidade>=0 && velocidade<=200){
            this.velocidade = velocidade;
        }
    }
   
   public void setQuilometragem(int quilometragem) {
       if(quilometragem>=0 && quilometragem<=999999){
           this.quilometragem = quilometragem;
       }
   }

   public int getQuilometragem(){
       return this.quilometragem;
   }

    
}