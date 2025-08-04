import java.util.Scanner;

public class lap_4 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        char A = input.next().charAt(0); //รับค่าตัวอักษร

        if (A == 'a'){
            System.out.println("Vowel"); //ถ้า A ตรงกับ a,e,i,o,u
        } else if (A == 'e') {
            System.out.println("Vowel");
        } else if (A == 'i') {
            System.out.println("Vowel");
        } else if (A == 'o') {
            System.out.println("Vowel");
        }else if (A == 'u') {
            System.out.println("Vowel");
        }else {
            System.out.println("No Vowel"); // ถ้าค่า A ไม่ตรงกับ a,e,i,o,u
        }
    }
}