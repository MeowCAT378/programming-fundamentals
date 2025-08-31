import java.util.Scanner;

public class lpp_4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int m = input.nextInt(); // จำนวนบรรทัด
        int n = input.nextInt(); // จำนวนชุดในแต่ละบรรทัด

        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                for (int k = 1; k <= n; k++) {
                    System.out.print(i);
                }
                System.out.print(" ");
            }
            System.out.println(); // ตัดบรรทัด
        }
    }
}
