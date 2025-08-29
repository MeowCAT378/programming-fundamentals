import java.util.Scanner;

public class lap_3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int m = input.nextInt();
        int n = input.nextInt();

        for (int i = 1; i <= m; i += 1){
            for (int j = 1;j <= n;j +=1){
                System.out.print(i + " ");
                System.out.print(j + " ");
                System.out.println();
            }
        }
    }
}
