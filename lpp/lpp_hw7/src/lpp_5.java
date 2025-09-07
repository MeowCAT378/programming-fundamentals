import java.util.*;

public class lpp_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();

        // ส่วนบน
        for (int i = 1; i <= num; i += 1) {
            // ช่องว่างด้านซ้าย
            for (int j = 1; j <= num - i; j += 1) {
                System.out.print(" ");
            }
            // พิมพ์ดาวกับช่องว่าง
            for (int j = 1; j <= i; j += 1) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // ส่วนล่าง
        for (int i = num - 1; i >= 1; i -= 1) {
            // ช่องว่างด้านซ้าย
            for (int j = 1; j <= num - i; j += 1) {
                System.out.print(" ");
            }
            // พิมพ์ดาวกับช่องว่าง
            for (int j = 1; j <= i; j += 1) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
