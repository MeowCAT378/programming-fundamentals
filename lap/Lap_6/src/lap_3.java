import java.util.Scanner;

public class lap_3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int num = input.nextInt();

        // ลูปแรกเขียนตาสูตรปกติ
        for (int i = 1; i <= num; i+=1){
            //  j ต้องไม่ 0
            // ไม่ 0 ก็ 1 ไม่อีกก็ num
            for (int j = 1; j <= num; j+=1){
                // num - i คือจำนวนช่องว่าง (underscore) ที่ต้องพิมพ์ในแต่ละแถว
                if (j <= num - i ){
                    System.out.print(" ");
                }else {
                    System.out.print(j);
                    /*
                    System.out.print(" ");
                    input : 5
                    -----------------
                            5
                           4 5
                          3 4 5
                         2 3 4 5
                        1 2 3 4 5
                    ----------------
                    */

                }
            }
            System.out.println();
        }
    }
}
