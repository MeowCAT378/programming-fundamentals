import java.util.*;

public class lap_05 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[] arr = new int[10];      // เก็บตัวเลข 10 ตัว

        for (int i = 0; i < 10; i += 1) { // รับตัวเลข 10 ตัว
            arr[i] = input.nextInt();
        }
        // แสดงค่าที่อยู่ใน index คู่
        System.out.print("Value in even index : ");
        for (int i = 0; i < 10; i += 2) {        // ข้ามทีละ 2 → 0,2,4,6,8
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        // แสดงค่าที่เป็นเลขคู่
        System.out.print("Even number : ");
        for (int i = 0; i < 10; i += 1) {
            if (arr[i] % 2 == 0) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
