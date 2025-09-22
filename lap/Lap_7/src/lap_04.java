import java.util.*;

public class lap_04 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int num = input.nextInt();      // ขนาดของอาร์เรย์
        int[] arr = new int[num];        // อาร์เรย์เก็บตัวเลข

        for (int i = 0; i < num; i += 1) { // รับค่าตัวเลขใส่ในอาร์เรย์
            arr[i] = input.nextInt();
        }

        int x = input.nextInt(); // ค่าที่ต้องการค้นหา
        int loc = -1; // ตำแหน่งที่เจอ (-1 = ยังไม่เจอ)
        for (int i = 0; i < num; i += 1) { // ค้นหา x ในอาร์เรย์
            if (arr[i] == x) {
                loc = i; // เก็บตำแหน่งที่เจอ
                break;
            }
        }
        System.out.println(loc);         // แสดงตำแหน่ง หรือ -1 ถ้าไม่เจอ
    }
}
