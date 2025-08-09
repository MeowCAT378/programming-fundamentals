import java.util.Scanner;

public class lpp_03 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        int sum = 0;

        for (int i = 1 ; i <= num1 ;i+=1){
            sum += i;
        }
        System.out.println(sum);
    }
}
