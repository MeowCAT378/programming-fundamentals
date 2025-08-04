import java.util.Scanner;

public class lap_5 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int price = input.nextInt(); // ประกาศและรับค่าราคา
        int dis; // ประกาศ dis เก็บส่วนลด
        int Total; // ประกาศ Total เก็บราคาสุทธิ

        System.out.println("=== Program discount price ===");
        System.out.println("Input price :" + price); // แสดงราคาที่รับเข้ามา
        System.out.println("=== Calculate total price ===");

        if (price >= 5001){
            dis = (price * 10/100); //ส่วนลด 10%
            Total = (price - dis);
            System.out.println("Total Price : " + Total); //แสดงราคาสุทธิ
        } else if (price >= 2001) {
            dis = (price * 7/100);//ส่วนลด 7%
            Total = (price - dis);
            System.out.println("Total Price : " + Total);//แสดงราคาสุทธิ
        } else if (price >= 1001) {
            dis = (price * 4/100);//ส่วนลด 4%
            Total = (price - dis);
            System.out.println("Total Price : " + Total);//แสดงราคาสุทธิ
        } else if (price >= 501) {
            dis = (price * 3/100);//ส่วนลด 3%
            Total = (price - dis);
            System.out.println("Total Price : " + Total);//แสดงราคาสุทธิ
        }else
            System.out.println("Total Price : " + price); // ถ้าน้อยกว่า 500 ไม่มีส่วนลด
        }
    }
