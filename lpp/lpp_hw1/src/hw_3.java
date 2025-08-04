import java.util.Scanner;

public class hw_3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double c = input.nextDouble();
        double f = (c * 9) /5 +32;
        System.out.printf("%.2f\n", f );
    }
}
