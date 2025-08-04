import java.util.Scanner;

public class lap_4 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int temp = input.nextInt(); // ความร้อน
        String Weather  = input.next(); // รับค่าอากาศ
        String sporte = ""; // เก็บกีฬาที่เหมาะ

        switch (Weather){
            case "R": //ฝนตก
                if (temp <= 30){ // ถ้าอากาศน้อยกว่าหรือเท่ากับ 30
                    sporte = "Badminton"; //เล่น Badminton
                }else {
                    sporte = "Yoga"; //เล่น Yoga
                }
                break;
            case "S": // มีแดด
                if (temp <= 30){ // ถ้าอากาศน้อยกว่าหรือเท่ากับ 30
                    sporte = "Football"; //เล่น Football
                }else {
                    sporte = "Swim"; // ถ้าไม่ใช่เล่น Swim
                }
        }
        System.out.println("=== Processing ===\n" +
                "Suggest sport : " + sporte); // แสดงกีฬาที่เหมาะ
    }
}