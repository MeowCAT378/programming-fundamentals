import java.util.Scanner;

public class lap_4 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int num = input.nextInt();

        // ลูปแรกเขียนตาสูตรปกติ
        for (int i = 1; i <= num; i++) {
            // ย้าย if เก่าใชในลูปแทน ให้ค่า num ไม่ตกให้ + 1
            for (int j = 1; j <= num - i + 1; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
