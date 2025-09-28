import java.util.*;

public class lpp_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[][] g = new String[3][3];

        // อ่านค่ากริด 3x3 (0, 1, X)
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                g[i][j] = sc.next();
            }
        }

        int ones = 0, zeros = 0;

        // นับเพื่อนรอบๆ (8 ช่อง) ไม่รวมศูนย์กลาง
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == 1 && j == 1) continue;     // ข้ามตำแหน่งกลาง (X)
                if (g[i][j].equals("1")) ones++;
                else if (g[i][j].equals("0")) zeros++;
            }
        }

        boolean leftRightZero = g[1][0].equals("0") && g[1][2].equals("0");

        if (ones == 8) {
            System.out.println("1");
        } else if (zeros >= 5 || leftRightZero) {
            System.out.println("0");
        } else {
            System.out.println("X");
        }
    }
}
