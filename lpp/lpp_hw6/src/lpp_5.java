import java.util.Scanner;

public class lpp_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int w = 2 * n - 1;

        for (int i = 1; i <= n; i++) {
            // พิมพ์ '=' ด้านซ้าย
            for (int j = 1; j <= i - 1; j+=1) {
                System.out.print("=");
            }
            // พิมพ์ '+'
            for (int j = 1; j <= w - 2 * (i - 1); j+=1) {
                System.out.print("+");
            }
            // พิมพ์ '=' ด้านขวา
            for (int j = 1; j <= i - 1; j+=1) {
                System.out.print("=");
            }
            System.out.println();
        }
    }
}
