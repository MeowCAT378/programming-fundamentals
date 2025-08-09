import java.util.Scanner;

public class lpp_05 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        int num2 = input.nextInt();

        if (num1 > num2) {
            // สลับค่าให้ num1 น้อยกว่า num2
            int test = num1; // เทสเช็ค
            num1 = num2;
            num2 = test;
        }

        for (int i = num1; i <= num2; i++) {
            if (i % 2 == 0){
                System.out.print(i + " ");
            }
        }
    }
}
