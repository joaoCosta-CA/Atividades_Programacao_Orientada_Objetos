import java.security.SecureRandom;

public class Faixa {

    public int[] faixa(int arr[], int faixas[]){
        SecureRandom sr = new SecureRandom();
        for(int i=0;i<arr.length;i++){
            arr[i] = sr.nextInt(700) + 1;

            if(arr[i] >0 && arr[i] < 100){
                faixas[0]++;
            }else if(arr[i] >= 100 && arr[i] < 200){
                faixas[1]++;
            }else if(arr[i] >= 200 && arr[i] < 300){
                faixas[2]++;
            }else if(arr[i] >= 300 && arr[i] < 400){
                faixas[3]++;
            }else if(arr[i] >= 400 && arr[i] < 500){
                faixas[4]++;
            }else if(arr[i] >= 500 && arr[i] < 600){
                faixas[5]++;
            }else if(arr[i] >= 600 && arr[i] < 700){
                faixas[6]++;
            }
        }

        return faixas;
    }
    
}
