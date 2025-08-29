import java.util.Scanner;

public class lap_2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int r = input.nextInt();
        int c = input.nextInt();

        for (int i = 1; i <= r; i += 1){
            for (int j = 1;j <= c;j+=1){
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}