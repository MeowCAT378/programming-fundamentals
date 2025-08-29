import java.util.Scanner;

public class lap_5 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int m = input.nextInt(); // จำนวนบรรทัด
        int n = input.nextInt(); // จำนวนชุดข้อมูลในแต่ละบรรทัด
        int o = input.nextInt(); // จำนวนดอกจันต่อชุด

        for (int i = 0; i < m; i++) {       // บรรทัด
            for (int j = 0; j < n; j++) {   // วนตามจำนวนชุดในแต่ละบรรทัด
                for (int k = 0; k < o; k++) {  // วนสร้างดอกจันในแต่ละชุด
                    System.out.print("*");
                }
                System.out.print(" "); // เว้นวรรคระหว่างชุด
            }
            System.out.println(); // ขึ้นบรรทัดใหม่
        }
    }
}
