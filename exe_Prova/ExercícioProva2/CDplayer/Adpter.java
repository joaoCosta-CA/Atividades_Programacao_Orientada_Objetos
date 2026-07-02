package ExercícioProva2.CDplayer;

public class Adpter extends Cdplayer{
    private USBReader usb = new USBReader();

    @Override
    public void playCD(){
        usb.playFromUSB();
    }
    
}