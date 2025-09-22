import java.util.*;

public class lap_03 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int num = input.nextInt();// ขนาด arr
        double sum = 0.00; // ผลรวม
        int count = 0;  // นับจำนวนที่มากกว่า avg
        int[] arr = new int[num];  // เก็บตัวเลข

        // รับตัวเลขและบวกผลรวม
        for (int i = 0; i < num; i += 1) { // รับตัวเลขและบวกผลรวม
            arr[i] = (int) input.nextDouble();
            sum += arr[i];
        }
        double avg = sum / num; // หาค่าเฉลี่ย

        for (int i = 0; i < num; i += 1) { // นับตัวที่มากกว่า avg
            if (arr[i] > avg) {
                count += 1;
            }
        }
        System.out.println(count); // แสดงจำนวนที่มากกว่า avg
    }
}
