import java.util.Scanner;

public class lpp_2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int num = input.nextInt();

        for (int i = 1; i <= num; i++) {
            if (i == 1 || i == num) {
                // พิมพ์เลข i ทั้งแถว (ครบ num ตัว)
                for (int j = 1; j <= num; j++) {
                    System.out.print(i);
                }
            } else {
                // พิมพ์กรอบ
                System.out.print(i);  // ตัวแรก
                for (int k = 1; k <= num - 2; k++) {
                    System.out.print("=");
                }
                System.out.print(i);  // ตัวสุดท้าย
            }
            System.out.println();
        }
    }
}
