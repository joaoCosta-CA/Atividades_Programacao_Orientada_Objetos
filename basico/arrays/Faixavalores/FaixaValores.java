import java.util.Arrays;

public class FaixaValores {
    public static void main(String[] args){
        int[] arr = new int[50];
        int[] faixas = new int[7];
        
        Faixa faixa = new Faixa();
        int [] resultados = faixa.faixa(arr, faixas);

        System.out.println(Arrays.toString(resultados));

    }
}
