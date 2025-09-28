import java.util.*;

public class lpp_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // อ่านสถานะขีด 0..6 (1=on, 0=off)
        int[] s = new int[7];
        for (int i = 0; i < 7; i++) s[i] = sc.nextInt();

        // สร้าง 3 บรรทัดตามรูปแบบ 3x3
        String row0 = " " + (s[0] == 1 ? "_" : " ") + " ";
        String row1 = (s[1] == 1 ? "|" : " ")
                + (s[2] == 1 ? "_" : " ")
                + (s[3] == 1 ? "|" : " ");
        String row2 = (s[4] == 1 ? "|" : " ")
                + (s[5] == 1 ? "_" : " ")
                + (s[6] == 1 ? "|" : " ");

        System.out.println(row0);
        System.out.println(row1);
        System.out.println(row2);
    }
}
