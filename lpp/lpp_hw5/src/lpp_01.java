import java.util.Scanner;

public class lpp_01 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int sum = 0;

        for (int i = num1; i<= num2; i+=1){
            if (i % 2  != 0){
                System.out.print(i + " ");
                sum += i;
            }
        }
        System.out.println();
        System.out.println(sum);
    }
}
