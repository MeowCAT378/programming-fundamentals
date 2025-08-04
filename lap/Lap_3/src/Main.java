import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int num1 = input.nextInt(); // รับค่าจำนวนเตม

        if (num1 > 0){
            System.out.println("your number more than zero"); //ถ้ามากว่า 0
        }else {
            System.out.println("your number less or equal zero");//ถ้ามากว่า 0
        }
    }
}