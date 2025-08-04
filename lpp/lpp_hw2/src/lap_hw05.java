import java.util.Scanner;

public class lap_hw05 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int h = input.nextInt(); // ชม
        int m = input.nextInt(); // นาที
        int p = input.nextInt(); // เวลาที่ผ่าน

        int min = m + p; // หานาทีทั้งหมด

        if (min >= 60) {
            int addH = min / 60;
            min = min % 60;
            h = h + addH;
        }
        if (h >= 24) { // หาว่า ชม > 24 ไหม
            h = h % 24;
        }
        if (h < 10) { // ปรับการแสดงเวลา
            System.out.print("0" + h + ":");
        } else {
            System.out.print(h + ":");
        }
        if (min < 10) {
            System.out.println("0" + min);
        } else {
            System.out.println(min);
        }
    }
}

