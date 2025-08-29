import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();

        for (int i = 1; i<= num1; i+=1){
            System.out.print("*");
        }
        System.out.println();
        for (int j = 1 ;j <= num1 - 2; j+=1){
            System.out.print("*");
        }
        System.out.println();
        for (int k = 1 ;k <= num1 - 4; k+=1){
            System.out.print("*");
        }
    }
}