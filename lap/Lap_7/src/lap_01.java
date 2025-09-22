import java.util.*;

public class lap_01 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int num = input.nextInt(); // ตัวแปร num เก็บจำนวนนักเรียน
        int[] arr = new int[num];  // อาร์เรย์ arr เก็บคะแนนนักเรียน

        // ลูปรับค่าคะแนนนักเรียนแต่ละคน
        for (int i = 0; i < num; i += 1) {
            arr[i] = input.nextInt(); // เก็บคะแนนใน arr
        }
        // ลูปแสดงค่าคะแนนจากคนสุดท้ายไปคนแรก
        for (int i = num - 1; i >= 0; i -= 1) {
            System.out.print(arr[i] + " "); // แสดงคะแนนที่ตำแหน่ง i
        }
    }
}
