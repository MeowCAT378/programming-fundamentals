import java.util.Scanner;

public class lpp_01 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        String math = input.next();

        if (math.equals("+")){
            System.out.println(num1 + num2);
        }else if (math.equals("-")){
            System.out.println(num1 - num2);
        }else if (math.equals("*")){
            System.out.println(num1 * num2);
        }else if (math.equals("/")){
            System.out.println(num1 / num2);
        }else {
            System.out.println("IDK");
        }
    }
}
