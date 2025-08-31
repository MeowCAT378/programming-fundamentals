import java.util.Scanner;

public class lpp_3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int num = input.nextInt();

        for (int i = 1; i <= num; i++) {
            if (i % 2 == 0) {
                // แถวเลขคู่ >>>> <<<<
                for (int k = 1; k <= num; k++) {
                    System.out.print("<");
                }
                System.out.print(" ");
                for (int k = 1; k <= num; k++) {
                    System.out.print(">");
                }
            } else {
                // แถวเลขคี่ <<<< >>>>
                for (int k = 1; k <= num; k++) {
                    System.out.print(">");
                }
                System.out.print(" ");
                for (int k = 1; k <= num; k++) {
                    System.out.print("<");
                }
            }
            System.out.println();
        }
    }
}
