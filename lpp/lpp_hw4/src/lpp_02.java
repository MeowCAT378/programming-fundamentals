import java.util.Scanner;

public class lpp_02 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        int round = input.nextInt();
        int sum = 0;

        for (int i = 1; i <= round; i+=1){
            sum += num1;
            System.out.print(num1);
            if (i < round){
                System.out.print(" + ");
            }
        }
        System.out.println(" = " + sum);
    }
}
