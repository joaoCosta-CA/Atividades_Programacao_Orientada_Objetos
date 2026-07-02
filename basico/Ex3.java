import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);
        String name = leitor.nextLine();
        int n = leitor.nextInt();

        for(int i=0;i<n;i++){
            System.out.println(name);
        }
        leitor.close();
    }
}
