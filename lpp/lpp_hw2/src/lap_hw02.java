import java.util.Scanner;

public class lap_hw02 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int num = input.nextInt();

        if (num % 3 == 0 && num % 5 == 0){
            System.out.println("Yes");
        }else {
            System.out.println("NO");
        }
    }
}