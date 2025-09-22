import java.util.*;

public class lpp_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();         // จำนวนผู้เข้าชม
        int[] ticket = new int[n];       // อาร์เรย์เก็บหมายเลขบัตรคิว

        // รับค่าหมายเลขบัตรคิว
        for (int i = 0; i < n; i++) {
            ticket[i] = input.nextInt();
        }

        int x = input.nextInt();         // หมายเลขบัตรที่ต้องการตรวจสอบ
        int count = 0;                   // ตัวนับจำนวน

        // นับจำนวนบัตรที่ตรงกับ x
        for (int i = 0; i < n; i++) {
            if (ticket[i] == x) {
                count++;
            }
        }
        System.out.println(count);       // แสดงผล
    }
}
