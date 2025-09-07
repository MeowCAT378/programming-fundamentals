import java.util.*;

public class lpp_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();

        for (int j = 0; j < num; j += 1) {
            System.out.print(" ");
        }
        System.out.println(" |");

        for (int i = 1; i <= num; i += 1) {
            // ช่องว่างด้านซ้าย
            for (int j = 0; j < num - i; j += 1) {
                System.out.print(" ");
            }
            // ดาวซ้าย
            for (int j = 0; j < i; j += 1) {
                System.out.print("*");
            }
            // เส้นแบ่ง
            System.out.print(" | ");
            // ดาวขวา
            for (int j = 0; j < i; j += 1) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
