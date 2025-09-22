import java.util.Scanner;

public class lpp_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        long sum = 0;
        int min = Integer.MAX_VALUE;
        int minCount = 0;

        for (int i = 0; i < N; i++) {
            int x = sc.nextInt();
            sum += x;

            if (x < min) {
                min = x;
                minCount = 1;
            } else if (x == min) {
                minCount++;
            }
        }

        long result = sum - (long) min * minCount;
        System.out.println(result);
    }
}
