import java.util.Scanner;

public class lpp_03 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int num = input.nextInt();

        for (int i = 1; i <= num;i +=1){
            if (num % 2 == 0){
                System.out.print("* ");
            }
            else {
                System.out.print("+ ");
            }
        }
    }
}
