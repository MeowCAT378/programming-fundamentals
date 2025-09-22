import java.util.Scanner;

public class lpp_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt(); // จำนวนคน
        String[] names = new String[n];
        int[] scores = new int[n];

        // อ่านข้อมูลนักเรียน
        int i = 0;
        while (i < n) {
            names[i] = input.next();
            scores[i] = input.nextInt();
            i += 1; // ใช้ += 1 แทน ++
        }

        // กำหนดค่าเริ่มต้น
        int maxScore = scores[0];
        int maxIndex = 0;
        int minScore = scores[0];
        int minIndex = 0;

        int j = 1;
        while (j < n) {
            if (scores[j] > maxScore) {
                maxScore = scores[j];
                maxIndex = j;
            }
            if (scores[j] < minScore) {
                minScore = scores[j];
                minIndex = j;
            }
            j += 1; // ใช้ += 1
        }

        // แสดงผล: คนที่ได้คะแนนสูงสุด ตามด้วยคะแนนต่ำสุด
        System.out.println(names[maxIndex]);
        System.out.println(names[minIndex]);
    }
}
