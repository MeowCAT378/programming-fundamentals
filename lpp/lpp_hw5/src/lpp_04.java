import java.util.Scanner;

public class lpp_04 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int count = 0;

        while (true){
            int num = input.nextInt();
            count += 1;

            if (num != 25){
                System.out.println("no");
            }
            else {
                System.out.println("yes " + count);
                break;
            }
        }
    }
}
