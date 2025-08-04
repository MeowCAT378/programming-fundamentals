import java.util.Scanner;

public class lpp_05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int minutes = input.nextInt(); // เวลาจอด (นาที)
        int bill = input.nextInt();    // จำนวนเงินที่ซื้อ

        int freeMinutes = 0;
        int rate = 0;

        if (bill > 1000) {
            System.out.println(0); // จอดฟรี
            return;
        } else if (bill >= 500) {
            freeMinutes = 120; // ฟรี 2 ชม.
            rate = 10;
        } else if (bill > 0) {
            freeMinutes = 60; // ฟรี 1 ชม.
            rate = 15;
        } else {
            freeMinutes = 0;
            rate = 20;
        }

        int extraMinutes = minutes - freeMinutes;

        if (extraMinutes <= 0) {
            System.out.println(0);
        } else {
            int hours = (extraMinutes + 59) / 60; // ปัดเศษขึ้น
            int cost = hours * rate;
            System.out.println(cost);
        }
    }
}
