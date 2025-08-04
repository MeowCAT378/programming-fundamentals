import java.util.Scanner;

public class lap_3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt(); // รับค่าองศา F

        double C = (double) ((num1 - 32) * 5) / 9; // แปลงค่าองศา C
        System.out.printf("%.4f \n",C);//แสดงค่า C

        if (C < 23){ //ถ้าค่า C น้อยกว่า 23
            System.out.println("cold");
        } else if (C <= 28) { //ถ้าค่า C น้อยกว่า 28
            System.out.println("cool");
        } else if (C <= 33) { //ถ้าค่า C น้อยกว่า 30
            System.out.println("warm");
        } else {
            System.out.println("hot"); //ถ้าไม่ตรงกับที่น้อยกว่าเป็น hot
        }
    }
}