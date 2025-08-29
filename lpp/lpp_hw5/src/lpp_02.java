import java.util.Scanner;

public class lpp_02 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int num = input.nextInt();

        /*
        for (int i = 0; i <= num; i += 1 ){
            if (i % 10 == 0){
                System.out.print(i + " ");
         */
        // ถ้าจะสลับจาก มาก --> น้อยให้
        //  i = num แล้ว ,i >= 0, เพื่อให้เลขนับจากหลังลงไป
        for (int i = num; i >= 0; i -= 1 ){
            if (i % 10 == 0){
                System.out.print(i + " ");
            }
        }
    }
}
