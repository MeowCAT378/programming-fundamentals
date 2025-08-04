import java.util.Scanner;

public class lpp_02 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int temp = input.nextInt();
        String type = input.next();

        if (type.equals("C")){
            if (temp <= 0) {
                System.out.println("Solid");
            } else if (temp >= 1 && temp <= 99) {
                System.out.println("Liquid");
            } else if (temp >= 100) {
                System.out.println("Gas");
            }
        } else if (type.equals("F")) {
            if (temp <= 32) {
                System.out.println("Solid");
            } else if (temp >= 33 && temp <= 211) {
                System.out.println("Liquid");
            } else if (temp >= 212) {
                System.out.println("Gas");
            }
        }
    }
}