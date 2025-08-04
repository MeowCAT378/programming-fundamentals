import java.util.Scanner;

public class hw_5 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int num = input.nextInt();

        int mod1 =num % 10;
        System.out.print(mod1);
        num = (num - mod1) / 10;

        int mod2 =num % 10;
        System.out.print(mod2);
        num = (num - mod2) / 10;

        int mod3 =num % 10;
        System.out.print(mod3);
        num = (num - mod3) / 10;

        int mod4 =num % 10;
        System.out.print(mod4);
    }
}
