import java.util.*;

public class lpp_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();          // จำนวนข้อมูล
        int[] num = new int[n];           // อาร์เรย์เก็บข้อมูล

        // รับค่าเก็บในอาร์เรย์
        for (int i = 0; i < n; i++) {
            num[i] = input.nextInt();
        }

        int s = input.nextInt();          // index เริ่มต้น
        int e = input.nextInt();          // index สิ้นสุด

        // แสดงข้อมูลทั้งหมด
        for (int i = 0; i < n; i++) {
            System.out.print(num[i] + " ");
        }
        System.out.println();

        // ตรวจสอบว่าขอบเขต index valid ไหม
        if (s < 0 || e >= n || s > e) {
            System.out.println("Your index invalid.");
        } else {
            for (int i = s; i <= e; i++) {
                System.out.print(num[i] + " ");
            }
        }
    }
}
