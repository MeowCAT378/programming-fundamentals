import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String A = input.next(); //รับค่าตัวอักษร

        switch (A){
            case "a", "e" , "i" , "o", "u": // ถ้า A ตรงกับ a e i o u
                System.out.println("Vowel ");
            break;
            default: // ถ้าไม่ตรงในที่มี
                System.out.println("No Vowel");
        }
    }
}