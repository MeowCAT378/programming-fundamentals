import java.util.Scanner;

public class lap_hw03 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int time = input.nextInt(); // หน่วย: นาที
        int fee = 0;

        if (time > 180) {
            fee = 30;
        } else if (time > 120) {
            fee = 20;
        } else if (time > 60) {
            fee = 10;
        }
        System.out.println(fee);
    }
}
