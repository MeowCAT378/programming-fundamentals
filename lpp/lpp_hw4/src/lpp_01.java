import java.util.Scanner;

public class lpp_01 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();

        for (int i = 1; i <= 12; i+=1){
            int time = num1 * i;
            System.out.println(num1 + " x " + i + " = " + time );
        }
    }
}
