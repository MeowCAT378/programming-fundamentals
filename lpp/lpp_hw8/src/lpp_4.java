import java.util.Scanner;

public class lpp_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        int sum = 0;
        int max = Integer.MIN_VALUE;
        int maxIndex = 0;
        int min = Integer.MAX_VALUE;

        // รับค่าเข้ามาในอาร์เรย์
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            sum += arr[i];

            if (arr[i] > max) {
                max = arr[i];
                maxIndex = i;
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        // นับจำนวนค่าที่เท่ากับ min
        int minCount = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == min) {
                minCount++;
            }
        }

        // แสดงผลลัพธ์
        System.out.println(sum);
        System.out.println(max);
        System.out.println(maxIndex);
        System.out.println(minCount);
    }
}
