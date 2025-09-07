import java.util.Scanner;

public class lap_5 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int num = input.nextInt();

        // ลูปแรกเขียนตาสูตรปกติ
        for (int i = 1; i <= num; i+=1) {
            // ลูปปกติ
            for (int j = 1; j <= num; j++){
                /*
                if
                j == 1	ตำแหน่งแรกของแต่ละแถว	พิมพ์ * ที่ขอบซ้าย
                j == i	ตำแหน่งสุดท้ายของแถว (ตอนนี้ j ไล่ถึง i)	พิมพ์ * ที่ขอบขวา
                i == num	แถวสุดท้าย (เช่น i = 5)	พิมพ์ * ทั้งแถวล่างสุด
                 */
                if (j == 1 || j == i || i == num){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
