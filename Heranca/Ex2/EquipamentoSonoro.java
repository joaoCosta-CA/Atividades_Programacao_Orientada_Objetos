package Ex2;

public class EquipamentoSonoro extends Equipamento {
   public short volume;
   public boolean stereo;

   public EquipamentoSonoro(boolean ligado){
       super(ligado);
   }

   @Override
   public void ligar(){
       super.ligar();
       this.volume = 5;       
   }
 
    public short getVolume() {
        return this.volume;
    }

    public void setVolume(short volume){
        this.volume = volume;
    }

    public boolean getStereo(){
        return this.stereo;
    }
    public void setStereo(boolean stereo){
        this.stereo = stereo;
    }

    public void mono(){
        this.stereo = false;
    }

    public void stereo(){
        this.stereo = true;
    }
}
