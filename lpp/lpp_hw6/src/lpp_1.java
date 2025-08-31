import java.util.Scanner;

public class lpp_1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int m = input.nextInt();
        int n = input.nextInt();

        for (int i = 1; i <= m; i += 1){
            for (int j  = 1; j <= n/2; j+=1){
                System.out.print(">");
            }
            for (int j  = 1; j <= n/2; j+=1){
                System.out.print("<");
            }
            System.out.println();
        }
    }
}
