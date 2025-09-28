import java.util.*;

public class lpp_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();   // จำนวนแถว
        int n = sc.nextInt();   // จำนวนคอลัมน์

        int[][] arr = new int[m][n];

        // รับข้อมูลเมทริกซ์
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int x = sc.nextInt();   // พิกัดแถว
        int y = sc.nextInt();   // พิกัดคอลัมน์

        boolean result = false;

        // ตรวจสอบบน-ล่าง (ต้องไม่อยู่นอกกรอบ)
        if (x - 1 >= 0 && x + 1 < m) {
            if (arr[x - 1][y] == 1 && arr[x + 1][y] == 1) {
                result = true;
            }
        }

        // ตรวจสอบซ้าย-ขวา (ต้องไม่อยู่นอกกรอบ)
        if (y - 1 >= 0 && y + 1 < n) {
            if (arr[x][y - 1] == 1 && arr[x][y + 1] == 1) {
                result = true;
            }
        }

        System.out.println(result ? "true" : "false");
    }
}
