import java.util.Scanner;

public class lap_2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int num1 = input.nextInt(); // นับค่าตัวเลขที่จะแปลง

        switch (num1){
            case 1:
                System.out.println("I"); //ถ้าที่รับมาเป็น 1-10
                break;
            case 2:
                System.out.println("II");
                break;
            case 3:
                System.out.println("III");
                break;
            case 4:
                System.out.println("IV");
                break;
            case 5:
                System.out.println("V");
                break;
            case 6:
                System.out.println("VI");
                break;
            case 7:
                System.out.println("VII");
                break;
            case 8:
                System.out.println("VIII");
                break;
            case 9:
                System.out.println("XI");
                break;
            case 10:
                System.out.println("X");
                break;
            default: // นอกจาก 1-10
                System.out.println("Can’t not convert to roman number, My program support only 1-10");
        }

    }
}
