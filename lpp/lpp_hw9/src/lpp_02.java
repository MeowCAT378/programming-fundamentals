import java.util.*;

public class lpp_02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[][] arr = new int[3][3];

        // รับค่าเมทริกซ์ 3x3
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                arr[i][j] = input.nextInt();
            }
        }

        // ตรวจสอบแถว
        for (int i = 0; i < 3; i++) {
            if (arr[i][0] == arr[i][1] && arr[i][1] == arr[i][2]) {
                System.out.println("All " + arr[i][0] + " on row " + i);
            }
        }

        // ตรวจสอบคอลัมน์
        for (int j = 0; j < 3; j++) {
            if (arr[0][j] == arr[1][j] && arr[1][j] == arr[2][j]) {
                System.out.println("All " + arr[0][j] + " on column " + j);
            }
        }
    }
}
