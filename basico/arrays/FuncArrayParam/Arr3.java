import java.util.Arrays;

public class Arr3 {


    public static int product(int ... a){
        int product = 1;
        for(int number: a){
            product *= number;
        }
        return product;
    }
    public static void main(String[] args){
        int arr[] = Arrays.stream(args).mapToInt(Integer::parseInt).toArray();
        System.out.println(product(arr));
    }
}
