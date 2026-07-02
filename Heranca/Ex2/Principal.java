package Ex2;

public class Principal{
    public static void main(String[] args){
        EquipamentoSonoro equipamentoSonoro = new EquipamentoSonoro(false);
        Equipamento equipamento = new Equipamento(false);

        boolean loop = true;

        while(loop){
            System.out.println("1 - Ligar equipamento sonoro\n2 - ligar equipamento\n3 - Mudar volume\n4 - Mudar stereo\n5 - Sair");
            int opcao = Integer.parseInt(System.console().readLine());
            switch(opcao){
                case 1:
                    equipamentoSonoro.ligar();
                    break;
                case 2:
                    equipamento.ligar();
                    break;
                case 3:
                    System.out.println("Digite o volume:");
                    short volume = Short.parseShort(System.console().readLine());
                    equipamentoSonoro.setVolume(volume);
                    break;
                case 4:
                    System.out.println("Digite o stereo:");
                    boolean stereo = Boolean.parseBoolean(System.console().readLine());
                    equipamentoSonoro.setStereo(stereo);
                    break;
                case 5:
                    loop = false;
                    break;
                default:
                    loop = false;
                    break;
            }
        }

        
        
    }
}