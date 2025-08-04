import java.util.Scanner;

public class lap_3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String Sex = input.next(); // รับค่าเพศ
        int age = input.nextInt(); // รับค่าอายุ

        switch (Sex){
            case "M": // เป็น ผช
                if (age <= 14){ //ถ้าอายุไม่เกิน 14
                    Sex = "Boy";
                }else { // ถ้าไม่ใช่
                    Sex = "Man";
                }
                break;
            case "F": // ถ้าเป็น ผญ
                if (age <= 14){ //ถ้าอายุไม่เกิน 14
                    Sex = "Girl";
                }else { // ถ้าไม่ใช่
                    Sex = "Woman";
                }
                break;
            default: // ไม่ใช่ทั้ง ผช / ผญ
                System.out.println("Don’t know, what you are  ");
        }
        System.out.println("=== Processing ===");
        System.out.println("You are a " + Sex); // แสดงว่าเป็นเด็กหรือผู้ใหญ่
    }
}
