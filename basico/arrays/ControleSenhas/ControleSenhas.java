import java.util.ArrayList;

public class ControleSenhas {
    public int gerarSenha(ArrayList<Integer> fila){
            int senha = (int) (Math.random() * 1000);
            fila.add(senha);
            return senha;
    }

    public void retirarSenha(ArrayList<Integer> fila, int senha){
        if (fila.contains(senha)){
            fila.remove(senha);
        }
    }

    public void atenderCliente(ArrayList<Integer> fila){
        if(fila.size() > 0){
            fila.remove(0);
        }
    }

    public void buscarPosição(ArrayList<Integer> fila, int senha){
        if(fila.contains(senha)){
            int posição = fila.indexOf(senha);
            System.out.println("A posição da senha é: " + posição);
        }
    }

    public void imprimirFila(ArrayList<Integer> fila){
        System.out.println("Fila: " + fila);
    }
}
