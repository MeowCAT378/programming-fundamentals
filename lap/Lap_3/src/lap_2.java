import java.util.Scanner;

public class lap_2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int num1 = input.nextInt(); // นับค่าตัวเลขที่จะแปลง

        if (num1 == 1){
            System.out.println("I");  //ถ้าที่รับมาเป็น 1
        } else if (num1 == 2) {
            System.out.println("II"); //ถ้าที่รับมาเป็น 2
        } else if (num1 == 3) {
            System.out.println("III"); //ถ้าที่รับมาเป็น 3
        } else if (num1 == 4) {
            System.out.println("IV"); //ถ้าที่รับมาเป็น 4
        } else if (num1 == 5) {
            System.out.println("V");//ถ้าที่รับมาเป็น 5
        } else if (num1 == 6) {
            System.out.println("VI");//ถ้าที่รับมาเป็น 6
        } else if (num1 == 7) {
            System.out.println("VII"); //ถ้าที่รับมาเป็น 7
        } else if  (num1 == 8) {
            System.out.println("VIII"); //ถ้าที่รับมาเป็น 8
        } else if (num1 == 9) {
            System.out.println("IX"); //ถ้าที่รับมาเป็น 9
        } else if (num1 == 10) {
            System.out.println("X"); //ถ้าที่รับมาเป็น 10
        } else {
            System.out.println("“Can’t not convert to roman number, My program support only 1-10”"); //ถ้าที่รับมาไม่ตรงกับที่มี
        }
    }
}
