import java.util.Scanner;

public class lap_hw01 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int num = input.nextInt();

        if (num >= 1){
            System.out.println("Positive");
        } else if (num <= -1) {
            System.out.println("Negative");
        }else {
            System.out.println("Zero");
        }
    }
}
