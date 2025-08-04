import java.util.Scanner;

public class hw_4 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double b = input.nextDouble();
        double h = input.nextDouble();
        double ar = ((double) 1 /2) * b * h;
        System.out.printf("%.2f\n", ar );

    }
}
