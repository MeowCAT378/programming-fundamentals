import java.util.Scanner;

public class lpp_04 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        int num2 = input.nextInt();

        for (int i = num1; i <= num2; i+=1){
            System.out.print(i + " ");
        }
        if (num1 < num2){
            for (int i = num2; i <= num1; i+=1){
                System.out.print(i + " ");
            }
        }
    }
}