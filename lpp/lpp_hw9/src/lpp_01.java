import java.util.*;

public class lpp_01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // รับขนาดเมทริกซ์ m (แถว) และ n (คอลัมน์)
        int m = input.nextInt();
        int n = input.nextInt();

        int[][] arr = new int[m][n];  // เก็บเมทริกซ์ต้นฉบับ

        // รับค่าของเมทริกซ์
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = input.nextInt();
            }
        }

        // แสดงผล Transpose (สลับแถวเป็นคอลัมน์)
        for (int j = 0; j < n; j++) {
            for (int i = 0; i < m; i++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println(); // ขึ้นบรรทัดใหม่
        }
    }
}
