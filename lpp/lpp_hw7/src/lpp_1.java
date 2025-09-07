import java.util.*;

public class lpp_1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int num = input.nextInt();

        for (int i = 1; i <= num; i+=1){
            for (int j = 1; j<= i; j+=1){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
